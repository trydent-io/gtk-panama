// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1121 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1121() {}
    static final FunctionDescriptor gdk_display_manager_set_default_display$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_manager_set_default_display$MH = RuntimeHelper.downcallHandle(
        "gdk_display_manager_set_default_display",
        constants$1121.gdk_display_manager_set_default_display$FUNC
    );
    static final FunctionDescriptor gdk_display_manager_list_displays$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_manager_list_displays$MH = RuntimeHelper.downcallHandle(
        "gdk_display_manager_list_displays",
        constants$1121.gdk_display_manager_list_displays$FUNC
    );
    static final FunctionDescriptor gdk_display_manager_open_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_manager_open_display$MH = RuntimeHelper.downcallHandle(
        "gdk_display_manager_open_display",
        constants$1121.gdk_display_manager_open_display$FUNC
    );
    static final FunctionDescriptor gdk_set_allowed_backends$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_set_allowed_backends$MH = RuntimeHelper.downcallHandle(
        "gdk_set_allowed_backends",
        constants$1121.gdk_set_allowed_backends$FUNC
    );
    static final FunctionDescriptor gdk_drag_surface_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_drag_surface_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_surface_get_type",
        constants$1121.gdk_drag_surface_get_type$FUNC
    );
    static final FunctionDescriptor gdk_drag_surface_present$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drag_surface_present$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_surface_present",
        constants$1121.gdk_drag_surface_present$FUNC
    );
}


