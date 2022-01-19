package ton.ExampleMod.common.potion;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import ton.ExampleMod.core.init.effectInit;

public class examplePotion extends Potion {
    public examplePotion() {
        super(new EffectInstance(effectInit.EXAMPLE_EFFECT.get(), 2560, 0)); //参数 -> EffectInstance(效果, 持续时间)
    }
}
