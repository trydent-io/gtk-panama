// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$680 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$680() {}
    static final FunctionDescriptor g_list_store_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_list_store_new$MH = RuntimeHelper.downcallHandle(
        "g_list_store_new",
        constants$680.g_list_store_new$FUNC
    );
    static final FunctionDescriptor g_list_store_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_insert$MH = RuntimeHelper.downcallHandle(
        "g_list_store_insert",
        constants$680.g_list_store_insert$FUNC
    );
    static final FunctionDescriptor g_list_store_insert_sorted$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_insert_sorted$MH = RuntimeHelper.downcallHandle(
        "g_list_store_insert_sorted",
        constants$680.g_list_store_insert_sorted$FUNC
    );
    static final FunctionDescriptor g_list_store_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_sort$MH = RuntimeHelper.downcallHandle(
        "g_list_store_sort",
        constants$680.g_list_store_sort$FUNC
    );
    static final FunctionDescriptor g_list_store_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_append$MH = RuntimeHelper.downcallHandle(
        "g_list_store_append",
        constants$680.g_list_store_append$FUNC
    );
    static final FunctionDescriptor g_list_store_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_list_store_remove$MH = RuntimeHelper.downcallHandle(
        "g_list_store_remove",
        constants$680.g_list_store_remove$FUNC
    );
}

