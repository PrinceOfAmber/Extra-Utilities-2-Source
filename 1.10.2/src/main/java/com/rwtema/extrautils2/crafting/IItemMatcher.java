package com.rwtema.extrautils2.crafting;

import javax.annotation.Nonnull;

import com.rwtema.extrautils2.compatibility.StackHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.oredict.OreDictionary;

public interface IItemMatcher {
	IItemMatcher CRAFTING = (IItemMatcher) (slot, target) -> OreDictionary.itemMatches(target, slot, false);
	IItemMatcher EXACT = (IItemMatcher ) (slot, target) -> StackHelper.isNonNull(slot) && ItemHandlerHelper.canItemStacksStack(slot, target);

	boolean itemsMatch(ItemStack slot, @Nonnull ItemStack target);
}
