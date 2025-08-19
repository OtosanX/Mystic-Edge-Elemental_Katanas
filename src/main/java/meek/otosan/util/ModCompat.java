package meek.otosan.util;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModCompat {
    public static final String DAD_MODID = "deeperdarker";

    // Check if D&D is loaded
    public static boolean isDeeperDarkerLoaded() {
        return FabricLoader.getInstance().isModLoaded(DAD_MODID);
    }

    // Get Warden Upgrade Template from Deeper & Darker
    public static Item getWardenUpgradeTemplate() {
        if (isDeeperDarkerLoaded()) {
            return Registries.ITEM.get(new Identifier(DAD_MODID, "warden_upgrade_template"));
        }
        return null; // safe fallback
    }
}
