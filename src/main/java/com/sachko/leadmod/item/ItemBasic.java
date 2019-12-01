package com.sachko.leadmod.item;


import com.sachko.leadmod.LeadMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item {

    public ItemBasic(String unlocalizedName, String registryName) {
        setUnlocalizedName(LeadMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MISC);
    }

}
