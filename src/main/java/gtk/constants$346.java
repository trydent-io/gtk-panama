// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$346 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$346() {}
    static final FunctionDescriptor sched_setparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sched_setparam$MH = RuntimeHelper.downcallHandle(
        "sched_setparam",
        constants$346.sched_setparam$FUNC
    );
    static final FunctionDescriptor sched_getparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sched_getparam$MH = RuntimeHelper.downcallHandle(
        "sched_getparam",
        constants$346.sched_getparam$FUNC
    );
    static final FunctionDescriptor sched_setscheduler$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sched_setscheduler$MH = RuntimeHelper.downcallHandle(
        "sched_setscheduler",
        constants$346.sched_setscheduler$FUNC
    );
    static final FunctionDescriptor sched_getscheduler$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sched_getscheduler$MH = RuntimeHelper.downcallHandle(
        "sched_getscheduler",
        constants$346.sched_getscheduler$FUNC
    );
    static final FunctionDescriptor sched_yield$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle sched_yield$MH = RuntimeHelper.downcallHandle(
        "sched_yield",
        constants$346.sched_yield$FUNC
    );
    static final FunctionDescriptor sched_get_priority_max$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sched_get_priority_max$MH = RuntimeHelper.downcallHandle(
        "sched_get_priority_max",
        constants$346.sched_get_priority_max$FUNC
    );
}


