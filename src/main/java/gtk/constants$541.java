// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$541 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$541() {}
    static final FunctionDescriptor g_bus_get_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bus_get_finish$MH = RuntimeHelper.downcallHandle(
        "g_bus_get_finish",
        constants$541.g_bus_get_finish$FUNC
    );
    static final FunctionDescriptor g_bus_get_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bus_get_sync$MH = RuntimeHelper.downcallHandle(
        "g_bus_get_sync",
        constants$541.g_bus_get_sync$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_new$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_new$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_new",
        constants$541.g_dbus_connection_new$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_new_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_new_finish$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_new_finish",
        constants$541.g_dbus_connection_new_finish$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_new_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_new_sync$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_new_sync",
        constants$541.g_dbus_connection_new_sync$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_new_for_address$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_new_for_address$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_new_for_address",
        constants$541.g_dbus_connection_new_for_address$FUNC
    );
}

