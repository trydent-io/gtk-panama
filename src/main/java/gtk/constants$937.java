// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$937 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$937() {}
    static final FunctionDescriptor pango_units_from_double$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_units_from_double$MH = RuntimeHelper.downcallHandle(
        "pango_units_from_double",
        constants$937.pango_units_from_double$FUNC
    );
    static final FunctionDescriptor pango_units_to_double$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_units_to_double$MH = RuntimeHelper.downcallHandle(
        "pango_units_to_double",
        constants$937.pango_units_to_double$FUNC
    );
    static final FunctionDescriptor pango_extents_to_pixels$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_extents_to_pixels$MH = RuntimeHelper.downcallHandle(
        "pango_extents_to_pixels",
        constants$937.pango_extents_to_pixels$FUNC
    );
    static final FunctionDescriptor pango_matrix_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_matrix_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_get_type",
        constants$937.pango_matrix_get_type$FUNC
    );
    static final FunctionDescriptor pango_matrix_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_copy$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_copy",
        constants$937.pango_matrix_copy$FUNC
    );
    static final FunctionDescriptor pango_matrix_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_free$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_free",
        constants$937.pango_matrix_free$FUNC
    );
}


