package paytonthemartian.martian_alloys;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class MartianAlloysMod implements ModInitializer {

	public static final Alloy AMETHYST_IRON_ALLOY = new Alloy("amethyst_iron", 800, 3.0F, 5.0F, 3, 15, null);
	public static final Alloy OBSIDIAMOND_ALLOY = new Alloy("obsidiamond", 2000, 6.0F, 6.0F, 4, 25, null);

	public static final Rune RUNE_EMPTY = new Rune(new FabricItemSettings().group(ItemGroup.TOOLS));
	public static final Rune RUNE_FLIGHT = new Rune(new FabricItemSettings().group(ItemGroup.TOOLS));

	@Override
	public void onInitialize() {
		Alloy.registerAlloy(AMETHYST_IRON_ALLOY);
		Alloy.registerAlloy(OBSIDIAMOND_ALLOY);
		
		Registry.register(new Identifier("martian_alloys", "empty_rune"), RUNE_EMPTY);
		Registry.register(new Identifier("martian_alloys", "flight_rune"), RUNE_FLIGHT);
	}
}
