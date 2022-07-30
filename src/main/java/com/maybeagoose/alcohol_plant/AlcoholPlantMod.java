package com.maybeagoose.alcohol_plant;

import com.jozufozu.flywheel.api.RenderLayer;
import com.maybeagoose.alcohol_plant.block.ModBlocks;

import net.fabricmc.fabric.mixin.object.builder.ModelPredicateProviderRegistryAccessor;
import net.minecraft.client.renderer.GameRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class AlcoholPlantMod implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILD_GRAPES, RenderType.cutout());
	}
}
