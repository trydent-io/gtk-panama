// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$314 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$314() {}
    static final OfAddress g_test_config_vars$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle g_test_config_vars$VH = constants$314.g_test_config_vars$LAYOUT.varHandle();
    static final MemorySegment g_test_config_vars$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_test_config_vars", constants$314.g_test_config_vars$LAYOUT);
    static final FunctionDescriptor g_test_log_type_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_test_log_type_name$MH = RuntimeHelper.downcallHandle(
        "g_test_log_type_name",
        constants$314.g_test_log_type_name$FUNC
    );
    static final FunctionDescriptor g_test_log_buffer_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_test_log_buffer_new$MH = RuntimeHelper.downcallHandle(
        "g_test_log_buffer_new",
        constants$314.g_test_log_buffer_new$FUNC
    );
    static final FunctionDescriptor g_test_log_buffer_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_log_buffer_free$MH = RuntimeHelper.downcallHandle(
        "g_test_log_buffer_free",
        constants$314.g_test_log_buffer_free$FUNC
    );
    static final FunctionDescriptor g_test_log_buffer_push$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_log_buffer_push$MH = RuntimeHelper.downcallHandle(
        "g_test_log_buffer_push",
        constants$314.g_test_log_buffer_push$FUNC
    );
    static final FunctionDescriptor g_test_log_buffer_pop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_log_buffer_pop$MH = RuntimeHelper.downcallHandle(
        "g_test_log_buffer_pop",
        constants$314.g_test_log_buffer_pop$FUNC
    );
}

