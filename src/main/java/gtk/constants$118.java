// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$118 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$118() {}
    static final FunctionDescriptor dirfd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle dirfd$MH = RuntimeHelper.downcallHandle(
        "dirfd",
        constants$118.dirfd$FUNC
    );
    static final FunctionDescriptor scandir$__selector$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor scandir$__selector_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$__selector_UP$MH = RuntimeHelper.upcallHandle(scandir$__selector.class, "apply", constants$118.scandir$__selector_UP$FUNC);
    static final FunctionDescriptor scandir$__selector_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$__selector_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$118.scandir$__selector_DOWN$FUNC
    );
    static final FunctionDescriptor scandir$__cmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor scandir$__cmp_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$__cmp_UP$MH = RuntimeHelper.upcallHandle(scandir$__cmp.class, "apply", constants$118.scandir$__cmp_UP$FUNC);
    static final FunctionDescriptor scandir$__cmp_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$__cmp_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$118.scandir$__cmp_DOWN$FUNC
    );
    static final FunctionDescriptor scandir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$MH = RuntimeHelper.downcallHandle(
        "scandir",
        constants$118.scandir$FUNC
    );
}


