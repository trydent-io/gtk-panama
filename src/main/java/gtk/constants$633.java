// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$633 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$633() {}
    static final FunctionDescriptor g_file_info_get_attribute_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_attribute_data$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_attribute_data",
        constants$633.g_file_info_get_attribute_data$FUNC
    );
    static final FunctionDescriptor g_file_info_get_attribute_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_attribute_type$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_attribute_type",
        constants$633.g_file_info_get_attribute_type$FUNC
    );
    static final FunctionDescriptor g_file_info_remove_attribute$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_remove_attribute$MH = RuntimeHelper.downcallHandle(
        "g_file_info_remove_attribute",
        constants$633.g_file_info_remove_attribute$FUNC
    );
    static final FunctionDescriptor g_file_info_get_attribute_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_attribute_status$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_attribute_status",
        constants$633.g_file_info_get_attribute_status$FUNC
    );
    static final FunctionDescriptor g_file_info_set_attribute_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_info_set_attribute_status$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_attribute_status",
        constants$633.g_file_info_set_attribute_status$FUNC
    );
    static final FunctionDescriptor g_file_info_get_attribute_as_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_attribute_as_string$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_attribute_as_string",
        constants$633.g_file_info_get_attribute_as_string$FUNC
    );
}


