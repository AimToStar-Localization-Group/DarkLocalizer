package org.zhixiwiki.mixin.client;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.zhixiwiki.Translations;

import java.util.List;

@Mixin(ItemStack.class)
public class DarkLocalizerMixin {
    @Inject(method = "getTooltip", at = @At("RETURN"), cancellable = true)
    private void translateTooltip(@Nullable PlayerEntity player, TooltipContext context, CallbackInfoReturnable<List<Text>> info) {
        List<Text> tooltip = info.getReturnValue();
        tooltip.replaceAll(x -> Translations.translations.getOrDefault(x.getString(), x));
        info.setReturnValue(tooltip);
    }
}
