package com.zaekeon.zaeksmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.zaekeon.zaeksmod.block.BlockLitStone;
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
    
    
  
    
@PreInit

public void preInit(FMLPreInitializationEvent event) {

}



//Blocks

public static Block LitStone;

@Init
public void init(FMLInitializationEvent event)
{
    
    
    //LIT STONE 
    //TODO reference these creates elsewhere.
    
    LitStone = new BlockLitStone(500,Material.rock).setUnlocalizedName("LitStone");
    
    GameRegistry.registerBlock(LitStone, Reference.MOD_ID + LitStone.getUnlocalizedName2());
    
    LanguageRegistry.addName(LitStone, "Lit Stone");
    
}

@PostInit

public void postInit(FMLPostInitializationEvent event){
    
}
}
