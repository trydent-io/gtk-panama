// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1789 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1789() {}
    static final FunctionDescriptor gtk_recent_manager_has_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_has_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_has_item",
        constants$1789.gtk_recent_manager_has_item$FUNC
    );
    static final FunctionDescriptor gtk_recent_manager_move_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_move_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_move_item",
        constants$1789.gtk_recent_manager_move_item$FUNC
    );
    static final FunctionDescriptor gtk_recent_manager_get_items$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_get_items$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_get_items",
        constants$1789.gtk_recent_manager_get_items$FUNC
    );
    static final FunctionDescriptor gtk_recent_manager_purge_items$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_purge_items$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_purge_items",
        constants$1789.gtk_recent_manager_purge_items$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_recent_info_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_type",
        constants$1789.gtk_recent_info_get_type$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_ref$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_ref",
        constants$1789.gtk_recent_info_ref$FUNC
    );
}


