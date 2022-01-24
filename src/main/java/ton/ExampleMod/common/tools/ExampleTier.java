package ton.ExampleMod.common.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import ton.ExampleMod.core.init.ItemInit;

import java.util.function.Supplier;


public enum ExampleTier implements IItemTier {
    EXAMPLETIER(4, 3023, 9.0F, 0, 15, () -> {
        return Ingredient.fromItems(ItemInit.EXAMPLE_ITEM.get());
    });


    private final int harvestLevel; //挖掘等级
    private final int maxUses; //耐久值
    private final float efficiency; //效率：指标 + 工具效率 + 方块相关效率 + 急迫度
    private final float attackDamage; //攻击力 + 武器攻击 + 盔甲防御值
    private final int enchantability; //附魔亲和度
    private final LazyValue<Ingredient> repairMaterial; //修复材料

    private ExampleTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
