// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1016 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1016() {}
    static final FunctionDescriptor fclose$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fclose$MH = RuntimeHelper.downcallHandle(
        "fclose",
        constants$1016.fclose$FUNC
    );
    static final FunctionDescriptor tmpfile$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle tmpfile$MH = RuntimeHelper.downcallHandle(
        "tmpfile",
        constants$1016.tmpfile$FUNC
    );
    static final FunctionDescriptor tmpnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tmpnam$MH = RuntimeHelper.downcallHandle(
        "tmpnam",
        constants$1016.tmpnam$FUNC
    );
    static final FunctionDescriptor tmpnam_r$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tmpnam_r$MH = RuntimeHelper.downcallHandle(
        "tmpnam_r",
        constants$1016.tmpnam_r$FUNC
    );
    static final FunctionDescriptor tempnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tempnam$MH = RuntimeHelper.downcallHandle(
        "tempnam",
        constants$1016.tempnam$FUNC
    );
    static final FunctionDescriptor fflush$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fflush$MH = RuntimeHelper.downcallHandle(
        "fflush",
        constants$1016.fflush$FUNC
    );
}


