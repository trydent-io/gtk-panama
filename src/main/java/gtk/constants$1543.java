// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1543 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1543() {}
    static final FunctionDescriptor gtk_combo_box_set_model$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_set_model$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_set_model",
        constants$1543.gtk_combo_box_set_model$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_get_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_get_model$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_get_model",
        constants$1543.gtk_combo_box_get_model$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_get_row_separator_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_get_row_separator_func$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_get_row_separator_func",
        constants$1543.gtk_combo_box_get_row_separator_func$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_set_row_separator_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_set_row_separator_func$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_set_row_separator_func",
        constants$1543.gtk_combo_box_set_row_separator_func$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_set_button_sensitivity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_combo_box_set_button_sensitivity$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_set_button_sensitivity",
        constants$1543.gtk_combo_box_set_button_sensitivity$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_get_button_sensitivity$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_get_button_sensitivity$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_get_button_sensitivity",
        constants$1543.gtk_combo_box_get_button_sensitivity$FUNC
    );
}


