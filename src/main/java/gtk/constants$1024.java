// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1024 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1024() {}
    static final FunctionDescriptor getdelim$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getdelim$MH = RuntimeHelper.downcallHandle(
        "getdelim",
        constants$1024.getdelim$FUNC
    );
    static final FunctionDescriptor getline$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getline$MH = RuntimeHelper.downcallHandle(
        "getline",
        constants$1024.getline$FUNC
    );
    static final FunctionDescriptor fputs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fputs$MH = RuntimeHelper.downcallHandle(
        "fputs",
        constants$1024.fputs$FUNC
    );
    static final FunctionDescriptor puts$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle puts$MH = RuntimeHelper.downcallHandle(
        "puts",
        constants$1024.puts$FUNC
    );
    static final FunctionDescriptor ungetc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ungetc$MH = RuntimeHelper.downcallHandle(
        "ungetc",
        constants$1024.ungetc$FUNC
    );
    static final FunctionDescriptor fread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fread$MH = RuntimeHelper.downcallHandle(
        "fread",
        constants$1024.fread$FUNC
    );
}


