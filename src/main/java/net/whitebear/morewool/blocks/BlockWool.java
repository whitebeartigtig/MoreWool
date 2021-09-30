package net.whitebear.morewool.blocks;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;
import net.whitebear.morewool.textures.Textures;

@HasMetaNamedBlockItem
public class BlockWool extends TemplateBlockBase {
    public BlockWool(Identifier identifier) {
        super(identifier, Material.WOOL);
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        if (meta > Textures.WoolTextures.length-1) {
            return Textures.WoolTextures[0];
        }
        return Textures.WoolTextures[meta];
    }

    @Override
    protected int droppedMeta(int meta) {
        return meta;
    }
}
