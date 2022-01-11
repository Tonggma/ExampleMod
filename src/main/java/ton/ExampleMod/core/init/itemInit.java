package ton.ExampleMod.core.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.common.food.exampleFood;
import ton.ExampleMod.common.item.exampleItem;
import ton.ExampleMod.common.item.exampleItem2;
import ton.ExampleMod.core.itemgroup.exampleGroup;

public class itemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<exampleItem> EXAMPLE_ITEM =
            ITEMS.register("example_item", ()-> new exampleItem(new Item.Properties().group(exampleGroup.exampleGroup)));

    public static final RegistryObject<exampleItem2> EXAMPLE_ITEM_2 =
            ITEMS.register("example_item2", ()-> new exampleItem2(new Item.Properties().group(exampleGroup.exampleGroup)));

    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK =
            ITEMS.register("example_block", ()-> new BlockItem(blockInit.EXAMPLE_BLOCK.get(), new Item.Properties().group(exampleGroup.exampleGroup)));

    public static final RegistryObject<exampleFood> EXAMPLE_FOOD =
            ITEMS.register("example_food", exampleFood::new);
}