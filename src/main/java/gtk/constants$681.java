// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$681 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$681() {}
    static final FunctionDescriptor g_list_store_remove_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_remove_all$MH = RuntimeHelper.downcallHandle(
        "g_list_store_remove_all",
        constants$681.g_list_store_remove_all$FUNC
    );
    static final FunctionDescriptor g_list_store_splice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_list_store_splice$MH = RuntimeHelper.downcallHandle(
        "g_list_store_splice",
        constants$681.g_list_store_splice$FUNC
    );
    static final FunctionDescriptor g_list_store_find$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_find$MH = RuntimeHelper.downcallHandle(
        "g_list_store_find",
        constants$681.g_list_store_find$FUNC
    );
    static final FunctionDescriptor g_list_store_find_with_equal_func$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_find_with_equal_func$MH = RuntimeHelper.downcallHandle(
        "g_list_store_find_with_equal_func",
        constants$681.g_list_store_find_with_equal_func$FUNC
    );
    static final FunctionDescriptor g_loadable_icon_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_loadable_icon_get_type$MH = RuntimeHelper.downcallHandle(
        "g_loadable_icon_get_type",
        constants$681.g_loadable_icon_get_type$FUNC
    );
    static final FunctionDescriptor g_loadable_icon_load$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_loadable_icon_load$MH = RuntimeHelper.downcallHandle(
        "g_loadable_icon_load",
        constants$681.g_loadable_icon_load$FUNC
    );
}


