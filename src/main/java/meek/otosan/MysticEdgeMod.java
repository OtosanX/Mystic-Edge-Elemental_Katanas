package meek.otosan;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import meek.otosan.item.ModItems;
import meek.otosan.item.ModItemGroups;
import meek.otosan.loot.ModLootTableModifiers;

public class MysticEdgeMod implements ModInitializer {
    public static final String MOD_ID = "mysticedge";

    // Mod compatibility flags
    public static final boolean AETHER_LOADED = FabricLoader.getInstance().isModLoaded("aether");
    public static final boolean DEEPERDARKER_LOADED = FabricLoader.getInstance().isModLoaded("deeperdarker");

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModLootTableModifiers.modifyLootTables();
    }
}
