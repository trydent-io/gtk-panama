// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1004 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1004() {}
    static final FunctionDescriptor pango_layout_get_line_readonly$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_get_line_readonly$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_line_readonly",
        constants$1004.pango_layout_get_line_readonly$FUNC
    );
    static final FunctionDescriptor pango_layout_get_lines$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_lines$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_lines",
        constants$1004.pango_layout_get_lines$FUNC
    );
    static final FunctionDescriptor pango_layout_get_lines_readonly$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_lines_readonly$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_lines_readonly",
        constants$1004.pango_layout_get_lines_readonly$FUNC
    );
    static final FunctionDescriptor pango_layout_serialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_serialize$MH = RuntimeHelper.downcallHandle(
        "pango_layout_serialize",
        constants$1004.pango_layout_serialize$FUNC
    );
    static final FunctionDescriptor pango_layout_write_to_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_write_to_file$MH = RuntimeHelper.downcallHandle(
        "pango_layout_write_to_file",
        constants$1004.pango_layout_write_to_file$FUNC
    );
    static final FunctionDescriptor pango_layout_deserialize_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle pango_layout_deserialize_error_quark$MH = RuntimeHelper.downcallHandle(
        "pango_layout_deserialize_error_quark",
        constants$1004.pango_layout_deserialize_error_quark$FUNC
    );
}


