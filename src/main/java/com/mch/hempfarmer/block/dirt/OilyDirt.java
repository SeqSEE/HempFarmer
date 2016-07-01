package com.mch.hempfarmer.block.dirt;

import com.mch.hempfarmer.block.HFBlockDirt;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class OilyDirt extends HFBlockDirt{

	public OilyDirt(String name) {
		super(name);
		this.blockSoundType = Blocks.SLIME_BLOCK.getSoundType();
		this.slipperiness = 0.96F;
	}

}
