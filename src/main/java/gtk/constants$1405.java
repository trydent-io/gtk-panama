// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1405 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1405() {}
    static final FunctionDescriptor gtk_filter_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_filter_changed$MH = RuntimeHelper.downcallHandle(
        "gtk_filter_changed",
        constants$1405.gtk_filter_changed$FUNC
    );
    static final FunctionDescriptor gtk_bool_filter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_bool_filter_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_bool_filter_get_type",
        constants$1405.gtk_bool_filter_get_type$FUNC
    );
    static final FunctionDescriptor gtk_bool_filter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bool_filter_new$MH = RuntimeHelper.downcallHandle(
        "gtk_bool_filter_new",
        constants$1405.gtk_bool_filter_new$FUNC
    );
    static final FunctionDescriptor gtk_bool_filter_get_expression$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bool_filter_get_expression$MH = RuntimeHelper.downcallHandle(
        "gtk_bool_filter_get_expression",
        constants$1405.gtk_bool_filter_get_expression$FUNC
    );
    static final FunctionDescriptor gtk_bool_filter_set_expression$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bool_filter_set_expression$MH = RuntimeHelper.downcallHandle(
        "gtk_bool_filter_set_expression",
        constants$1405.gtk_bool_filter_set_expression$FUNC
    );
    static final FunctionDescriptor gtk_bool_filter_get_invert$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bool_filter_get_invert$MH = RuntimeHelper.downcallHandle(
        "gtk_bool_filter_get_invert",
        constants$1405.gtk_bool_filter_get_invert$FUNC
    );
}


