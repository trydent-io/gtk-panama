// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1624 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1624() {}
    static final FunctionDescriptor gtk_font_button_set_modal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_font_button_set_modal$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_set_modal",
        constants$1624.gtk_font_button_set_modal$FUNC
    );
    static final FunctionDescriptor gtk_font_button_get_use_font$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_font_button_get_use_font$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_get_use_font",
        constants$1624.gtk_font_button_get_use_font$FUNC
    );
    static final FunctionDescriptor gtk_font_button_set_use_font$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_font_button_set_use_font$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_set_use_font",
        constants$1624.gtk_font_button_set_use_font$FUNC
    );
    static final FunctionDescriptor gtk_font_button_get_use_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_font_button_get_use_size$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_get_use_size",
        constants$1624.gtk_font_button_get_use_size$FUNC
    );
    static final FunctionDescriptor gtk_font_button_set_use_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_font_button_set_use_size$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_set_use_size",
        constants$1624.gtk_font_button_set_use_size$FUNC
    );
    static final FunctionDescriptor GtkFontFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkFontFilterFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkFontFilterFunc_UP$MH = RuntimeHelper.upcallHandle(GtkFontFilterFunc.class, "apply", constants$1624.GtkFontFilterFunc_UP$FUNC);
}

