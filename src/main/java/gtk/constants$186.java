// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$186 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$186() {}
    static final FunctionDescriptor g_utf8_offset_to_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_offset_to_pointer$MH = RuntimeHelper.downcallHandle(
        "g_utf8_offset_to_pointer",
        constants$186.g_utf8_offset_to_pointer$FUNC
    );
    static final FunctionDescriptor g_utf8_pointer_to_offset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_pointer_to_offset$MH = RuntimeHelper.downcallHandle(
        "g_utf8_pointer_to_offset",
        constants$186.g_utf8_pointer_to_offset$FUNC
    );
    static final FunctionDescriptor g_utf8_prev_char$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_prev_char$MH = RuntimeHelper.downcallHandle(
        "g_utf8_prev_char",
        constants$186.g_utf8_prev_char$FUNC
    );
    static final FunctionDescriptor g_utf8_find_next_char$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_find_next_char$MH = RuntimeHelper.downcallHandle(
        "g_utf8_find_next_char",
        constants$186.g_utf8_find_next_char$FUNC
    );
    static final FunctionDescriptor g_utf8_find_prev_char$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_find_prev_char$MH = RuntimeHelper.downcallHandle(
        "g_utf8_find_prev_char",
        constants$186.g_utf8_find_prev_char$FUNC
    );
    static final FunctionDescriptor g_utf8_strlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_strlen$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strlen",
        constants$186.g_utf8_strlen$FUNC
    );
}


