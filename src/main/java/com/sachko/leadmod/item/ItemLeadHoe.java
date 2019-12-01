package com.sachko.leadmod.item;

import com.sachko.leadmod.LeadMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemLeadHoe extends ItemHoe {

    public ItemLeadHoe(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setUnlocalizedName(LeadMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.TOOLS);
    }

}
