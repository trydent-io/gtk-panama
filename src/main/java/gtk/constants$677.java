// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$677 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$677() {}
    static final FunctionDescriptor g_io_extension_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_get_type$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_get_type",
        constants$677.g_io_extension_get_type$FUNC
    );
    static final FunctionDescriptor g_io_extension_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_get_name$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_get_name",
        constants$677.g_io_extension_get_name$FUNC
    );
    static final FunctionDescriptor g_io_extension_get_priority$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_get_priority$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_get_priority",
        constants$677.g_io_extension_get_priority$FUNC
    );
    static final FunctionDescriptor g_io_extension_ref_class$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_ref_class$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_ref_class",
        constants$677.g_io_extension_ref_class$FUNC
    );
    static final FunctionDescriptor g_io_module_load$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_module_load$MH = RuntimeHelper.downcallHandle(
        "g_io_module_load",
        constants$677.g_io_module_load$FUNC
    );
    static final FunctionDescriptor g_io_module_unload$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_module_unload$MH = RuntimeHelper.downcallHandle(
        "g_io_module_unload",
        constants$677.g_io_module_unload$FUNC
    );
}

