// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1277 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1277() {}
    static final FunctionDescriptor gsk_render_node_serialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_render_node_serialize$MH = RuntimeHelper.downcallHandle(
        "gsk_render_node_serialize",
        constants$1277.gsk_render_node_serialize$FUNC
    );
    static final FunctionDescriptor gsk_render_node_write_to_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_render_node_write_to_file$MH = RuntimeHelper.downcallHandle(
        "gsk_render_node_write_to_file",
        constants$1277.gsk_render_node_write_to_file$FUNC
    );
    static final FunctionDescriptor gsk_render_node_deserialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_render_node_deserialize$MH = RuntimeHelper.downcallHandle(
        "gsk_render_node_deserialize",
        constants$1277.gsk_render_node_deserialize$FUNC
    );
    static final FunctionDescriptor gsk_debug_node_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gsk_debug_node_get_type$MH = RuntimeHelper.downcallHandle(
        "gsk_debug_node_get_type",
        constants$1277.gsk_debug_node_get_type$FUNC
    );
    static final FunctionDescriptor gsk_debug_node_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_debug_node_new$MH = RuntimeHelper.downcallHandle(
        "gsk_debug_node_new",
        constants$1277.gsk_debug_node_new$FUNC
    );
    static final FunctionDescriptor gsk_debug_node_get_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_debug_node_get_child$MH = RuntimeHelper.downcallHandle(
        "gsk_debug_node_get_child",
        constants$1277.gsk_debug_node_get_child$FUNC
    );
}

