// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1351 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1351() {}
    static final FunctionDescriptor gtk_window_is_active$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_is_active$MH = RuntimeHelper.downcallHandle(
        "gtk_window_is_active",
        constants$1351.gtk_window_is_active$FUNC
    );
    static final FunctionDescriptor gtk_window_set_decorated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_decorated$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_decorated",
        constants$1351.gtk_window_set_decorated$FUNC
    );
    static final FunctionDescriptor gtk_window_get_decorated$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_decorated$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_decorated",
        constants$1351.gtk_window_get_decorated$FUNC
    );
    static final FunctionDescriptor gtk_window_set_deletable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_deletable$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_deletable",
        constants$1351.gtk_window_set_deletable$FUNC
    );
    static final FunctionDescriptor gtk_window_get_deletable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_deletable$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_deletable",
        constants$1351.gtk_window_get_deletable$FUNC
    );
    static final FunctionDescriptor gtk_window_set_icon_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_icon_name$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_icon_name",
        constants$1351.gtk_window_set_icon_name$FUNC
    );
}


