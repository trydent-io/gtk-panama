// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$754 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$754() {}
    static final FunctionDescriptor g_socket_get_multicast_loopback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_multicast_loopback$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_multicast_loopback",
        constants$754.g_socket_get_multicast_loopback$FUNC
    );
    static final FunctionDescriptor g_socket_set_multicast_loopback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_multicast_loopback$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_multicast_loopback",
        constants$754.g_socket_set_multicast_loopback$FUNC
    );
    static final FunctionDescriptor g_socket_get_multicast_ttl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_multicast_ttl$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_multicast_ttl",
        constants$754.g_socket_get_multicast_ttl$FUNC
    );
    static final FunctionDescriptor g_socket_set_multicast_ttl$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_multicast_ttl$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_multicast_ttl",
        constants$754.g_socket_set_multicast_ttl$FUNC
    );
    static final FunctionDescriptor g_socket_is_connected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_is_connected$MH = RuntimeHelper.downcallHandle(
        "g_socket_is_connected",
        constants$754.g_socket_is_connected$FUNC
    );
    static final FunctionDescriptor g_socket_bind$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_bind$MH = RuntimeHelper.downcallHandle(
        "g_socket_bind",
        constants$754.g_socket_bind$FUNC
    );
}


