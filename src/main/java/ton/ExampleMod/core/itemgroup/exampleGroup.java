package ton.ExampleMod.core.itemgroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ton.ExampleMod.core.init.itemInit;

public class exampleGroup extends ItemGroup {

    public static final exampleGroup exampleGroup = new exampleGroup();

    public exampleGroup() {
        super("example_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(itemInit.EXAMPLE_ITEM.get());
    }
}
