// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$544 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$544() {}
    static final FunctionDescriptor g_dbus_connection_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_get_flags",
        constants$544.g_dbus_connection_get_flags$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_close$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_close",
        constants$544.g_dbus_connection_close$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_close_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_close_finish$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_close_finish",
        constants$544.g_dbus_connection_close_finish$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_close_sync$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_close_sync$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_close_sync",
        constants$544.g_dbus_connection_close_sync$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_flush$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_flush$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_flush",
        constants$544.g_dbus_connection_flush$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_flush_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_flush_finish$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_flush_finish",
        constants$544.g_dbus_connection_flush_finish$FUNC
    );
}


