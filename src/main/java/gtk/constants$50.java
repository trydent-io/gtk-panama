// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$50 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$50() {}
    static final FunctionDescriptor posix_memalign$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle posix_memalign$MH = RuntimeHelper.downcallHandle(
        "posix_memalign",
        constants$50.posix_memalign$FUNC
    );
    static final FunctionDescriptor aligned_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle aligned_alloc$MH = RuntimeHelper.downcallHandle(
        "aligned_alloc",
        constants$50.aligned_alloc$FUNC
    );
    static final FunctionDescriptor abort$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle abort$MH = RuntimeHelper.downcallHandle(
        "abort",
        constants$50.abort$FUNC
    );
    static final FunctionDescriptor atexit$__func$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor atexit$__func_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit$__func_UP$MH = RuntimeHelper.upcallHandle(atexit$__func.class, "apply", constants$50.atexit$__func_UP$FUNC);
    static final FunctionDescriptor atexit$__func_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit$__func_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$50.atexit$__func_DOWN$FUNC
    );
    static final FunctionDescriptor atexit$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atexit$MH = RuntimeHelper.downcallHandle(
        "atexit",
        constants$50.atexit$FUNC
    );
}

