// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$164 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$164() {}
    static final FunctionDescriptor g_main_context_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_unref$MH = RuntimeHelper.downcallHandle(
        "g_main_context_unref",
        constants$164.g_main_context_unref$FUNC
    );
    static final FunctionDescriptor g_main_context_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_main_context_default$MH = RuntimeHelper.downcallHandle(
        "g_main_context_default",
        constants$164.g_main_context_default$FUNC
    );
    static final FunctionDescriptor g_main_context_iteration$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_main_context_iteration$MH = RuntimeHelper.downcallHandle(
        "g_main_context_iteration",
        constants$164.g_main_context_iteration$FUNC
    );
    static final FunctionDescriptor g_main_context_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_pending$MH = RuntimeHelper.downcallHandle(
        "g_main_context_pending",
        constants$164.g_main_context_pending$FUNC
    );
    static final FunctionDescriptor g_main_context_find_source_by_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_main_context_find_source_by_id$MH = RuntimeHelper.downcallHandle(
        "g_main_context_find_source_by_id",
        constants$164.g_main_context_find_source_by_id$FUNC
    );
    static final FunctionDescriptor g_main_context_find_source_by_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_find_source_by_user_data$MH = RuntimeHelper.downcallHandle(
        "g_main_context_find_source_by_user_data",
        constants$164.g_main_context_find_source_by_user_data$FUNC
    );
}


