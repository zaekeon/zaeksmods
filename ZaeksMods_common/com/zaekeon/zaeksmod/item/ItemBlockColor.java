package com.zaekeon.zaeksmod.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockColor extends ItemBlock {
    
    
    private final static String[] subNames = { "White",
        "Black", "Blue", "Yellow"
    };
    
    
    
    public ItemBlockColor(int id) {
        super(id);
        setHasSubtypes(true);
        setMaxDamage(0);
        
    }
    
    
    
    @Override
    public int getMetadata (int damageValue) {
        return damageValue;
    }



    public String getItemDisplayName(ItemStack itemstack){
        return "Zytanium " + subNames[itemstack.getItemDamage()];
        
    }
    
    
    
    
    

}
