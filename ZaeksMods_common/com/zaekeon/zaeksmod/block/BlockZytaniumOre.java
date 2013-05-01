package com.zaekeon.zaeksmod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class BlockZytaniumOre extends Block{
    
    public BlockZytaniumOre(int id, Material mat){
        super(id, mat);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setResistance(1F);
        this.setHardness(4F);
    }
    
    
    @Override
    public void registerIcons(IconRegister reg)
    {
        this.blockIcon = reg.registerIcon("zaekmod:ZytaniumOre");
    }
    
    public int idDropped(int par1, Random rand, int par2){
        return this.blockID;
    }
    
    public int quantityDropped(Random rand){
        return 1;
    }
    
    
}

