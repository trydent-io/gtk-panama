// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1901 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1901() {}
    static final FunctionDescriptor gtk_text_view_buffer_to_window_coords$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_buffer_to_window_coords$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_buffer_to_window_coords",
        constants$1901.gtk_text_view_buffer_to_window_coords$FUNC
    );
    static final FunctionDescriptor gtk_text_view_window_to_buffer_coords$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_window_to_buffer_coords$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_window_to_buffer_coords",
        constants$1901.gtk_text_view_window_to_buffer_coords$FUNC
    );
    static final FunctionDescriptor gtk_text_view_forward_display_line$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_forward_display_line$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_forward_display_line",
        constants$1901.gtk_text_view_forward_display_line$FUNC
    );
    static final FunctionDescriptor gtk_text_view_backward_display_line$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_backward_display_line$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_backward_display_line",
        constants$1901.gtk_text_view_backward_display_line$FUNC
    );
    static final FunctionDescriptor gtk_text_view_forward_display_line_end$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_forward_display_line_end$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_forward_display_line_end",
        constants$1901.gtk_text_view_forward_display_line_end$FUNC
    );
    static final FunctionDescriptor gtk_text_view_backward_display_line_start$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_backward_display_line_start$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_backward_display_line_start",
        constants$1901.gtk_text_view_backward_display_line_start$FUNC
    );
}


