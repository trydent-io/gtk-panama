// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$470 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$470() {}
    static final FunctionDescriptor g_action_map_lookup_action$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_map_lookup_action$MH = RuntimeHelper.downcallHandle(
        "g_action_map_lookup_action",
        constants$470.g_action_map_lookup_action$FUNC
    );
    static final FunctionDescriptor g_action_map_add_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_map_add_action$MH = RuntimeHelper.downcallHandle(
        "g_action_map_add_action",
        constants$470.g_action_map_add_action$FUNC
    );
    static final FunctionDescriptor g_action_map_remove_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_map_remove_action$MH = RuntimeHelper.downcallHandle(
        "g_action_map_remove_action",
        constants$470.g_action_map_remove_action$FUNC
    );
    static final FunctionDescriptor g_action_map_add_action_entries$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_map_add_action_entries$MH = RuntimeHelper.downcallHandle(
        "g_action_map_add_action_entries",
        constants$470.g_action_map_add_action_entries$FUNC
    );
    static final FunctionDescriptor g_app_info_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_app_info_get_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_type",
        constants$470.g_app_info_get_type$FUNC
    );
    static final FunctionDescriptor g_app_info_create_from_commandline$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_create_from_commandline$MH = RuntimeHelper.downcallHandle(
        "g_app_info_create_from_commandline",
        constants$470.g_app_info_create_from_commandline$FUNC
    );
}

