package com.mch.hempfarmer.block.dirt;

import com.mch.hempfarmer.block.HFBlockDirt;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class LimeDirt extends HFBlockDirt {

	public LimeDirt(String name) {
		super(name);
		this.blockSoundType = Blocks.SLIME_BLOCK.getSoundType();
	}

}
