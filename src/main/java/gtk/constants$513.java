// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$513 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$513() {}
    static final FunctionDescriptor sleep$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sleep$MH = RuntimeHelper.downcallHandle(
        "sleep",
        constants$513.sleep$FUNC
    );
    static final FunctionDescriptor ualarm$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle ualarm$MH = RuntimeHelper.downcallHandle(
        "ualarm",
        constants$513.ualarm$FUNC
    );
    static final FunctionDescriptor usleep$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle usleep$MH = RuntimeHelper.downcallHandle(
        "usleep",
        constants$513.usleep$FUNC
    );
    static final FunctionDescriptor pause$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle pause$MH = RuntimeHelper.downcallHandle(
        "pause",
        constants$513.pause$FUNC
    );
    static final FunctionDescriptor chown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle chown$MH = RuntimeHelper.downcallHandle(
        "chown",
        constants$513.chown$FUNC
    );
    static final FunctionDescriptor fchown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fchown$MH = RuntimeHelper.downcallHandle(
        "fchown",
        constants$513.fchown$FUNC
    );
}


