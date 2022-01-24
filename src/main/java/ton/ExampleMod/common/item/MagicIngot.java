package ton.ExampleMod.common.item;

import net.minecraft.item.Item;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

public class MagicIngot extends Item {
    public MagicIngot() {
        super(new Properties().group(ExampleGroup.exampleGroup));
    }
}
