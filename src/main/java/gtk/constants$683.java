// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$683 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$683() {}
    static final FunctionDescriptor g_memory_input_stream_add_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_add_data$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_add_data",
        constants$683.g_memory_input_stream_add_data$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_add_bytes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_add_bytes$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_add_bytes",
        constants$683.g_memory_input_stream_add_bytes$FUNC
    );
    static final FunctionDescriptor g_memory_monitor_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_memory_monitor_get_type$MH = RuntimeHelper.downcallHandle(
        "g_memory_monitor_get_type",
        constants$683.g_memory_monitor_get_type$FUNC
    );
    static final FunctionDescriptor g_memory_monitor_dup_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_memory_monitor_dup_default$MH = RuntimeHelper.downcallHandle(
        "g_memory_monitor_dup_default",
        constants$683.g_memory_monitor_dup_default$FUNC
    );
    static final FunctionDescriptor GReallocFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor GReallocFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GReallocFunc_UP$MH = RuntimeHelper.upcallHandle(GReallocFunc.class, "apply", constants$683.GReallocFunc_UP$FUNC);
    static final FunctionDescriptor GReallocFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GReallocFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$683.GReallocFunc_DOWN$FUNC
    );
}


