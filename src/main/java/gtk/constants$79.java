// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$79 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$79() {}
    static final FunctionDescriptor g_time_zone_new_offset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_time_zone_new_offset$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new_offset",
        constants$79.g_time_zone_new_offset$FUNC
    );
    static final FunctionDescriptor g_time_zone_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_time_zone_ref$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_ref",
        constants$79.g_time_zone_ref$FUNC
    );
    static final FunctionDescriptor g_time_zone_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_time_zone_unref$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_unref",
        constants$79.g_time_zone_unref$FUNC
    );
    static final FunctionDescriptor g_time_zone_find_interval$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_time_zone_find_interval$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_find_interval",
        constants$79.g_time_zone_find_interval$FUNC
    );
    static final FunctionDescriptor g_time_zone_adjust_time$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_time_zone_adjust_time$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_adjust_time",
        constants$79.g_time_zone_adjust_time$FUNC
    );
    static final FunctionDescriptor g_time_zone_get_abbreviation$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_time_zone_get_abbreviation$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_get_abbreviation",
        constants$79.g_time_zone_get_abbreviation$FUNC
    );
}


