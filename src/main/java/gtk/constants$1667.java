// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1667 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1667() {}
    static final FunctionDescriptor gtk_icon_view_select_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_select_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_select_path",
        constants$1667.gtk_icon_view_select_path$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_unselect_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_unselect_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_unselect_path",
        constants$1667.gtk_icon_view_unselect_path$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_path_is_selected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_path_is_selected$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_path_is_selected",
        constants$1667.gtk_icon_view_path_is_selected$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_item_row$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_item_row$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_item_row",
        constants$1667.gtk_icon_view_get_item_row$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_item_column$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_item_column$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_item_column",
        constants$1667.gtk_icon_view_get_item_column$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_selected_items$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_selected_items$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_selected_items",
        constants$1667.gtk_icon_view_get_selected_items$FUNC
    );
}


