package com.sachko.leadmod.recipes;


import com.sachko.leadmod.block.BlockBasic;
import com.sachko.leadmod.init.LeadBlocks;
import com.sachko.leadmod.init.LeadItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LeadRecipes {

    public static void initSmelting() {
        GameRegistry.addSmelting(LeadBlocks.LEAD_ORE, new ItemStack(LeadItems.LEAD_INGOT), 10.0F);
    }

}
