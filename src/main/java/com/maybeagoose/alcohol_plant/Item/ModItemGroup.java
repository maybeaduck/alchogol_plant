package com.maybeagoose.alcohol_plant.Item;

import com.maybeagoose.alcohol_plant.Startup;

import io.github.fabricators_of_create.porting_lib.util.ItemGroupUtil;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
	public static final CreativeModeTab AlcoholStuff = FabricItemGroupBuilder.build(new ResourceLocation(Startup.ID, "alcohol_stuff"),
	() -> new ItemStack(ModItems.GRAPES));
}
