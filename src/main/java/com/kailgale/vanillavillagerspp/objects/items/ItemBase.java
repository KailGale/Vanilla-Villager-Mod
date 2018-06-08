package com.kailgale.vanillavillagerspp.objects.items;

import com.kailgale.vanillavillagerspp.Main;
import com.kailgale.vanillavillagerspp.init.ItemInit;
import com.kailgale.vanillavillagerspp.proxy.ClientProxy;
import com.kailgale.vanillavillagerspp.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		
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
