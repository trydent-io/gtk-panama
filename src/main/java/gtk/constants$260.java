// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$260 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$260() {}
    static final FunctionDescriptor g_queue_remove_all$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_remove_all$MH = RuntimeHelper.downcallHandle(
        "g_queue_remove_all",
        constants$260.g_queue_remove_all$FUNC
    );
    static final FunctionDescriptor g_queue_insert_before$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_insert_before$MH = RuntimeHelper.downcallHandle(
        "g_queue_insert_before",
        constants$260.g_queue_insert_before$FUNC
    );
    static final FunctionDescriptor g_queue_insert_before_link$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_insert_before_link$MH = RuntimeHelper.downcallHandle(
        "g_queue_insert_before_link",
        constants$260.g_queue_insert_before_link$FUNC
    );
    static final FunctionDescriptor g_queue_insert_after$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_insert_after$MH = RuntimeHelper.downcallHandle(
        "g_queue_insert_after",
        constants$260.g_queue_insert_after$FUNC
    );
    static final FunctionDescriptor g_queue_insert_after_link$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_insert_after_link$MH = RuntimeHelper.downcallHandle(
        "g_queue_insert_after_link",
        constants$260.g_queue_insert_after_link$FUNC
    );
    static final FunctionDescriptor g_queue_insert_sorted$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_insert_sorted$MH = RuntimeHelper.downcallHandle(
        "g_queue_insert_sorted",
        constants$260.g_queue_insert_sorted$FUNC
    );
}


