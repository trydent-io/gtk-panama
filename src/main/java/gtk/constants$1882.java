// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1882 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1882() {}
    static final FunctionDescriptor gtk_text_iter_set_visible_line_offset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_iter_set_visible_line_offset$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_set_visible_line_offset",
        constants$1882.gtk_text_iter_set_visible_line_offset$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_set_visible_line_index$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_iter_set_visible_line_index$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_set_visible_line_index",
        constants$1882.gtk_text_iter_set_visible_line_index$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_forward_to_tag_toggle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_forward_to_tag_toggle$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_forward_to_tag_toggle",
        constants$1882.gtk_text_iter_forward_to_tag_toggle$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_backward_to_tag_toggle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_backward_to_tag_toggle$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_backward_to_tag_toggle",
        constants$1882.gtk_text_iter_backward_to_tag_toggle$FUNC
    );
    static final FunctionDescriptor GtkTextCharPredicate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkTextCharPredicate_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTextCharPredicate_UP$MH = RuntimeHelper.upcallHandle(GtkTextCharPredicate.class, "apply", constants$1882.GtkTextCharPredicate_UP$FUNC);
    static final FunctionDescriptor GtkTextCharPredicate_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTextCharPredicate_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1882.GtkTextCharPredicate_DOWN$FUNC
    );
}

