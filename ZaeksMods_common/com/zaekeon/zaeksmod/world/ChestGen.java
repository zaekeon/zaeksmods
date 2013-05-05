package com.zaekeon.zaeksmod.world;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;



public class ChestGen {
    
    //TODO
    //Hook this into OreDictionary
    
    
    //Generate Zytanium Ingots in chests.
    
    public static void init()
    {

        
        WeightedRandomChestContent lootIngotZytanium = new WeightedRandomChestContent(new ItemStack(com.zaekeon.zaeksmod.zaeksmod.zytaniumIngot), 1,3,5);
        ChestGenHooks.addItem("dungeonChest", lootIngotZytanium);
        ChestGenHooks.addItem("pyramidDesertyChest", lootIngotZytanium);
        ChestGenHooks.addItem("pyramidJungleChest", lootIngotZytanium);
        
        
    }
    


  
  
 
  
  
    
    

}
