package net.whitebear.morewool.blocks;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.BlockBase;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;
import net.whitebear.morewool.MoreWool;

public class Blocks {

    @EventListener
    private static void RegisterBlocks(BlockRegistryEvent event) {
        wool = new BlockWool(Identifier.of(MoreWool.MOD_ID, "wool")).setHardness(0.8F).setSounds(BlockBase.WOOL_SOUNDS).setTranslationKey(MoreWool.MOD_ID, "wool");
        classicwool = new BlockClassicWool(Identifier.of(MoreWool.MOD_ID, "classicwool")).setHardness(0.8F).setSounds(BlockBase.WOOL_SOUNDS).setTranslationKey(MoreWool.MOD_ID, "classicwool");
    }

    public static TemplateBlockBase wool;
    public static TemplateBlockBase classicwool;

}
