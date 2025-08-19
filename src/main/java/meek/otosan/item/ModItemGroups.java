package meek.otosan.item;

import meek.otosan.MysticEdgeMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    // === Custom Mystic Edge Tab ===
    public static final ItemGroup MYSTIC_EDGE_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MysticEdgeMod.MOD_ID, "mystic_edge"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.mysticedge.mystic_edge")) // matches your en_us.json
                    .icon(() -> new ItemStack(ModItems.AETHERNOVA_KATANA))
                    .entries((context, entries) -> {
                        entries.add(ModItems.FIRE_KATANA);
                        entries.add(ModItems.WATER_KATANA);
                        entries.add(ModItems.WIND_KATANA);
                        entries.add(ModItems.EARTH_KATANA);
                        entries.add(ModItems.SHADOW_KATANA);

                        entries.add(ModItems.BLACK_FIRE_KATANA);
                        entries.add(ModItems.BLACK_WATER_KATANA);
                        entries.add(ModItems.BLACK_WIND_KATANA);
                        entries.add(ModItems.BLACK_EARTH_KATANA);
                        entries.add(ModItems.BLACK_SHADOW_KATANA);

                        entries.add(ModItems.WARDEN_FIRE_KATANA);
                        entries.add(ModItems.WARDEN_WATER_KATANA);
                        entries.add(ModItems.WARDEN_WIND_KATANA);
                        entries.add(ModItems.WARDEN_EARTH_KATANA);
                        entries.add(ModItems.WARDEN_SHADOW_KATANA);

                        entries.add(ModItems.AETHERNOVA_KATANA);
                        entries.add(ModItems.BLACK_AETHERNOVA_KATANA);
                        entries.add(ModItems.WARDEN_AETHERNOVA_KATANA);
                    })
                    .build()
    );

    public static void registerItemGroups() {
        // Add all katanas into the **vanilla Combat tab** too
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(ModItems.FIRE_KATANA);
            entries.add(ModItems.WATER_KATANA);
            entries.add(ModItems.WIND_KATANA);
            entries.add(ModItems.EARTH_KATANA);
            entries.add(ModItems.SHADOW_KATANA);

            entries.add(ModItems.BLACK_FIRE_KATANA);
            entries.add(ModItems.BLACK_WATER_KATANA);
            entries.add(ModItems.BLACK_WIND_KATANA);
            entries.add(ModItems.BLACK_EARTH_KATANA);
            entries.add(ModItems.BLACK_SHADOW_KATANA);

            entries.add(ModItems.WARDEN_FIRE_KATANA);
            entries.add(ModItems.WARDEN_WATER_KATANA);
            entries.add(ModItems.WARDEN_WIND_KATANA);
            entries.add(ModItems.WARDEN_EARTH_KATANA);
            entries.add(ModItems.WARDEN_SHADOW_KATANA);

            entries.add(ModItems.AETHERNOVA_KATANA);
            entries.add(ModItems.BLACK_AETHERNOVA_KATANA);
            entries.add(ModItems.WARDEN_AETHERNOVA_KATANA);
        });
    }
}
