package com.mch.hempfarmer.item.joint;

import java.util.Random;

import javax.annotation.Nullable;

import com.mch.hempfarmer.creativetab.HFCreativeTabs;
import com.mch.hempfarmer.init.HFItems;
import com.mch.hempfarmer.item.HFItem;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class Joint extends ItemFood{
	
	public final int itemUseDuration;
    private final int healAmount;
    private final float saturationModifier;
    private final boolean isWolfsFavoriteMeat;
    private boolean alwaysEdible;

	public Joint(String name) {
		super(0, 0.0F , false);
		this.itemUseDuration = 8;
        this.healAmount = 2;
        this.isWolfsFavoriteMeat = false;
        this.saturationModifier = 0.1F;
        this.alwaysEdible = true;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(HFCreativeTabs.HFDrugs);
		addToItems(this);
	}
	
	private void addToItems(Item item) {
		HFItems.items.add(item);
	}

	@Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand){  
		playerIn.setActiveHand(hand);
        return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
    }
	@Override
    @Nullable
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        --stack.stackSize;
        Random random = new Random();
        int x = random.nextInt(500) + 100;
        int y = random.nextInt(2) + 1;
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(2), x, 1, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(17), x, y, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(24), x, y, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(8), x, y, true, false));
        x = random.nextInt(210) + 50;
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(9), x, 1, true, false));
        return stack;
    }
	@Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 8;
    }
	 public EnumAction getItemUseAction(ItemStack stack){
	        return EnumAction.NONE;
	    }
}
