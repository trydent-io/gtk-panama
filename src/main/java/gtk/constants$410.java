// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$410 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$410() {}
    static final FunctionDescriptor g_signal_stop_emission$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_stop_emission$MH = RuntimeHelper.downcallHandle(
        "g_signal_stop_emission",
        constants$410.g_signal_stop_emission$FUNC
    );
    static final FunctionDescriptor g_signal_stop_emission_by_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_stop_emission_by_name$MH = RuntimeHelper.downcallHandle(
        "g_signal_stop_emission_by_name",
        constants$410.g_signal_stop_emission_by_name$FUNC
    );
    static final FunctionDescriptor g_signal_add_emission_hook$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_add_emission_hook$MH = RuntimeHelper.downcallHandle(
        "g_signal_add_emission_hook",
        constants$410.g_signal_add_emission_hook$FUNC
    );
    static final FunctionDescriptor g_signal_remove_emission_hook$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_signal_remove_emission_hook$MH = RuntimeHelper.downcallHandle(
        "g_signal_remove_emission_hook",
        constants$410.g_signal_remove_emission_hook$FUNC
    );
    static final FunctionDescriptor g_signal_has_handler_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_has_handler_pending$MH = RuntimeHelper.downcallHandle(
        "g_signal_has_handler_pending",
        constants$410.g_signal_has_handler_pending$FUNC
    );
    static final FunctionDescriptor g_signal_connect_closure_by_id$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_connect_closure_by_id$MH = RuntimeHelper.downcallHandle(
        "g_signal_connect_closure_by_id",
        constants$410.g_signal_connect_closure_by_id$FUNC
    );
}


