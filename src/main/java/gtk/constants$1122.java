// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1122 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1122() {}
    static final FunctionDescriptor gdk_draw_context_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_draw_context_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_draw_context_get_type",
        constants$1122.gdk_draw_context_get_type$FUNC
    );
    static final FunctionDescriptor gdk_draw_context_get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_draw_context_get_display$MH = RuntimeHelper.downcallHandle(
        "gdk_draw_context_get_display",
        constants$1122.gdk_draw_context_get_display$FUNC
    );
    static final FunctionDescriptor gdk_draw_context_get_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_draw_context_get_surface$MH = RuntimeHelper.downcallHandle(
        "gdk_draw_context_get_surface",
        constants$1122.gdk_draw_context_get_surface$FUNC
    );
    static final FunctionDescriptor gdk_draw_context_begin_frame$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_draw_context_begin_frame$MH = RuntimeHelper.downcallHandle(
        "gdk_draw_context_begin_frame",
        constants$1122.gdk_draw_context_begin_frame$FUNC
    );
    static final FunctionDescriptor gdk_draw_context_end_frame$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_draw_context_end_frame$MH = RuntimeHelper.downcallHandle(
        "gdk_draw_context_end_frame",
        constants$1122.gdk_draw_context_end_frame$FUNC
    );
    static final FunctionDescriptor gdk_draw_context_is_in_frame$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_draw_context_is_in_frame$MH = RuntimeHelper.downcallHandle(
        "gdk_draw_context_is_in_frame",
        constants$1122.gdk_draw_context_is_in_frame$FUNC
    );
}


