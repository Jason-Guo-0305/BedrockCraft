package com.frank.registry;

import com.frank.item.BedrockIngot;
import com.frank.item.tool.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class ItemRegisterHandler {
        /**
         * 在这里声明常量
         * item: public static final 类名 常量名 = new 类名();
         * itemBlock: public static final ItemBlock 常量名 = withRegistryName(new ItemBlock(BlockRegistryHandler.方块常量名))
         * itemtool: public static final 类名 常量名 = new 类名(材料常量名);
         */
        public static final BedrockIngot BEDROCK_INGOT = new BedrockIngot();
        public static final BedrockPickaxe BEDROCK_PICKAXE = new BedrockPickaxe(ToolMaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        public static final BedrockAxe BEDROCK_AXE = new BedrockAxe(ToolMaterialRegistryHandler.BEDROCK_TOOL_MATERIAL,14f,-2.5f);
        public static final BedrockShovel BEDROCK_SHOVEL = new BedrockShovel(ToolMaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        public static final BedrockHoe BEDROCK_HOE = new BedrockHoe(ToolMaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        public static final BedrockSword BEDROCK_SWORD = new BedrockSword(ToolMaterialRegistryHandler.BEDROCK_SWORD_MATERIAL);

        @SubscribeEvent
        public static void onRegistry(RegistryEvent.Register<Item> event) {
                IForgeRegistry<Item> registry = event.getRegistry();
                /**
                 * item: registry.registrer(常量名);
                 * itemBlock: registry.register(withRegistryName(常量名));
                 */
                registry.register(BEDROCK_INGOT);
                registry.register(BEDROCK_PICKAXE);
                registry.register(BEDROCK_AXE);
                registry.register(BEDROCK_SHOVEL);
                registry.register(BEDROCK_HOE);
                registry.register(BEDROCK_SWORD);
        }

        @SubscribeEvent
        @SideOnly(Side.CLIENT)
        public static void onModelRegistry(ModelRegistryEvent event) {
                /**
                 * registerModel(常量名)
                 */
                registerModel(BEDROCK_INGOT);
                registerModel(BEDROCK_PICKAXE);
                registerModel(BEDROCK_AXE);
                registerModel(BEDROCK_SHOVEL);
                registerModel(BEDROCK_HOE);
                registerModel(BEDROCK_SWORD);
        }










        //下面的都不用管了
        private static ItemBlock withRegistryName(ItemBlock item){
                item.setRegistryName(item.getBlock().getRegistryName());
                return item;
        }
        @SideOnly(Side.CLIENT)
        private static void registerModel(Item item){
                ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(),"inventory");
                ModelLoader.setCustomModelResourceLocation(item,0,modelResourceLocation);
        }

}
