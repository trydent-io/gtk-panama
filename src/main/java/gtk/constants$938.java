// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$938 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$938() {}
    static final FunctionDescriptor pango_matrix_translate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_matrix_translate$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_translate",
        constants$938.pango_matrix_translate$FUNC
    );
    static final FunctionDescriptor pango_matrix_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_matrix_scale$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_scale",
        constants$938.pango_matrix_scale$FUNC
    );
    static final FunctionDescriptor pango_matrix_rotate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_matrix_rotate$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_rotate",
        constants$938.pango_matrix_rotate$FUNC
    );
    static final FunctionDescriptor pango_matrix_concat$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_concat$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_concat",
        constants$938.pango_matrix_concat$FUNC
    );
    static final FunctionDescriptor pango_matrix_transform_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_transform_point$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_transform_point",
        constants$938.pango_matrix_transform_point$FUNC
    );
    static final FunctionDescriptor pango_matrix_transform_distance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_transform_distance$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_transform_distance",
        constants$938.pango_matrix_transform_distance$FUNC
    );
}

