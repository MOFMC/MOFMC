package com.agmpenguin.mofmc.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier RUBY = new ForgeTier(2, 250, 6.0f,
            2.0f, 14, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.RUBY.get()));
    public static final ForgeTier FOOLS_GOLD_INGOT = new ForgeTier(2, 250, 6.0f,
            2.0f, 14, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.FOOLS_GOLD_INGOT.get()));
}
