package ton.ExampleMod.common.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

public class SuperChestplate extends ArmorItem {
    public SuperChestplate() {
        super(ExampleArmorMaterial.EXAMPLE, EquipmentSlotType.CHEST, new Properties().group(ExampleGroup.exampleGroup));
    }
}
