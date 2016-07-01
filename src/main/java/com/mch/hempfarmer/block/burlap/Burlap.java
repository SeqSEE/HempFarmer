package com.mch.hempfarmer.block.burlap;

import com.mch.hempfarmer.block.HFBlockBurlap;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Burlap extends HFBlockBurlap{

	public Burlap(Material material, String name) {
		super(material, name);
	}
	
	@Override
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
            entityIn.fall(fallDistance = 0, 0.0F);
    }

}
