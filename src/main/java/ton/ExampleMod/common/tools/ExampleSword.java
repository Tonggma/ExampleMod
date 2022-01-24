package ton.ExampleMod.common.tools;

import net.minecraft.item.SwordItem;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

public class ExampleSword extends SwordItem {
    public ExampleSword() {
        super(ExampleTier.EXAMPLETIER, 10, -2.4F, new Properties().group(ExampleGroup.exampleGroup));
    }
}
