// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$712 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$712() {}
    static final FunctionDescriptor g_permission_get_allowed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_get_allowed$MH = RuntimeHelper.downcallHandle(
        "g_permission_get_allowed",
        constants$712.g_permission_get_allowed$FUNC
    );
    static final FunctionDescriptor g_permission_get_can_acquire$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_get_can_acquire$MH = RuntimeHelper.downcallHandle(
        "g_permission_get_can_acquire",
        constants$712.g_permission_get_can_acquire$FUNC
    );
    static final FunctionDescriptor g_permission_get_can_release$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_get_can_release$MH = RuntimeHelper.downcallHandle(
        "g_permission_get_can_release",
        constants$712.g_permission_get_can_release$FUNC
    );
    static final FunctionDescriptor g_permission_impl_update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_permission_impl_update$MH = RuntimeHelper.downcallHandle(
        "g_permission_impl_update",
        constants$712.g_permission_impl_update$FUNC
    );
    static final FunctionDescriptor g_pollable_input_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_pollable_input_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_get_type",
        constants$712.g_pollable_input_stream_get_type$FUNC
    );
    static final FunctionDescriptor g_pollable_input_stream_can_poll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_input_stream_can_poll$MH = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_can_poll",
        constants$712.g_pollable_input_stream_can_poll$FUNC
    );
}

