package org.dimdev.vanillafix;

import net.minecraftforge.fml.common.ModContainer;

import java.util.Set;

public interface IPatchedCrashReport {
    public Set<ModContainer> getSuspectedMods();
}
