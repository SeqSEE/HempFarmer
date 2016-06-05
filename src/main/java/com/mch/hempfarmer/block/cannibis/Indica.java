package com.mch.hempfarmer.block.cannibis;

import java.util.List;
import java.util.Random;

import com.mch.hempfarmer.block.HFBlockCrops;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Indica extends HFBlockCrops {
	
	public Indica(String name) {
		super(name);
	}

    @Override
	protected Item getSeed() {
		Item seed ;
		Random random = new Random();
		int x = random.nextInt(100) + 1;
		if (x > 97){
			boolean y = random.nextBoolean();
			seed = HFItems.seeds_sativa; 
		}
		else if (x > 90) {
			seed = HFItems.seeds_hemp;
		}
		else {
			seed = HFItems.seeds_indica;
		}
		return seed;
    }

    @Override
    protected Item getCrop() {
    	Item crop;
    	Random random = new Random();
    	int x = random.nextInt(100) + 1;
    	crop = x > 70 ? HFItems.bud : HFItems.indica_bud;
        return crop;
    }
    
    @Override
    public List<ItemStack> getDrops(net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        java.util.List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
        int age = getAge(state);
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (age >= getMaxAge()) {
            int k = 3 + fortune;
            for (int i = 0; i < 3 + fortune; ++i) {
                if (rand.nextInt(2 * getMaxAge()) <= age) {
                	ret.add(new ItemStack(this.getSeed(), rand.nextInt(2), 0));
                    ret.add(new ItemStack(this.getCrop(), rand.nextInt(4) + 1, 0));
                }
            }
        }
        int x = rand.nextInt(100) + 1;
        if (x > 99) {
        	ret.add(new ItemStack(HFItems.leaf, rand.nextInt(2) + 1));
        }
        return ret;
    }
}
