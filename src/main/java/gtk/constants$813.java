// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$813 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$813() {}
    static final FunctionDescriptor g_volume_eject$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_eject$MH = RuntimeHelper.downcallHandle(
        "g_volume_eject",
        constants$813.g_volume_eject$FUNC
    );
    static final FunctionDescriptor g_volume_eject_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_eject_finish$MH = RuntimeHelper.downcallHandle(
        "g_volume_eject_finish",
        constants$813.g_volume_eject_finish$FUNC
    );
    static final FunctionDescriptor g_volume_get_identifier$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_identifier$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_identifier",
        constants$813.g_volume_get_identifier$FUNC
    );
    static final FunctionDescriptor g_volume_enumerate_identifiers$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_enumerate_identifiers$MH = RuntimeHelper.downcallHandle(
        "g_volume_enumerate_identifiers",
        constants$813.g_volume_enumerate_identifiers$FUNC
    );
    static final FunctionDescriptor g_volume_get_activation_root$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_activation_root$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_activation_root",
        constants$813.g_volume_get_activation_root$FUNC
    );
    static final FunctionDescriptor g_volume_eject_with_operation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_eject_with_operation$MH = RuntimeHelper.downcallHandle(
        "g_volume_eject_with_operation",
        constants$813.g_volume_eject_with_operation$FUNC
    );
}


