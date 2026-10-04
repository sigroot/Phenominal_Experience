package org.sigroot.phenomenal_experience;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Phenomenal_experience implements ModInitializer {
    public static final String Mod_ID = "phenomenal-experience";
    public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Phenomenal Experience");
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(Mod_ID, path);
    }
}
