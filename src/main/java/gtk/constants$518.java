// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$518 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$518() {}
    static final FunctionDescriptor getpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getpgrp$MH = RuntimeHelper.downcallHandle(
        "getpgrp",
        constants$518.getpgrp$FUNC
    );
    static final FunctionDescriptor __getpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __getpgid$MH = RuntimeHelper.downcallHandle(
        "__getpgid",
        constants$518.__getpgid$FUNC
    );
    static final FunctionDescriptor getpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getpgid$MH = RuntimeHelper.downcallHandle(
        "getpgid",
        constants$518.getpgid$FUNC
    );
    static final FunctionDescriptor setpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setpgid$MH = RuntimeHelper.downcallHandle(
        "setpgid",
        constants$518.setpgid$FUNC
    );
    static final FunctionDescriptor setpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle setpgrp$MH = RuntimeHelper.downcallHandle(
        "setpgrp",
        constants$518.setpgrp$FUNC
    );
    static final FunctionDescriptor setsid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle setsid$MH = RuntimeHelper.downcallHandle(
        "setsid",
        constants$518.setsid$FUNC
    );
}


