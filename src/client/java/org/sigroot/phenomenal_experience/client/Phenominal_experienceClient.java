package org.sigroot.phenomenal_experience.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.sigroot.phenomenal_experience.Phenomenal_experience;
import org.sigroot.phenomenal_experience.client.gui.HudRenderingEntrypoint;
import org.sigroot.phenomenal_experience.client.gui.PE_ExperienceBar;

import static org.sigroot.phenomenal_experience.Phenomenal_experience.id;

public class Phenominal_experienceClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HudElementRegistry.attachElementAfter(VanillaHudElements.SUBTITLES, id("demobar"), new PE_ExperienceBar());
    }
}
