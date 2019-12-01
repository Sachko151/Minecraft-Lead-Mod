package com.sachko.leadmod.item;


import com.sachko.leadmod.LeadMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemLeadSword extends ItemSword {

    public ItemLeadSword(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setUnlocalizedName(LeadMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.COMBAT);
    }


}
