// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$704 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$704() {}
    static final FunctionDescriptor g_volume_monitor_get_volume_for_uuid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_monitor_get_volume_for_uuid$MH = RuntimeHelper.downcallHandle(
        "g_volume_monitor_get_volume_for_uuid",
        constants$704.g_volume_monitor_get_volume_for_uuid$FUNC
    );
    static final FunctionDescriptor g_volume_monitor_get_mount_for_uuid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_monitor_get_mount_for_uuid$MH = RuntimeHelper.downcallHandle(
        "g_volume_monitor_get_mount_for_uuid",
        constants$704.g_volume_monitor_get_mount_for_uuid$FUNC
    );
    static final FunctionDescriptor g_volume_monitor_adopt_orphan_mount$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_monitor_adopt_orphan_mount$MH = RuntimeHelper.downcallHandle(
        "g_volume_monitor_adopt_orphan_mount",
        constants$704.g_volume_monitor_adopt_orphan_mount$FUNC
    );
    static final FunctionDescriptor g_native_volume_monitor_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_native_volume_monitor_get_type$MH = RuntimeHelper.downcallHandle(
        "g_native_volume_monitor_get_type",
        constants$704.g_native_volume_monitor_get_type$FUNC
    );
    static final FunctionDescriptor g_network_address_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_network_address_get_type$MH = RuntimeHelper.downcallHandle(
        "g_network_address_get_type",
        constants$704.g_network_address_get_type$FUNC
    );
    static final FunctionDescriptor g_network_address_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_network_address_new$MH = RuntimeHelper.downcallHandle(
        "g_network_address_new",
        constants$704.g_network_address_new$FUNC
    );
}


