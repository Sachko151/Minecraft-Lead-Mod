package com.sachko.leadmod.item;


import com.sachko.leadmod.LeadMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemLeadArmor extends ItemArmor {

    public ItemLeadArmor(ArmorMaterial material, EntityEquipmentSlot equipmentSlot, String unlocalizedName, String registryName) {
        super(material, 0, equipmentSlot);

        setUnlocalizedName(LeadMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.COMBAT);
    }

}
