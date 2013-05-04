package com.zaekeon.zaeksmod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemZytaniumIngot extends Item {
    
    public ItemZytaniumIngot(int id){
    
    super(id);
    this.setCreativeTab(CreativeTabs.tabMaterials);
    this.setMaxStackSize(64);
    
    }
    
    
    
    //@Override
    
    
   // public void updateIcons(IconRegister iconReg)
   // {
      //  this.iconIndex = iconReg.registerIcon(ItemInfo.ZYTANIUM_INGOT_NAME);
        

    
   // }
    
    

    @SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister reg){
        this.itemIcon = reg.registerIcon("zaekmod:" + ItemInfo.ZYTANIUM_INGOT_NAME);
    }
    
    

}
