// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$490 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$490() {}
    static final FunctionDescriptor g_input_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_input_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_get_type",
        constants$490.g_input_stream_get_type$FUNC
    );
    static final FunctionDescriptor g_input_stream_read$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_read$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_read",
        constants$490.g_input_stream_read$FUNC
    );
    static final FunctionDescriptor g_input_stream_read_all$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_read_all$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_read_all",
        constants$490.g_input_stream_read_all$FUNC
    );
    static final FunctionDescriptor g_input_stream_read_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_read_bytes$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_read_bytes",
        constants$490.g_input_stream_read_bytes$FUNC
    );
    static final FunctionDescriptor g_input_stream_skip$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_skip$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_skip",
        constants$490.g_input_stream_skip$FUNC
    );
    static final FunctionDescriptor g_input_stream_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_close$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_close",
        constants$490.g_input_stream_close$FUNC
    );
}


