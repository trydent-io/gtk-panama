// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$467 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$467() {}
    static final FunctionDescriptor g_action_group_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_action_group_get_type$MH = RuntimeHelper.downcallHandle(
        "g_action_group_get_type",
        constants$467.g_action_group_get_type$FUNC
    );
    static final FunctionDescriptor g_action_group_has_action$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_has_action$MH = RuntimeHelper.downcallHandle(
        "g_action_group_has_action",
        constants$467.g_action_group_has_action$FUNC
    );
    static final FunctionDescriptor g_action_group_list_actions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_list_actions$MH = RuntimeHelper.downcallHandle(
        "g_action_group_list_actions",
        constants$467.g_action_group_list_actions$FUNC
    );
    static final FunctionDescriptor g_action_group_get_action_parameter_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_get_action_parameter_type$MH = RuntimeHelper.downcallHandle(
        "g_action_group_get_action_parameter_type",
        constants$467.g_action_group_get_action_parameter_type$FUNC
    );
    static final FunctionDescriptor g_action_group_get_action_state_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_get_action_state_type$MH = RuntimeHelper.downcallHandle(
        "g_action_group_get_action_state_type",
        constants$467.g_action_group_get_action_state_type$FUNC
    );
    static final FunctionDescriptor g_action_group_get_action_state_hint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_get_action_state_hint$MH = RuntimeHelper.downcallHandle(
        "g_action_group_get_action_state_hint",
        constants$467.g_action_group_get_action_state_hint$FUNC
    );
}

