// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1609 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1609() {}
    static final FunctionDescriptor gtk_native_dialog_get_visible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_get_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_get_visible",
        constants$1609.gtk_native_dialog_get_visible$FUNC
    );
    static final FunctionDescriptor gtk_native_dialog_set_modal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_set_modal$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_set_modal",
        constants$1609.gtk_native_dialog_set_modal$FUNC
    );
    static final FunctionDescriptor gtk_native_dialog_get_modal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_get_modal$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_get_modal",
        constants$1609.gtk_native_dialog_get_modal$FUNC
    );
    static final FunctionDescriptor gtk_native_dialog_set_title$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_set_title$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_set_title",
        constants$1609.gtk_native_dialog_set_title$FUNC
    );
    static final FunctionDescriptor gtk_native_dialog_get_title$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_get_title$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_get_title",
        constants$1609.gtk_native_dialog_get_title$FUNC
    );
    static final FunctionDescriptor gtk_native_dialog_set_transient_for$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_set_transient_for$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_set_transient_for",
        constants$1609.gtk_native_dialog_set_transient_for$FUNC
    );
}


