// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$292 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$292() {}
    static final FunctionDescriptor g_spawn_check_exit_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_spawn_check_exit_status$MH = RuntimeHelper.downcallHandle(
        "g_spawn_check_exit_status",
        constants$292.g_spawn_check_exit_status$FUNC
    );
    static final FunctionDescriptor g_spawn_close_pid$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_spawn_close_pid$MH = RuntimeHelper.downcallHandle(
        "g_spawn_close_pid",
        constants$292.g_spawn_close_pid$FUNC
    );
    static final OfAddress g_ascii_table$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle g_ascii_table$VH = constants$292.g_ascii_table$LAYOUT.varHandle();
    static final MemorySegment g_ascii_table$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_ascii_table", constants$292.g_ascii_table$LAYOUT);
    static final FunctionDescriptor g_ascii_tolower$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_ascii_tolower$MH = RuntimeHelper.downcallHandle(
        "g_ascii_tolower",
        constants$292.g_ascii_tolower$FUNC
    );
    static final FunctionDescriptor g_ascii_toupper$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_ascii_toupper$MH = RuntimeHelper.downcallHandle(
        "g_ascii_toupper",
        constants$292.g_ascii_toupper$FUNC
    );
    static final FunctionDescriptor g_ascii_digit_value$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_ascii_digit_value$MH = RuntimeHelper.downcallHandle(
        "g_ascii_digit_value",
        constants$292.g_ascii_digit_value$FUNC
    );
}


