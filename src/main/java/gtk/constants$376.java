// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$376 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$376() {}
    static final FunctionDescriptor g_type_query$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_query$MH = RuntimeHelper.downcallHandle(
        "g_type_query",
        constants$376.g_type_query$FUNC
    );
    static final FunctionDescriptor g_type_get_instance_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_get_instance_count$MH = RuntimeHelper.downcallHandle(
        "g_type_get_instance_count",
        constants$376.g_type_get_instance_count$FUNC
    );
    static final FunctionDescriptor GBaseInitFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GBaseInitFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBaseInitFunc_UP$MH = RuntimeHelper.upcallHandle(GBaseInitFunc.class, "apply", constants$376.GBaseInitFunc_UP$FUNC);
    static final FunctionDescriptor GBaseInitFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBaseInitFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$376.GBaseInitFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GBaseFinalizeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GBaseFinalizeFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBaseFinalizeFunc_UP$MH = RuntimeHelper.upcallHandle(GBaseFinalizeFunc.class, "apply", constants$376.GBaseFinalizeFunc_UP$FUNC);
    static final FunctionDescriptor GBaseFinalizeFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBaseFinalizeFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$376.GBaseFinalizeFunc_DOWN$FUNC
    );
}

