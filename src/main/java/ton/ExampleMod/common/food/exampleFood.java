package ton.ExampleMod.common.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import ton.ExampleMod.core.itemgroup.exampleGroup;


public class exampleFood extends Item {

    private static final Food food = (new Food.Builder())
            .hunger(5)
            .saturation(3)
            .effect(()-> new EffectInstance(Effects.HEALTH_BOOST, 3*20, 2),1)
            .build();
    public exampleFood() {
        super(new Properties().group(exampleGroup.exampleGroup).food(food));
    }
}
