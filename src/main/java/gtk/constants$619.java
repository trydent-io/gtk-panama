// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$619 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$619() {}
    static final FunctionDescriptor g_file_query_settable_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_query_settable_attributes$MH = RuntimeHelper.downcallHandle(
        "g_file_query_settable_attributes",
        constants$619.g_file_query_settable_attributes$FUNC
    );
    static final FunctionDescriptor g_file_query_writable_namespaces$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_query_writable_namespaces$MH = RuntimeHelper.downcallHandle(
        "g_file_query_writable_namespaces",
        constants$619.g_file_query_writable_namespaces$FUNC
    );
    static final FunctionDescriptor g_file_set_attribute$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attribute$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attribute",
        constants$619.g_file_set_attribute$FUNC
    );
    static final FunctionDescriptor g_file_set_attributes_from_info$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attributes_from_info$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attributes_from_info",
        constants$619.g_file_set_attributes_from_info$FUNC
    );
    static final FunctionDescriptor g_file_set_attributes_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attributes_async$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attributes_async",
        constants$619.g_file_set_attributes_async$FUNC
    );
    static final FunctionDescriptor g_file_set_attributes_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attributes_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attributes_finish",
        constants$619.g_file_set_attributes_finish$FUNC
    );
}


