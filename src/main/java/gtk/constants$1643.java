// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1643 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1643() {}
    static final FunctionDescriptor gtk_gl_area_get_error$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gl_area_get_error$MH = RuntimeHelper.downcallHandle(
        "gtk_gl_area_get_error",
        constants$1643.gtk_gl_area_get_error$FUNC
    );
    static final FunctionDescriptor gtk_grid_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_grid_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_get_type",
        constants$1643.gtk_grid_get_type$FUNC
    );
    static final FunctionDescriptor gtk_grid_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_grid_new$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_new",
        constants$1643.gtk_grid_new$FUNC
    );
    static final FunctionDescriptor gtk_grid_attach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_attach$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_attach",
        constants$1643.gtk_grid_attach$FUNC
    );
    static final FunctionDescriptor gtk_grid_attach_next_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_attach_next_to$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_attach_next_to",
        constants$1643.gtk_grid_attach_next_to$FUNC
    );
    static final FunctionDescriptor gtk_grid_get_child_at$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_get_child_at$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_get_child_at",
        constants$1643.gtk_grid_get_child_at$FUNC
    );
}


