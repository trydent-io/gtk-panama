// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$739 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$739() {}
    static final FunctionDescriptor g_settings_set_enum$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_settings_set_enum$MH = RuntimeHelper.downcallHandle(
        "g_settings_set_enum",
        constants$739.g_settings_set_enum$FUNC
    );
    static final FunctionDescriptor g_settings_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_flags",
        constants$739.g_settings_get_flags$FUNC
    );
    static final FunctionDescriptor g_settings_set_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_settings_set_flags$MH = RuntimeHelper.downcallHandle(
        "g_settings_set_flags",
        constants$739.g_settings_set_flags$FUNC
    );
    static final FunctionDescriptor g_settings_get_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_child$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_child",
        constants$739.g_settings_get_child$FUNC
    );
    static final FunctionDescriptor g_settings_is_writable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_is_writable$MH = RuntimeHelper.downcallHandle(
        "g_settings_is_writable",
        constants$739.g_settings_is_writable$FUNC
    );
    static final FunctionDescriptor g_settings_delay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_delay$MH = RuntimeHelper.downcallHandle(
        "g_settings_delay",
        constants$739.g_settings_delay$FUNC
    );
}

