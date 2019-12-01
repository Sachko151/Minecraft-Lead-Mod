package com.sachko.leadmod.item;


import com.sachko.leadmod.LeadMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemLeadShovel extends ItemSpade {

    public ItemLeadShovel(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setUnlocalizedName(LeadMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.TOOLS);
    }

}
