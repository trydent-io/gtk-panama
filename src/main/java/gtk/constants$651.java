// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$651 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$651() {}
    static final FunctionDescriptor g_file_output_stream_query_info_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_output_stream_query_info_async$MH = RuntimeHelper.downcallHandle(
        "g_file_output_stream_query_info_async",
        constants$651.g_file_output_stream_query_info_async$FUNC
    );
    static final FunctionDescriptor g_file_output_stream_query_info_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_output_stream_query_info_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_output_stream_query_info_finish",
        constants$651.g_file_output_stream_query_info_finish$FUNC
    );
    static final FunctionDescriptor g_file_output_stream_get_etag$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_output_stream_get_etag$MH = RuntimeHelper.downcallHandle(
        "g_file_output_stream_get_etag",
        constants$651.g_file_output_stream_get_etag$FUNC
    );
    static final FunctionDescriptor g_inet_address_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_inet_address_get_type$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_get_type",
        constants$651.g_inet_address_get_type$FUNC
    );
    static final FunctionDescriptor g_inet_address_new_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_inet_address_new_from_string$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_new_from_string",
        constants$651.g_inet_address_new_from_string$FUNC
    );
    static final FunctionDescriptor g_inet_address_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_inet_address_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_inet_address_new_from_bytes",
        constants$651.g_inet_address_new_from_bytes$FUNC
    );
}


