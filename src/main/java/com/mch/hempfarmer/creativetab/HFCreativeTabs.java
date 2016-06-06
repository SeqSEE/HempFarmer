package com.mch.hempfarmer.creativetab;

import java.util.List;

import com.mch.hempfarmer.HempFarmer;
import com.mch.hempfarmer.init.HFBlocks;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HFCreativeTabs extends CreativeTabs{

	public HFCreativeTabs(int index, String label){
		super(index, label);
	}

	
    public static final HFCreativeTabs HFCombat = new HFCreativeTabs(CreativeTabs.getNextID(), "hfcombat"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
        	return HFItems.resin_sword;
        }
    };
    public static final HFCreativeTabs HFCrops = new HFCreativeTabs(CreativeTabs.getNextID(), "hfcrops"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
        	return HFItems.leaf;
        }
    };
    
    public static final HFCreativeTabs HFMaterials = new HFCreativeTabs(CreativeTabs.getNextID(), "hfmaterials"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
        	return HFItems.burlap;
        }
    };
    
	@Override
	public Item getTabIconItem(){
		return null;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void displayAllRelevantItems(List<ItemStack> p_78018_1_){
		for (Item item : HFItems.items){
  		  if (item == null){
  			  continue;
  		  }
  		  for (CreativeTabs tab : item.getCreativeTabs()){
  			  if (tab == this){
  				  item.getSubItems(item, this, p_78018_1_);
  			  }
  		  }
	  }
	      for (Block block : HFBlocks.blocks){
	    	  Item itemBlock = Item.getItemFromBlock(block);
	    	  if (block == null){
	                continue;
	    	  }
	    	  for (CreativeTabs tab : itemBlock.getCreativeTabs()){
	    		  if (tab == this){
	    			  itemBlock.getSubItems(itemBlock, this, p_78018_1_);
	    		  }
	    	  }
	    	  

	    	  if (this.getRelevantEnchantmentTypes() != null){
	    		  this.addEnchantmentBooksToList(p_78018_1_, this.getRelevantEnchantmentTypes());
	    	  }
	      }
    }
}
