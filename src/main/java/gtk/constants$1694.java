// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1694 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1694() {}
    static final FunctionDescriptor gtk_list_box_selected_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_selected_foreach$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_selected_foreach",
        constants$1694.gtk_list_box_selected_foreach$FUNC
    );
    static final FunctionDescriptor gtk_list_box_get_selected_rows$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_get_selected_rows$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_get_selected_rows",
        constants$1694.gtk_list_box_get_selected_rows$FUNC
    );
    static final FunctionDescriptor gtk_list_box_unselect_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_unselect_row$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_unselect_row",
        constants$1694.gtk_list_box_unselect_row$FUNC
    );
    static final FunctionDescriptor gtk_list_box_select_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_select_all$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_select_all",
        constants$1694.gtk_list_box_select_all$FUNC
    );
    static final FunctionDescriptor gtk_list_box_unselect_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_unselect_all$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_unselect_all",
        constants$1694.gtk_list_box_unselect_all$FUNC
    );
    static final FunctionDescriptor gtk_list_box_set_selection_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_selection_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_selection_mode",
        constants$1694.gtk_list_box_set_selection_mode$FUNC
    );
}


