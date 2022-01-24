package ton.ExampleMod.common.effect;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class ExampleEffect extends Effect {
    public ExampleEffect() {
        super(EffectType.BENEFICIAL, 2293580);
    }

//    @Override
//    public void renderInventoryEffect(EffectInstance effect, DisplayEffectsScreen<?> gui, MatrixStack mStack, int x, int y, float z) {
//        super.renderInventoryEffect(effect, gui, mStack, x, y, z);
//    }
//
//    @Override
//    public void renderHUDEffect(EffectInstance effect, AbstractGui gui, MatrixStack mStack, int x, int y, float z, float alpha) {
//        super.renderHUDEffect(effect, gui, mStack, x, y, z, alpha);
//    }
}