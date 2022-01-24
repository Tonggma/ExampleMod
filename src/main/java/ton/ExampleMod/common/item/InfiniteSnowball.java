package ton.ExampleMod.common.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

import java.util.Random;

public class InfiniteSnowball extends Item {
    public InfiniteSnowball() {
        super(new Properties().group(ExampleGroup.exampleGroup));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        //右键物品事件
        ItemStack heldItem = playerIn.getHeldItem(handIn); //获得手中物品
        worldIn.playSound(null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_SNOWBALL_THROW,
                SoundCategory.NEUTRAL, 0.5F, new Random().nextFloat() * 0.4F + 0.8F); //播放音效
        if(!worldIn.isRemote) { //判断是否为服务端
            SnowballEntity snowballEntity = new SnowballEntity(worldIn, playerIn); //创建雪球实体
            snowballEntity.setDirectionAndMovement(playerIn, playerIn.rotationPitch, playerIn.rotationYaw,
                    0.0f, 1.5f, 1.0f); //配置雪球实体
            worldIn.addEntity(snowballEntity); //生成实体
            return new ActionResult<>(ActionResultType.SUCCESS, heldItem);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
