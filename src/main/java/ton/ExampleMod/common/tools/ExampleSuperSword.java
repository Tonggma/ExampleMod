package ton.ExampleMod.common.tools;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.world.World;
import ton.ExampleMod.core.init.EffectInit;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

import java.io.Console;
import java.util.Random;

public class ExampleSuperSword extends SwordItem {
    public ExampleSuperSword() {
        super(ExampleTier.EXAMPLETIER, 14, -1.8f, new Properties().group(ExampleGroup.exampleGroup));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack heldItem = playerIn.getHeldItem(handIn);
        worldIn.playSound(null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(),
                SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.NEUTRAL, 0.8f, new Random().nextFloat() * 0.4F + 0.8F);
        float health = playerIn.getHealth();
        if(health>=15) {
            if(!playerIn.isCreative()) {
                playerIn.setHealth(1);
            }
            playerIn.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 300, 0));
            playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 300, 2));
            playerIn.addPotionEffect(new EffectInstance(Effects.STRENGTH, 300, 1));
            playerIn.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 300, 4));
            playerIn.addPotionEffect(new EffectInstance(Effects.HASTE, 300, 1));
            playerIn.addPotionEffect(new EffectInstance(Effects.HUNGER, 500, 7));
            playerIn.addPotionEffect(new EffectInstance(EffectInit.EXAMPLE_EFFECT.get(), 300, 1));
            return new ActionResult<>(ActionResultType.SUCCESS, heldItem);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
