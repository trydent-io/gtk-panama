// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$306 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$306() {}
    static final FunctionDescriptor g_test_maximized_result$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_maximized_result$MH = RuntimeHelper.downcallHandleVariadic(
        "g_test_maximized_result",
        constants$306.g_test_maximized_result$FUNC
    );
    static final FunctionDescriptor g_test_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_init$MH = RuntimeHelper.downcallHandleVariadic(
        "g_test_init",
        constants$306.g_test_init$FUNC
    );
    static final FunctionDescriptor g_test_subprocess$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_test_subprocess$MH = RuntimeHelper.downcallHandle(
        "g_test_subprocess",
        constants$306.g_test_subprocess$FUNC
    );
    static final FunctionDescriptor g_test_run$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_test_run$MH = RuntimeHelper.downcallHandle(
        "g_test_run",
        constants$306.g_test_run$FUNC
    );
    static final FunctionDescriptor g_test_add_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_add_func$MH = RuntimeHelper.downcallHandle(
        "g_test_add_func",
        constants$306.g_test_add_func$FUNC
    );
    static final FunctionDescriptor g_test_add_data_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_add_data_func$MH = RuntimeHelper.downcallHandle(
        "g_test_add_data_func",
        constants$306.g_test_add_data_func$FUNC
    );
}


