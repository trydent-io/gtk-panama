// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1439 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1439() {}
    static final FunctionDescriptor GtkCellAllocCallback_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkCellAllocCallback_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1439.GtkCellAllocCallback_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_cell_area_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_get_type",
        constants$1439.gtk_cell_area_get_type$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_add$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_add",
        constants$1439.gtk_cell_area_add$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_remove$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_remove",
        constants$1439.gtk_cell_area_remove$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_has_renderer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_has_renderer$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_has_renderer",
        constants$1439.gtk_cell_area_has_renderer$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_foreach$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_foreach",
        constants$1439.gtk_cell_area_foreach$FUNC
    );
}


