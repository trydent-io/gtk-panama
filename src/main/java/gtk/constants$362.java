// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$362 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$362() {}
    static final FunctionDescriptor pthread_condattr_getclock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_condattr_getclock$MH = RuntimeHelper.downcallHandle(
        "pthread_condattr_getclock",
        constants$362.pthread_condattr_getclock$FUNC
    );
    static final FunctionDescriptor pthread_condattr_setclock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_condattr_setclock$MH = RuntimeHelper.downcallHandle(
        "pthread_condattr_setclock",
        constants$362.pthread_condattr_setclock$FUNC
    );
    static final FunctionDescriptor pthread_spin_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_spin_init$MH = RuntimeHelper.downcallHandle(
        "pthread_spin_init",
        constants$362.pthread_spin_init$FUNC
    );
    static final FunctionDescriptor pthread_spin_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_spin_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_spin_destroy",
        constants$362.pthread_spin_destroy$FUNC
    );
    static final FunctionDescriptor pthread_spin_lock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_spin_lock$MH = RuntimeHelper.downcallHandle(
        "pthread_spin_lock",
        constants$362.pthread_spin_lock$FUNC
    );
    static final FunctionDescriptor pthread_spin_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_spin_trylock$MH = RuntimeHelper.downcallHandle(
        "pthread_spin_trylock",
        constants$362.pthread_spin_trylock$FUNC
    );
}


