package com.mch.hempfarmer.block.dirt;

import com.mch.hempfarmer.block.HFBlockDirt;

import net.minecraft.init.Blocks;

public class ResinDirt extends HFBlockDirt{

	public ResinDirt(String name) {
		super(name);
		this.blockSoundType = Blocks.OBSIDIAN.getSoundType();
	}

}
