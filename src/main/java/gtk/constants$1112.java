// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1112 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1112() {}
    static final FunctionDescriptor gdk_surface_get_device_cursor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_get_device_cursor$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_get_device_cursor",
        constants$1112.gdk_surface_get_device_cursor$FUNC
    );
    static final FunctionDescriptor gdk_surface_get_width$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_get_width$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_get_width",
        constants$1112.gdk_surface_get_width$FUNC
    );
    static final FunctionDescriptor gdk_surface_get_height$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_get_height$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_get_height",
        constants$1112.gdk_surface_get_height$FUNC
    );
    static final FunctionDescriptor gdk_surface_translate_coordinates$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_translate_coordinates$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_translate_coordinates",
        constants$1112.gdk_surface_translate_coordinates$FUNC
    );
    static final FunctionDescriptor gdk_surface_get_scale_factor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_get_scale_factor$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_get_scale_factor",
        constants$1112.gdk_surface_get_scale_factor$FUNC
    );
    static final FunctionDescriptor gdk_surface_get_device_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_get_device_position$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_get_device_position",
        constants$1112.gdk_surface_get_device_position$FUNC
    );
}

