// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$466 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$466() {}
    static final FunctionDescriptor g_action_get_state$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_get_state$MH = RuntimeHelper.downcallHandle(
        "g_action_get_state",
        constants$466.g_action_get_state$FUNC
    );
    static final FunctionDescriptor g_action_change_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_change_state$MH = RuntimeHelper.downcallHandle(
        "g_action_change_state",
        constants$466.g_action_change_state$FUNC
    );
    static final FunctionDescriptor g_action_activate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_activate$MH = RuntimeHelper.downcallHandle(
        "g_action_activate",
        constants$466.g_action_activate$FUNC
    );
    static final FunctionDescriptor g_action_name_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_name_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_action_name_is_valid",
        constants$466.g_action_name_is_valid$FUNC
    );
    static final FunctionDescriptor g_action_parse_detailed_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_parse_detailed_name$MH = RuntimeHelper.downcallHandle(
        "g_action_parse_detailed_name",
        constants$466.g_action_parse_detailed_name$FUNC
    );
    static final FunctionDescriptor g_action_print_detailed_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_print_detailed_name$MH = RuntimeHelper.downcallHandle(
        "g_action_print_detailed_name",
        constants$466.g_action_print_detailed_name$FUNC
    );
}

