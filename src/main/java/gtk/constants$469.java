// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$469 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$469() {}
    static final FunctionDescriptor g_action_group_action_enabled_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_action_group_action_enabled_changed$MH = RuntimeHelper.downcallHandle(
        "g_action_group_action_enabled_changed",
        constants$469.g_action_group_action_enabled_changed$FUNC
    );
    static final FunctionDescriptor g_action_group_action_state_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_action_state_changed$MH = RuntimeHelper.downcallHandle(
        "g_action_group_action_state_changed",
        constants$469.g_action_group_action_state_changed$FUNC
    );
    static final FunctionDescriptor g_action_group_query_action$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_query_action$MH = RuntimeHelper.downcallHandle(
        "g_action_group_query_action",
        constants$469.g_action_group_query_action$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_export_action_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_export_action_group$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_export_action_group",
        constants$469.g_dbus_connection_export_action_group$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_unexport_action_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_connection_unexport_action_group$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_unexport_action_group",
        constants$469.g_dbus_connection_unexport_action_group$FUNC
    );
    static final FunctionDescriptor g_action_map_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_action_map_get_type$MH = RuntimeHelper.downcallHandle(
        "g_action_map_get_type",
        constants$469.g_action_map_get_type$FUNC
    );
}


