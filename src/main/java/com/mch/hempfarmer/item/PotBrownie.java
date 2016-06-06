package com.mch.hempfarmer.item;

import java.util.Random;

import javax.annotation.Nullable;

import com.mch.hempfarmer.HempFarmer;
import com.mch.hempfarmer.creativetab.DrugsTab;
import com.mch.hempfarmer.init.HFItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class PotBrownie extends ItemFood{
    public final int itemUseDuration;
    private final int healAmount;
    private final float saturationModifier;
    private final boolean isWolfsFavoriteMeat;
    private boolean alwaysEdible;
    
	public PotBrownie(String name) {
		super(2, 0.0F , false);
		this.itemUseDuration = 8;
        this.healAmount = 0;
        this.isWolfsFavoriteMeat = false;
        this.saturationModifier = 0.0F;
        this.alwaysEdible = true;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		if (HempFarmer.drugs == true){
			this.setCreativeTab(DrugsTab.HFDrugs);
			addToItems(this);
		}
	}
		
	public void addToItems(Item item) {
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
        int x = random.nextInt(3000) + 1000;
        int y = random.nextInt(4) + 1;
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(2), x, 1, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(17), x, y, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(24), x, y, true, false));
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(8), x, 6, true, false));
        x = random.nextInt(420) + 100;
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(9), x, 1, true, false));
        x = random.nextInt(210) + 50;
        entityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(25), x, 1, true, false));
        return stack;
    }
	@Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 8;
    }

}
