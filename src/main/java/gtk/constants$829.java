// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$829 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$829() {}
    static final FunctionDescriptor cairo_reset_clip$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_reset_clip$MH = RuntimeHelper.downcallHandle(
        "cairo_reset_clip",
        constants$829.cairo_reset_clip$FUNC
    );
    static final FunctionDescriptor cairo_clip$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_clip$MH = RuntimeHelper.downcallHandle(
        "cairo_clip",
        constants$829.cairo_clip$FUNC
    );
    static final FunctionDescriptor cairo_clip_preserve$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_clip_preserve$MH = RuntimeHelper.downcallHandle(
        "cairo_clip_preserve",
        constants$829.cairo_clip_preserve$FUNC
    );
    static final FunctionDescriptor cairo_clip_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_clip_extents$MH = RuntimeHelper.downcallHandle(
        "cairo_clip_extents",
        constants$829.cairo_clip_extents$FUNC
    );
    static final FunctionDescriptor cairo_copy_clip_rectangle_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_copy_clip_rectangle_list$MH = RuntimeHelper.downcallHandle(
        "cairo_copy_clip_rectangle_list",
        constants$829.cairo_copy_clip_rectangle_list$FUNC
    );
    static final FunctionDescriptor cairo_rectangle_list_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_rectangle_list_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_rectangle_list_destroy",
        constants$829.cairo_rectangle_list_destroy$FUNC
    );
}


