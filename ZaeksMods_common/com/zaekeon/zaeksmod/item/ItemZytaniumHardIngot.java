package com.zaekeon.zaeksmod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemZytaniumHardIngot extends Item {
    
    public ItemZytaniumHardIngot(int id){
    
    super(id);
    this.setCreativeTab(CreativeTabs.tabMaterials);
    this.setMaxStackSize(64);
    
    }
    
    
    

       
    
    @SideOnly(Side.CLIENT)
    
    public void updateIcons(IconRegister reg){
        this.itemIcon = reg.registerIcon("zaekmod:" + ItemInfo.ZYTANIUM_HARDINGOT_NAME);
    }
    
    

}
