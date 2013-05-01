package com.zaekeon.zaeksmod.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemZytaniumIngot extends Item {
    
    public ItemZytaniumIngot(int id){
    
    super(id);
    
    }
    
    @Override
    
    public void updateIcons(IconRegister iconReg)
    {
        this.iconIndex = iconReg.registerIcon(this.getUnlocalizedName());
    
    }
    
    
    
    

}
