package paytonthemartian.martian_alloys.util;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialMaker implements ToolMaterial {

	private int durability;
	private float miningSpeedMultiplier;
	private float attackDamage;
	private int miningLevel;
	private int enchantability;
	private Item repairItem;

	public ToolMaterialMaker(int durability, float miningSpeedMultiplier, float attackDamage, int miningLevel, int enchantability, Item repairItem) {
		super();
		this.durability = durability;
		this.miningSpeedMultiplier = miningSpeedMultiplier;
		this.attackDamage = attackDamage;
		this.miningLevel = miningLevel;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
	}

	public int getDurability() {
		return this.durability;
	}

	public float getMiningSpeedMultiplier() {
		return this.miningSpeedMultiplier;
	}

	public float getAttackDamage() {
		return this.attackDamage;
	}

	public int getMiningLevel() {
		return this.miningLevel;
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(repairItem);
	}
}
