package paytonthemartian.martian_alloys;

import net.fabricmc.api.ModInitializer;

public class MartianAlloysMod implements ModInitializer {

	public static final Alloy AMETHYST_IRON_ALLOY = new Alloy("amethyst_iron", 800, 3.0F, 5.0F, 3, 15, null);
	public static final Alloy OBSIDIAMOND_ALLOY = new Alloy("obsidiamond", 2000, 6.0F, 6.0F, 4, 25, null);

	@Override
	public void onInitialize() {
		Alloy.registerAlloy(AMETHYST_IRON_ALLOY);
		Alloy.registerAlloy(OBSIDIAMOND_ALLOY);
	}
}
