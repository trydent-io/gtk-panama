// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$349 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$349() {}
    static final FunctionDescriptor pthread_attr_getdetachstate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getdetachstate$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getdetachstate",
        constants$349.pthread_attr_getdetachstate$FUNC
    );
    static final FunctionDescriptor pthread_attr_setdetachstate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_attr_setdetachstate$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setdetachstate",
        constants$349.pthread_attr_setdetachstate$FUNC
    );
    static final FunctionDescriptor pthread_attr_getguardsize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getguardsize$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getguardsize",
        constants$349.pthread_attr_getguardsize$FUNC
    );
    static final FunctionDescriptor pthread_attr_setguardsize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_attr_setguardsize$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setguardsize",
        constants$349.pthread_attr_setguardsize$FUNC
    );
    static final FunctionDescriptor pthread_attr_getschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getschedparam",
        constants$349.pthread_attr_getschedparam$FUNC
    );
    static final FunctionDescriptor pthread_attr_setschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_setschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setschedparam",
        constants$349.pthread_attr_setschedparam$FUNC
    );
}


