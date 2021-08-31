package paytonthemartian.martian_alloys.mixins;

import java.util.Map;

import com.google.gson.JsonElement;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import paytonthemartian.martian_alloys.MartianAlloysMod;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {
	@Inject(method = "apply", at = @At("HEAD"))
	public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
		if (MartianAlloysMod.AMETHYST_IRON_ALLOY.swordRecipe != null)
			map.put(new Identifier("martian_alloys", "amethyst_iron_sword"), MartianAlloysMod.AMETHYST_IRON_ALLOY.swordRecipe);
		if (MartianAlloysMod.AMETHYST_IRON_ALLOY.shovelRecipe != null)
			map.put(new Identifier("martian_alloys", "amethyst_iron_shovel"), MartianAlloysMod.AMETHYST_IRON_ALLOY.shovelRecipe);
		if (MartianAlloysMod.AMETHYST_IRON_ALLOY.pickaxeRecipe != null)
			map.put(new Identifier("martian_alloys", "amethyst_iron_pickaxe"), MartianAlloysMod.AMETHYST_IRON_ALLOY.pickaxeRecipe);
		if (MartianAlloysMod.AMETHYST_IRON_ALLOY.axeRecipe != null)
			map.put(new Identifier("martian_alloys", "amethyst_iron_axe"), MartianAlloysMod.AMETHYST_IRON_ALLOY.axeRecipe);
		if (MartianAlloysMod.AMETHYST_IRON_ALLOY.hoeRecipe != null)
			map.put(new Identifier("martian_alloys", "amethyst_iron_hoe"), MartianAlloysMod.AMETHYST_IRON_ALLOY.hoeRecipe);

		if (MartianAlloysMod.OBSIDIAMOND_ALLOY.swordRecipe != null)
			map.put(new Identifier("martian_alloys", "obsidiamond_sword"), MartianAlloysMod.OBSIDIAMOND_ALLOY.swordRecipe);
		if (MartianAlloysMod.OBSIDIAMOND_ALLOY.shovelRecipe != null)
			map.put(new Identifier("martian_alloys", "obsidiamond_shovel"), MartianAlloysMod.OBSIDIAMOND_ALLOY.shovelRecipe);
		if (MartianAlloysMod.OBSIDIAMOND_ALLOY.pickaxeRecipe != null)
			map.put(new Identifier("martian_alloys", "obsidiamond_pickaxe"), MartianAlloysMod.OBSIDIAMOND_ALLOY.pickaxeRecipe);
		if (MartianAlloysMod.OBSIDIAMOND_ALLOY.axeRecipe != null)
			map.put(new Identifier("martian_alloys", "obsidiamond_axe"), MartianAlloysMod.OBSIDIAMOND_ALLOY.axeRecipe);
		if (MartianAlloysMod.OBSIDIAMOND_ALLOY.hoeRecipe != null)
			map.put(new Identifier("martian_alloys", "obsidiamond_hoe"), MartianAlloysMod.OBSIDIAMOND_ALLOY.hoeRecipe);

		if (MartianAlloysMod.ROSE_GOLD.swordRecipe != null)
			map.put(new Identifier("martian_alloys", "rose_gold_sword"), MartianAlloysMod.ROSE_GOLD.swordRecipe);
		if (MartianAlloysMod.OBSIDIAMOND_ALLOY.shovelRecipe != null)
			map.put(new Identifier("martian_alloys", "rose_gold_shovel"), MartianAlloysMod.ROSE_GOLD.shovelRecipe);
		if (MartianAlloysMod.ROSE_GOLD.pickaxeRecipe != null)
			map.put(new Identifier("martian_alloys", "rose_gold_pickaxe"), MartianAlloysMod.ROSE_GOLD.pickaxeRecipe);
		if (MartianAlloysMod.ROSE_GOLD.axeRecipe != null)
			map.put(new Identifier("martian_alloys", "rose_gold_axe"), MartianAlloysMod.ROSE_GOLD.axeRecipe);
		if (MartianAlloysMod.ROSE_GOLD.hoeRecipe != null)
			map.put(new Identifier("martian_alloys", "rose_gold_hoe"), MartianAlloysMod.ROSE_GOLD.hoeRecipe);
	}
}
