package com.maybeagoose.alcohol_plant.Item;

import com.maybeagoose.alcohol_plant.Startup;

import com.simibubi.create.content.CreateItemGroup;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {

	public static final Item GRAPES = RegisterItem("grapes",
			new Item(new FabricItemSettings().group(ModItemGroup.AlcoholStuff).food(ModFoodComponents.GRAPES)));

	public static Item RegisterItem(String name, Item item){
		return Registry.register(Registry.ITEM,new ResourceLocation(Startup.ID,name),item);
	}

	public static void RegisterModItems(){
		Startup.LOGGER.info("Registering mod items for " + Startup.ID);
	}
}
