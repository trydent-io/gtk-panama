// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$775 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$775() {}
    static final FunctionDescriptor g_subprocess_send_signal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_subprocess_send_signal$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_send_signal",
        constants$775.g_subprocess_send_signal$FUNC
    );
    static final FunctionDescriptor g_subprocess_force_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_force_exit$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_force_exit",
        constants$775.g_subprocess_force_exit$FUNC
    );
    static final FunctionDescriptor g_subprocess_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_wait$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_wait",
        constants$775.g_subprocess_wait$FUNC
    );
    static final FunctionDescriptor g_subprocess_wait_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_wait_async$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_wait_async",
        constants$775.g_subprocess_wait_async$FUNC
    );
    static final FunctionDescriptor g_subprocess_wait_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_wait_finish$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_wait_finish",
        constants$775.g_subprocess_wait_finish$FUNC
    );
    static final FunctionDescriptor g_subprocess_wait_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_wait_check$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_wait_check",
        constants$775.g_subprocess_wait_check$FUNC
    );
}

