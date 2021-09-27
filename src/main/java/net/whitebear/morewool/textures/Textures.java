package net.whitebear.morewool.textures;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlas;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.whitebear.morewool.MoreWool;

import static net.modificationstation.stationapi.api.registry.Identifier.of;
import static net.whitebear.morewool.MoreWool.MOD_ID;

public class Textures {

    @EventListener
    private static void registertextures(TextureRegisterEvent event) {
        ExpandableAtlas terrain = Atlases.getStationTerrain();
        WoolTextures = new int[] {
                terrain.addTexture(of(MOD_ID, "blocks/Blueberry")).index,
                terrain.addTexture(of(MOD_ID, "blocks/BluishPuple")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Bubblegum")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Cayenne")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Grape")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Lemon")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Lime")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Marashino")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Maroon")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Mocha")).index,
                terrain.addTexture(of(MOD_ID, "blocks/MochaOrange")).index,
                terrain.addTexture(of(MOD_ID, "blocks/SkinColor1")).index,
                terrain.addTexture(of(MOD_ID, "blocks/SkinColor2")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Sky")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Teal")).index,
                terrain.addTexture(of(MOD_ID, "blocks/Tungsten")).index,
        };
        ClassicWoolTextures = new int[] {
                terrain.addTexture(of(MOD_ID, "blocks/ClassicRedWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicOrangeWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicYellowWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicChartreuseWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicGreenWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicSpringGreenWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicCyanWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicCapriWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicUltramarineWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicVioletWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicPurpleWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicMagentaWool")).index,
                terrain.addTexture(of(MOD_ID, "blocks/ClassicRoseWool")).index,
        };
        ExpandableAtlas items = Atlases.getStationGuiItems();
        DyeTextures = new int[] {
                items.addTexture(of(MOD_ID, "items/BlueberryDye")).index,
                items.addTexture(of(MOD_ID, "items/BluishPupleDye")).index,
                items.addTexture(of(MOD_ID, "items/BubblegumDye")).index,
                items.addTexture(of(MOD_ID, "items/CayenneDye")).index,
                items.addTexture(of(MOD_ID, "items/GrapeDye")).index,
                items.addTexture(of(MOD_ID, "items/LemonDye")).index,
                items.addTexture(of(MOD_ID, "items/LimeDye")).index,
                items.addTexture(of(MOD_ID, "items/MarashinoDye")).index,
                items.addTexture(of(MOD_ID, "items/MaroonDye")).index,
                items.addTexture(of(MOD_ID, "items/MochaDye")).index,
                items.addTexture(of(MOD_ID, "items/MochaOrangeDye")).index,
                items.addTexture(of(MOD_ID, "items/SkinColor1Dye")).index,
                items.addTexture(of(MOD_ID, "items/SkinColor2Dye")).index,
                items.addTexture(of(MOD_ID, "items/SkyDye")).index,
                items.addTexture(of(MOD_ID, "items/TealDye")).index,
                items.addTexture(of(MOD_ID, "items/TungstenDye")).index,

                items.addTexture(of(MOD_ID, "items/ClassicRedDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicOrangeDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicYellowDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicChartreuseDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicGreenDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicSpringGreenDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicCyanDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicCapriDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicUltramarineDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicVioletDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicPurpleDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicMagentaDye")).index,
                items.addTexture(of(MOD_ID, "items/ClassicRoseDye")).index,

        };
    }

    public static int[] WoolTextures;
    public static int[] ClassicWoolTextures;
    public static int[] DyeTextures;


}
