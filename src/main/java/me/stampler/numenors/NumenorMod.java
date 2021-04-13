package me.stampler.numenors;

import me.stampler.numenors.regs.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NumenorMod.MOD_ID)
public class NumenorMod {
    public static final String MOD_ID = "numenors";

    private static final Logger LOGGER = LogManager.getLogger();

    public NumenorMod() {
        Registration.register();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}