package meek.otosan.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    // === Base Katanas ===
    FIRE(4, 1200, 9.0f, 0.0f, 22, () -> Ingredient.ofItems(Items.NETHERITE_SCRAP)),
    WATER(4, 1400, 9.0f, 0.0f, 22, () -> Ingredient.ofItems(Items.HEART_OF_THE_SEA)),
    WIND(4, 1100, 9.0f, 0.0f, 22, () -> Ingredient.ofItems(Items.PHANTOM_MEMBRANE)),
    EARTH(4, 1600, 9.0f, 0.0f, 22, () -> Ingredient.ofItems(Items.EMERALD)),
    SHADOW(4, 1300, 9.0f, 0.0f, 22, () -> Ingredient.ofItems(Items.ENDER_EYE)),

    // === Black Katanas ===
    BLACK_FIRE(4, 2400, 9.0f, 0.0f, 25, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    BLACK_WATER(4, 2600, 9.0f, 0.0f, 25, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    BLACK_WIND(4, 2200, 9.0f, 0.0f, 25, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    BLACK_EARTH(4, 2800, 9.0f, 0.0f, 25, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    BLACK_SHADOW(4, 2500, 9.0f, 0.0f, 25, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    // === Warden Katanas ===
    WARDEN_FIRE(4, 3600, 9.0f, 0.0f, 30, () -> Ingredient.ofItems(Items.ECHO_SHARD)),
    WARDEN_WATER(4, 3800, 9.0f, 0.0f, 30, () -> Ingredient.ofItems(Items.ECHO_SHARD)),
    WARDEN_WIND(4, 3400, 9.0f, 0.0f, 30, () -> Ingredient.ofItems(Items.ECHO_SHARD)),
    WARDEN_EARTH(4, 4000, 9.0f, 0.0f, 30, () -> Ingredient.ofItems(Items.ECHO_SHARD)),
    WARDEN_SHADOW(4, 3700, 9.0f, 0.0f, 30, () -> Ingredient.ofItems(Items.ECHO_SHARD)),

    // === Aethernova ===
    AETHERNOVA(5, 5000, 10.0f, 0.0f, 30, () -> Ingredient.ofItems(Items.NETHER_STAR)),
    BLACK_AETHERNOVA(5, 6000, 10.0f, 0.0f, 30, () -> Ingredient.ofItems(Items.NETHER_STAR)),
    WARDEN_AETHERNOVA(5, 7500, 10.0f, 0.0f, 30, () -> Ingredient.ofItems(Items.NETHER_STAR));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed,
                     float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
