// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$648 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$648() {}
    static final FunctionDescriptor g_io_stream_clear_pending$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_stream_clear_pending$MH = RuntimeHelper.downcallHandle(
        "g_io_stream_clear_pending",
        constants$648.g_io_stream_clear_pending$FUNC
    );
    static final FunctionDescriptor g_file_io_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_file_io_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_file_io_stream_get_type",
        constants$648.g_file_io_stream_get_type$FUNC
    );
    static final FunctionDescriptor g_file_io_stream_query_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_io_stream_query_info$MH = RuntimeHelper.downcallHandle(
        "g_file_io_stream_query_info",
        constants$648.g_file_io_stream_query_info$FUNC
    );
    static final FunctionDescriptor g_file_io_stream_query_info_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_io_stream_query_info_async$MH = RuntimeHelper.downcallHandle(
        "g_file_io_stream_query_info_async",
        constants$648.g_file_io_stream_query_info_async$FUNC
    );
    static final FunctionDescriptor g_file_io_stream_query_info_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_io_stream_query_info_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_io_stream_query_info_finish",
        constants$648.g_file_io_stream_query_info_finish$FUNC
    );
    static final FunctionDescriptor g_file_io_stream_get_etag$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_io_stream_get_etag$MH = RuntimeHelper.downcallHandle(
        "g_file_io_stream_get_etag",
        constants$648.g_file_io_stream_get_etag$FUNC
    );
}


