// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$149 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$149() {}
    static final FunctionDescriptor g_hmac_get_digest$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hmac_get_digest$MH = RuntimeHelper.downcallHandle(
        "g_hmac_get_digest",
        constants$149.g_hmac_get_digest$FUNC
    );
    static final FunctionDescriptor g_compute_hmac_for_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_compute_hmac_for_data$MH = RuntimeHelper.downcallHandle(
        "g_compute_hmac_for_data",
        constants$149.g_compute_hmac_for_data$FUNC
    );
    static final FunctionDescriptor g_compute_hmac_for_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_compute_hmac_for_string$MH = RuntimeHelper.downcallHandle(
        "g_compute_hmac_for_string",
        constants$149.g_compute_hmac_for_string$FUNC
    );
    static final FunctionDescriptor g_compute_hmac_for_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_compute_hmac_for_bytes$MH = RuntimeHelper.downcallHandle(
        "g_compute_hmac_for_bytes",
        constants$149.g_compute_hmac_for_bytes$FUNC
    );
    static final FunctionDescriptor GHookCompareFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GHookCompareFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCompareFunc_UP$MH = RuntimeHelper.upcallHandle(GHookCompareFunc.class, "apply", constants$149.GHookCompareFunc_UP$FUNC);
    static final FunctionDescriptor GHookCompareFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCompareFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$149.GHookCompareFunc_DOWN$FUNC
    );
}


