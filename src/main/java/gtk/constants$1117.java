// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1117 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1117() {}
    static final FunctionDescriptor gdk_display_is_closed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_is_closed$MH = RuntimeHelper.downcallHandle(
        "gdk_display_is_closed",
        constants$1117.gdk_display_is_closed$FUNC
    );
    static final FunctionDescriptor gdk_display_is_composited$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_is_composited$MH = RuntimeHelper.downcallHandle(
        "gdk_display_is_composited",
        constants$1117.gdk_display_is_composited$FUNC
    );
    static final FunctionDescriptor gdk_display_is_rgba$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_is_rgba$MH = RuntimeHelper.downcallHandle(
        "gdk_display_is_rgba",
        constants$1117.gdk_display_is_rgba$FUNC
    );
    static final FunctionDescriptor gdk_display_supports_input_shapes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_supports_input_shapes$MH = RuntimeHelper.downcallHandle(
        "gdk_display_supports_input_shapes",
        constants$1117.gdk_display_supports_input_shapes$FUNC
    );
    static final FunctionDescriptor gdk_display_prepare_gl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_prepare_gl$MH = RuntimeHelper.downcallHandle(
        "gdk_display_prepare_gl",
        constants$1117.gdk_display_prepare_gl$FUNC
    );
    static final FunctionDescriptor gdk_display_create_gl_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_create_gl_context$MH = RuntimeHelper.downcallHandle(
        "gdk_display_create_gl_context",
        constants$1117.gdk_display_create_gl_context$FUNC
    );
}

