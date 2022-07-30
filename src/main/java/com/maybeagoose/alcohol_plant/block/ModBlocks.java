package com.maybeagoose.alcohol_plant.block;

import com.maybeagoose.alcohol_plant.Item.ModItemGroup;
import com.maybeagoose.alcohol_plant.Startup;

import com.maybeagoose.alcohol_plant.block.custom.wild_grape_block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Material;

public class ModBlocks {


	public static final Block WILD_GRAPES = RegisterBlock("wild_grape_block",
			new wild_grape_block(FabricBlockSettings.of(Material.LEAVES).noCollission().strength(1f)), ModItemGroup.AlcoholStuff);

	private static Block RegisterBlock(String name, Block block,CreativeModeTab group){
		RegisterBlockItem(name,block,group);
		return Registry.register(Registry.BLOCK, new ResourceLocation(Startup.ID,name),block);
	}

	public static Item RegisterBlockItem(String name, Block block, CreativeModeTab group)
	{
		return Registry.register(Registry.ITEM, new ResourceLocation(Startup.ID,name),new BlockItem(block, new FabricItemSettings().group(group)));
	}


	public static void RegisterModBlocks(){
		Startup.LOGGER.info("Registration ModBlocks for " + Startup.ID);
	}
}
