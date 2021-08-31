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

	@Override
	public void onInitialize() {
		Alloy.registerAlloy(AMETHYST_IRON_ALLOY);
		Alloy.registerAlloy(OBSIDIAMOND_ALLOY);
		Alloy.registerAlloy(ROSE_GOLD);

		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_sharpness"), RUNE_SHARPNESS);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_fire_aspect"), RUNE_FIRE_ASPECT);
		Registry.register(Registry.ITEM, new Identifier("martian_alloys", "rune_efficiency"), RUNE_EFFICIENCY);
	}
}
