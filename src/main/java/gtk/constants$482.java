// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$482 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$482() {}
    static final FunctionDescriptor g_application_get_is_remote$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_is_remote$MH = RuntimeHelper.downcallHandle(
        "g_application_get_is_remote",
        constants$482.g_application_get_is_remote$FUNC
    );
    static final FunctionDescriptor g_application_register$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_register$MH = RuntimeHelper.downcallHandle(
        "g_application_register",
        constants$482.g_application_register$FUNC
    );
    static final FunctionDescriptor g_application_hold$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_hold$MH = RuntimeHelper.downcallHandle(
        "g_application_hold",
        constants$482.g_application_hold$FUNC
    );
    static final FunctionDescriptor g_application_release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_release$MH = RuntimeHelper.downcallHandle(
        "g_application_release",
        constants$482.g_application_release$FUNC
    );
    static final FunctionDescriptor g_application_activate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_activate$MH = RuntimeHelper.downcallHandle(
        "g_application_activate",
        constants$482.g_application_activate$FUNC
    );
    static final FunctionDescriptor g_application_open$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_open$MH = RuntimeHelper.downcallHandle(
        "g_application_open",
        constants$482.g_application_open$FUNC
    );
}


