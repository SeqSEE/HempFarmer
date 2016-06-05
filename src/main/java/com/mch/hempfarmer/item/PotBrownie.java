package com.mch.hempfarmer.item;

import javax.annotation.Nullable;

import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;



public class PotBrownie extends ItemFood{
	
	public int itemUseDuration; 
	
	public PotBrownie(String name) {
		super(2, 0.1F , false);
		this.itemUseDuration = 32;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFDrugs);
		addToItems(this);
	}

	private void addToItems(Item item) {
		HFItems.items.add(item);
	}
	
	@Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
        if (!worldIn.isRemote){
            player.addPotionEffect(new PotionEffect(Potion.getPotionById(8), 50));
        }
    }
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack){
        return EnumAction.EAT;
    }
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand){  
		playerIn.setActiveHand(hand);
        return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
    }
	@Override
    @Nullable
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        --stack.stackSize;
        return stack;
    }
	@Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 32;
    }

}
