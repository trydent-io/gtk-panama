// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1355 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1355() {}
    static final FunctionDescriptor gtk_window_set_default_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_default_size$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_default_size",
        constants$1355.gtk_window_set_default_size$FUNC
    );
    static final FunctionDescriptor gtk_window_get_default_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_default_size$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_default_size",
        constants$1355.gtk_window_get_default_size$FUNC
    );
    static final FunctionDescriptor gtk_window_get_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_group$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_group",
        constants$1355.gtk_window_get_group$FUNC
    );
    static final FunctionDescriptor gtk_window_has_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_has_group$MH = RuntimeHelper.downcallHandle(
        "gtk_window_has_group",
        constants$1355.gtk_window_has_group$FUNC
    );
    static final FunctionDescriptor gtk_window_get_application$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_application$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_application",
        constants$1355.gtk_window_get_application$FUNC
    );
    static final FunctionDescriptor gtk_window_set_application$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_application$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_application",
        constants$1355.gtk_window_set_application$FUNC
    );
}

