package com.zaekeon.zaeksmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.zaekeon.zaeksmod.block.BlockInfo;
import com.zaekeon.zaeksmod.block.BlockLitStone;
import com.zaekeon.zaeksmod.block.BlockZytaniumOre;
import com.zaekeon.zaeksmod.config.ConfigHandler;
import com.zaekeon.zaeksmod.item.ItemInfo;
import com.zaekeon.zaeksmod.item.ItemZytaniumIngot;
import com.zaekeon.zaeksmod.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version =Reference.VERSION_NUMBER)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)  

public class zaeksmod {
    
    
  //ConfigFile

 
    
@PreInit

public void preInit(FMLPreInitializationEvent event) {

ConfigHandler.init(event.getSuggestedConfigurationFile());
    
    
}



//Blocks

public static Block LitStone;
public static Block ZytaniumOre;

//Items

public static Item zytaniumIngot;



@Init
public void init(FMLInitializationEvent event)
{
    

    
    
    //LIT STONE 
    //TODO reference these creates elsewhere.
    
    LitStone = new BlockLitStone(500,Material.rock).setUnlocalizedName("LitStone");
    
    GameRegistry.registerBlock(LitStone, Reference.MOD_ID + LitStone.getUnlocalizedName2());
    
    LanguageRegistry.addName(LitStone, "Lit Stone");
    
    
    //ZytaniumOre (this calls the registerblockid value for zytanium ore.
    
    ZytaniumOre = new BlockZytaniumOre(BlockInfo.zytaniumOreID,Material.iron).setUnlocalizedName(BlockInfo.ZYTANIUM_ORE_NAME);
    
    
    
    //ITEMS
    
    zytaniumIngot = new ItemZytaniumIngot(ItemInfo.zytaniumIngotID).setUnlocalizedName(ItemInfo.ZYTANIUM_INGOT_NAME);
    
    
    
    //Register
    gameRegisters();
    languageRegisters();
    
    
    
    //ZytaniumOreWorldGenCall
    GameRegistry.registerWorldGenerator(new com.zaekeon.zaeksmod.world.WorldGeneratorZaeksmod());
    
    
    
    
    
    
    
}

private static void gameRegisters(){
    
    GameRegistry.registerBlock(ZytaniumOre, "ZytaniumOre");
    GameRegistry.registerItem(zytaniumIngot, ItemInfo.ZYTANIUM_INGOT_NAME);
    
}

private static void languageRegisters(){
    LanguageRegistry.addName(ZytaniumOre, "Zytanium Ore");
    LanguageRegistry.addName(zytaniumIngot, "Zytanium Ingot");
}


@PostInit

public void postInit(FMLPostInitializationEvent event){
    
}
}
