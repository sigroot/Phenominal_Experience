package org.sigroot.phenomenal_experience.client.gui;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import static org.sigroot.phenomenal_experience.Phenomenal_experience.id;

public class HudRenderingEntrypoint implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HudElementRegistry.attachElementAfter(VanillaHudElements.SUBTITLES, id("Phenominal_experience"), new PE_ExperienceBar());
    }
}
