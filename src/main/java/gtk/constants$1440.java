// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1440 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1440() {}
    static final FunctionDescriptor gtk_cell_area_foreach_alloc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_foreach_alloc$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_foreach_alloc",
        constants$1440.gtk_cell_area_foreach_alloc$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_area_event$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_event",
        constants$1440.gtk_cell_area_event$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_snapshot$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_area_snapshot$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_snapshot",
        constants$1440.gtk_cell_area_snapshot$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_get_cell_allocation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_get_cell_allocation$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_get_cell_allocation",
        constants$1440.gtk_cell_area_get_cell_allocation$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_get_cell_at_position$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_get_cell_at_position$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_get_cell_at_position",
        constants$1440.gtk_cell_area_get_cell_at_position$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_create_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_create_context$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_create_context",
        constants$1440.gtk_cell_area_create_context$FUNC
    );
}


