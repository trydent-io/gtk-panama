// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$358 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$358() {}
    static final FunctionDescriptor pthread_rwlock_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_destroy",
        constants$358.pthread_rwlock_destroy$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_rdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_rdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_rdlock",
        constants$358.pthread_rwlock_rdlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_tryrdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_tryrdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_tryrdlock",
        constants$358.pthread_rwlock_tryrdlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_timedrdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_timedrdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_timedrdlock",
        constants$358.pthread_rwlock_timedrdlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_wrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_wrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_wrlock",
        constants$358.pthread_rwlock_wrlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_trywrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_trywrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_trywrlock",
        constants$358.pthread_rwlock_trywrlock$FUNC
    );
}


