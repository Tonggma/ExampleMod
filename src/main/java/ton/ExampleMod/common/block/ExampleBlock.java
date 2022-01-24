package ton.ExampleMod.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ExampleBlock extends Block {
    public ExampleBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 10f));
    }
}
//创建一个新方块(依据原版石头)
//hardnessAndResistance()参数为原版石头，可手动填充，算法参考原版
