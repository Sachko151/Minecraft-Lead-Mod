package com.sachko.leadmod;

import com.sachko.leadmod.proxy.IProxy;
import com.sachko.leadmod.recipes.LeadRecipes;
import com.sachko.leadmod.world.gen.LeadWorldGen;
import org.apache.logging.log4j.Logger;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = LeadMod.MODID, name = LeadMod.NAME, version = LeadMod.VERSION, acceptedMinecraftVersions = LeadMod.MC_VERSION)
public class LeadMod {

    public static final String MODID = "leadmod";
    public static final String NAME = "Sachko's lead mod!";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12]";

    public static final String CLIENT = "com.sachko.leadmod.proxy.ClientProxy";
    public static final String SERVER = "com.sachko.leadmod.proxy.ServerProxy";


    @SidedProxy(clientSide = LeadMod.CLIENT, serverSide = LeadMod.SERVER)
    public static IProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        LeadRecipes.initSmelting();
        GameRegistry.registerWorldGenerator(new LeadWorldGen(), 0);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}