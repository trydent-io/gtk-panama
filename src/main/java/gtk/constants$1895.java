// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1895 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1895() {}
    static final FunctionDescriptor gtk_text_buffer_paste_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_paste_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_paste_clipboard",
        constants$1895.gtk_text_buffer_paste_clipboard$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_selection_bounds$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_selection_bounds$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_selection_bounds",
        constants$1895.gtk_text_buffer_get_selection_bounds$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_delete_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_delete_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_delete_selection",
        constants$1895.gtk_text_buffer_delete_selection$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_selection_content$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_selection_content$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_selection_content",
        constants$1895.gtk_text_buffer_get_selection_content$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_can_undo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_can_undo$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_can_undo",
        constants$1895.gtk_text_buffer_get_can_undo$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_can_redo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_can_redo$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_can_redo",
        constants$1895.gtk_text_buffer_get_can_redo$FUNC
    );
}


