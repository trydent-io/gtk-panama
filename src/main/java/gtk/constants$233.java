// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$233 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$233() {}
    static final FunctionDescriptor g_variant_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_hash$MH = RuntimeHelper.downcallHandle(
        "g_variant_hash",
        constants$233.g_variant_hash$FUNC
    );
    static final FunctionDescriptor g_variant_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_equal$MH = RuntimeHelper.downcallHandle(
        "g_variant_equal",
        constants$233.g_variant_equal$FUNC
    );
    static final FunctionDescriptor g_variant_get_normal_form$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_normal_form$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_normal_form",
        constants$233.g_variant_get_normal_form$FUNC
    );
    static final FunctionDescriptor g_variant_is_normal_form$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_is_normal_form$MH = RuntimeHelper.downcallHandle(
        "g_variant_is_normal_form",
        constants$233.g_variant_is_normal_form$FUNC
    );
    static final FunctionDescriptor g_variant_byteswap$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_byteswap$MH = RuntimeHelper.downcallHandle(
        "g_variant_byteswap",
        constants$233.g_variant_byteswap$FUNC
    );
    static final FunctionDescriptor g_variant_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_from_bytes",
        constants$233.g_variant_new_from_bytes$FUNC
    );
}


