// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1114 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1114() {}
    static final FunctionDescriptor gdk_surface_create_cairo_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_create_cairo_context$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_create_cairo_context",
        constants$1114.gdk_surface_create_cairo_context$FUNC
    );
    static final FunctionDescriptor gdk_surface_create_gl_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_create_gl_context$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_create_gl_context",
        constants$1114.gdk_surface_create_gl_context$FUNC
    );
    static final FunctionDescriptor gdk_surface_create_vulkan_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_create_vulkan_context$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_create_vulkan_context",
        constants$1114.gdk_surface_create_vulkan_context$FUNC
    );
    static final FunctionDescriptor gdk_seat_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_seat_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_type",
        constants$1114.gdk_seat_get_type$FUNC
    );
    static final FunctionDescriptor gdk_seat_get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_get_display$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_display",
        constants$1114.gdk_seat_get_display$FUNC
    );
    static final FunctionDescriptor gdk_seat_get_capabilities$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_get_capabilities$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_capabilities",
        constants$1114.gdk_seat_get_capabilities$FUNC
    );
}


