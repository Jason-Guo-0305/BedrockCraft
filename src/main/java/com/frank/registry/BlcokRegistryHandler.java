package com.frank.registry;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class BlcokRegistryHandler {
        /**
         * 在这里声明常量
         * block: public static final 类名 常量名 = new 类名;
         */
        @SubscribeEvent
        public static void onRegistry(RegistryEvent.Register<Block> event){
                IForgeRegistry<Block> registry = event.getRegistry();
                /**
                 * block: registry.register(常量名)
                 */
        }
}
