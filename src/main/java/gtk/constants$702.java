// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$702 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$702() {}
    static final FunctionDescriptor g_mount_operation_set_is_tcrypt_hidden_volume$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mount_operation_set_is_tcrypt_hidden_volume$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_set_is_tcrypt_hidden_volume",
        constants$702.g_mount_operation_set_is_tcrypt_hidden_volume$FUNC
    );
    static final FunctionDescriptor g_mount_operation_get_is_tcrypt_system_volume$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_get_is_tcrypt_system_volume$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_is_tcrypt_system_volume",
        constants$702.g_mount_operation_get_is_tcrypt_system_volume$FUNC
    );
    static final FunctionDescriptor g_mount_operation_set_is_tcrypt_system_volume$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mount_operation_set_is_tcrypt_system_volume$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_set_is_tcrypt_system_volume",
        constants$702.g_mount_operation_set_is_tcrypt_system_volume$FUNC
    );
    static final FunctionDescriptor g_mount_operation_get_pim$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_get_pim$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_pim",
        constants$702.g_mount_operation_get_pim$FUNC
    );
    static final FunctionDescriptor g_mount_operation_set_pim$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mount_operation_set_pim$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_set_pim",
        constants$702.g_mount_operation_set_pim$FUNC
    );
    static final FunctionDescriptor g_native_socket_address_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_native_socket_address_get_type$MH = RuntimeHelper.downcallHandle(
        "g_native_socket_address_get_type",
        constants$702.g_native_socket_address_get_type$FUNC
    );
}


