package ton.ExampleMod.core.init;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.common.armor.ExampleArmorMaterial;
import ton.ExampleMod.common.armor.ExampleChestplate;
import ton.ExampleMod.common.armor.ExampleHelmet;
import ton.ExampleMod.common.entity.ExampleEntity;
import ton.ExampleMod.common.food.ExampleFood;
import ton.ExampleMod.common.item.*;
import ton.ExampleMod.common.tools.ExampleAxe;
import ton.ExampleMod.common.tools.ExamplePickaxe;
import ton.ExampleMod.common.tools.ExampleSuperSword;
import ton.ExampleMod.common.tools.ExampleSword;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<ExampleItem> EXAMPLE_ITEM =
            ITEMS.register("example_item", ()-> new ExampleItem(new Item.Properties().group(ExampleGroup.exampleGroup)));

    public static final RegistryObject<ExampleItem2> EXAMPLE_ITEM_2 =
            ITEMS.register("example_item2", ()-> new ExampleItem2(new Item.Properties().group(ExampleGroup.exampleGroup)));

    public static final RegistryObject<ExampleItem3> EXAMPLE_ITEM3 =
            ITEMS.register("example_item3", ExampleItem3::new);

    public static final RegistryObject<MagicIngot> MAGIC_INGOT =
            ITEMS.register("magic_ingot", MagicIngot::new);

    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK =
            ITEMS.register("example_block", ()-> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties().group(ExampleGroup.exampleGroup)));

    public static final RegistryObject<ExampleFood> EXAMPLE_FOOD =
            ITEMS.register("example_food", ExampleFood::new);

    public static final RegistryObject<ExampleSword> EXAMPLE_SWORD =
            ITEMS.register("example_sword", ExampleSword::new);

    public static final RegistryObject<ExampleAxe> EXAMPLE_AXE =
            ITEMS.register("example_axe", ExampleAxe::new);

    public static final RegistryObject<ExamplePickaxe> EXAMPLE_PICKAXE =
            ITEMS.register("example_pickaxe", ExamplePickaxe::new);

    public static final RegistryObject<ExampleHelmet> EXAMPLE_HELMET =
            ITEMS.register("example_helmet", ExampleHelmet::new);

    public static final RegistryObject<ExampleChestplate> EXAMPLE_CHEST =
            ITEMS.register("example_chest", ExampleChestplate::new);

    public static final RegistryObject<Item> EXAMPLE_LEGGINGS =
            ITEMS.register("example_leggings",
                    ()-> new ArmorItem(ExampleArmorMaterial.EXAMPLE,
                            EquipmentSlotType.LEGS,
                            new Item.Properties().group(ExampleGroup.exampleGroup)));

    public static final RegistryObject<Item> EXAMPLE_BOOTS =
            ITEMS.register("example_boots",
                    ()-> new ArmorItem(ExampleArmorMaterial.EXAMPLE,
                            EquipmentSlotType.FEET,
                            new Item.Properties().group(ExampleGroup.exampleGroup)));

    public static final RegistryObject<InfiniteSnowball> INFINITE_SNOWBALL =
            ITEMS.register("infinite_snowball", InfiniteSnowball::new);

    public static final RegistryObject<TNTLauncher> TNT_LAUNCHER =
            ITEMS.register("tnt_launcher", TNTLauncher::new);

    public static final RegistryObject<ExampleSuperSword> EXAMPLE_SUPER_SWORD =
            ITEMS.register("example_super_sword", ExampleSuperSword::new);

    public static final RegistryObject<Item> EXAMPLE_ENTITY_EGG =
            ITEMS.register("example_entity_egg",
                    ()->new SpawnEggItem(ExampleEntity.TYPE, 803406, 11063436,
                            new Item.Properties().group(ExampleGroup.exampleGroup)));
}
