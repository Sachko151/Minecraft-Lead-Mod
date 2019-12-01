package com.sachko.leadmod.util;


import com.sachko.leadmod.init.LeadBlocks;
import com.sachko.leadmod.init.LeadItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(LeadItems.LEAD_INGOT);
        registerModel(LeadItems.LEAD_AXE);
        registerModel(LeadItems.LEAD_PICKAXE);
        registerModel(LeadItems.LEAD_HOE);
        registerModel(LeadItems.LEAD_SHOVEL);
        registerModel(LeadItems.LEAD_SWORD);
        registerModel(LeadItems.LEAD_HELMET);
        registerModel(LeadItems.LEAD_CHESTPLATE);
        registerModel(LeadItems.LEAD_LEGGINGS);
        registerModel(LeadItems.LEAD_BOOTS);

        registerModel(Item.getItemFromBlock(LeadBlocks.LEAD_ORE));
        registerModel(Item.getItemFromBlock(LeadBlocks.LEAD_BLOCK));
    }

    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
