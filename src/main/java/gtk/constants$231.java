// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$231 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$231() {}
    static final FunctionDescriptor g_variant_n_children$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_n_children$MH = RuntimeHelper.downcallHandle(
        "g_variant_n_children",
        constants$231.g_variant_n_children$FUNC
    );
    static final FunctionDescriptor g_variant_get_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_child$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_get_child",
        constants$231.g_variant_get_child$FUNC
    );
    static final FunctionDescriptor g_variant_get_child_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_variant_get_child_value$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_child_value",
        constants$231.g_variant_get_child_value$FUNC
    );
    static final FunctionDescriptor g_variant_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_lookup$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_lookup",
        constants$231.g_variant_lookup$FUNC
    );
    static final FunctionDescriptor g_variant_lookup_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_lookup_value$MH = RuntimeHelper.downcallHandle(
        "g_variant_lookup_value",
        constants$231.g_variant_lookup_value$FUNC
    );
    static final FunctionDescriptor g_variant_get_fixed_array$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_variant_get_fixed_array$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_fixed_array",
        constants$231.g_variant_get_fixed_array$FUNC
    );
}

