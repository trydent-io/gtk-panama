// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1669 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1669() {}
    static final FunctionDescriptor gtk_icon_view_enable_model_drag_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_view_enable_model_drag_source$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_enable_model_drag_source",
        constants$1669.gtk_icon_view_enable_model_drag_source$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_enable_model_drag_dest$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_view_enable_model_drag_dest$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_enable_model_drag_dest",
        constants$1669.gtk_icon_view_enable_model_drag_dest$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_unset_model_drag_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_unset_model_drag_source$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_unset_model_drag_source",
        constants$1669.gtk_icon_view_unset_model_drag_source$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_unset_model_drag_dest$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_unset_model_drag_dest$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_unset_model_drag_dest",
        constants$1669.gtk_icon_view_unset_model_drag_dest$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_set_reorderable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_view_set_reorderable$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_set_reorderable",
        constants$1669.gtk_icon_view_set_reorderable$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_reorderable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_reorderable$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_reorderable",
        constants$1669.gtk_icon_view_get_reorderable$FUNC
    );
}

