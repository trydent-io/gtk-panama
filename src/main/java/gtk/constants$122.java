// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$122 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$122() {}
    static final FunctionDescriptor g_file_set_contents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_contents$MH = RuntimeHelper.downcallHandle(
        "g_file_set_contents",
        constants$122.g_file_set_contents$FUNC
    );
    static final FunctionDescriptor g_file_set_contents_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_contents_full$MH = RuntimeHelper.downcallHandle(
        "g_file_set_contents_full",
        constants$122.g_file_set_contents_full$FUNC
    );
    static final FunctionDescriptor g_file_read_link$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_read_link$MH = RuntimeHelper.downcallHandle(
        "g_file_read_link",
        constants$122.g_file_read_link$FUNC
    );
    static final FunctionDescriptor g_mkdtemp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mkdtemp$MH = RuntimeHelper.downcallHandle(
        "g_mkdtemp",
        constants$122.g_mkdtemp$FUNC
    );
    static final FunctionDescriptor g_mkdtemp_full$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mkdtemp_full$MH = RuntimeHelper.downcallHandle(
        "g_mkdtemp_full",
        constants$122.g_mkdtemp_full$FUNC
    );
    static final FunctionDescriptor g_mkstemp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mkstemp$MH = RuntimeHelper.downcallHandle(
        "g_mkstemp",
        constants$122.g_mkstemp$FUNC
    );
}


