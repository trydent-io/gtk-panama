// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$486 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$486() {}
    static final FunctionDescriptor g_application_command_line_get_is_remote$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_get_is_remote$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_get_is_remote",
        constants$486.g_application_command_line_get_is_remote$FUNC
    );
    static final FunctionDescriptor g_application_command_line_print$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_print$MH = RuntimeHelper.downcallHandleVariadic(
        "g_application_command_line_print",
        constants$486.g_application_command_line_print$FUNC
    );
    static final FunctionDescriptor g_application_command_line_printerr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_printerr$MH = RuntimeHelper.downcallHandleVariadic(
        "g_application_command_line_printerr",
        constants$486.g_application_command_line_printerr$FUNC
    );
    static final FunctionDescriptor g_application_command_line_get_exit_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_get_exit_status$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_get_exit_status",
        constants$486.g_application_command_line_get_exit_status$FUNC
    );
    static final FunctionDescriptor g_application_command_line_set_exit_status$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_application_command_line_set_exit_status$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_set_exit_status",
        constants$486.g_application_command_line_set_exit_status$FUNC
    );
    static final FunctionDescriptor g_application_command_line_get_platform_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_get_platform_data$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_get_platform_data",
        constants$486.g_application_command_line_get_platform_data$FUNC
    );
}

