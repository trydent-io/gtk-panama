// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$166 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$166() {}
    static final FunctionDescriptor g_main_context_prepare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_prepare$MH = RuntimeHelper.downcallHandle(
        "g_main_context_prepare",
        constants$166.g_main_context_prepare$FUNC
    );
    static final FunctionDescriptor g_main_context_query$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_main_context_query$MH = RuntimeHelper.downcallHandle(
        "g_main_context_query",
        constants$166.g_main_context_query$FUNC
    );
    static final FunctionDescriptor g_main_context_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_main_context_check$MH = RuntimeHelper.downcallHandle(
        "g_main_context_check",
        constants$166.g_main_context_check$FUNC
    );
    static final FunctionDescriptor g_main_context_dispatch$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_dispatch$MH = RuntimeHelper.downcallHandle(
        "g_main_context_dispatch",
        constants$166.g_main_context_dispatch$FUNC
    );
    static final FunctionDescriptor g_main_context_set_poll_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_set_poll_func$MH = RuntimeHelper.downcallHandle(
        "g_main_context_set_poll_func",
        constants$166.g_main_context_set_poll_func$FUNC
    );
    static final FunctionDescriptor g_main_context_get_poll_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_get_poll_func$MH = RuntimeHelper.downcallHandle(
        "g_main_context_get_poll_func",
        constants$166.g_main_context_get_poll_func$FUNC
    );
}


