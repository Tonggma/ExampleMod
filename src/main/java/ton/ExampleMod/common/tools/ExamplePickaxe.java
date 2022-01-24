package ton.ExampleMod.common.tools;

import net.minecraft.item.PickaxeItem;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

public class ExamplePickaxe extends PickaxeItem {
    public ExamplePickaxe() {
        super(ExampleTier.EXAMPLETIER, 8, -3.5F, new Properties().group(ExampleGroup.exampleGroup));
    }
}
