// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$737 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$737() {}
    static final FunctionDescriptor g_settings_set_uint$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_settings_set_uint$MH = RuntimeHelper.downcallHandle(
        "g_settings_set_uint",
        constants$737.g_settings_set_uint$FUNC
    );
    static final FunctionDescriptor g_settings_get_uint64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_uint64$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_uint64",
        constants$737.g_settings_get_uint64$FUNC
    );
    static final FunctionDescriptor g_settings_set_uint64$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_settings_set_uint64$MH = RuntimeHelper.downcallHandle(
        "g_settings_set_uint64",
        constants$737.g_settings_set_uint64$FUNC
    );
    static final FunctionDescriptor g_settings_get_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_string$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_string",
        constants$737.g_settings_get_string$FUNC
    );
    static final FunctionDescriptor g_settings_set_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_set_string$MH = RuntimeHelper.downcallHandle(
        "g_settings_set_string",
        constants$737.g_settings_set_string$FUNC
    );
    static final FunctionDescriptor g_settings_get_boolean$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_boolean$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_boolean",
        constants$737.g_settings_get_boolean$FUNC
    );
}

