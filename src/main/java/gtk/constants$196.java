// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$196 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$196() {}
    static final FunctionDescriptor g_string_append_printf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_append_printf$MH = RuntimeHelper.downcallHandleVariadic(
        "g_string_append_printf",
        constants$196.g_string_append_printf$FUNC
    );
    static final FunctionDescriptor g_string_append_uri_escaped$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_string_append_uri_escaped$MH = RuntimeHelper.downcallHandle(
        "g_string_append_uri_escaped",
        constants$196.g_string_append_uri_escaped$FUNC
    );
    static final FunctionDescriptor g_string_down$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_down$MH = RuntimeHelper.downcallHandle(
        "g_string_down",
        constants$196.g_string_down$FUNC
    );
    static final FunctionDescriptor g_string_up$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_up$MH = RuntimeHelper.downcallHandle(
        "g_string_up",
        constants$196.g_string_up$FUNC
    );
    static final FunctionDescriptor GIOFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GIOFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GIOFunc_UP$MH = RuntimeHelper.upcallHandle(GIOFunc.class, "apply", constants$196.GIOFunc_UP$FUNC);
    static final FunctionDescriptor GIOFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GIOFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$196.GIOFunc_DOWN$FUNC
    );
}


