// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$191 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$191() {}
    static final FunctionDescriptor g_string_new_len$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_new_len$MH = RuntimeHelper.downcallHandle(
        "g_string_new_len",
        constants$191.g_string_new_len$FUNC
    );
    static final FunctionDescriptor g_string_sized_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_sized_new$MH = RuntimeHelper.downcallHandle(
        "g_string_sized_new",
        constants$191.g_string_sized_new$FUNC
    );
    static final FunctionDescriptor g_string_free$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_string_free$MH = RuntimeHelper.downcallHandle(
        "g_string_free",
        constants$191.g_string_free$FUNC
    );
    static final FunctionDescriptor g_string_free_to_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_free_to_bytes$MH = RuntimeHelper.downcallHandle(
        "g_string_free_to_bytes",
        constants$191.g_string_free_to_bytes$FUNC
    );
    static final FunctionDescriptor g_string_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_equal$MH = RuntimeHelper.downcallHandle(
        "g_string_equal",
        constants$191.g_string_equal$FUNC
    );
    static final FunctionDescriptor g_string_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_hash$MH = RuntimeHelper.downcallHandle(
        "g_string_hash",
        constants$191.g_string_hash$FUNC
    );
}


