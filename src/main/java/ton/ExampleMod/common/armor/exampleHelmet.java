package ton.ExampleMod.common.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import ton.ExampleMod.core.itemgroup.exampleGroup;

public class exampleHelmet extends ArmorItem {
    public exampleHelmet() {
        super(exampleArmorMaterial.EXAMPLE, EquipmentSlotType.HEAD, new Properties().group(exampleGroup.exampleGroup));
    }
}
//创建一个头盔
