// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$347 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$347() {}
    static final FunctionDescriptor sched_get_priority_min$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sched_get_priority_min$MH = RuntimeHelper.downcallHandle(
        "sched_get_priority_min",
        constants$347.sched_get_priority_min$FUNC
    );
    static final FunctionDescriptor sched_rr_get_interval$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sched_rr_get_interval$MH = RuntimeHelper.downcallHandle(
        "sched_rr_get_interval",
        constants$347.sched_rr_get_interval$FUNC
    );
    static final FunctionDescriptor pthread_create$__start_routine$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor pthread_create$__start_routine_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_create$__start_routine_UP$MH = RuntimeHelper.upcallHandle(pthread_create$__start_routine.class, "apply", constants$347.pthread_create$__start_routine_UP$FUNC);
    static final FunctionDescriptor pthread_create$__start_routine_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_create$__start_routine_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$347.pthread_create$__start_routine_DOWN$FUNC
    );
    static final FunctionDescriptor pthread_create$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_create$MH = RuntimeHelper.downcallHandle(
        "pthread_create",
        constants$347.pthread_create$FUNC
    );
    static final FunctionDescriptor pthread_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_exit$MH = RuntimeHelper.downcallHandle(
        "pthread_exit",
        constants$347.pthread_exit$FUNC
    );
}


