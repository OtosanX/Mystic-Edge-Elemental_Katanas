package meek.otosan.loot;

import meek.otosan.MysticEdgeMod;
import meek.otosan.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class ModLootTableModifiers {

    // Vanilla loot tables
    public static final Identifier BASTION_TREASURE = new Identifier("minecraft", "chests/bastion_treasure");
    public static final Identifier NETHER_FORTRESS = new Identifier("minecraft", "chests/nether_bridge");
    public static final Identifier UNDERWATER_RUINS = new Identifier("minecraft", "chests/underwater_ruin_big");
    public static final Identifier OCEAN_MONUMENT = new Identifier("minecraft", "chests/ocean_monument");
    public static final Identifier STRONGHOLD = new Identifier("minecraft", "chests/stronghold_corridor");
    public static final Identifier END_CITY = new Identifier("minecraft", "chests/end_city_treasure");

    // Aether loot table (modded)
    public static final Identifier AETHER_DUNGEON = new Identifier("aether", "chests/dungeon");

    // Deeper & Darker loot table (modded)
    public static final Identifier WARDEN_TOWER = new Identifier("deeperdarker", "chests/warden_tower");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            // 🔥 Fire Katana — Nether progression (very rare)
            if (BASTION_TREASURE.equals(id) || NETHER_FORTRESS.equals(id)) {
                LootPool pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.FIRE_KATANA).weight(1)) // ~1% chance
                        .build();
                tableBuilder.pool(pool);
            }

            // 💧 Water Katana — Ocean progression (rare)
            if (OCEAN_MONUMENT.equals(id) || UNDERWATER_RUINS.equals(id)) {
                LootPool pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.WATER_KATANA).weight(2)) // ~2% chance
                        .build();
                tableBuilder.pool(pool);
            }

            // 🌬️ Wind Katana — Aether-only (uncommon)
            if (MysticEdgeMod.AETHER_LOADED) {
                if (AETHER_DUNGEON.equals(id)) {
                    LootPool pool = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .with(ItemEntry.builder(ModItems.WIND_KATANA).weight(3)) // ~3–4% in Aether dungeons
                            .build();
                    tableBuilder.pool(pool);
                }
            } else {
                // fallback idea: worldgen placement above Y=100 (to be added separately)
            }

            // ⛰️ Earth Katana — Stronghold progression (very rare)
            if (STRONGHOLD.equals(id)) {
                LootPool pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.EARTH_KATANA).weight(1)) // ~1% chance
                        .build();
                tableBuilder.pool(pool);
            }

            // 🌑 Shadow Katana — End progression (extremely rare)
            if (END_CITY.equals(id)) {
                LootPool pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.SHADOW_KATANA).weight(1)) // ~1% chance
                        .build();
                tableBuilder.pool(pool);
            }

            // 🪓 Warden Upgrade Template — Deeper & Darker compat
            if (MysticEdgeMod.DEEPERDARKER_LOADED && WARDEN_TOWER.equals(id)) {
                LootPool pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(
                                Registries.ITEM.get(new Identifier("deeperdarker", "warden_upgrade_template"))
                        ).weight(3)) // uncommon in warden towers
                        .build();
                tableBuilder.pool(pool);
            }
        });
    }
}
