package org.sigroot.phenomenal_experience.client.gui;

import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.util.ARGB;
import net.minecraft.util.Mth;
import net.minecraft.util.Util;

public class PE_ExperienceBar implements HudElement {
    @Override
    public void extractRenderState(GuiGraphicsExtractor graphics, DeltaTracker deltaTracker) {
        float currTime = (float) ((((int) Util.getMillis()) % 1000) / 1000.0);

        int lerpColor = ARGB.linearLerp(currTime, 0xFF00FF00, 0xFF0000FF);
        int movementY = (int) (
            100 * (
                Mth.sin(
                    2.0*Mth.PI*Mth.clamp(
                        2.0*(currTime-0.5),
                        0.0,
                        1.0)
                    + Mth.PI
                )
                + 0.5
            )
        );
        int movementX = (int) (
            100 * (
                Mth.cos(
                    2.0*Mth.PI*Mth.clamp(
                        2.0*(currTime-0.5),
                        0.0,
                        1.0)
                    + Mth.PI
                )
                + 0.5
            )
        );

        graphics.fill(100 + movementX, movementY, 150 + movementX, 50 + movementY, lerpColor);
    }
}
