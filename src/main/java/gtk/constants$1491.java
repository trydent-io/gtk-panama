// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1491 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1491() {}
    static final FunctionDescriptor gtk_editable_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_editable_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_type",
        constants$1491.gtk_editable_get_type$FUNC
    );
    static final FunctionDescriptor gtk_editable_get_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_get_text$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_text",
        constants$1491.gtk_editable_get_text$FUNC
    );
    static final FunctionDescriptor gtk_editable_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_set_text$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_set_text",
        constants$1491.gtk_editable_set_text$FUNC
    );
    static final FunctionDescriptor gtk_editable_get_chars$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_get_chars$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_chars",
        constants$1491.gtk_editable_get_chars$FUNC
    );
    static final FunctionDescriptor gtk_editable_insert_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_insert_text$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_insert_text",
        constants$1491.gtk_editable_insert_text$FUNC
    );
    static final FunctionDescriptor gtk_editable_delete_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_delete_text$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_delete_text",
        constants$1491.gtk_editable_delete_text$FUNC
    );
}


