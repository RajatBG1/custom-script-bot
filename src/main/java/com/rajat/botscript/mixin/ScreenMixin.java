import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.client.gui.screen.option.OptionsScreen;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OptionsScreen.class) // Injecting into the Options screen
public abstract class ScreenMixin extends Screen {

    protected ScreenMixin(Text title) {
        super(title);
    }

    @Inject(method = "init", at = @At("HEAD"))
    private void addLolButton(CallbackInfo info) {
        this.addDrawableChild(new ButtonWidget(
                this.width / 2 - 100, this.height / 2, 200, 20,
                Text.of("Lol"),
                button -> {
                    // Open your script GUI when clicked
                    this.client.setScreen(new ScriptGui(this));
                },
                new CustomNarrationSupplier()
        ));
    }
}