// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$640 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$640() {}
    static final FunctionDescriptor g_file_info_get_symlink_target$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_symlink_target$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_symlink_target",
        constants$640.g_file_info_get_symlink_target$FUNC
    );
    static final FunctionDescriptor g_file_info_get_etag$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_etag$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_etag",
        constants$640.g_file_info_get_etag$FUNC
    );
    static final FunctionDescriptor g_file_info_get_sort_order$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_sort_order$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_sort_order",
        constants$640.g_file_info_get_sort_order$FUNC
    );
    static final FunctionDescriptor g_file_info_set_attribute_mask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_set_attribute_mask$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_attribute_mask",
        constants$640.g_file_info_set_attribute_mask$FUNC
    );
    static final FunctionDescriptor g_file_info_unset_attribute_mask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_unset_attribute_mask$MH = RuntimeHelper.downcallHandle(
        "g_file_info_unset_attribute_mask",
        constants$640.g_file_info_unset_attribute_mask$FUNC
    );
    static final FunctionDescriptor g_file_info_set_file_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_info_set_file_type$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_file_type",
        constants$640.g_file_info_set_file_type$FUNC
    );
}


