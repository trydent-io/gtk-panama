// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$46 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$46() {}
    static final FunctionDescriptor erand48$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle erand48$MH = RuntimeHelper.downcallHandle(
        "erand48",
        constants$46.erand48$FUNC
    );
    static final FunctionDescriptor lrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle lrand48$MH = RuntimeHelper.downcallHandle(
        "lrand48",
        constants$46.lrand48$FUNC
    );
    static final FunctionDescriptor nrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle nrand48$MH = RuntimeHelper.downcallHandle(
        "nrand48",
        constants$46.nrand48$FUNC
    );
    static final FunctionDescriptor mrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle mrand48$MH = RuntimeHelper.downcallHandle(
        "mrand48",
        constants$46.mrand48$FUNC
    );
    static final FunctionDescriptor jrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle jrand48$MH = RuntimeHelper.downcallHandle(
        "jrand48",
        constants$46.jrand48$FUNC
    );
    static final FunctionDescriptor srand48$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle srand48$MH = RuntimeHelper.downcallHandle(
        "srand48",
        constants$46.srand48$FUNC
    );
}


