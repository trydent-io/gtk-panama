// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1424 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1424() {}
    static final FunctionDescriptor gtk_cell_renderer_get_aligned_area$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_get_aligned_area$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_get_aligned_area",
        constants$1424.gtk_cell_renderer_get_aligned_area$FUNC
    );
    static final FunctionDescriptor gtk_cell_renderer_snapshot$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_snapshot$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_snapshot",
        constants$1424.gtk_cell_renderer_snapshot$FUNC
    );
    static final FunctionDescriptor gtk_cell_renderer_activate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_activate$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_activate",
        constants$1424.gtk_cell_renderer_activate$FUNC
    );
    static final FunctionDescriptor gtk_cell_renderer_start_editing$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_start_editing$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_start_editing",
        constants$1424.gtk_cell_renderer_start_editing$FUNC
    );
    static final FunctionDescriptor gtk_cell_renderer_set_fixed_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_set_fixed_size$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_set_fixed_size",
        constants$1424.gtk_cell_renderer_set_fixed_size$FUNC
    );
    static final FunctionDescriptor gtk_cell_renderer_get_fixed_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_get_fixed_size$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_get_fixed_size",
        constants$1424.gtk_cell_renderer_get_fixed_size$FUNC
    );
}

