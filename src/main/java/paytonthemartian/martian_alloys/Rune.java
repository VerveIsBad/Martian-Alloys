package paytonthemartian.martian_alloys;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Rune extends Item {
	public Enchantment enchant;

	public Rune(Enchantment enchant) {
		super(new Item.Settings().maxCount(1).group(ItemGroup.MATERIALS));
		this.enchant = enchant;
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
		if (this.enchant.isAcceptableItem(player.getOffHandStack()) && player.getOffHandStack().isEnchantable()) {
			player.getOffHandStack().addEnchantment(this.enchant, this.enchant.getMaxLevel());
			player.getMainHandStack().decrement(1);
			player.incrementStat(Stats.ENCHANT_ITEM);
			if (player instanceof ServerPlayerEntity) {
				Criteria.ENCHANTED_ITEM.trigger((ServerPlayerEntity) player, player.getOffHandStack(), this.enchant.getMaxLevel());
			}
			player.playSound(SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, 1.0F, world.random.nextFloat() * 0.1f + 0.9f);
		}

		return TypedActionResult.success(player.getMainHandStack());
	}
}
