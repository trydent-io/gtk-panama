// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$232 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$232() {}
    static final FunctionDescriptor g_variant_get_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_size$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_size",
        constants$232.g_variant_get_size$FUNC
    );
    static final FunctionDescriptor g_variant_get_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_data$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_data",
        constants$232.g_variant_get_data$FUNC
    );
    static final FunctionDescriptor g_variant_get_data_as_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_data_as_bytes$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_data_as_bytes",
        constants$232.g_variant_get_data_as_bytes$FUNC
    );
    static final FunctionDescriptor g_variant_store$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_store$MH = RuntimeHelper.downcallHandle(
        "g_variant_store",
        constants$232.g_variant_store$FUNC
    );
    static final FunctionDescriptor g_variant_print$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_print$MH = RuntimeHelper.downcallHandle(
        "g_variant_print",
        constants$232.g_variant_print$FUNC
    );
    static final FunctionDescriptor g_variant_print_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_print_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_print_string",
        constants$232.g_variant_print_string$FUNC
    );
}


