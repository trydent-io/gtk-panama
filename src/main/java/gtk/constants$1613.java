// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1613 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1613() {}
    static final FunctionDescriptor GtkCustomFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkCustomFilterFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkCustomFilterFunc_UP$MH = RuntimeHelper.upcallHandle(GtkCustomFilterFunc.class, "apply", constants$1613.GtkCustomFilterFunc_UP$FUNC);
    static final FunctionDescriptor GtkCustomFilterFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkCustomFilterFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1613.GtkCustomFilterFunc_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_custom_filter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_custom_filter_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_custom_filter_get_type",
        constants$1613.gtk_custom_filter_get_type$FUNC
    );
    static final FunctionDescriptor gtk_custom_filter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_custom_filter_new$MH = RuntimeHelper.downcallHandle(
        "gtk_custom_filter_new",
        constants$1613.gtk_custom_filter_new$FUNC
    );
    static final FunctionDescriptor gtk_custom_filter_set_filter_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_custom_filter_set_filter_func$MH = RuntimeHelper.downcallHandle(
        "gtk_custom_filter_set_filter_func",
        constants$1613.gtk_custom_filter_set_filter_func$FUNC
    );
    static final FunctionDescriptor gtk_flatten_list_model_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_flatten_list_model_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_flatten_list_model_get_type",
        constants$1613.gtk_flatten_list_model_get_type$FUNC
    );
}

