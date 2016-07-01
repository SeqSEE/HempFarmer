package com.mch.hempfarmer.block.dirt;

import com.mch.hempfarmer.block.HFBlockDirt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class VioletDirt extends HFBlockDirt {

	public VioletDirt(String name) {
		super(name);
		this.blockSoundType = Blocks.SLIME_BLOCK.getSoundType();
	}

}
