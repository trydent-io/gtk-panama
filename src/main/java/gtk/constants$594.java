// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$594 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$594() {}
    static final FunctionDescriptor g_drive_poll_for_media_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_poll_for_media_finish$MH = RuntimeHelper.downcallHandle(
        "g_drive_poll_for_media_finish",
        constants$594.g_drive_poll_for_media_finish$FUNC
    );
    static final FunctionDescriptor g_drive_get_identifier$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_get_identifier$MH = RuntimeHelper.downcallHandle(
        "g_drive_get_identifier",
        constants$594.g_drive_get_identifier$FUNC
    );
    static final FunctionDescriptor g_drive_enumerate_identifiers$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_enumerate_identifiers$MH = RuntimeHelper.downcallHandle(
        "g_drive_enumerate_identifiers",
        constants$594.g_drive_enumerate_identifiers$FUNC
    );
    static final FunctionDescriptor g_drive_get_start_stop_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_get_start_stop_type$MH = RuntimeHelper.downcallHandle(
        "g_drive_get_start_stop_type",
        constants$594.g_drive_get_start_stop_type$FUNC
    );
    static final FunctionDescriptor g_drive_can_start$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_can_start$MH = RuntimeHelper.downcallHandle(
        "g_drive_can_start",
        constants$594.g_drive_can_start$FUNC
    );
    static final FunctionDescriptor g_drive_can_start_degraded$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_can_start_degraded$MH = RuntimeHelper.downcallHandle(
        "g_drive_can_start_degraded",
        constants$594.g_drive_can_start_degraded$FUNC
    );
}


