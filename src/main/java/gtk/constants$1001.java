// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1001 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1001() {}
    static final FunctionDescriptor pango_layout_get_direction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_get_direction$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_direction",
        constants$1001.pango_layout_get_direction$FUNC
    );
    static final FunctionDescriptor pango_layout_context_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_context_changed$MH = RuntimeHelper.downcallHandle(
        "pango_layout_context_changed",
        constants$1001.pango_layout_context_changed$FUNC
    );
    static final FunctionDescriptor pango_layout_get_serial$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_serial$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_serial",
        constants$1001.pango_layout_get_serial$FUNC
    );
    static final FunctionDescriptor pango_layout_get_log_attrs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_log_attrs$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_log_attrs",
        constants$1001.pango_layout_get_log_attrs$FUNC
    );
    static final FunctionDescriptor pango_layout_get_log_attrs_readonly$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_log_attrs_readonly$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_log_attrs_readonly",
        constants$1001.pango_layout_get_log_attrs_readonly$FUNC
    );
    static final FunctionDescriptor pango_layout_index_to_pos$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_index_to_pos$MH = RuntimeHelper.downcallHandle(
        "pango_layout_index_to_pos",
        constants$1001.pango_layout_index_to_pos$FUNC
    );
}

