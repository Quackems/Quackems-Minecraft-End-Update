package net.saifa.quackems_the_end_update_mod.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.saifa.quackems_the_end_update_mod.entity.animations.ModAnimationDefinitions;
import net.saifa.quackems_the_end_update_mod.entity.custom.EndBruteEntity;

public class EndBruteModel<T extends Entity> extends HierarchicalModel<T> {
    private final ModelPart end_brute;


    public EndBruteModel(ModelPart root) {
        this.end_brute = root.getChild("end_brute");

    }



    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition end_brute = partdefinition.addOrReplaceChild("end_brute", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition torso = end_brute.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -30.0F, -3.0F, 16.0F, 15.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(36, 23).addBox(-1.0F, -29.0F, -4.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 0.0F));

        PartDefinition leg1 = end_brute.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(48, 0).addBox(3.0F, -15.0F, 0.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition leg2 = end_brute.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(33, 49).addBox(-6.0F, -15.0F, 0.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition arm2 = end_brute.addOrReplaceChild("arm2", CubeListBuilder.create(), PartPose.offset(-10.0F, -26.0F, -1.2896F));

        PartDefinition cube_r1 = arm2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, -2.1F, -2.5F, 4.0F, 22.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2126F, -0.1309F, 0.0F, 0.0F));

        PartDefinition arm1 = end_brute.addOrReplaceChild("arm1", CubeListBuilder.create(), PartPose.offset(10.0F, -27.1778F, -1.2128F));

        PartDefinition cube_r2 = arm1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, -2.1017F, -2.5F, 4.0F, 22.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1778F, 1.1615F, 0.1309F, 3.1416F, 0.0F));

        PartDefinition head = end_brute.addOrReplaceChild("head", CubeListBuilder.create().texOffs(36, 37).addBox(-4.0F, -3.0F, -4.2F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 3).addBox(-3.0F, -5.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(2.0F, -5.0F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(45, 49).addBox(-4.0F, -4.0F, -1.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(48, 18).addBox(1.0F, -4.0F, -1.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -30.0F, -2.8F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

        this.animateWalk(ModAnimationDefinitions.WALKING, limbSwing, limbSwingAmount, 2, 2.5f);
        this.animate(((EndBruteEntity) entity).idleAnimationState, ModAnimationDefinitions.IDLE, ageInTicks, 1f);
        this.animate(((EndBruteEntity) entity).attackAnimationState, ModAnimationDefinitions.ATTACK, ageInTicks, 1f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        end_brute.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        root().getChild("head").yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        root().getChild("head").xRot = pHeadPitch * ((float)Math.PI / 180F);
    }


    @Override
    public ModelPart root() {
        return end_brute;
    }
}