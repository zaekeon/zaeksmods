package com.zaekeon.zaeksmod.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockLitStone extends Block{
    
    
    public BlockLitStone( int id, Material par2Material)
    
    {
        super(id, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightValue(1);
        this.setStepSound(Block.soundStoneFootstep);
        this.setHardness(4.0F);
        this.setResistance(1);
        
        
    }
    


}
