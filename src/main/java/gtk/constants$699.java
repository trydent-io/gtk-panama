// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$699 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$699() {}
    static final FunctionDescriptor g_mount_eject_with_operation_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_eject_with_operation_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_eject_with_operation_finish",
        constants$699.g_mount_eject_with_operation_finish$FUNC
    );
    static final FunctionDescriptor g_mount_get_sort_key$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_get_sort_key$MH = RuntimeHelper.downcallHandle(
        "g_mount_get_sort_key",
        constants$699.g_mount_get_sort_key$FUNC
    );
    static final FunctionDescriptor g_mount_operation_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_mount_operation_get_type$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_type",
        constants$699.g_mount_operation_get_type$FUNC
    );
    static final FunctionDescriptor g_mount_operation_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_mount_operation_new$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_new",
        constants$699.g_mount_operation_new$FUNC
    );
    static final FunctionDescriptor g_mount_operation_get_username$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_get_username$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_username",
        constants$699.g_mount_operation_get_username$FUNC
    );
    static final FunctionDescriptor g_mount_operation_set_username$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_set_username$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_set_username",
        constants$699.g_mount_operation_set_username$FUNC
    );
}

