// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1856 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1856() {}
    static final FunctionDescriptor gtk_style_context_set_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_context_set_scale$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_set_scale",
        constants$1856.gtk_style_context_set_scale$FUNC
    );
    static final FunctionDescriptor gtk_style_context_get_scale$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_get_scale$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_scale",
        constants$1856.gtk_style_context_get_scale$FUNC
    );
    static final FunctionDescriptor gtk_style_context_add_class$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_add_class$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_add_class",
        constants$1856.gtk_style_context_add_class$FUNC
    );
    static final FunctionDescriptor gtk_style_context_remove_class$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_remove_class$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_remove_class",
        constants$1856.gtk_style_context_remove_class$FUNC
    );
    static final FunctionDescriptor gtk_style_context_has_class$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_has_class$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_has_class",
        constants$1856.gtk_style_context_has_class$FUNC
    );
    static final FunctionDescriptor gtk_style_context_set_display$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_set_display$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_set_display",
        constants$1856.gtk_style_context_set_display$FUNC
    );
}

