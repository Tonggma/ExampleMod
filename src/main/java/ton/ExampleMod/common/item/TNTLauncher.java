package ton.ExampleMod.common.item;

import net.minecraft.entity.MoverType;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

import java.util.Random;

public class TNTLauncher extends Item {
    public TNTLauncher() {
        super(new Properties().group(ExampleGroup.exampleGroup));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack heldItem = playerIn.getHeldItem(handIn);
        worldIn.playSound(null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(),
                SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.NEUTRAL, 0.5f, new Random().nextFloat() * 0.4f + 0.8f);
        if (!worldIn.isRemote) {
            TNTEntity tntEntity = new TNTEntity(worldIn, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), null);
//            tntEntity.setPositionAndRotationDirect(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(),
//                    0, 3.2f, 1, false);
            worldIn.addEntity(tntEntity);
            return new ActionResult<>(ActionResultType.SUCCESS, heldItem);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
