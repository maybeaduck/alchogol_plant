package com.maybeagoose.alcohol_plant;

import com.maybeagoose.alcohol_plant.Item.ModItems;
import com.maybeagoose.alcohol_plant.block.ModBlocks;
import com.simibubi.create.Create;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Startup implements ModInitializer {
	public static final String ID = "alcohol_plant";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] loading alongside Create [{}]!", ID, Create.VERSION);
		ModItems.RegisterModItems();
		ModBlocks.RegisterModBlocks();

	}



	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
