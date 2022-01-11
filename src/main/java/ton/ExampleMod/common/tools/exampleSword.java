package ton.ExampleMod.common.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import ton.ExampleMod.core.itemgroup.exampleGroup;

public class exampleSword extends SwordItem {
    public exampleSword() {
        super(exampleTier.EXAMPLETIER, 10, -2.4F, new Properties().group(exampleGroup.exampleGroup));
    }
}
