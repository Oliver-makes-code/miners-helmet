package olivermakesco.de.minerhelm;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Entrypoint implements ModInitializer {
	public static final String modid = "minerhelm";
	public static final Logger LOGGER = LogManager.getLogger(modid);
	public static final ArmorMaterial HELMET_MATERIAL = new MinersHelmetArmorMaterial();
	public static final Item MINERS_HELMET = new ArmorItem(HELMET_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
	@Override
	public void onInitialize() {
		LOGGER.info("Registering Miner's Helmet!");
		Registry.register(Registry.ITEM,new Identifier(modid,"helmet"),MINERS_HELMET);
		LOGGER.info("Miner's Helmet registry complete! Enjoy!");
	}
}
