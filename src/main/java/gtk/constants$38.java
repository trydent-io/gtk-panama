// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$38 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$38() {}
    static final FunctionDescriptor g_get_user_state_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_user_state_dir$MH = RuntimeHelper.downcallHandle(
        "g_get_user_state_dir",
        constants$38.g_get_user_state_dir$FUNC
    );
    static final FunctionDescriptor g_get_system_data_dirs$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_system_data_dirs$MH = RuntimeHelper.downcallHandle(
        "g_get_system_data_dirs",
        constants$38.g_get_system_data_dirs$FUNC
    );
    static final FunctionDescriptor g_get_system_config_dirs$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_system_config_dirs$MH = RuntimeHelper.downcallHandle(
        "g_get_system_config_dirs",
        constants$38.g_get_system_config_dirs$FUNC
    );
    static final FunctionDescriptor g_get_user_runtime_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_user_runtime_dir$MH = RuntimeHelper.downcallHandle(
        "g_get_user_runtime_dir",
        constants$38.g_get_user_runtime_dir$FUNC
    );
    static final FunctionDescriptor g_get_user_special_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_get_user_special_dir$MH = RuntimeHelper.downcallHandle(
        "g_get_user_special_dir",
        constants$38.g_get_user_special_dir$FUNC
    );
    static final FunctionDescriptor g_parse_debug_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_parse_debug_string$MH = RuntimeHelper.downcallHandle(
        "g_parse_debug_string",
        constants$38.g_parse_debug_string$FUNC
    );
}


