package com.bwbjustin.tutorial;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("tutorial")
public class TutorialMod
{
    public TutorialMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
