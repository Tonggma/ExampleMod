package ton.ExampleMod.common.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.EquipmentSlotType;

public class ExampleEnchantment extends Enchantment {
    private static final EquipmentSlotType[] MAINHAND = new EquipmentSlotType[] {EquipmentSlotType.MAINHAND};
    public ExampleEnchantment() {
        super(Rarity.COMMON, EnchantmentType.WEAPON, MAINHAND);
    }

    public int getMinEnchantability(int enchantmentLevel) {
        return 1 + 10 * (enchantmentLevel - 1);
    }

    public int getMaxEnchantability(int enchantmentLevel) {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }

    /**
     * Returns the maximum level that the enchantment can have.
     */
    public int getMaxLevel() {
        return 5;
    }

    /**
     * Determines if this enchantment can be applied to a specific ItemStack.
     */
    @Override
    public boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench) && Enchantments.SWEEPING != ench;
    }
}
