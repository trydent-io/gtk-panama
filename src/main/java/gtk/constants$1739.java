// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1739 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1739() {}
    static final FunctionDescriptor gtk_overlay_layout_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_overlay_layout_new$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_layout_new",
        constants$1739.gtk_overlay_layout_new$FUNC
    );
    static final FunctionDescriptor gtk_overlay_layout_child_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_overlay_layout_child_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_layout_child_get_type",
        constants$1739.gtk_overlay_layout_child_get_type$FUNC
    );
    static final FunctionDescriptor gtk_overlay_layout_child_set_measure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_overlay_layout_child_set_measure$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_layout_child_set_measure",
        constants$1739.gtk_overlay_layout_child_set_measure$FUNC
    );
    static final FunctionDescriptor gtk_overlay_layout_child_get_measure$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_overlay_layout_child_get_measure$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_layout_child_get_measure",
        constants$1739.gtk_overlay_layout_child_get_measure$FUNC
    );
    static final FunctionDescriptor gtk_overlay_layout_child_set_clip_overlay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_overlay_layout_child_set_clip_overlay$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_layout_child_set_clip_overlay",
        constants$1739.gtk_overlay_layout_child_set_clip_overlay$FUNC
    );
    static final FunctionDescriptor gtk_overlay_layout_child_get_clip_overlay$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_overlay_layout_child_get_clip_overlay$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_layout_child_get_clip_overlay",
        constants$1739.gtk_overlay_layout_child_get_clip_overlay$FUNC
    );
}


