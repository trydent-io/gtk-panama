// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1580 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1580() {}
    static final FunctionDescriptor gtk_drag_source_set_content$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_set_content$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_set_content",
        constants$1580.gtk_drag_source_set_content$FUNC
    );
    static final FunctionDescriptor gtk_drag_source_get_content$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_get_content$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_get_content",
        constants$1580.gtk_drag_source_get_content$FUNC
    );
    static final FunctionDescriptor gtk_drag_source_set_actions$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_source_set_actions$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_set_actions",
        constants$1580.gtk_drag_source_set_actions$FUNC
    );
    static final FunctionDescriptor gtk_drag_source_get_actions$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_get_actions$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_get_actions",
        constants$1580.gtk_drag_source_get_actions$FUNC
    );
    static final FunctionDescriptor gtk_drag_source_set_icon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_source_set_icon$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_set_icon",
        constants$1580.gtk_drag_source_set_icon$FUNC
    );
    static final FunctionDescriptor gtk_drag_source_drag_cancel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_drag_cancel$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_drag_cancel",
        constants$1580.gtk_drag_source_drag_cancel$FUNC
    );
}


