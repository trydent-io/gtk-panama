// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1315 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1315() {}
    static final FunctionDescriptor gtk_widget_queue_allocate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_queue_allocate$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_queue_allocate",
        constants$1315.gtk_widget_queue_allocate$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_frame_clock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_frame_clock$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_frame_clock",
        constants$1315.gtk_widget_get_frame_clock$FUNC
    );
    static final FunctionDescriptor gtk_widget_size_allocate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_size_allocate$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_size_allocate",
        constants$1315.gtk_widget_size_allocate$FUNC
    );
    static final FunctionDescriptor gtk_widget_allocate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_allocate$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_allocate",
        constants$1315.gtk_widget_allocate$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_request_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_request_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_request_mode",
        constants$1315.gtk_widget_get_request_mode$FUNC
    );
    static final FunctionDescriptor gtk_widget_measure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_measure$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_measure",
        constants$1315.gtk_widget_measure$FUNC
    );
}


