// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$475 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$475() {}
    static final FunctionDescriptor g_app_info_set_as_last_used_for_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_set_as_last_used_for_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_set_as_last_used_for_type",
        constants$475.g_app_info_set_as_last_used_for_type$FUNC
    );
    static final FunctionDescriptor g_app_info_get_all$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_app_info_get_all$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_all",
        constants$475.g_app_info_get_all$FUNC
    );
    static final FunctionDescriptor g_app_info_get_all_for_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_all_for_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_all_for_type",
        constants$475.g_app_info_get_all_for_type$FUNC
    );
    static final FunctionDescriptor g_app_info_get_recommended_for_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_recommended_for_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_recommended_for_type",
        constants$475.g_app_info_get_recommended_for_type$FUNC
    );
    static final FunctionDescriptor g_app_info_get_fallback_for_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_fallback_for_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_fallback_for_type",
        constants$475.g_app_info_get_fallback_for_type$FUNC
    );
    static final FunctionDescriptor g_app_info_reset_type_associations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_reset_type_associations$MH = RuntimeHelper.downcallHandle(
        "g_app_info_reset_type_associations",
        constants$475.g_app_info_reset_type_associations$FUNC
    );
}


