// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1896 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1896() {}
    static final FunctionDescriptor gtk_text_buffer_get_enable_undo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_enable_undo$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_enable_undo",
        constants$1896.gtk_text_buffer_get_enable_undo$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_set_enable_undo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_set_enable_undo$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_set_enable_undo",
        constants$1896.gtk_text_buffer_set_enable_undo$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_max_undo_levels$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_max_undo_levels$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_max_undo_levels",
        constants$1896.gtk_text_buffer_get_max_undo_levels$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_set_max_undo_levels$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_set_max_undo_levels$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_set_max_undo_levels",
        constants$1896.gtk_text_buffer_set_max_undo_levels$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_undo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_undo$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_undo",
        constants$1896.gtk_text_buffer_undo$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_redo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_redo$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_redo",
        constants$1896.gtk_text_buffer_redo$FUNC
    );
}

