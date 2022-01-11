package ton.ExampleMod.common.tools;

import net.minecraft.item.PickaxeItem;
import ton.ExampleMod.core.itemgroup.exampleGroup;

public class examplePickaxe extends PickaxeItem {
    public examplePickaxe() {
        super(exampleTier.EXAMPLETIER, 8, -3.5F, new Properties().group(exampleGroup.exampleGroup));
    }
}
