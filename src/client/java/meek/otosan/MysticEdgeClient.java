package meek.otosan;

import net.fabricmc.api.ClientModInitializer;

public class MysticEdgeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // No extra tooltip lines added here
        System.out.println("[MysticEdge] Client initialized successfully.");
    }
}
