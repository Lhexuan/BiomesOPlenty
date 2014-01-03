package biomesoplenty.common.biomes;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import biomesoplenty.common.eventhandler.world.DecorateBiomeEventHandler;
import biomesoplenty.common.world.decoration.IBOPDecoration;
import biomesoplenty.common.world.features.WorldGenBOPFlora;

public class BOPBiome extends BiomeGenBase implements IBOPDecoration
{
	public BOPBiome(int biomeID) 
	{
		super(biomeID);
	}
	
    @Override
	public void decorate(World world, Random random, int x, int z)
    {
    	DecorateBiomeEventHandler.decorate(world, random, this, x, z);
    }
    
    @Override
	public WorldGenBOPFlora getRandomWorldGenForBOPFlowers(Random random)
    {
    	return null;
    }
}
