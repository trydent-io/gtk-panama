// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$429 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$429() {}
    static final FunctionDescriptor g_object_weak_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_weak_unref$MH = RuntimeHelper.downcallHandle(
        "g_object_weak_unref",
        constants$429.g_object_weak_unref$FUNC
    );
    static final FunctionDescriptor g_object_add_weak_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_add_weak_pointer$MH = RuntimeHelper.downcallHandle(
        "g_object_add_weak_pointer",
        constants$429.g_object_add_weak_pointer$FUNC
    );
    static final FunctionDescriptor g_object_remove_weak_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_remove_weak_pointer$MH = RuntimeHelper.downcallHandle(
        "g_object_remove_weak_pointer",
        constants$429.g_object_remove_weak_pointer$FUNC
    );
    static final FunctionDescriptor GToggleNotify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor GToggleNotify_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GToggleNotify_UP$MH = RuntimeHelper.upcallHandle(GToggleNotify.class, "apply", constants$429.GToggleNotify_UP$FUNC);
    static final FunctionDescriptor GToggleNotify_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GToggleNotify_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$429.GToggleNotify_DOWN$FUNC
    );
    static final FunctionDescriptor g_object_add_toggle_ref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_add_toggle_ref$MH = RuntimeHelper.downcallHandle(
        "g_object_add_toggle_ref",
        constants$429.g_object_add_toggle_ref$FUNC
    );
}


