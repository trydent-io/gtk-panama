// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1548 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1548() {}
    static final FunctionDescriptor gtk_combo_box_text_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_text_append$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_append",
        constants$1548.gtk_combo_box_text_append$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_text_prepend$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_text_prepend$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_prepend",
        constants$1548.gtk_combo_box_text_prepend$FUNC
    );
    static final FunctionDescriptor gtk_constraint_target_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_constraint_target_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_constraint_target_get_type",
        constants$1548.gtk_constraint_target_get_type$FUNC
    );
    static final FunctionDescriptor gtk_constraint_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_constraint_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_constraint_get_type",
        constants$1548.gtk_constraint_get_type$FUNC
    );
    static final FunctionDescriptor gtk_constraint_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_constraint_new$MH = RuntimeHelper.downcallHandle(
        "gtk_constraint_new",
        constants$1548.gtk_constraint_new$FUNC
    );
    static final FunctionDescriptor gtk_constraint_new_constant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_constraint_new_constant$MH = RuntimeHelper.downcallHandle(
        "gtk_constraint_new_constant",
        constants$1548.gtk_constraint_new_constant$FUNC
    );
}


