package com.frank.registry;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterialRegistryHandler {
        /**
         * EnumHelper.addToolMaterial()方法需要传入三个参数
         * 第一个是String型，name
         * 第二个是int型，harvestLevel(挖掘等级,最高为3)
         * 第三个是int型maxUse(耐久)
         * 第四个是int型efficiency(挖掘效率)
         * 第五个是float型，攻击力
         * 第六个是int型，附魔能力
         */

        public static final Item.ToolMaterial BEDROCK_TOOL_MATERIAL = EnumHelper.addToolMaterial("BEDROCK",3,5000,25f,5f,7);
        public static final Item.ToolMaterial BEDROCK_SWORD_MATERIAL = EnumHelper.addToolMaterial("BEDROCK_SWORD",0,5000,5f,9f,7);
}
