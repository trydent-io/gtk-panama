// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$71 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$71() {}
    static final FunctionDescriptor ssignal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ssignal$MH = RuntimeHelper.downcallHandle(
        "ssignal",
        constants$71.ssignal$FUNC
    );
    static final FunctionDescriptor gsignal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gsignal$MH = RuntimeHelper.downcallHandle(
        "gsignal",
        constants$71.gsignal$FUNC
    );
    static final FunctionDescriptor psignal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle psignal$MH = RuntimeHelper.downcallHandle(
        "psignal",
        constants$71.psignal$FUNC
    );
    static final FunctionDescriptor psiginfo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle psiginfo$MH = RuntimeHelper.downcallHandle(
        "psiginfo",
        constants$71.psiginfo$FUNC
    );
    static final FunctionDescriptor sigblock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigblock$MH = RuntimeHelper.downcallHandle(
        "sigblock",
        constants$71.sigblock$FUNC
    );
    static final FunctionDescriptor sigsetmask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigsetmask$MH = RuntimeHelper.downcallHandle(
        "sigsetmask",
        constants$71.sigsetmask$FUNC
    );
}


