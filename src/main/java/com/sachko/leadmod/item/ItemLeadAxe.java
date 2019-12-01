package com.sachko.leadmod.item;


import com.sachko.leadmod.LeadMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemLeadAxe extends ItemAxe {

    public ItemLeadAxe(ToolMaterial material, float damage, float speed, String unlocalizedName, String registryName) {
        super(material, damage, speed);

        setUnlocalizedName(LeadMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.TOOLS);
    }

    public ItemLeadAxe(ToolMaterial material, String unlocalizedName, String registryName) {
        this(material, 8.0F, -1.1F, unlocalizedName, registryName);
    }

}
