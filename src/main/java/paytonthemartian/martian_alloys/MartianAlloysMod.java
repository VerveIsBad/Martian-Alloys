package paytonthemartian.martian_alloys;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MartianAlloysMod implements ModInitializer {

	public static final Alloy AMETHYST_IRON_ALLOY = new Alloy("amethyst_iron", 800, 3.0F, 3.0F, 3, 15, null);
	public static final Alloy OBSIDIAMOND_ALLOY = new Alloy("obsidiamond", 2000, 6.0F, 5.0F, 4, 20, null);
	public static final Alloy ROSE_GOLD = new Alloy("rose_gold", 600, 3.0F, 4.0F, 3, 30, null);

	public static final Item RUNE_SHARPNESS = new Rune(Enchantments.SHARPNESS);
	public static final Item RUNE_FIRE_ASPECT = new Rune(Enchantments.FIRE_ASPECT);
	public static final Item RUNE_EFFICIENCY = new Rune(Enchantments.EFFICIENCY);
	public static final Item RUNE_AQUA_AFFINITY = new Rune(Enchantments.AQUA_AFFINITY);
	public static final Item RUNE_BLAST_PROTECTION = new Rune(Enchantments.BLAST_PROTECTION);
	public static final Item RUNE_DEPTH_STRIDER = new Rune(Enchantments.DEPTH_STRIDER);
	public static final Item RUNE_FEATHER_FALLING = new Rune(Enchantments.FEATHER_FALLING);
	public static final Item RUNE_FROST_WALKER = new Rune(Enchantments.FROST_WALKER);
	public static final Item RUNE_PROJECTILE_PROTECTION = new Rune(Enchantments.PROJECTILE_PROTECTION);
	public static final Item RUNE_PROTECTION = new Rune(Enchantments.PROTECTION);
	public static final Item RUNE_RESPIRATION = new Rune(Enchantments.RESPIRATION);
	public static final Item RUNE_SOUL_SPEED = new Rune(Enchantments.SOUL_SPEED);
	public static final Item RUNE_THORNS = new Rune(Enchantments.THORNS);

	@Override
	public void onInitialize() {
		Alloy.registerAlloy(AMETHYST_IRON_ALLOY);
		Alloy.registerAlloy(OBSIDIAMOND_ALLOY);
		Alloy.registerAlloy(ROSE_GOLD);

		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_sharpness"), RUNE_SHARPNESS);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_fire_aspect"), RUNE_FIRE_ASPECT);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_efficiency"), RUNE_EFFICIENCY);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_aqua_affinity"), RUNE_AQUA_AFFINITY);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_blast_protection"), RUNE_BLAST_PROTECTION);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_depth_strider"), RUNE_DEPTH_STRIDER);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_feather_falling"), RUNE_FEATHER_FALLING);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_frost_walker"), RUNE_FROST_WALKER);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_projectile_protection"), RUNE_PROJECTILE_PROTECTION);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_protection"), RUNE_PROTECTION);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_respiration"), RUNE_RESPIRATION);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_soul_speed"), RUNE_SOUL_SPEED);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_thorns"), RUNE_THORNS);
	}
}
