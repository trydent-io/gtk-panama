// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1778 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1778() {}
    static final FunctionDescriptor gtk_print_operation_set_custom_tab_label$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_set_custom_tab_label$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_set_custom_tab_label",
        constants$1778.gtk_print_operation_set_custom_tab_label$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_run$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_run$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_run",
        constants$1778.gtk_print_operation_run$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_get_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_get_error$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_get_error",
        constants$1778.gtk_print_operation_get_error$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_get_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_get_status$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_get_status",
        constants$1778.gtk_print_operation_get_status$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_get_status_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_get_status_string$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_get_status_string",
        constants$1778.gtk_print_operation_get_status_string$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_is_finished$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_is_finished$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_is_finished",
        constants$1778.gtk_print_operation_is_finished$FUNC
    );
}

