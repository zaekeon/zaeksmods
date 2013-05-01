package com.zaekeon.zaeksmod.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;



public class WorldGeneratorZaeksmod implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        // TODO Auto-generated method stub
        
        
        //END Switch statement doesn't work?
        if (world.provider.dimensionId == 1)
        {
            generateEnd(world,random,chunkX*16,chunkZ*16);
            
        }
        
        //Surface
        
        if (world.provider.dimensionId == 0)
        {
        generateSurface(world,random,chunkX*16,chunkZ*16);
        
        }
        
        if (world.provider.dimensionId == -1)
        {
        generateNether(world,random,chunkX*16,chunkZ*16);
        }
        
        
        
            
        }

    private void generateNether(World world, Random random, int chunkX, int chunkZ) {
       
        for(int i=0; i<50;i++){ //stone is like 16?
        int coordX= random.nextInt(16)+chunkX;
        int coordY= random.nextInt(64);  //level to spawn at
        int coordZ= random.nextInt(16)+chunkZ;
        
        //must reference the created object
        (new WorldGenMinable(com.zaekeon.zaeksmod.zaeksmod.ZytaniumOre.blockID, 18)) .generate(world,random,coordX,coordY,coordZ);//vein size
        
        }
        }
            
        
    

    private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
        for(int i=0; i<50;i++){ //stone is like 16?
        int coordX= random.nextInt(16)+chunkX;
        int coordY= random.nextInt(64);  //level to spawn at
        int coordZ= random.nextInt(16)+chunkZ;
        
        //must reference the created object
        (new WorldGenMinable(com.zaekeon.zaeksmod.zaeksmod.ZytaniumOre.blockID, 18)) .generate(world,random,coordX,coordY,coordZ);//vein size
        }
    }

    private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
      
        for(int i=0; i<50;i++){ //stone is like 16?
        int coordX= random.nextInt(16)+chunkX;
        int coordY= random.nextInt(64);  //level to spawn at
        int coordZ= random.nextInt(16)+chunkZ;
        
        //must reference the created object
        (new WorldGenMinable(com.zaekeon.zaeksmod.zaeksmod.ZytaniumOre.blockID, 18)) .generate(world,random,coordX,coordY,coordZ);//vein size
    }
    }
}
        
    


