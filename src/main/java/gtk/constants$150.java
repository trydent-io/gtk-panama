// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$150 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$150() {}
    static final FunctionDescriptor GHookFindFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GHookFindFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFindFunc_UP$MH = RuntimeHelper.upcallHandle(GHookFindFunc.class, "apply", constants$150.GHookFindFunc_UP$FUNC);
    static final FunctionDescriptor GHookFindFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFindFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$150.GHookFindFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GHookMarshaller$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GHookMarshaller_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookMarshaller_UP$MH = RuntimeHelper.upcallHandle(GHookMarshaller.class, "apply", constants$150.GHookMarshaller_UP$FUNC);
    static final FunctionDescriptor GHookMarshaller_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookMarshaller_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$150.GHookMarshaller_DOWN$FUNC
    );
    static final FunctionDescriptor GHookCheckMarshaller$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GHookCheckMarshaller_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCheckMarshaller_UP$MH = RuntimeHelper.upcallHandle(GHookCheckMarshaller.class, "apply", constants$150.GHookCheckMarshaller_UP$FUNC);
    static final FunctionDescriptor GHookCheckMarshaller_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCheckMarshaller_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$150.GHookCheckMarshaller_DOWN$FUNC
    );
}


