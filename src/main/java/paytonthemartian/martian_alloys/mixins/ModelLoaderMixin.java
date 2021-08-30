package paytonthemartian.martian_alloys.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.util.Identifier;
import paytonthemartian.martian_alloys.Alloy;

@Mixin(ModelLoader.class)
public class ModelLoaderMixin {
    @Inject(method = "loadModelFromJson", at = @At(value = "INVOKE", target = "Lnet/minecraft/resource/ResourceManager;getResource(Lnet/minecraft/util/Identifier;)Lnet/minecraft/resource/Resource;"), cancellable = true)
    public void loadModelFromJson(Identifier id, CallbackInfoReturnable<JsonUnbakedModel> cir) {
        if (!"martian_alloys".equals(id.getNamespace())) return;
        String modelJson = Alloy.createItemModel(id.toString(), "generated");
        if ("".equals(modelJson)) return;
        JsonUnbakedModel model = JsonUnbakedModel.deserialize(modelJson);
        model.id = id.toString();
        cir.setReturnValue(model);
        cir.cancel();
    }
}
