// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$212 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$212() {}
    static final FunctionDescriptor g_mapped_file_new_from_fd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_new_from_fd$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_new_from_fd",
        constants$212.g_mapped_file_new_from_fd$FUNC
    );
    static final FunctionDescriptor g_mapped_file_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_get_length$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_get_length",
        constants$212.g_mapped_file_get_length$FUNC
    );
    static final FunctionDescriptor g_mapped_file_get_contents$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_get_contents$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_get_contents",
        constants$212.g_mapped_file_get_contents$FUNC
    );
    static final FunctionDescriptor g_mapped_file_get_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_get_bytes$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_get_bytes",
        constants$212.g_mapped_file_get_bytes$FUNC
    );
    static final FunctionDescriptor g_mapped_file_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_ref$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_ref",
        constants$212.g_mapped_file_ref$FUNC
    );
    static final FunctionDescriptor g_mapped_file_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_unref$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_unref",
        constants$212.g_mapped_file_unref$FUNC
    );
}


