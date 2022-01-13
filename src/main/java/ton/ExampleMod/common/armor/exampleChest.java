package ton.ExampleMod.common.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import ton.ExampleMod.core.itemgroup.exampleGroup;

public class exampleChest extends ArmorItem {
    public exampleChest() {
        super(exampleArmorMaterial.EXAMPLE, EquipmentSlotType.CHEST, new Properties().group(exampleGroup.exampleGroup));
    }
}
