package com.zaekeon.zaeksmod.client.gui;

import com.zaekeon.zaeksmod.inventory.ContainerZytaniumFurnace;
import com.zaekeon.zaeksmod.tileentity.TileEntityZytaniumFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z) {
        TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
        
        if(tile_entity instanceof TileEntityZytaniumFurnace){
    return new ContainerZytaniumFurnace(player.inventory, (TileEntityZytaniumFurnace) tile_entity);
    
    }
            
        return null;
        
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z) {
        TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
        if(tile_entity instanceof TileEntityZytaniumFurnace){
    return new GuiZytaniumFurnace(player.inventory, (TileEntityZytaniumFurnace) tile_entity);
    
    }
            
        return null;
    }

}
