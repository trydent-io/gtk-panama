// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$259 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$259() {}
    static final FunctionDescriptor g_queue_pop_nth$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_queue_pop_nth$MH = RuntimeHelper.downcallHandle(
        "g_queue_pop_nth",
        constants$259.g_queue_pop_nth$FUNC
    );
    static final FunctionDescriptor g_queue_peek_head$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_peek_head$MH = RuntimeHelper.downcallHandle(
        "g_queue_peek_head",
        constants$259.g_queue_peek_head$FUNC
    );
    static final FunctionDescriptor g_queue_peek_tail$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_peek_tail$MH = RuntimeHelper.downcallHandle(
        "g_queue_peek_tail",
        constants$259.g_queue_peek_tail$FUNC
    );
    static final FunctionDescriptor g_queue_peek_nth$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_queue_peek_nth$MH = RuntimeHelper.downcallHandle(
        "g_queue_peek_nth",
        constants$259.g_queue_peek_nth$FUNC
    );
    static final FunctionDescriptor g_queue_index$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_index$MH = RuntimeHelper.downcallHandle(
        "g_queue_index",
        constants$259.g_queue_index$FUNC
    );
    static final FunctionDescriptor g_queue_remove$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_remove$MH = RuntimeHelper.downcallHandle(
        "g_queue_remove",
        constants$259.g_queue_remove$FUNC
    );
}

