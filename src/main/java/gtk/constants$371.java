// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$371 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$371() {}
    static final FunctionDescriptor g_thread_get_initialized$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_thread_get_initialized$MH = RuntimeHelper.downcallHandle(
        "g_thread_get_initialized",
        constants$371.g_thread_get_initialized$FUNC
    );
    static final OfInt g_threads_got_initialized$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle g_threads_got_initialized$VH = constants$371.g_threads_got_initialized$LAYOUT.varHandle();
    static final MemorySegment g_threads_got_initialized$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_threads_got_initialized", constants$371.g_threads_got_initialized$LAYOUT);
    static final FunctionDescriptor g_mutex_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_mutex_new$MH = RuntimeHelper.downcallHandle(
        "g_mutex_new",
        constants$371.g_mutex_new$FUNC
    );
    static final FunctionDescriptor g_mutex_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mutex_free$MH = RuntimeHelper.downcallHandle(
        "g_mutex_free",
        constants$371.g_mutex_free$FUNC
    );
    static final FunctionDescriptor g_cond_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_cond_new$MH = RuntimeHelper.downcallHandle(
        "g_cond_new",
        constants$371.g_cond_new$FUNC
    );
    static final FunctionDescriptor g_cond_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cond_free$MH = RuntimeHelper.downcallHandle(
        "g_cond_free",
        constants$371.g_cond_free$FUNC
    );
}


