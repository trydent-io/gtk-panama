// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$151 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$151() {}
    static final FunctionDescriptor GHookFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GHookFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFunc_UP$MH = RuntimeHelper.upcallHandle(GHookFunc.class, "apply", constants$151.GHookFunc_UP$FUNC);
    static final FunctionDescriptor GHookFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$151.GHookFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GHookCheckFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GHookCheckFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCheckFunc_UP$MH = RuntimeHelper.upcallHandle(GHookCheckFunc.class, "apply", constants$151.GHookCheckFunc_UP$FUNC);
    static final FunctionDescriptor GHookCheckFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCheckFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$151.GHookCheckFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GHookFinalizeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GHookFinalizeFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFinalizeFunc_UP$MH = RuntimeHelper.upcallHandle(GHookFinalizeFunc.class, "apply", constants$151.GHookFinalizeFunc_UP$FUNC);
    static final FunctionDescriptor GHookFinalizeFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFinalizeFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$151.GHookFinalizeFunc_DOWN$FUNC
    );
}


