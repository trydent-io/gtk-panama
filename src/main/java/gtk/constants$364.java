// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$364 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$364() {}
    static final FunctionDescriptor pthread_barrierattr_getpshared$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_barrierattr_getpshared$MH = RuntimeHelper.downcallHandle(
        "pthread_barrierattr_getpshared",
        constants$364.pthread_barrierattr_getpshared$FUNC
    );
    static final FunctionDescriptor pthread_barrierattr_setpshared$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_barrierattr_setpshared$MH = RuntimeHelper.downcallHandle(
        "pthread_barrierattr_setpshared",
        constants$364.pthread_barrierattr_setpshared$FUNC
    );
    static final FunctionDescriptor pthread_key_create$__destr_function$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor pthread_key_create$__destr_function_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_key_create$__destr_function_UP$MH = RuntimeHelper.upcallHandle(pthread_key_create$__destr_function.class, "apply", constants$364.pthread_key_create$__destr_function_UP$FUNC);
    static final FunctionDescriptor pthread_key_create$__destr_function_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_key_create$__destr_function_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$364.pthread_key_create$__destr_function_DOWN$FUNC
    );
    static final FunctionDescriptor pthread_key_create$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_key_create$MH = RuntimeHelper.downcallHandle(
        "pthread_key_create",
        constants$364.pthread_key_create$FUNC
    );
    static final FunctionDescriptor pthread_key_delete$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_key_delete$MH = RuntimeHelper.downcallHandle(
        "pthread_key_delete",
        constants$364.pthread_key_delete$FUNC
    );
}


