// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1620 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1620() {}
    static final FunctionDescriptor gtk_flow_box_selected_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_selected_foreach$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_selected_foreach",
        constants$1620.gtk_flow_box_selected_foreach$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_get_selected_children$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_get_selected_children$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_get_selected_children",
        constants$1620.gtk_flow_box_get_selected_children$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_select_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_select_child$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_select_child",
        constants$1620.gtk_flow_box_select_child$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_unselect_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_unselect_child$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_unselect_child",
        constants$1620.gtk_flow_box_unselect_child$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_select_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_select_all$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_select_all",
        constants$1620.gtk_flow_box_select_all$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_unselect_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_unselect_all$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_unselect_all",
        constants$1620.gtk_flow_box_unselect_all$FUNC
    );
}

