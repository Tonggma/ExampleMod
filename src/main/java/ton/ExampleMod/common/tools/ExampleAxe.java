package ton.ExampleMod.common.tools;

import net.minecraft.item.AxeItem;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

public class ExampleAxe extends AxeItem {
    public ExampleAxe() {
        super(ExampleTier.EXAMPLETIER,15, -3.2F, new Properties().group(ExampleGroup.exampleGroup));
    }
}
//创建一个斧头
