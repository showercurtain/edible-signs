package showercurtain.edible_signs;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Items;

public class EdibleSignsMod implements ModInitializer {
	@Override
	public void onInitialize() {
		FoodComponent edible = new FoodComponent.Builder().alwaysEdible().build();

		Items.ACACIA_SIGN.foodComponent = edible;
		Items.BAMBOO_SIGN.foodComponent = edible;
		Items.BIRCH_SIGN.foodComponent = edible;
		Items.CHERRY_SIGN.foodComponent = edible;
		Items.CRIMSON_SIGN.foodComponent = edible;
		Items.DARK_OAK_SIGN.foodComponent = edible;
		Items.JUNGLE_SIGN.foodComponent = edible;
		Items.MANGROVE_SIGN.foodComponent = edible;
		Items.OAK_SIGN.foodComponent = edible;
		Items.SPRUCE_SIGN.foodComponent = edible;
		Items.WARPED_SIGN.foodComponent = edible;
		
		Items.ACACIA_HANGING_SIGN.foodComponent = edible;
		Items.BAMBOO_HANGING_SIGN.foodComponent = edible;
		Items.BIRCH_HANGING_SIGN.foodComponent = edible;
		Items.CHERRY_HANGING_SIGN.foodComponent = edible;
		Items.CRIMSON_HANGING_SIGN.foodComponent = edible;
		Items.DARK_OAK_HANGING_SIGN.foodComponent = edible;
		Items.JUNGLE_HANGING_SIGN.foodComponent = edible;
		Items.MANGROVE_HANGING_SIGN.foodComponent = edible;
		Items.OAK_HANGING_SIGN.foodComponent = edible;
		Items.SPRUCE_HANGING_SIGN.foodComponent = edible;
		Items.WARPED_HANGING_SIGN.foodComponent = edible;
	}
}