package com.sachko.leadmod.util;


import com.sachko.leadmod.block.BlockBasic;
import com.sachko.leadmod.init.LeadBlocks;
import com.sachko.leadmod.item.*;
import com.sachko.leadmod.materials.LeadMaterials;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                new BlockBasic(Material.ROCK, "leadOre", "lead_ore").setHardness(3f),
                new BlockBasic(Material.IRON, "leadBlock", "lead_block").setHardness(5f)
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new ItemBasic("leadIngot", "lead_ingot"),
                new ItemLeadAxe(LeadMaterials.LEAD_TOOL, "axeLead", "lead_axe"),
                new ItemLeadPickaxe(LeadMaterials.LEAD_TOOL, "pickaxeLead", "lead_pickaxe"),
                new ItemLeadHoe(LeadMaterials.LEAD_TOOL, "hoeLead", "lead_hoe"),
                new ItemLeadShovel(LeadMaterials.LEAD_TOOL, "shovelLead", "lead_shovel"),
                new ItemLeadSword(LeadMaterials.LEAD_TOOL, "swordLead", "lead_sword"),
                new ItemLeadArmor(LeadMaterials.LEAD_ARMOR, EntityEquipmentSlot.HEAD, "helmetLead", "lead_helmet"),
                new ItemLeadArmor(LeadMaterials.LEAD_ARMOR, EntityEquipmentSlot.CHEST, "chestplateLead", "lead_chestplate"),
                new ItemLeadArmor(LeadMaterials.LEAD_ARMOR, EntityEquipmentSlot.LEGS, "leggingsLead", "lead_leggings"),
                new ItemLeadArmor(LeadMaterials.LEAD_ARMOR, EntityEquipmentSlot.FEET, "bootsLead", "lead_boots")
        };

        final Item[] itemBlocks = {
                new ItemBlock(LeadBlocks.LEAD_ORE).setRegistryName(LeadBlocks.LEAD_ORE.getRegistryName()),
                new ItemBlock(LeadBlocks.LEAD_BLOCK).setRegistryName(LeadBlocks.LEAD_BLOCK.getRegistryName()),
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

}
