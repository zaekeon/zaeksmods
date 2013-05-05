package com.zaekeon.zaeksmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.zaekeon.zaeksmod.block.BlockInfo;
import com.zaekeon.zaeksmod.block.BlockLitStone;
import com.zaekeon.zaeksmod.block.BlockZytaniumColor;
import com.zaekeon.zaeksmod.block.BlockZytaniumOre;
import com.zaekeon.zaeksmod.block.BlockZytaniumVoid;
import com.zaekeon.zaeksmod.config.ConfigHandler;
import com.zaekeon.zaeksmod.item.ItemBlockColor;
import com.zaekeon.zaeksmod.item.ItemInfo;
import com.zaekeon.zaeksmod.item.ItemZytaniumHardIngot;
import com.zaekeon.zaeksmod.item.ItemZytaniumIngot;
import com.zaekeon.zaeksmod.item.ItemZytaniumSheet;
import com.zaekeon.zaeksmod.item.ItemZytaniumStone;
import com.zaekeon.zaeksmod.lib.Reference;
import com.zaekeon.zaeksmod.world.ChestGen;
import com.zaekeon.zaeksmod.core.proxy.CommonProxy;

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
import cpw.mods.fml.common.SidedProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version =Reference.VERSION_NUMBER)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)  




public class zaeksmod {
 
@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
public static CommonProxy proxy;

    
  //ConfigFile

 
    
@PreInit

public void preInit(FMLPreInitializationEvent event) {

ConfigHandler.init(event.getSuggestedConfigurationFile());
    
    
}



//Blocks

public static Block LitStone;
public static Block ZytaniumOre;
public static Block zytaniumVoidBlack;
public static Block zytaniumColorBlock;


//Items

public static Item zytaniumIngot;
public static Item zytaniumSheet;
public static Item zytaniumStone;
public static Item zytaniumHardIngot;

//Metadata Blocks
public static ItemStack colorBlackBlock;
public static ItemStack colorBlueBlock;
public static ItemStack colorYellowBlock;


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
    zytaniumVoidBlack = new BlockZytaniumVoid(BlockInfo.zytaniumVoidBlackID,Material.rock).setUnlocalizedName(BlockInfo.ZYTANIUM_VOID_BLACK_NAME);
    
    
    //ITEMS
    
    zytaniumIngot = new ItemZytaniumIngot(ItemInfo.zytaniumIngotID).setUnlocalizedName(ItemInfo.ZYTANIUM_INGOT_NAME);
    zytaniumSheet = new ItemZytaniumSheet(ItemInfo.zytaniumSheetID).setUnlocalizedName(ItemInfo.ZYTANIUM_SHEET_NAME);
    zytaniumStone = new ItemZytaniumStone(ItemInfo.zytaniumStoneID).setUnlocalizedName(ItemInfo.ZYTANIUM_STONE_NAME);
    zytaniumHardIngot = new ItemZytaniumHardIngot(ItemInfo.zytaniumHardIngotID).setUnlocalizedName(ItemInfo.ZYTANIUM_HARDINGOT_NAME);
    
    
    //OreDictionary Support Test
    //register as, 2nd item to register
   
    OreDictionary.registerOre("ingotZytanium", new ItemStack(zytaniumIngot));
    

    
    //Register
    gameRegisters();
    languageRegisters();
    
    
    
    //ZytaniumOreWorldGenCall
    GameRegistry.registerWorldGenerator(new com.zaekeon.zaeksmod.world.WorldGeneratorZaeksmod());
    
   // Non-ore dictionary way

   //GameRegistry.addSmelting(com.zaekeon.zaeksmod.zaeksmod.ZytaniumOre.blockID, new ItemStack(com.zaekeon.zaeksmod.zaeksmod.zytaniumIngot.itemID, 1, 0), 1.0F);
    
    //RegularRecipies
    
   //Non Item Stack Way
   // GameRegistry.addRecipe(new ShapedOreRecipe(com.zaekeon.zaeksmod.zaeksmod.zytaniumStone, true, new Object[] {
   //         "F F", " X ", "F F", Character.valueOf('F'), "ingotZytanium", Character.valueOf('X'), Item.diamond}));
    
    
    //OreRecipie that results in item stack of 4
    
    
  //BLOCK RECIPES
    
    //blackvoid
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(com.zaekeon.zaeksmod.zaeksmod.zytaniumVoidBlack, 32), true, new Object[] {
        "F F", " X ", "F F", Character.valueOf('F'), "ingotZytanium", Character.valueOf('X'), Item.dyePowder}));
    
    GameRegistry.addRecipe(new ItemStack(com.zaekeon.zaeksmod.zaeksmod.zytaniumVoidBlack, 32), "FFF", "FXF", "FFF", 'F', com.zaekeon.zaeksmod.zaeksmod.zytaniumSheet, 'X', Item.dyePowder); 
    
  
    
    //litstone
    GameRegistry.addRecipe(new ItemStack(com.zaekeon.zaeksmod.zaeksmod.LitStone, 8), "FFF", "FXF", "FFF", 'F', Block.stone, 'X', Item.lightStoneDust);
    
    //ITEM RECIPES
    
    //ZytaniumStone
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(com.zaekeon.zaeksmod.zaeksmod.zytaniumStone, 2), true, new Object[] {
            "F F", " X ", "F F", Character.valueOf('F'), "ingotZytanium", Character.valueOf('X'), Item.diamond}));
    
    //ZytaniumSheets
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(com.zaekeon.zaeksmod.zaeksmod.zytaniumSheet, 16), true, new Object[] {
        "FF ", "FF ", Character.valueOf('F'), "ingotZytanium"}));
 

    
    
    
    //SMELTING
    
    GameRegistry.addSmelting(com.zaekeon.zaeksmod.zaeksmod.ZytaniumOre.blockID, OreDictionary.getOres("ingotZytanium").get(0), 1.0F);
    
    GameRegistry.addSmelting(com.zaekeon.zaeksmod.zaeksmod.zytaniumStone.itemID, new ItemStack(com.zaekeon.zaeksmod.zaeksmod.zytaniumHardIngot.itemID, 1, 0), 1.0F);
    
    
    //Multiblock (metadata blocks)
    
 zytaniumColorBlock =  new BlockZytaniumColor(BlockInfo.zytaniumColorBlockID, Material.rock).setUnlocalizedName(BlockInfo.ZYTANIUM_COLOR_BLOCK__NAME);
 GameRegistry.registerBlock(zytaniumColorBlock, ItemBlockColor.class,  BlockInfo.ZYTANIUM_COLOR_BLOCK__NAME);
 
 //Declare ItemStacks for Metadata blocks
 colorBlackBlock = new ItemStack(zytaniumColorBlock, 1, 1);
 colorBlueBlock = new ItemStack(zytaniumColorBlock, 1, 2);
 colorYellowBlock = new ItemStack(zytaniumColorBlock, 1, 3);

 
 //Recipe that creates a stack of 32 metablocks of id 1.
 GameRegistry.addRecipe(new ItemStack(com.zaekeon.zaeksmod.zaeksmod.zytaniumColorBlock, 32, 1), "FFF", "FXF", "FFF", 'F', com.zaekeon.zaeksmod.zaeksmod.zytaniumIngot, 'X', Item.dyePowder);

 ChestGen.init();
 
    
 //need to clean up all these recipes and blocks to separate register classes.   
    
    
    
    
}

private static void gameRegisters(){
    
    //BLOCKS
    GameRegistry.registerBlock(ZytaniumOre, "ZytaniumOre");
    GameRegistry.registerBlock(zytaniumVoidBlack, BlockInfo.ZYTANIUM_VOID_BLACK_NAME);
    
    
    
    //ITEMS
    GameRegistry.registerItem(zytaniumIngot, ItemInfo.ZYTANIUM_INGOT_NAME);
    GameRegistry.registerItem(zytaniumSheet, ItemInfo.ZYTANIUM_SHEET_NAME);
    GameRegistry.registerItem(zytaniumStone, ItemInfo.ZYTANIUM_STONE_NAME);
    GameRegistry.registerItem(zytaniumHardIngot, ItemInfo.ZYTANIUM_HARDINGOT_NAME);
}

private static void languageRegisters(){
    //BLOCKS
    
    LanguageRegistry.addName(ZytaniumOre, "Zytanium Ore");
    LanguageRegistry.addName(zytaniumVoidBlack, "Zytanium Black Void");
     
     //ITEMS
     LanguageRegistry.addName(zytaniumIngot, "Zytanium Ingot");
     LanguageRegistry.addName(zytaniumSheet, "Zytanium Sheet");
     LanguageRegistry.addName(zytaniumStone, "Zytanium Stone");
     LanguageRegistry.addName(zytaniumHardIngot, "Zytanium Hard Ingot");
}


@PostInit

public void postInit(FMLPostInitializationEvent event){
    
}



}


