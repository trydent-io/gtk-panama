// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$769 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$769() {}
    static final FunctionDescriptor g_socket_control_message_deserialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_control_message_deserialize$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_deserialize",
        constants$769.g_socket_control_message_deserialize$FUNC
    );
    static final FunctionDescriptor g_socket_listener_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_listener_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_get_type",
        constants$769.g_socket_listener_get_type$FUNC
    );
    static final FunctionDescriptor g_socket_listener_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_socket_listener_new$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_new",
        constants$769.g_socket_listener_new$FUNC
    );
    static final FunctionDescriptor g_socket_listener_set_backlog$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_listener_set_backlog$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_set_backlog",
        constants$769.g_socket_listener_set_backlog$FUNC
    );
    static final FunctionDescriptor g_socket_listener_add_socket$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listener_add_socket$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_add_socket",
        constants$769.g_socket_listener_add_socket$FUNC
    );
    static final FunctionDescriptor g_socket_listener_add_address$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listener_add_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_add_address",
        constants$769.g_socket_listener_add_address$FUNC
    );
}


