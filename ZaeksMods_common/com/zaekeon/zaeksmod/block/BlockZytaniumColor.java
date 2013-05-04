package com.zaekeon.zaeksmod.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockZytaniumColor extends Block {

    private Icon iconBlack;
    private Icon iconBlue;
    private Icon iconYellow;
    private Icon iconWhite;

    public BlockZytaniumColor(int id, Material par2Material)

    {
        super(id, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightValue(1);
        this.setStepSound(Block.soundStoneFootstep);
        this.setHardness(3.0F);
        this.setResistance(5.0F);

        // this block, meta id, tool, min level?
        MinecraftForge.setBlockHarvestLevel(this, 1, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(this, 2, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(this, 3, "pickaxe", 1);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon("zaekmod:VoidBlack");
        iconBlack = reg.registerIcon("zaekmod:colorBlack");
        iconBlue = reg.registerIcon("zaekmod:colorBlue");
        iconYellow = reg.registerIcon("zaekmod:colorYellow");
        iconWhite = reg.registerIcon("zaekmod:colorWhite");
    }

    @Override
    public Icon getIcon(int side, int metadata) {
       
        if (metadata == 0)
            return iconWhite;
        if (metadata == 1)
            return iconBlack;
        
        if (metadata == 2)
            return iconBlue;
        
      
            return iconYellow;

    }

    @Override
    public int damageDropped(int metadata) {
        return metadata;
    }


    public void getSubBlocks(int par1, CreativeTabs tab, List list) {
        for (int NumOfMets = 0; NumOfMets < 4; NumOfMets++) {
            list.add(new ItemStack(par1, 1, NumOfMets));

        }
    }
}
