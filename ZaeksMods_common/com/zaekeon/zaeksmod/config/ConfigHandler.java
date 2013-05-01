package com.zaekeon.zaeksmod.config;




import java.io.File;

import com.zaekeon.zaeksmod.block.BlockIDs;
import com.zaekeon.zaeksmod.item.ItemIDs;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
    
    
    
    public static Configuration configuration;
    
    
    public static void init(File configFile){
    
       configuration = new Configuration(configFile);
       
        configuration.load();
        
        //Load-Set Block IDs
        
        BlockIDs.zytaniumOreID = configuration.get(Configuration.CATEGORY_BLOCK, "ZytaniumOre", 501).getInt();
        
        
        //Load-Set Item IDs
        
        ItemIDs.zytaniumIngotID = configuration.get(Configuration.CATEGORY_ITEM, "ZytaniumIngot", 14500).getInt();
        
        configuration.save();
        
    }
}

    