// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$524 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$524() {}
    static final FunctionDescriptor getlogin_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getlogin_r$MH = RuntimeHelper.downcallHandle(
        "getlogin_r",
        constants$524.getlogin_r$FUNC
    );
    static final FunctionDescriptor setlogin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle setlogin$MH = RuntimeHelper.downcallHandle(
        "setlogin",
        constants$524.setlogin$FUNC
    );
    static final OfAddress optarg$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle optarg$VH = constants$524.optarg$LAYOUT.varHandle();
    static final MemorySegment optarg$SEGMENT = RuntimeHelper.lookupGlobalVariable("optarg", constants$524.optarg$LAYOUT);
    static final OfInt optind$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle optind$VH = constants$524.optind$LAYOUT.varHandle();
    static final MemorySegment optind$SEGMENT = RuntimeHelper.lookupGlobalVariable("optind", constants$524.optind$LAYOUT);
    static final OfInt opterr$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle opterr$VH = constants$524.opterr$LAYOUT.varHandle();
    static final MemorySegment opterr$SEGMENT = RuntimeHelper.lookupGlobalVariable("opterr", constants$524.opterr$LAYOUT);
    static final OfInt optopt$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle optopt$VH = constants$524.optopt$LAYOUT.varHandle();
    static final MemorySegment optopt$SEGMENT = RuntimeHelper.lookupGlobalVariable("optopt", constants$524.optopt$LAYOUT);
}


