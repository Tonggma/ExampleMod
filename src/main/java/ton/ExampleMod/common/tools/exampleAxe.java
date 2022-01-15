package ton.ExampleMod.common.tools;

import net.minecraft.item.AxeItem;
import ton.ExampleMod.core.itemgroup.exampleGroup;

public class exampleAxe extends AxeItem {
    public exampleAxe() {
        super(exampleTier.EXAMPLETIER,15, -3.2F, new Properties().group(exampleGroup.exampleGroup));
    }
}
//创建一个斧头
