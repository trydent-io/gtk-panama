// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1404 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1404() {}
    static final FunctionDescriptor gtk_value_dup_expression$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_value_dup_expression$MH = RuntimeHelper.downcallHandle(
        "gtk_value_dup_expression",
        constants$1404.gtk_value_dup_expression$FUNC
    );
    static final FunctionDescriptor gtk_param_expression_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_param_expression_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_param_expression_get_type",
        constants$1404.gtk_param_expression_get_type$FUNC
    );
    static final FunctionDescriptor gtk_param_spec_expression$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_param_spec_expression$MH = RuntimeHelper.downcallHandle(
        "gtk_param_spec_expression",
        constants$1404.gtk_param_spec_expression$FUNC
    );
    static final FunctionDescriptor gtk_filter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_filter_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_filter_get_type",
        constants$1404.gtk_filter_get_type$FUNC
    );
    static final FunctionDescriptor gtk_filter_match$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_filter_match$MH = RuntimeHelper.downcallHandle(
        "gtk_filter_match",
        constants$1404.gtk_filter_match$FUNC
    );
    static final FunctionDescriptor gtk_filter_get_strictness$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_filter_get_strictness$MH = RuntimeHelper.downcallHandle(
        "gtk_filter_get_strictness",
        constants$1404.gtk_filter_get_strictness$FUNC
    );
}


