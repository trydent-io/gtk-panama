// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1020 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1020() {}
    static final FunctionDescriptor vdprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vdprintf$MH = RuntimeHelper.downcallHandle(
        "vdprintf",
        constants$1020.vdprintf$FUNC
    );
    static final FunctionDescriptor dprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle dprintf$MH = RuntimeHelper.downcallHandleVariadic(
        "dprintf",
        constants$1020.dprintf$FUNC
    );
    static final FunctionDescriptor fscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fscanf$MH = RuntimeHelper.downcallHandleVariadic(
        "fscanf",
        constants$1020.fscanf$FUNC
    );
    static final FunctionDescriptor scanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scanf$MH = RuntimeHelper.downcallHandleVariadic(
        "scanf",
        constants$1020.scanf$FUNC
    );
    static final FunctionDescriptor sscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sscanf$MH = RuntimeHelper.downcallHandleVariadic(
        "sscanf",
        constants$1020.sscanf$FUNC
    );
    static final FunctionDescriptor vfscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vfscanf$MH = RuntimeHelper.downcallHandle(
        "vfscanf",
        constants$1020.vfscanf$FUNC
    );
}

