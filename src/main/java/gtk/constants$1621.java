// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1621 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1621() {}
    static final FunctionDescriptor gtk_flow_box_set_selection_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_flow_box_set_selection_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_set_selection_mode",
        constants$1621.gtk_flow_box_set_selection_mode$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_get_selection_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_get_selection_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_get_selection_mode",
        constants$1621.gtk_flow_box_get_selection_mode$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_set_hadjustment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_set_hadjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_set_hadjustment",
        constants$1621.gtk_flow_box_set_hadjustment$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_set_vadjustment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_set_vadjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_set_vadjustment",
        constants$1621.gtk_flow_box_set_vadjustment$FUNC
    );
    static final FunctionDescriptor GtkFlowBoxFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkFlowBoxFilterFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkFlowBoxFilterFunc_UP$MH = RuntimeHelper.upcallHandle(GtkFlowBoxFilterFunc.class, "apply", constants$1621.GtkFlowBoxFilterFunc_UP$FUNC);
    static final FunctionDescriptor GtkFlowBoxFilterFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkFlowBoxFilterFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1621.GtkFlowBoxFilterFunc_DOWN$FUNC
    );
}


