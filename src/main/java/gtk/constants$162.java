// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$162 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$162() {}
    static final FunctionDescriptor g_clear_slist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_clear_slist$MH = RuntimeHelper.downcallHandle(
        "g_clear_slist",
        constants$162.g_clear_slist$FUNC
    );
    static final FunctionDescriptor GSourceFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GSourceFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSourceFunc_UP$MH = RuntimeHelper.upcallHandle(GSourceFunc.class, "apply", constants$162.GSourceFunc_UP$FUNC);
    static final FunctionDescriptor GSourceFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSourceFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$162.GSourceFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GChildWatchFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GChildWatchFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GChildWatchFunc_UP$MH = RuntimeHelper.upcallHandle(GChildWatchFunc.class, "apply", constants$162.GChildWatchFunc_UP$FUNC);
    static final FunctionDescriptor GChildWatchFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GChildWatchFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$162.GChildWatchFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GSourceDisposeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GSourceDisposeFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSourceDisposeFunc_UP$MH = RuntimeHelper.upcallHandle(GSourceDisposeFunc.class, "apply", constants$162.GSourceDisposeFunc_UP$FUNC);
}


