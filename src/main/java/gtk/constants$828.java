// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$828 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$828() {}
    static final FunctionDescriptor cairo_show_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_show_page$MH = RuntimeHelper.downcallHandle(
        "cairo_show_page",
        constants$828.cairo_show_page$FUNC
    );
    static final FunctionDescriptor cairo_in_stroke$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_in_stroke$MH = RuntimeHelper.downcallHandle(
        "cairo_in_stroke",
        constants$828.cairo_in_stroke$FUNC
    );
    static final FunctionDescriptor cairo_in_fill$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_in_fill$MH = RuntimeHelper.downcallHandle(
        "cairo_in_fill",
        constants$828.cairo_in_fill$FUNC
    );
    static final FunctionDescriptor cairo_in_clip$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_in_clip$MH = RuntimeHelper.downcallHandle(
        "cairo_in_clip",
        constants$828.cairo_in_clip$FUNC
    );
    static final FunctionDescriptor cairo_stroke_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_stroke_extents$MH = RuntimeHelper.downcallHandle(
        "cairo_stroke_extents",
        constants$828.cairo_stroke_extents$FUNC
    );
    static final FunctionDescriptor cairo_fill_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_fill_extents$MH = RuntimeHelper.downcallHandle(
        "cairo_fill_extents",
        constants$828.cairo_fill_extents$FUNC
    );
}

