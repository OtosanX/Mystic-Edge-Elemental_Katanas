package meek.otosan.item;

import meek.otosan.MysticEdgeMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ModItems {

    // === Base Elemental Katanas ===
    public static final Item FIRE_KATANA = register("fire_katana",
            new BaseKatanaItem(ModToolMaterials.FIRE, 5, -2.4f, new FabricItemSettings()));
    public static final Item WATER_KATANA = register("water_katana",
            new BaseKatanaItem(ModToolMaterials.WATER, 5, -2.4f, new FabricItemSettings()));
    public static final Item WIND_KATANA = register("wind_katana",
            new BaseKatanaItem(ModToolMaterials.WIND, 4, -2.2f, new FabricItemSettings()));
    public static final Item EARTH_KATANA = register("earth_katana",
            new BaseKatanaItem(ModToolMaterials.EARTH, 6, -2.6f, new FabricItemSettings()));
    public static final Item SHADOW_KATANA = register("shadow_katana",
            new BaseKatanaItem(ModToolMaterials.SHADOW, 5, -2.4f, new FabricItemSettings()));

    // === Black Elemental Katanas ===
    public static final Item BLACK_FIRE_KATANA = register("black_fire_katana",
            new BaseKatanaItem(ModToolMaterials.BLACK_FIRE, 7, -2.4f, new FabricItemSettings()));
    public static final Item BLACK_WATER_KATANA = register("black_water_katana",
            new BaseKatanaItem(ModToolMaterials.BLACK_WATER, 7, -2.4f, new FabricItemSettings()));
    public static final Item BLACK_WIND_KATANA = register("black_wind_katana",
            new BaseKatanaItem(ModToolMaterials.BLACK_WIND, 6, -2.2f, new FabricItemSettings()));
    public static final Item BLACK_EARTH_KATANA = register("black_earth_katana",
            new BaseKatanaItem(ModToolMaterials.BLACK_EARTH, 8, -2.6f, new FabricItemSettings()));
    public static final Item BLACK_SHADOW_KATANA = register("black_shadow_katana",
            new BaseKatanaItem(ModToolMaterials.BLACK_SHADOW, 7, -2.4f, new FabricItemSettings()));

    // === Warden Elemental Katanas ===
    public static final Item WARDEN_FIRE_KATANA = register("warden_fire_katana",
            new BaseKatanaItem(ModToolMaterials.WARDEN_FIRE, 10, -2.4f, new FabricItemSettings()));
    public static final Item WARDEN_WATER_KATANA = register("warden_water_katana",
            new BaseKatanaItem(ModToolMaterials.WARDEN_WATER, 10, -2.4f, new FabricItemSettings()));
    public static final Item WARDEN_WIND_KATANA = register("warden_wind_katana",
            new BaseKatanaItem(ModToolMaterials.WARDEN_WIND, 9, -2.2f, new FabricItemSettings()));
    public static final Item WARDEN_EARTH_KATANA = register("warden_earth_katana",
            new BaseKatanaItem(ModToolMaterials.WARDEN_EARTH, 11, -2.6f, new FabricItemSettings()));
    public static final Item WARDEN_SHADOW_KATANA = register("warden_shadow_katana",
            new BaseKatanaItem(ModToolMaterials.WARDEN_SHADOW, 10, -2.4f, new FabricItemSettings()));

    // === Aethernova Katana ===
    public static final Item AETHERNOVA_KATANA = register("aethernova_katana",
            new BaseKatanaItem(ModToolMaterials.AETHERNOVA, 13, -2.8f, new FabricItemSettings()));
    public static final Item BLACK_AETHERNOVA_KATANA = register("black_aethernova_katana",
            new BaseKatanaItem(ModToolMaterials.BLACK_AETHERNOVA, 15, -2.8f, new FabricItemSettings()));
    public static final Item WARDEN_AETHERNOVA_KATANA = register("warden_aethernova_katana",
            new BaseKatanaItem(ModToolMaterials.WARDEN_AETHERNOVA, 18, -2.8f, new FabricItemSettings()));

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MysticEdgeMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // Forces class loading
        System.out.println("Registering mod items for Mystic Edge");
    }
}
