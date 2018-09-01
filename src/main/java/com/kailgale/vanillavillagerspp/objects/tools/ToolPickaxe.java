package com.kailgale.vanillavillagerspp.objects.tools;

import com.kailgale.vanillavillagerspp.Main;
import com.kailgale.vanillavillagerspp.init.ItemInit;
import com.kailgale.vanillavillagerspp.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{

	public ToolPickaxe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	    setCreativeTab(CreativeTabs.MATERIALS);
	    
	    ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}	

}
