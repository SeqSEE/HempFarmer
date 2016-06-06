package com.mch.hempfarmer.block.cannibis;

import java.util.List;
import java.util.Random;

import com.mch.hempfarmer.HempFarmer;
import com.mch.hempfarmer.block.HFBlockCrops;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Hemp extends HFBlockCrops{

    public Hemp(String name) {
		super(name);
    }

	@Override
	protected Item getSeed() {
		Item seed;
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
    protected Item getCrop() {
    	if (!HempFarmer.drugs){
    		return HFItems.raw_hemp;
    	}
    	Item crop;
    	Random random = new Random();
    	int x = random.nextInt(100) + 1;
    	crop = x > 90 ? HFItems.bud : HFItems.raw_hemp;
        return crop;
    }
    
    
    @Override
    public List<ItemStack> getDrops(net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune){
        java.util.List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
        int age = getAge(state);
        Random rand = world instanceof World ? ((World)world).rand : new Random();

        if (age >= getMaxAge()) {
            int k = 3 + fortune;

            for (int i = 0; i < 3 + fortune; ++i) {
                if (rand.nextInt(2 * getMaxAge()) <= age) {
                    ret.add(new ItemStack(this.getSeed(), 1));
                    ret.add(new ItemStack(this.getCrop(), rand.nextInt(4)));
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
