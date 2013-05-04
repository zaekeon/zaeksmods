package com.zaekeon.zaeksmod.config;




import java.io.File;

import com.zaekeon.zaeksmod.block.BlockInfo;
import com.zaekeon.zaeksmod.item.ItemInfo;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
    
    
    
    public static Configuration configuration;
    
    
    public static void init(File configFile){
    
       configuration = new Configuration(configFile);
       
        configuration.load();
        
        //Load-Set Block IDs
        
        BlockInfo.zytaniumOreID = configuration.get(Configuration.CATEGORY_BLOCK, BlockInfo.ZYTANIUM_ORE_NAME, BlockInfo.ZYTANIUM_ORE_DEFAULT_ID).getInt();
        
        BlockInfo.zytaniumVoidBlackID = configuration.get(Configuration.CATEGORY_BLOCK, BlockInfo.ZYTANIUM_VOID_BLACK_NAME, BlockInfo.ZYTANIUM_VOID_BLACK_DEFAULT_ID).getInt();
        
        //Load-Set Item IDs
        
        ItemInfo.zytaniumIngotID = configuration.get(Configuration.CATEGORY_ITEM, ItemInfo.ZYTANIUM_INGOT_NAME, ItemInfo.ZYTANIUM_INGOT_DEFAULT_ID).getInt();
        ItemInfo.zytaniumSheetID = configuration.get(Configuration.CATEGORY_ITEM, ItemInfo.ZYTANIUM_SHEET_NAME, ItemInfo.ZYTANIUM_SHEET_DEFAULT_ID).getInt();
        ItemInfo.zytaniumStoneID = configuration.get(Configuration.CATEGORY_ITEM, ItemInfo.ZYTANIUM_STONE_NAME, ItemInfo.ZYTANIUM_STONE_DEFAULT_ID).getInt();
        ItemInfo.zytaniumHardIngotID = configuration.get(Configuration.CATEGORY_ITEM, ItemInfo.ZYTANIUM_HARDINGOT_NAME, ItemInfo.ZYTANIUM_HARDINGOT_DEFAULT_ID).getInt();
        
        configuration.save();
        
        
    }
}

    