// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1104 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1104() {}
    static final FunctionDescriptor gdk_frame_clock_get_fps$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_clock_get_fps$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_clock_get_fps",
        constants$1104.gdk_frame_clock_get_fps$FUNC
    );
    static final FunctionDescriptor gdk_rectangle_intersect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_rectangle_intersect$MH = RuntimeHelper.downcallHandle(
        "gdk_rectangle_intersect",
        constants$1104.gdk_rectangle_intersect$FUNC
    );
    static final FunctionDescriptor gdk_rectangle_union$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_rectangle_union$MH = RuntimeHelper.downcallHandle(
        "gdk_rectangle_union",
        constants$1104.gdk_rectangle_union$FUNC
    );
    static final FunctionDescriptor gdk_rectangle_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_rectangle_equal$MH = RuntimeHelper.downcallHandle(
        "gdk_rectangle_equal",
        constants$1104.gdk_rectangle_equal$FUNC
    );
    static final FunctionDescriptor gdk_rectangle_contains_point$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_rectangle_contains_point$MH = RuntimeHelper.downcallHandle(
        "gdk_rectangle_contains_point",
        constants$1104.gdk_rectangle_contains_point$FUNC
    );
    static final FunctionDescriptor gdk_rectangle_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_rectangle_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_rectangle_get_type",
        constants$1104.gdk_rectangle_get_type$FUNC
    );
}


