// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$682 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$682() {}
    static final FunctionDescriptor g_loadable_icon_load_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_loadable_icon_load_async$MH = RuntimeHelper.downcallHandle(
        "g_loadable_icon_load_async",
        constants$682.g_loadable_icon_load_async$FUNC
    );
    static final FunctionDescriptor g_loadable_icon_load_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_loadable_icon_load_finish$MH = RuntimeHelper.downcallHandle(
        "g_loadable_icon_load_finish",
        constants$682.g_loadable_icon_load_finish$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_memory_input_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_get_type",
        constants$682.g_memory_input_stream_get_type$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_memory_input_stream_new$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_new",
        constants$682.g_memory_input_stream_new$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_new_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_new_from_data$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_new_from_data",
        constants$682.g_memory_input_stream_new_from_data$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_new_from_bytes",
        constants$682.g_memory_input_stream_new_from_bytes$FUNC
    );
}

