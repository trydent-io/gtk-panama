// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$252 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$252() {}
    static final FunctionDescriptor g_option_context_set_main_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_set_main_group$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_main_group",
        constants$252.g_option_context_set_main_group$FUNC
    );
    static final FunctionDescriptor g_option_context_get_main_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_main_group$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_main_group",
        constants$252.g_option_context_get_main_group$FUNC
    );
    static final FunctionDescriptor g_option_context_get_help$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_help$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_help",
        constants$252.g_option_context_get_help$FUNC
    );
    static final FunctionDescriptor g_option_group_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_new$MH = RuntimeHelper.downcallHandle(
        "g_option_group_new",
        constants$252.g_option_group_new$FUNC
    );
    static final FunctionDescriptor g_option_group_set_parse_hooks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_set_parse_hooks$MH = RuntimeHelper.downcallHandle(
        "g_option_group_set_parse_hooks",
        constants$252.g_option_group_set_parse_hooks$FUNC
    );
    static final FunctionDescriptor g_option_group_set_error_hook$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_set_error_hook$MH = RuntimeHelper.downcallHandle(
        "g_option_group_set_error_hook",
        constants$252.g_option_group_set_error_hook$FUNC
    );
}


