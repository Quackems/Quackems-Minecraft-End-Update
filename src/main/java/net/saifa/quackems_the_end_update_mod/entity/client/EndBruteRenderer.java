package net.saifa.quackems_the_end_update_mod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.saifa.quackems_the_end_update_mod.Quackems_The_End_Update;
import net.saifa.quackems_the_end_update_mod.entity.custom.EndBruteEntity;

public class EndBruteRenderer extends MobRenderer<EndBruteEntity, EndBruteModel<EndBruteEntity>> {


    public EndBruteRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new EndBruteModel<>(pContext.bakeLayer(ModModelLayers.END_BRUTE_LAYER)), 1.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(EndBruteEntity pEntity) {
        return new ResourceLocation(Quackems_The_End_Update.MOD_ID, "textures/entity/end_brute.png");
    }


    @Override
    public void render(EndBruteEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()){
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }



        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}