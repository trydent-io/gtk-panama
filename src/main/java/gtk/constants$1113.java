// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1113 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1113() {}
    static final FunctionDescriptor gdk_surface_create_similar_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_surface_create_similar_surface$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_create_similar_surface",
        constants$1113.gdk_surface_create_similar_surface$FUNC
    );
    static final FunctionDescriptor gdk_surface_beep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_beep$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_beep",
        constants$1113.gdk_surface_beep$FUNC
    );
    static final FunctionDescriptor gdk_surface_queue_render$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_queue_render$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_queue_render",
        constants$1113.gdk_surface_queue_render$FUNC
    );
    static final FunctionDescriptor gdk_surface_request_layout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_request_layout$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_request_layout",
        constants$1113.gdk_surface_request_layout$FUNC
    );
    static final FunctionDescriptor gdk_surface_get_frame_clock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_get_frame_clock$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_get_frame_clock",
        constants$1113.gdk_surface_get_frame_clock$FUNC
    );
    static final FunctionDescriptor gdk_surface_set_opaque_region$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_surface_set_opaque_region$MH = RuntimeHelper.downcallHandle(
        "gdk_surface_set_opaque_region",
        constants$1113.gdk_surface_set_opaque_region$FUNC
    );
}

