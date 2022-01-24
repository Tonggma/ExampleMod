package ton.ExampleMod.core.itemgroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ton.ExampleMod.core.init.ItemInit;

public class ExampleGroup extends ItemGroup {

    public static final ExampleGroup exampleGroup = new ExampleGroup();

    public ExampleGroup() {
        super("example_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
    }
}
