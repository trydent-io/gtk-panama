// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$451 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$451() {}
    static final FunctionDescriptor g_type_plugin_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_type_plugin_get_type$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_get_type",
        constants$451.g_type_plugin_get_type$FUNC
    );
    static final FunctionDescriptor g_type_plugin_use$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_use$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_use",
        constants$451.g_type_plugin_use$FUNC
    );
    static final FunctionDescriptor g_type_plugin_unuse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_unuse$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_unuse",
        constants$451.g_type_plugin_unuse$FUNC
    );
    static final FunctionDescriptor g_type_plugin_complete_type_info$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_complete_type_info$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_complete_type_info",
        constants$451.g_type_plugin_complete_type_info$FUNC
    );
    static final FunctionDescriptor g_type_plugin_complete_interface_info$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_complete_interface_info$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_complete_interface_info",
        constants$451.g_type_plugin_complete_interface_info$FUNC
    );
    static final FunctionDescriptor g_value_array_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_value_array_get_type$MH = RuntimeHelper.downcallHandle(
        "g_value_array_get_type",
        constants$451.g_value_array_get_type$FUNC
    );
}


