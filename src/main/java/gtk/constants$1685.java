// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1685 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1685() {}
    static final FunctionDescriptor gtk_level_bar_get_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_level_bar_get_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_get_mode",
        constants$1685.gtk_level_bar_get_mode$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_level_bar_set_value$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_set_value",
        constants$1685.gtk_level_bar_set_value$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_get_value$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_level_bar_get_value$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_get_value",
        constants$1685.gtk_level_bar_get_value$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_set_min_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_level_bar_set_min_value$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_set_min_value",
        constants$1685.gtk_level_bar_set_min_value$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_get_min_value$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_level_bar_get_min_value$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_get_min_value",
        constants$1685.gtk_level_bar_get_min_value$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_set_max_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_level_bar_set_max_value$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_set_max_value",
        constants$1685.gtk_level_bar_set_max_value$FUNC
    );
}

