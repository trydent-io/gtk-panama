// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$727 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$727() {}
    static final FunctionDescriptor g_resources_get_info$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resources_get_info$MH = RuntimeHelper.downcallHandle(
        "g_resources_get_info",
        constants$727.g_resources_get_info$FUNC
    );
    static final FunctionDescriptor g_static_resource_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_resource_init$MH = RuntimeHelper.downcallHandle(
        "g_static_resource_init",
        constants$727.g_static_resource_init$FUNC
    );
    static final FunctionDescriptor g_static_resource_fini$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_resource_fini$MH = RuntimeHelper.downcallHandle(
        "g_static_resource_fini",
        constants$727.g_static_resource_fini$FUNC
    );
    static final FunctionDescriptor g_static_resource_get_resource$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_resource_get_resource$MH = RuntimeHelper.downcallHandle(
        "g_static_resource_get_resource",
        constants$727.g_static_resource_get_resource$FUNC
    );
    static final FunctionDescriptor g_seekable_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_seekable_get_type$MH = RuntimeHelper.downcallHandle(
        "g_seekable_get_type",
        constants$727.g_seekable_get_type$FUNC
    );
    static final FunctionDescriptor g_seekable_tell$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_seekable_tell$MH = RuntimeHelper.downcallHandle(
        "g_seekable_tell",
        constants$727.g_seekable_tell$FUNC
    );
}


