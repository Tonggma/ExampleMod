package ton.ExampleMod.common.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import ton.ExampleMod.core.itemgroup.exampleGroup;

public class exampleChestplate extends ArmorItem {
    public exampleChestplate() {
        super(exampleArmorMaterial.EXAMPLE, EquipmentSlotType.CHEST, new Properties().group(exampleGroup.exampleGroup));
    }
}
//创建一个胸甲
