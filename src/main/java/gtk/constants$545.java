// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$545 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$545() {}
    static final FunctionDescriptor g_dbus_connection_flush_sync$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_flush_sync$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_flush_sync",
        constants$545.g_dbus_connection_flush_sync$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_send_message$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_send_message$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_send_message",
        constants$545.g_dbus_connection_send_message$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_send_message_with_reply$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_send_message_with_reply$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_send_message_with_reply",
        constants$545.g_dbus_connection_send_message_with_reply$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_send_message_with_reply_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_send_message_with_reply_finish$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_send_message_with_reply_finish",
        constants$545.g_dbus_connection_send_message_with_reply_finish$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_send_message_with_reply_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_send_message_with_reply_sync$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_send_message_with_reply_sync",
        constants$545.g_dbus_connection_send_message_with_reply_sync$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_emit_signal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_emit_signal$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_emit_signal",
        constants$545.g_dbus_connection_emit_signal$FUNC
    );
}


