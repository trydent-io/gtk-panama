// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1696 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1696() {}
    static final FunctionDescriptor gtk_list_box_set_sort_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_sort_func$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_sort_func",
        constants$1696.gtk_list_box_set_sort_func$FUNC
    );
    static final FunctionDescriptor gtk_list_box_set_activate_on_single_click$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_activate_on_single_click$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_activate_on_single_click",
        constants$1696.gtk_list_box_set_activate_on_single_click$FUNC
    );
    static final FunctionDescriptor gtk_list_box_get_activate_on_single_click$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_get_activate_on_single_click$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_get_activate_on_single_click",
        constants$1696.gtk_list_box_get_activate_on_single_click$FUNC
    );
    static final FunctionDescriptor gtk_list_box_drag_unhighlight_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_drag_unhighlight_row$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_drag_unhighlight_row",
        constants$1696.gtk_list_box_drag_unhighlight_row$FUNC
    );
    static final FunctionDescriptor gtk_list_box_drag_highlight_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_drag_highlight_row$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_drag_highlight_row",
        constants$1696.gtk_list_box_drag_highlight_row$FUNC
    );
    static final FunctionDescriptor gtk_list_box_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_list_box_new$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_new",
        constants$1696.gtk_list_box_new$FUNC
    );
}


