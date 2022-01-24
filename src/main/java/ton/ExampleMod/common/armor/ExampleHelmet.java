package ton.ExampleMod.common.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

public class ExampleHelmet extends ArmorItem {
    public ExampleHelmet() {
        super(ExampleArmorMaterial.EXAMPLE, EquipmentSlotType.HEAD, new Properties().group(ExampleGroup.exampleGroup));
    }
}
//创建一个头盔
