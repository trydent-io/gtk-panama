// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1936 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1936() {}
    static final FunctionDescriptor gtk_window_group_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_window_group_new$MH = RuntimeHelper.downcallHandle(
        "gtk_window_group_new",
        constants$1936.gtk_window_group_new$FUNC
    );
    static final FunctionDescriptor gtk_window_group_add_window$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_group_add_window$MH = RuntimeHelper.downcallHandle(
        "gtk_window_group_add_window",
        constants$1936.gtk_window_group_add_window$FUNC
    );
    static final FunctionDescriptor gtk_window_group_remove_window$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_group_remove_window$MH = RuntimeHelper.downcallHandle(
        "gtk_window_group_remove_window",
        constants$1936.gtk_window_group_remove_window$FUNC
    );
    static final FunctionDescriptor gtk_window_group_list_windows$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_group_list_windows$MH = RuntimeHelper.downcallHandle(
        "gtk_window_group_list_windows",
        constants$1936.gtk_window_group_list_windows$FUNC
    );
    static final FunctionDescriptor gtk_window_handle_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_window_handle_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_window_handle_get_type",
        constants$1936.gtk_window_handle_get_type$FUNC
    );
    static final FunctionDescriptor gtk_window_handle_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_window_handle_new$MH = RuntimeHelper.downcallHandle(
        "gtk_window_handle_new",
        constants$1936.gtk_window_handle_new$FUNC
    );
}


