// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$123 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$123() {}
    static final FunctionDescriptor g_mkstemp_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mkstemp_full$MH = RuntimeHelper.downcallHandle(
        "g_mkstemp_full",
        constants$123.g_mkstemp_full$FUNC
    );
    static final FunctionDescriptor g_file_open_tmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_open_tmp$MH = RuntimeHelper.downcallHandle(
        "g_file_open_tmp",
        constants$123.g_file_open_tmp$FUNC
    );
    static final FunctionDescriptor g_dir_make_tmp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dir_make_tmp$MH = RuntimeHelper.downcallHandle(
        "g_dir_make_tmp",
        constants$123.g_dir_make_tmp$FUNC
    );
    static final FunctionDescriptor g_build_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_path$MH = RuntimeHelper.downcallHandleVariadic(
        "g_build_path",
        constants$123.g_build_path$FUNC
    );
    static final FunctionDescriptor g_build_pathv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_pathv$MH = RuntimeHelper.downcallHandle(
        "g_build_pathv",
        constants$123.g_build_pathv$FUNC
    );
    static final FunctionDescriptor g_build_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_filename$MH = RuntimeHelper.downcallHandleVariadic(
        "g_build_filename",
        constants$123.g_build_filename$FUNC
    );
}


