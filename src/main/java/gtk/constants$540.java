// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$540 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$540() {}
    static final FunctionDescriptor g_dbus_auth_observer_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dbus_auth_observer_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dbus_auth_observer_get_type",
        constants$540.g_dbus_auth_observer_get_type$FUNC
    );
    static final FunctionDescriptor g_dbus_auth_observer_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_dbus_auth_observer_new$MH = RuntimeHelper.downcallHandle(
        "g_dbus_auth_observer_new",
        constants$540.g_dbus_auth_observer_new$FUNC
    );
    static final FunctionDescriptor g_dbus_auth_observer_authorize_authenticated_peer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_auth_observer_authorize_authenticated_peer$MH = RuntimeHelper.downcallHandle(
        "g_dbus_auth_observer_authorize_authenticated_peer",
        constants$540.g_dbus_auth_observer_authorize_authenticated_peer$FUNC
    );
    static final FunctionDescriptor g_dbus_auth_observer_allow_mechanism$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_auth_observer_allow_mechanism$MH = RuntimeHelper.downcallHandle(
        "g_dbus_auth_observer_allow_mechanism",
        constants$540.g_dbus_auth_observer_allow_mechanism$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dbus_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_get_type",
        constants$540.g_dbus_connection_get_type$FUNC
    );
    static final FunctionDescriptor g_bus_get$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bus_get$MH = RuntimeHelper.downcallHandle(
        "g_bus_get",
        constants$540.g_bus_get$FUNC
    );
}


