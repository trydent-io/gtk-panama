// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$838 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$838() {}
    static final FunctionDescriptor cairo_scaled_font_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_create$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_create",
        constants$838.cairo_scaled_font_create$FUNC
    );
    static final FunctionDescriptor cairo_scaled_font_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_reference$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_reference",
        constants$838.cairo_scaled_font_reference$FUNC
    );
    static final FunctionDescriptor cairo_scaled_font_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_destroy",
        constants$838.cairo_scaled_font_destroy$FUNC
    );
    static final FunctionDescriptor cairo_scaled_font_get_reference_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_get_reference_count$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_get_reference_count",
        constants$838.cairo_scaled_font_get_reference_count$FUNC
    );
    static final FunctionDescriptor cairo_scaled_font_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_status$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_status",
        constants$838.cairo_scaled_font_status$FUNC
    );
    static final FunctionDescriptor cairo_scaled_font_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_get_type$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_get_type",
        constants$838.cairo_scaled_font_get_type$FUNC
    );
}


