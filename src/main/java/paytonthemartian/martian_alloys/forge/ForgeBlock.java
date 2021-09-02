package paytonthemartian.martian_alloys.forge;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import paytonthemartian.martian_alloys.MartianAlloysMod;

public class ForgeBlock extends Block {
	public ForgeBlock(Settings settings) {
		super(settings);
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
			BlockHitResult hit) {
		if (!world.isClient) {
			if (player.isHolding(MartianAlloysMod.AMETHYST_IRON_ALLOY.alloyItem)) {
				player.getStackInHand(hand).decrement(1);
				ItemScatterer.spawn(world, pos.getX(), pos.getY() + 1, pos.getZ(),
						new ItemStack(MartianAlloysMod.AMETHYST_IRON_ALLOY.bucketItem));
			} else {
				return ActionResult.FAIL;
			}
		}

		return ActionResult.SUCCESS;
	}
}
