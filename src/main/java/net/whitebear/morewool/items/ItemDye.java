package net.whitebear.morewool.items;

import com.google.common.primitives.Ints;
import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;
import net.whitebear.morewool.textures.Textures;

public class ItemDye extends TemplateItemBase {
    public ItemDye(Identifier identifier) {
        super(identifier);
        setHasSubItems(true);
    }

    @Override
    public int getTexturePosition(int damage) {
        return Textures.DyeTextures[Ints.constrainToRange(damage, 0, 28)];
    }

    @Override
    public String getTranslationKey(ItemInstance item) {
        return super.getTranslationKey(item)+item.getDamage();
    }
}
