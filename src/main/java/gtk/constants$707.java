// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$707 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$707() {}
    static final FunctionDescriptor g_network_monitor_can_reach_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_monitor_can_reach_async$MH = RuntimeHelper.downcallHandle(
        "g_network_monitor_can_reach_async",
        constants$707.g_network_monitor_can_reach_async$FUNC
    );
    static final FunctionDescriptor g_network_monitor_can_reach_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_monitor_can_reach_finish$MH = RuntimeHelper.downcallHandle(
        "g_network_monitor_can_reach_finish",
        constants$707.g_network_monitor_can_reach_finish$FUNC
    );
    static final FunctionDescriptor g_network_service_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_network_service_get_type$MH = RuntimeHelper.downcallHandle(
        "g_network_service_get_type",
        constants$707.g_network_service_get_type$FUNC
    );
    static final FunctionDescriptor g_network_service_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_service_new$MH = RuntimeHelper.downcallHandle(
        "g_network_service_new",
        constants$707.g_network_service_new$FUNC
    );
    static final FunctionDescriptor g_network_service_get_service$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_service_get_service$MH = RuntimeHelper.downcallHandle(
        "g_network_service_get_service",
        constants$707.g_network_service_get_service$FUNC
    );
    static final FunctionDescriptor g_network_service_get_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_service_get_protocol$MH = RuntimeHelper.downcallHandle(
        "g_network_service_get_protocol",
        constants$707.g_network_service_get_protocol$FUNC
    );
}


