// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$72 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$72() {}
    static final FunctionDescriptor siggetmask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle siggetmask$MH = RuntimeHelper.downcallHandle(
        "siggetmask",
        constants$72.siggetmask$FUNC
    );
    static final FunctionDescriptor sig_t$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor sig_t_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sig_t_UP$MH = RuntimeHelper.upcallHandle(sig_t.class, "apply", constants$72.sig_t_UP$FUNC);
    static final FunctionDescriptor sig_t_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sig_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$72.sig_t_DOWN$FUNC
    );
    static final FunctionDescriptor sigemptyset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigemptyset$MH = RuntimeHelper.downcallHandle(
        "sigemptyset",
        constants$72.sigemptyset$FUNC
    );
    static final FunctionDescriptor sigfillset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigfillset$MH = RuntimeHelper.downcallHandle(
        "sigfillset",
        constants$72.sigfillset$FUNC
    );
    static final FunctionDescriptor sigaddset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigaddset$MH = RuntimeHelper.downcallHandle(
        "sigaddset",
        constants$72.sigaddset$FUNC
    );
}


