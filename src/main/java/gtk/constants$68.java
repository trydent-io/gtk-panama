// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$68 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$68() {}
    static final FunctionDescriptor g_async_queue_timeout_pop_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_async_queue_timeout_pop_unlocked$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_timeout_pop_unlocked",
        constants$68.g_async_queue_timeout_pop_unlocked$FUNC
    );
    static final FunctionDescriptor g_async_queue_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_length$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_length",
        constants$68.g_async_queue_length$FUNC
    );
    static final FunctionDescriptor g_async_queue_length_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_length_unlocked$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_length_unlocked",
        constants$68.g_async_queue_length_unlocked$FUNC
    );
    static final FunctionDescriptor g_async_queue_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_sort$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_sort",
        constants$68.g_async_queue_sort$FUNC
    );
    static final FunctionDescriptor g_async_queue_sort_unlocked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_sort_unlocked$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_sort_unlocked",
        constants$68.g_async_queue_sort_unlocked$FUNC
    );
    static final FunctionDescriptor g_async_queue_remove$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_remove$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_remove",
        constants$68.g_async_queue_remove$FUNC
    );
}


