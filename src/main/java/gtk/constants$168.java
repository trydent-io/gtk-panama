// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$168 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$168() {}
    static final FunctionDescriptor g_main_context_get_thread_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_main_context_get_thread_default$MH = RuntimeHelper.downcallHandle(
        "g_main_context_get_thread_default",
        constants$168.g_main_context_get_thread_default$FUNC
    );
    static final FunctionDescriptor g_main_context_ref_thread_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_main_context_ref_thread_default$MH = RuntimeHelper.downcallHandle(
        "g_main_context_ref_thread_default",
        constants$168.g_main_context_ref_thread_default$FUNC
    );
    static final FunctionDescriptor g_main_loop_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_main_loop_new$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_new",
        constants$168.g_main_loop_new$FUNC
    );
    static final FunctionDescriptor g_main_loop_run$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_loop_run$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_run",
        constants$168.g_main_loop_run$FUNC
    );
    static final FunctionDescriptor g_main_loop_quit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_loop_quit$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_quit",
        constants$168.g_main_loop_quit$FUNC
    );
    static final FunctionDescriptor g_main_loop_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_loop_ref$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_ref",
        constants$168.g_main_loop_ref$FUNC
    );
}


