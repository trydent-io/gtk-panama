// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$234 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$234() {}
    static final FunctionDescriptor g_variant_new_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_from_data$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_from_data",
        constants$234.g_variant_new_from_data$FUNC
    );
    static final FunctionDescriptor g_variant_iter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_new$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_new",
        constants$234.g_variant_iter_new$FUNC
    );
    static final FunctionDescriptor g_variant_iter_init$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_init$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_init",
        constants$234.g_variant_iter_init$FUNC
    );
    static final FunctionDescriptor g_variant_iter_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_copy$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_copy",
        constants$234.g_variant_iter_copy$FUNC
    );
    static final FunctionDescriptor g_variant_iter_n_children$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_n_children$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_n_children",
        constants$234.g_variant_iter_n_children$FUNC
    );
    static final FunctionDescriptor g_variant_iter_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_free$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_free",
        constants$234.g_variant_iter_free$FUNC
    );
}


