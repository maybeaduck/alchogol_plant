package com.maybeagoose.alcohol_plant.block.custom;

import com.simibubi.create.foundation.utility.VoxelShaper;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.HORIZONTAL_AXIS;

public class wild_grape_block extends Block {

	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	protected static final VoxelShape SHAPE_N = Block.box(0, 0, 13, 16, 16, 16);
	protected static final VoxelShape SHAPE_W = Block.box(13, 0, 0, 16, 16, 16);
	protected static final VoxelShape SHAPE_S = Block.box(0, 0, 0, 16, 16, 3);
	protected static final VoxelShape SHAPE_E = Block.box(0, 0, 0, 3, 16, 16);


	@Override
	public VoxelShape  getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext)  {
		switch (blockState.getValue(FACING)){
			case NORTH:
				return SHAPE_N;
			case SOUTH:
				return SHAPE_S;
			case WEST:
				return SHAPE_W;
			case EAST:
				return SHAPE_E;
			default:
				return SHAPE_N;
		}
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {

		return (BlockState)this.defaultBlockState().setValue(FACING, blockPlaceContext.getHorizontalDirection().getOpposite());
	}

	@Override
	public BlockState mirror(BlockState blockState, Mirror mirror) {
		return blockState.rotate(mirror.getRotation(blockState.getValue(FACING)));
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rotation) {
		Direction fromAxis = Direction.get(Direction.AxisDirection.POSITIVE, state.getValue(HORIZONTAL_AXIS));
		Direction rotated = rotation.rotate(fromAxis);

		return state.setValue(HORIZONTAL_AXIS, rotated.getAxis());
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	public wild_grape_block(Properties properties) {
		super(properties);
	}
}
