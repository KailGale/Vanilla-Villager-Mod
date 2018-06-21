package com.kailgale.vanillavillagerspp.init;

import java.util.ArrayList;
import java.util.List;

import com.kailgale.vanillavillagerspp.objects.armor.ArmorBase;
import com.kailgale.vanillavillagerspp.objects.items.ItemBase;
import com.kailgale.vanillavillagerspp.objects.tools.ToolAxe;
import com.kailgale.vanillavillagerspp.objects.tools.ToolHoe;
import com.kailgale.vanillavillagerspp.objects.tools.ToolPickaxe;
import com.kailgale.vanillavillagerspp.objects.tools.ToolShovel;
import com.kailgale.vanillavillagerspp.objects.tools.ToolSword;
import com.kailgale.vanillavillagerspp.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Materials
	public static final ToolMaterial TOOL_TEST = EnumHelper.addToolMaterial("tool_test", 1, 131, 4.0F, 1.0F, 5);
	public static final ArmorMaterial ARMOR_TEST = EnumHelper.addArmorMaterial("armor_test", Reference.MOD_ID + ":test",  15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	//Items
	public static final Item INGOT_TEST = new ItemBase("ingot_test");
	//Tools
	public static final Item AXE_TEST = new ToolAxe("axe_test", TOOL_TEST);
	public static final Item HOE_TEST = new ToolHoe("hoe_test", TOOL_TEST);
	public static final Item PICKAXE_TEST = new ToolPickaxe("pickaxe_test", TOOL_TEST);
	public static final Item SHOVEL_TEST = new ToolShovel("shovel_test", TOOL_TEST);
	public static final Item SWORD_TEST = new ToolSword("sword_test", TOOL_TEST);
	//Armor
	public static final Item HELMET_TEST = new ArmorBase("helmet_test", ARMOR_TEST, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_TEST = new ArmorBase("chestplate_test", ARMOR_TEST, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_TEST = new ArmorBase("leggings_test", ARMOR_TEST, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_TEST = new ArmorBase("boots_test", ARMOR_TEST, 1, EntityEquipmentSlot.FEET);
}
