// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1089 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1089() {}
    static final FunctionDescriptor gdk_drag_get_selected_action$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_drag_get_selected_action$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_get_selected_action",
        constants$1089.gdk_drag_get_selected_action$FUNC
    );
    static final FunctionDescriptor gdk_drag_action_is_unique$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drag_action_is_unique$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_action_is_unique",
        constants$1089.gdk_drag_action_is_unique$FUNC
    );
    static final FunctionDescriptor gdk_drag_begin$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gdk_drag_begin$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_begin",
        constants$1089.gdk_drag_begin$FUNC
    );
    static final FunctionDescriptor gdk_drag_drop_done$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drag_drop_done$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_drop_done",
        constants$1089.gdk_drag_drop_done$FUNC
    );
    static final FunctionDescriptor gdk_drag_get_drag_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_drag_get_drag_surface$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_get_drag_surface",
        constants$1089.gdk_drag_get_drag_surface$FUNC
    );
    static final FunctionDescriptor gdk_drag_set_hotspot$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drag_set_hotspot$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_set_hotspot",
        constants$1089.gdk_drag_set_hotspot$FUNC
    );
}


