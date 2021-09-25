package net.whitebear.morewool.items;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemBase;
import net.modificationstation.stationapi.api.event.item.ItemStrengthOnBlockEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.item.tool.Shear;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;
import net.whitebear.morewool.MoreWool;
import net.whitebear.morewool.blocks.Blocks;

public class Items {

    @EventListener
    private static void registerItems(ItemRegistryEvent event) {
        dye = new ItemDye(Identifier.of(MoreWool.MOD_ID, "dye")).setTranslationKey(MoreWool.MOD_ID, "dye");
    }

    public static TemplateItemBase dye;

    @EventListener
    private static void sheareffectiveness(ItemStrengthOnBlockEvent event) {

        if ((event.itemInstance.itemId == ItemBase.shears.id || event.itemInstance.getType() instanceof Shear) && event.block.id == Blocks.wool.id) {
            event.strength = 5;
        }
    }

}
