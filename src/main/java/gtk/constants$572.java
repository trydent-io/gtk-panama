// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$572 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$572() {}
    static final FunctionDescriptor g_dbus_method_invocation_return_value_with_unix_fd_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_value_with_unix_fd_list$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_value_with_unix_fd_list",
        constants$572.g_dbus_method_invocation_return_value_with_unix_fd_list$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_error$MH = RuntimeHelper.downcallHandleVariadic(
        "g_dbus_method_invocation_return_error",
        constants$572.g_dbus_method_invocation_return_error$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_error_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_error_valist$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_error_valist",
        constants$572.g_dbus_method_invocation_return_error_valist$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_error_literal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_error_literal$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_error_literal",
        constants$572.g_dbus_method_invocation_return_error_literal$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_return_gerror$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_return_gerror$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_return_gerror",
        constants$572.g_dbus_method_invocation_return_gerror$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_take_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_take_error$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_take_error",
        constants$572.g_dbus_method_invocation_take_error$FUNC
    );
}

