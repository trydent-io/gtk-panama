// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$625 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$625() {}
    static final FunctionDescriptor g_file_poll_mountable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_poll_mountable$MH = RuntimeHelper.downcallHandle(
        "g_file_poll_mountable",
        constants$625.g_file_poll_mountable$FUNC
    );
    static final FunctionDescriptor g_file_poll_mountable_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_poll_mountable_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_poll_mountable_finish",
        constants$625.g_file_poll_mountable_finish$FUNC
    );
    static final FunctionDescriptor g_file_query_default_handler$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_query_default_handler$MH = RuntimeHelper.downcallHandle(
        "g_file_query_default_handler",
        constants$625.g_file_query_default_handler$FUNC
    );
    static final FunctionDescriptor g_file_query_default_handler_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_query_default_handler_async$MH = RuntimeHelper.downcallHandle(
        "g_file_query_default_handler_async",
        constants$625.g_file_query_default_handler_async$FUNC
    );
    static final FunctionDescriptor g_file_query_default_handler_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_query_default_handler_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_query_default_handler_finish",
        constants$625.g_file_query_default_handler_finish$FUNC
    );
    static final FunctionDescriptor g_file_load_contents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_load_contents$MH = RuntimeHelper.downcallHandle(
        "g_file_load_contents",
        constants$625.g_file_load_contents$FUNC
    );
}


