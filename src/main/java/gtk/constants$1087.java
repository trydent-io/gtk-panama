// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1087 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1087() {}
    static final FunctionDescriptor gdk_device_get_surface_at_position$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_surface_at_position$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_surface_at_position",
        constants$1087.gdk_device_get_surface_at_position$FUNC
    );
    static final FunctionDescriptor gdk_device_get_timestamp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_timestamp$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_timestamp",
        constants$1087.gdk_device_get_timestamp$FUNC
    );
    static final FunctionDescriptor gdk_device_pad_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_device_pad_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_device_pad_get_type",
        constants$1087.gdk_device_pad_get_type$FUNC
    );
    static final FunctionDescriptor gdk_device_pad_get_n_groups$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_pad_get_n_groups$MH = RuntimeHelper.downcallHandle(
        "gdk_device_pad_get_n_groups",
        constants$1087.gdk_device_pad_get_n_groups$FUNC
    );
    static final FunctionDescriptor gdk_device_pad_get_group_n_modes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_pad_get_group_n_modes$MH = RuntimeHelper.downcallHandle(
        "gdk_device_pad_get_group_n_modes",
        constants$1087.gdk_device_pad_get_group_n_modes$FUNC
    );
    static final FunctionDescriptor gdk_device_pad_get_n_features$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_pad_get_n_features$MH = RuntimeHelper.downcallHandle(
        "gdk_device_pad_get_n_features",
        constants$1087.gdk_device_pad_get_n_features$FUNC
    );
}


