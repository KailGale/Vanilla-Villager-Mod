package com.kailgale.vanillavillagerspp.objects.tools;

import com.kailgale.vanillavillagerspp.Main;
import com.kailgale.vanillavillagerspp.init.ItemInit;
import com.kailgale.vanillavillagerspp.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel 
{

	public ToolShovel(String name, ToolMaterial material) 
	{
		super(material);
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
