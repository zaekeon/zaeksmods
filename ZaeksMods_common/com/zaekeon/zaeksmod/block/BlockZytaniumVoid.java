package com.zaekeon.zaeksmod.block;


import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class BlockZytaniumVoid extends Block{
    
    
    public BlockZytaniumVoid( int id, Material par2Material)
    
    {
        super(id, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightValue(1);
        this.setStepSound(Block.soundStoneFootstep);
        this.setHardness(4.0F);
        this.setResistance(1);
        
        
    }
    
    @Override
    public void registerIcons(IconRegister reg)
    {
        this.blockIcon = reg.registerIcon("zaekmod:VoidBlack");
    }
    
    
    public int idDropped(int par1, Random rand, int par2){
        return this.blockID;
    }
    
    public int quantityDropped(Random rand){
        return 1;
    }
    


}
