// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$932 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$932() {}
    static final FunctionDescriptor hb_map_get$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_map_get$MH = RuntimeHelper.downcallHandle(
        "hb_map_get",
        constants$932.hb_map_get$FUNC
    );
    static final FunctionDescriptor hb_map_del$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_map_del$MH = RuntimeHelper.downcallHandle(
        "hb_map_del",
        constants$932.hb_map_del$FUNC
    );
    static final FunctionDescriptor hb_map_has$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_map_has$MH = RuntimeHelper.downcallHandle(
        "hb_map_has",
        constants$932.hb_map_has$FUNC
    );
    static final FunctionDescriptor hb_shape$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_shape$MH = RuntimeHelper.downcallHandle(
        "hb_shape",
        constants$932.hb_shape$FUNC
    );
    static final FunctionDescriptor hb_shape_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_shape_full$MH = RuntimeHelper.downcallHandle(
        "hb_shape_full",
        constants$932.hb_shape_full$FUNC
    );
    static final FunctionDescriptor hb_shape_list_shapers$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_shape_list_shapers$MH = RuntimeHelper.downcallHandle(
        "hb_shape_list_shapers",
        constants$932.hb_shape_list_shapers$FUNC
    );
}


