package ton.ExampleMod.common.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.common.entity.ExampleEntity;
import ton.ExampleMod.common.model.ExampleEntityModel;

public class ExampleEntityRender extends MobRenderer<ExampleEntity, ExampleEntityModel> {
    private static final ResourceLocation EXAMPLE_TEXTURES = new ResourceLocation(ExampleMod.MODID, "textures/entity/example_entity.png"); //获取材质地址

    public ExampleEntityRender(EntityRendererManager rendererManagerIn) {
        super(rendererManagerIn, new ExampleEntityModel(), 0.8f); //构造渲染方法
    }


    @Override
    public ResourceLocation getEntityTexture(ExampleEntity entity) {
        return EXAMPLE_TEXTURES; //返回路径
    }
}
