// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1575 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1575() {}
    static final FunctionDescriptor GtkCustomMeasureFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkCustomMeasureFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1575.GtkCustomMeasureFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GtkCustomAllocateFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor GtkCustomAllocateFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GtkCustomAllocateFunc_UP$MH = RuntimeHelper.upcallHandle(GtkCustomAllocateFunc.class, "apply", constants$1575.GtkCustomAllocateFunc_UP$FUNC);
    static final FunctionDescriptor GtkCustomAllocateFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GtkCustomAllocateFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1575.GtkCustomAllocateFunc_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_custom_layout_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_custom_layout_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_custom_layout_get_type",
        constants$1575.gtk_custom_layout_get_type$FUNC
    );
    static final FunctionDescriptor gtk_custom_layout_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_custom_layout_new$MH = RuntimeHelper.downcallHandle(
        "gtk_custom_layout_new",
        constants$1575.gtk_custom_layout_new$FUNC
    );
    static final FunctionDescriptor gtk_custom_sorter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_custom_sorter_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_custom_sorter_get_type",
        constants$1575.gtk_custom_sorter_get_type$FUNC
    );
}

