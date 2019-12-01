package com.sachko.leadmod.materials;


import com.sachko.leadmod.LeadMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class LeadMaterials {

    public static final ToolMaterial LEAD_TOOL = EnumHelper.addToolMaterial(LeadMod.MODID + ":" + "tutorial_tool", 2, 225, 7.0F, 2.5F, 12);

    public static final ArmorMaterial LEAD_ARMOR = EnumHelper.addArmorMaterial(LeadMod.MODID + ":" + "tutorial_armor", LeadMod.MODID + ":tutorial", 16, new int[]{2, 5, 6, 3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);

}
