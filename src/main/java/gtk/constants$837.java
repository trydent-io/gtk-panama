// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$837 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$837() {}
    static final FunctionDescriptor cairo_font_face_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_face_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_font_face_destroy",
        constants$837.cairo_font_face_destroy$FUNC
    );
    static final FunctionDescriptor cairo_font_face_get_reference_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_face_get_reference_count$MH = RuntimeHelper.downcallHandle(
        "cairo_font_face_get_reference_count",
        constants$837.cairo_font_face_get_reference_count$FUNC
    );
    static final FunctionDescriptor cairo_font_face_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_face_status$MH = RuntimeHelper.downcallHandle(
        "cairo_font_face_status",
        constants$837.cairo_font_face_status$FUNC
    );
    static final FunctionDescriptor cairo_font_face_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_face_get_type$MH = RuntimeHelper.downcallHandle(
        "cairo_font_face_get_type",
        constants$837.cairo_font_face_get_type$FUNC
    );
    static final FunctionDescriptor cairo_font_face_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_face_get_user_data$MH = RuntimeHelper.downcallHandle(
        "cairo_font_face_get_user_data",
        constants$837.cairo_font_face_get_user_data$FUNC
    );
    static final FunctionDescriptor cairo_font_face_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_face_set_user_data$MH = RuntimeHelper.downcallHandle(
        "cairo_font_face_set_user_data",
        constants$837.cairo_font_face_set_user_data$FUNC
    );
}


