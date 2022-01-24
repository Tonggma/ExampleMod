package ton.ExampleMod.common.item;

import net.minecraft.item.Item;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

public class ExampleItem3 extends Item {
    public ExampleItem3() {
        super(new Properties().group(ExampleGroup.exampleGroup));
    }
}
