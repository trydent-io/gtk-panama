// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1468 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1468() {}
    static final FunctionDescriptor gtk_color_chooser_get_use_alpha$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_color_chooser_get_use_alpha$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_get_use_alpha",
        constants$1468.gtk_color_chooser_get_use_alpha$FUNC
    );
    static final FunctionDescriptor gtk_color_chooser_set_use_alpha$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_color_chooser_set_use_alpha$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_set_use_alpha",
        constants$1468.gtk_color_chooser_set_use_alpha$FUNC
    );
    static final FunctionDescriptor gtk_color_chooser_add_palette$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_color_chooser_add_palette$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_add_palette",
        constants$1468.gtk_color_chooser_add_palette$FUNC
    );
    static final FunctionDescriptor gtk_color_chooser_dialog_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_color_chooser_dialog_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_dialog_get_type",
        constants$1468.gtk_color_chooser_dialog_get_type$FUNC
    );
    static final FunctionDescriptor gtk_color_chooser_dialog_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_color_chooser_dialog_new$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_dialog_new",
        constants$1468.gtk_color_chooser_dialog_new$FUNC
    );
    static final FunctionDescriptor gtk_color_chooser_widget_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_color_chooser_widget_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_widget_get_type",
        constants$1468.gtk_color_chooser_widget_get_type$FUNC
    );
}


