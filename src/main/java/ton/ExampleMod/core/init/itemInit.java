package ton.ExampleMod.core.init;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.common.armor.exampleArmorMaterial;
import ton.ExampleMod.common.armor.exampleChest;
import ton.ExampleMod.common.armor.exampleHelmet;
import ton.ExampleMod.common.food.exampleFood;
import ton.ExampleMod.common.item.exampleItem;
import ton.ExampleMod.common.item.exampleItem2;
import ton.ExampleMod.common.item.exampleItem3;
import ton.ExampleMod.common.tools.exampleAxe;
import ton.ExampleMod.common.tools.examplePickaxe;
import ton.ExampleMod.common.tools.exampleSword;
import ton.ExampleMod.core.itemgroup.exampleGroup;

public class itemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<exampleItem> EXAMPLE_ITEM =
            ITEMS.register("example_item", ()-> new exampleItem(new Item.Properties().group(exampleGroup.exampleGroup)));

    public static final RegistryObject<exampleItem2> EXAMPLE_ITEM_2 =
            ITEMS.register("example_item2", ()-> new exampleItem2(new Item.Properties().group(exampleGroup.exampleGroup)));

    public static final RegistryObject<exampleItem3> EXAMPLE_ITEM3 =
            ITEMS.register("example_item3", exampleItem3::new);

    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK =
            ITEMS.register("example_block", ()-> new BlockItem(blockInit.EXAMPLE_BLOCK.get(), new Item.Properties().group(exampleGroup.exampleGroup)));

    public static final RegistryObject<exampleFood> EXAMPLE_FOOD =
            ITEMS.register("example_food", exampleFood::new);

    public static final RegistryObject<exampleSword> EXAMPLE_SWORD =
            ITEMS.register("example_sword", exampleSword::new);

    public static final RegistryObject<exampleAxe> EXAMPLE_AXE =
            ITEMS.register("example_axe", exampleAxe::new);

    public static final RegistryObject<examplePickaxe> EXAMPLE_PICKAXE =
            ITEMS.register("example_pickaxe", examplePickaxe::new);

    public static final RegistryObject<exampleHelmet> EXAMPLE_HELMET =
            ITEMS.register("example_helmet", exampleHelmet::new);

    public static final RegistryObject<exampleChest> EXAMPLE_CHEST =
            ITEMS.register("example_chest", exampleChest::new);

    public static final RegistryObject<Item> EXAMPLE_LEGGING =
            ITEMS.register("example_legging",
                    ()-> new ArmorItem(exampleArmorMaterial.EXAMPLE,
                            EquipmentSlotType.LEGS,
                            new Item.Properties().group(exampleGroup.exampleGroup)));

    public static final RegistryObject<Item> EXAMPLE_FEET =
            ITEMS.register("example_feet",
                    ()-> new ArmorItem(exampleArmorMaterial.EXAMPLE,
                            EquipmentSlotType.FEET,
                            new Item.Properties().group(exampleGroup.exampleGroup)));
}
