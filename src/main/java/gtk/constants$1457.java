// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1457 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1457() {}
    static final FunctionDescriptor gtk_cell_view_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_cell_view_new$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_view_new",
        constants$1457.gtk_cell_view_new$FUNC
    );
    static final FunctionDescriptor gtk_cell_view_new_with_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_view_new_with_context$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_view_new_with_context",
        constants$1457.gtk_cell_view_new_with_context$FUNC
    );
    static final FunctionDescriptor gtk_cell_view_new_with_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_view_new_with_text$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_view_new_with_text",
        constants$1457.gtk_cell_view_new_with_text$FUNC
    );
    static final FunctionDescriptor gtk_cell_view_new_with_markup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_view_new_with_markup$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_view_new_with_markup",
        constants$1457.gtk_cell_view_new_with_markup$FUNC
    );
    static final FunctionDescriptor gtk_cell_view_new_with_texture$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_view_new_with_texture$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_view_new_with_texture",
        constants$1457.gtk_cell_view_new_with_texture$FUNC
    );
    static final FunctionDescriptor gtk_cell_view_set_model$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_view_set_model$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_view_set_model",
        constants$1457.gtk_cell_view_set_model$FUNC
    );
}

