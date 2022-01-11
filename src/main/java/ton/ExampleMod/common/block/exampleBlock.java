package ton.ExampleMod.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class exampleBlock extends Block {
    public exampleBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 10f));
    }
}
