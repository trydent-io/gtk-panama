// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1142 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1142() {}
    static final FunctionDescriptor gdk_toplevel_layout_get_resizable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_toplevel_layout_get_resizable$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_layout_get_resizable",
        constants$1142.gdk_toplevel_layout_get_resizable$FUNC
    );
    static final FunctionDescriptor gdk_toplevel_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_toplevel_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_get_type",
        constants$1142.gdk_toplevel_get_type$FUNC
    );
    static final FunctionDescriptor gdk_toplevel_present$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_toplevel_present$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_present",
        constants$1142.gdk_toplevel_present$FUNC
    );
    static final FunctionDescriptor gdk_toplevel_minimize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_toplevel_minimize$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_minimize",
        constants$1142.gdk_toplevel_minimize$FUNC
    );
    static final FunctionDescriptor gdk_toplevel_lower$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_toplevel_lower$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_lower",
        constants$1142.gdk_toplevel_lower$FUNC
    );
    static final FunctionDescriptor gdk_toplevel_focus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_toplevel_focus$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_focus",
        constants$1142.gdk_toplevel_focus$FUNC
    );
}

