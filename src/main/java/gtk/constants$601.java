// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$601 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$601() {}
    static final FunctionDescriptor g_dtls_client_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dtls_client_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_type",
        constants$601.g_dtls_client_connection_get_type$FUNC
    );
    static final FunctionDescriptor g_dtls_client_connection_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_new$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_new",
        constants$601.g_dtls_client_connection_new$FUNC
    );
    static final FunctionDescriptor g_dtls_client_connection_get_validation_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_get_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_validation_flags",
        constants$601.g_dtls_client_connection_get_validation_flags$FUNC
    );
    static final FunctionDescriptor g_dtls_client_connection_set_validation_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_set_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_set_validation_flags",
        constants$601.g_dtls_client_connection_set_validation_flags$FUNC
    );
    static final FunctionDescriptor g_dtls_client_connection_get_server_identity$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_get_server_identity$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_server_identity",
        constants$601.g_dtls_client_connection_get_server_identity$FUNC
    );
    static final FunctionDescriptor g_dtls_client_connection_set_server_identity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_set_server_identity$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_set_server_identity",
        constants$601.g_dtls_client_connection_set_server_identity$FUNC
    );
}


