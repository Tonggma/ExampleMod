package ton.ExampleMod.common.item;

import net.minecraft.item.Item;
import ton.ExampleMod.core.itemgroup.exampleGroup;

public class magicIngot extends Item {
    public magicIngot() {
        super(new Properties().group(exampleGroup.exampleGroup));
    }
}
