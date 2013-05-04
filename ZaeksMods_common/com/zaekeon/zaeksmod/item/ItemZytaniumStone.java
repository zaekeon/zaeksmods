package com.zaekeon.zaeksmod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemZytaniumStone extends Item {
    
    public ItemZytaniumStone(int id){
    
    super(id);
    this.setCreativeTab(CreativeTabs.tabMaterials);
    this.setMaxStackSize(64);
    
    }
    
    
    
    //@Override
    
    
   // public void updateIcons(IconRegister iconReg)
   // {
      //  this.iconIndex = iconReg.registerIcon(ItemInfo.ZYTANIUM_INGOT_NAME);
        

    
   // }
    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister reg){
        this.iconIndex = reg.registerIcon("zaekmod:" + ItemInfo.ZYTANIUM_STONE_NAME);
    }
    
    

}
