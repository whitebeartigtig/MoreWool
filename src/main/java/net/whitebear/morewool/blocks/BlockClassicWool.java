package net.whitebear.morewool.blocks;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;
import net.whitebear.morewool.textures.Textures;

@HasMetaNamedBlockItem
public class BlockClassicWool extends TemplateBlockBase {
    public BlockClassicWool(Identifier identifier) {
        super(identifier, Material.WOOL);
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        return Textures.ClassicWoolTextures[meta];
    }

    @Override
    protected int droppedMeta(int meta) {
        return meta;
    }
}
