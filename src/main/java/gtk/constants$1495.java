// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1495 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1495() {}
    static final FunctionDescriptor gtk_editable_finish_delegate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_finish_delegate$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_finish_delegate",
        constants$1495.gtk_editable_finish_delegate$FUNC
    );
    static final FunctionDescriptor gtk_editable_delegate_set_property$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_delegate_set_property$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_delegate_set_property",
        constants$1495.gtk_editable_delegate_set_property$FUNC
    );
    static final FunctionDescriptor gtk_editable_delegate_get_property$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_delegate_get_property$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_delegate_get_property",
        constants$1495.gtk_editable_delegate_get_property$FUNC
    );
    static final FunctionDescriptor gtk_im_context_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_im_context_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_im_context_get_type",
        constants$1495.gtk_im_context_get_type$FUNC
    );
    static final FunctionDescriptor gtk_im_context_set_client_widget$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_im_context_set_client_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_im_context_set_client_widget",
        constants$1495.gtk_im_context_set_client_widget$FUNC
    );
    static final FunctionDescriptor gtk_im_context_get_preedit_string$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_im_context_get_preedit_string$MH = RuntimeHelper.downcallHandle(
        "gtk_im_context_get_preedit_string",
        constants$1495.gtk_im_context_get_preedit_string$FUNC
    );
}

