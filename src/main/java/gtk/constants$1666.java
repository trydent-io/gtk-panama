// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1666 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1666() {}
    static final FunctionDescriptor gtk_icon_view_get_visible_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_visible_range$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_visible_range",
        constants$1666.gtk_icon_view_get_visible_range$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_set_activate_on_single_click$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_view_set_activate_on_single_click$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_set_activate_on_single_click",
        constants$1666.gtk_icon_view_set_activate_on_single_click$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_activate_on_single_click$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_activate_on_single_click$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_activate_on_single_click",
        constants$1666.gtk_icon_view_get_activate_on_single_click$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_selected_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_selected_foreach$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_selected_foreach",
        constants$1666.gtk_icon_view_selected_foreach$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_set_selection_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_view_set_selection_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_set_selection_mode",
        constants$1666.gtk_icon_view_set_selection_mode$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_selection_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_selection_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_selection_mode",
        constants$1666.gtk_icon_view_get_selection_mode$FUNC
    );
}

