// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$102 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$102() {}
    static final FunctionDescriptor g_compute_checksum_for_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_compute_checksum_for_bytes$MH = RuntimeHelper.downcallHandle(
        "g_compute_checksum_for_bytes",
        constants$102.g_compute_checksum_for_bytes$FUNC
    );
    static final FunctionDescriptor g_convert_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_convert_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_convert_error_quark",
        constants$102.g_convert_error_quark$FUNC
    );
    static final FunctionDescriptor g_iconv_open$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_iconv_open$MH = RuntimeHelper.downcallHandle(
        "g_iconv_open",
        constants$102.g_iconv_open$FUNC
    );
    static final FunctionDescriptor g_iconv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_iconv$MH = RuntimeHelper.downcallHandle(
        "g_iconv",
        constants$102.g_iconv$FUNC
    );
    static final FunctionDescriptor g_iconv_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_iconv_close$MH = RuntimeHelper.downcallHandle(
        "g_iconv_close",
        constants$102.g_iconv_close$FUNC
    );
    static final FunctionDescriptor g_convert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_convert$MH = RuntimeHelper.downcallHandle(
        "g_convert",
        constants$102.g_convert$FUNC
    );
}


