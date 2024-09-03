package net.saifa.quackems_the_end_update_mod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.saifa.quackems_the_end_update_mod.entity.animations.ModAnimationDefinitionsStalker;
import net.saifa.quackems_the_end_update_mod.entity.custom.EndStalkerEntity;


public class EndStalkerModel<T extends Entity> extends HierarchicalModel<T> {
    private final ModelPart EndStalker;


    public EndStalkerModel(ModelPart root) {
        this.EndStalker = root.getChild("end_stalker");

    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition EndStalker = partdefinition.addOrReplaceChild("end_stalker", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition head = EndStalker.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 19).addBox(-4.0F, -2.0F, -2.5F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -28.0F, 3.5F));

        PartDefinition arm2 = EndStalker.addOrReplaceChild("arm2", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -25.0F, 1.0F));

        PartDefinition arm1 = EndStalker.addOrReplaceChild("arm1", CubeListBuilder.create().texOffs(26, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -25.0F, 1.0F));

        PartDefinition torso = EndStalker.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.5F, -3.0F, 10.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.5F, 0.0F));

        PartDefinition leg2 = EndStalker.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(8, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -15.0F, 0.0F));

        PartDefinition leg1 = EndStalker.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(16, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -15.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

        this.animateWalk(ModAnimationDefinitionsStalker.WALK, limbSwing, limbSwingAmount, 2, 2.5f);
        this.animate(((EndStalkerEntity) entity).idleAnimationState, ModAnimationDefinitionsStalker.IDLE, ageInTicks, 1f);
        this.animate(((EndStalkerEntity) entity).attackAnimationState, ModAnimationDefinitionsStalker.ATTACK, ageInTicks, 1f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        EndStalker.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        root().getChild("head").yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        root().getChild("head").xRot = pHeadPitch * ((float)Math.PI / 180F);
    }

    @Override
    public ModelPart root() {
        return EndStalker;
    }
}