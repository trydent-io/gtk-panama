// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1633 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1633() {}
    static final FunctionDescriptor gtk_gesture_is_recognized$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_is_recognized$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_is_recognized",
        constants$1633.gtk_gesture_is_recognized$FUNC
    );
    static final FunctionDescriptor gtk_gesture_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_group$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_group",
        constants$1633.gtk_gesture_group$FUNC
    );
    static final FunctionDescriptor gtk_gesture_ungroup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_ungroup$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_ungroup",
        constants$1633.gtk_gesture_ungroup$FUNC
    );
    static final FunctionDescriptor gtk_gesture_get_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_get_group$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_get_group",
        constants$1633.gtk_gesture_get_group$FUNC
    );
    static final FunctionDescriptor gtk_gesture_is_grouped_with$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_is_grouped_with$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_is_grouped_with",
        constants$1633.gtk_gesture_is_grouped_with$FUNC
    );
    static final FunctionDescriptor gtk_gesture_single_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_gesture_single_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_single_get_type",
        constants$1633.gtk_gesture_single_get_type$FUNC
    );
}


