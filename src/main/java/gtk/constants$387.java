// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$387 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$387() {}
    static final FunctionDescriptor g_value_reset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_reset$MH = RuntimeHelper.downcallHandle(
        "g_value_reset",
        constants$387.g_value_reset$FUNC
    );
    static final FunctionDescriptor g_value_unset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_unset$MH = RuntimeHelper.downcallHandle(
        "g_value_unset",
        constants$387.g_value_unset$FUNC
    );
    static final FunctionDescriptor g_value_set_instance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_instance$MH = RuntimeHelper.downcallHandle(
        "g_value_set_instance",
        constants$387.g_value_set_instance$FUNC
    );
    static final FunctionDescriptor g_value_init_from_instance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_init_from_instance$MH = RuntimeHelper.downcallHandle(
        "g_value_init_from_instance",
        constants$387.g_value_init_from_instance$FUNC
    );
    static final FunctionDescriptor g_value_fits_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_fits_pointer$MH = RuntimeHelper.downcallHandle(
        "g_value_fits_pointer",
        constants$387.g_value_fits_pointer$FUNC
    );
    static final FunctionDescriptor g_value_peek_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_peek_pointer$MH = RuntimeHelper.downcallHandle(
        "g_value_peek_pointer",
        constants$387.g_value_peek_pointer$FUNC
    );
}


