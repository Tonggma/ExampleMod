package ton.ExampleMod.common.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import ton.ExampleMod.core.itemgroup.exampleGroup;


public class exampleFood extends Item {

    private static final Food food = (new Food.Builder())
            .hunger(5) //增加的饱食度(鸡腿)
            .saturation(3) //饱腹度
            .effect(()-> new EffectInstance(Effects.HEALTH_BOOST, 3*20, 2),1) //药水效果
            .build(); //.build用于创建，必写
    public exampleFood() {
        super(new Properties().group(exampleGroup.exampleGroup).food(food));
    }
} //添加到exampleGroup
