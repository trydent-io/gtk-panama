// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1692 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1692() {}
    static final FunctionDescriptor gtk_list_box_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_append$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_append",
        constants$1692.gtk_list_box_append$FUNC
    );
    static final FunctionDescriptor gtk_list_box_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_list_box_insert$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_insert",
        constants$1692.gtk_list_box_insert$FUNC
    );
    static final FunctionDescriptor gtk_list_box_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_remove$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_remove",
        constants$1692.gtk_list_box_remove$FUNC
    );
    static final FunctionDescriptor gtk_list_box_get_selected_row$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_get_selected_row$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_get_selected_row",
        constants$1692.gtk_list_box_get_selected_row$FUNC
    );
    static final FunctionDescriptor gtk_list_box_get_row_at_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_list_box_get_row_at_index$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_get_row_at_index",
        constants$1692.gtk_list_box_get_row_at_index$FUNC
    );
    static final FunctionDescriptor gtk_list_box_get_row_at_y$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_list_box_get_row_at_y$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_get_row_at_y",
        constants$1692.gtk_list_box_get_row_at_y$FUNC
    );
}


