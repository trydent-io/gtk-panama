// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$759 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$759() {}
    static final FunctionDescriptor g_socket_speaks_ipv4$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_speaks_ipv4$MH = RuntimeHelper.downcallHandle(
        "g_socket_speaks_ipv4",
        constants$759.g_socket_speaks_ipv4$FUNC
    );
    static final FunctionDescriptor g_socket_get_credentials$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_credentials$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_credentials",
        constants$759.g_socket_get_credentials$FUNC
    );
    static final FunctionDescriptor g_socket_receive_with_blocking$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_receive_with_blocking$MH = RuntimeHelper.downcallHandle(
        "g_socket_receive_with_blocking",
        constants$759.g_socket_receive_with_blocking$FUNC
    );
    static final FunctionDescriptor g_socket_send_with_blocking$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_send_with_blocking$MH = RuntimeHelper.downcallHandle(
        "g_socket_send_with_blocking",
        constants$759.g_socket_send_with_blocking$FUNC
    );
    static final FunctionDescriptor g_socket_send_message_with_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_send_message_with_timeout$MH = RuntimeHelper.downcallHandle(
        "g_socket_send_message_with_timeout",
        constants$759.g_socket_send_message_with_timeout$FUNC
    );
    static final FunctionDescriptor g_socket_get_option$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_option$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_option",
        constants$759.g_socket_get_option$FUNC
    );
}


