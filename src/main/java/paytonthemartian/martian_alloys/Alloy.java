package paytonthemartian.martian_alloys;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class Alloy {
	private ToolMaterial material;
	public String name;
	public Item alloyItem;

	public JsonObject swordRecipe = null;
	public JsonObject shovelRecipe = null;
	public JsonObject pickaxeRecipe = null;
	public JsonObject axeRecipe = null;
	public JsonObject hoeRecipe = null;

	public Alloy(String name, int durability, float miningSpeedMultiplier, float attackDamage, int miningLevel, int enchantability, Item repairItem) {
		this.alloyItem = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
		if (repairItem == null) repairItem = alloyItem;

		this.material = new ToolMaterialMaker(durability, miningSpeedMultiplier, attackDamage, miningLevel, enchantability, repairItem);
		this.name = name;
	}

	public static void registerAlloy(Alloy alloy) {
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", alloy.name), alloy.alloyItem);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", alloy.name + "_bucket"),
						new Item(new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", alloy.name + "_raw"),
						new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

		Registry.register(Registry.ITEM, new Identifier("martian_alloys", alloy.name + "_sword"),
						new SwordItem(alloy.material, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", alloy.name + "_shovel"),
						new ShovelItem(alloy.material, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", alloy.name + "_pickaxe"),
						new ModPickaxeItem(alloy.material, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", alloy.name + "_axe"),
						new ModAxeItem(alloy.material, 5, -3.2F, new FabricItemSettings().group(ItemGroup.TOOLS)));
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", alloy.name + "_hoe"),
						new ModHoeItem(alloy.material, 1, -3.2F, new FabricItemSettings().group(ItemGroup.TOOLS)));

		if (FabricLoader.getInstance().isModLoaded("martian_alloys")) {
			alloy.swordRecipe = createShapedRecipe(
				Lists.newArrayList('#', '|'),
				Lists.newArrayList(new Identifier("martian_alloys", alloy.name), new Identifier("minecraft", "stick")),
				Lists.newArrayList("item", "item"),
				Lists.newArrayList(
					" # ",
					" # ",
					" | "
				),
				new Identifier("martian_alloys:" + alloy.name + "_sword")
			);

			alloy.shovelRecipe = createShapedRecipe(
				Lists.newArrayList('#', '|'),
				Lists.newArrayList(new Identifier("martian_alloys", alloy.name), new Identifier("minecraft", "stick")),
				Lists.newArrayList("item", "item"),
				Lists.newArrayList(
					" # ",
					" | ",
					" | "
				),
				new Identifier("martian_alloys:" + alloy.name + "_shovel")
			);

			alloy.pickaxeRecipe = createShapedRecipe(
				Lists.newArrayList('#', '|'),
				Lists.newArrayList(new Identifier("martian_alloys", alloy.name), new Identifier("minecraft", "stick")),
				Lists.newArrayList("item", "item"),
				Lists.newArrayList(
					"###",
					" | ",
					" | "
				),
				new Identifier("martian_alloys:" + alloy.name + "_pickaxe")
			);

			alloy.axeRecipe = createShapedRecipe(
				Lists.newArrayList('#', '|'),
				Lists.newArrayList(new Identifier("martian_alloys", alloy.name), new Identifier("minecraft", "stick")),
				Lists.newArrayList("item", "item"),
				Lists.newArrayList(
					" ##",
					" |#",
					" | "
				),
				new Identifier("martian_alloys:" + alloy.name + "_axe")
			);

			alloy.hoeRecipe = createShapedRecipe(
				Lists.newArrayList('#', '|'),
				Lists.newArrayList(new Identifier("martian_alloys", alloy.name), new Identifier("minecraft", "stick")),
				Lists.newArrayList("item", "item"),
				Lists.newArrayList(
					" ##",
					" | ",
					" | "
				),
				new Identifier("martian_alloys:" + alloy.name + "_hoe")
			);
		}
	}

	public static JsonObject createShapedRecipe(ArrayList<Character> keys, ArrayList<Identifier> items, ArrayList<String> type, ArrayList<String> pattern, Identifier output) {
		JsonObject json = new JsonObject();
		json.addProperty("type", "minecraft:crafting_shaped");

		JsonArray jsonArray = new JsonArray();
		jsonArray.add(pattern.get(0));
		jsonArray.add(pattern.get(1));
		jsonArray.add(pattern.get(2));
		json.add("pattern", jsonArray);

		JsonObject individualKey;
		JsonObject keyList = new JsonObject();

		for (int i = 0; i < keys.size(); ++i) {
			individualKey = new JsonObject();
			individualKey.addProperty(type.get(i), items.get(i).toString());
			keyList.add(keys.get(i) + "", individualKey);
		}
		json.add("key", keyList);

		JsonObject result = new JsonObject();
		result.addProperty("item", output.toString());
		result.addProperty("count", 1);
		json.add("result", result);

		return json;
	}

	public static String createItemModel(String id, String type) {
		if ("generated".equals(type) || "handheld".equals(type)) {
			return "{\n" +
				"  \"parent\": \"item/" + type + "\",\n" +
				"  \"textures\": {\n" +
				"    \"layer0\": \"" + id + "\"\n" +
				"  }\n" +
				"}";
		}

		return "";
	}
}
