// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$15 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$15() {}
    static final FunctionDescriptor bcopy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle bcopy$MH = RuntimeHelper.downcallHandle(
        "bcopy",
        constants$15.bcopy$FUNC
    );
    static final FunctionDescriptor bzero$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle bzero$MH = RuntimeHelper.downcallHandle(
        "bzero",
        constants$15.bzero$FUNC
    );
    static final FunctionDescriptor index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle index$MH = RuntimeHelper.downcallHandle(
        "index",
        constants$15.index$FUNC
    );
    static final FunctionDescriptor rindex$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle rindex$MH = RuntimeHelper.downcallHandle(
        "rindex",
        constants$15.rindex$FUNC
    );
    static final FunctionDescriptor ffs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle ffs$MH = RuntimeHelper.downcallHandle(
        "ffs",
        constants$15.ffs$FUNC
    );
    static final FunctionDescriptor ffsl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ffsl$MH = RuntimeHelper.downcallHandle(
        "ffsl",
        constants$15.ffsl$FUNC
    );
}


