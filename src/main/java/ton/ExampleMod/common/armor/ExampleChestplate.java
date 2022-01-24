package ton.ExampleMod.common.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import ton.ExampleMod.core.itemgroup.ExampleGroup;

public class ExampleChestplate extends ArmorItem {
    public ExampleChestplate() {
        super(ExampleArmorMaterial.EXAMPLE, EquipmentSlotType.CHEST, new Properties().group(ExampleGroup.exampleGroup));
    }
}
//创建一个胸甲
