// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1033 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1033() {}
    static final FunctionDescriptor gdk_app_launch_context_set_desktop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_app_launch_context_set_desktop$MH = RuntimeHelper.downcallHandle(
        "gdk_app_launch_context_set_desktop",
        constants$1033.gdk_app_launch_context_set_desktop$FUNC
    );
    static final FunctionDescriptor gdk_app_launch_context_set_timestamp$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_app_launch_context_set_timestamp$MH = RuntimeHelper.downcallHandle(
        "gdk_app_launch_context_set_timestamp",
        constants$1033.gdk_app_launch_context_set_timestamp$FUNC
    );
    static final FunctionDescriptor gdk_app_launch_context_set_icon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_app_launch_context_set_icon$MH = RuntimeHelper.downcallHandle(
        "gdk_app_launch_context_set_icon",
        constants$1033.gdk_app_launch_context_set_icon$FUNC
    );
    static final FunctionDescriptor gdk_app_launch_context_set_icon_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_app_launch_context_set_icon_name$MH = RuntimeHelper.downcallHandle(
        "gdk_app_launch_context_set_icon_name",
        constants$1033.gdk_app_launch_context_set_icon_name$FUNC
    );
    static final FunctionDescriptor gdk_rgba_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_rgba_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_rgba_get_type",
        constants$1033.gdk_rgba_get_type$FUNC
    );
    static final FunctionDescriptor gdk_rgba_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_rgba_copy$MH = RuntimeHelper.downcallHandle(
        "gdk_rgba_copy",
        constants$1033.gdk_rgba_copy$FUNC
    );
}


