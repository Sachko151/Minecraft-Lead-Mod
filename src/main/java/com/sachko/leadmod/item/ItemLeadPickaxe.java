package com.sachko.leadmod.item;

import com.sachko.leadmod.LeadMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemLeadPickaxe extends ItemPickaxe {

    public ItemLeadPickaxe(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setUnlocalizedName(LeadMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.TOOLS);
    }

}
