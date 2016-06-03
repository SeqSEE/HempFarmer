package com.mch.hempfarmer.block.cannibis;

import java.util.List;
import java.util.Random;

import com.mch.hempfarmer.Reference;
import com.mch.hempfarmer.block.HFBlockCrops;
import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Hemp extends HFBlockCrops{

    public Hemp(String name) {
		super(name);
		
	}

	@Override
	protected Item getSeed(){
		Item seed ;
		Random random = new Random();
		int x = random.nextInt(100) + 1;
		if (x > 90){
			boolean y = random.nextBoolean();
			seed = y == true ? HFItems.seeds_indica : HFItems.seeds_sativa; 
		}
		else {
			seed = HFItems.seeds_hemp;
		}		
		return seed;
    }
    
    @Override
    protected Item getCrop()
    {
        return HFItems.raw_hemp;
    }
    
    
    @Override
    public List<ItemStack> getDrops(net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune){
        java.util.List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
        int age = getAge(state);
        Random rand = world instanceof World ? ((World)world).rand : new Random();

        if (age >= getMaxAge()){
            int k = 3 + fortune;

            for (int i = 0; i < 3 + fortune; ++i){
                if (rand.nextInt(2 * getMaxAge()) <= age){
                    ret.add(new ItemStack(this.getSeed(), 1, 0));
                    ret.add(new ItemStack(this.getCrop(), rand.nextInt(4), 0));
                }
            }
        }
        return ret;
    }
    
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {AGE});
    }
    
       
}
