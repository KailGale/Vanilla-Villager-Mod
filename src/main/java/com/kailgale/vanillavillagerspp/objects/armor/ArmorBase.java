package com.kailgale.vanillavillagerspp.objects.armor;

import com.kailgale.vanillavillagerspp.Main;
import com.kailgale.vanillavillagerspp.init.ItemInit;
import com.kailgale.vanillavillagerspp.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel 
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
	    setCreativeTab(CreativeTabs.MATERIALS);
	    
	    ItemInit.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	

}
