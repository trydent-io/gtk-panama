// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$630 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$630() {}
    static final FunctionDescriptor g_file_enumerator_close_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_close_async$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_close_async",
        constants$630.g_file_enumerator_close_async$FUNC
    );
    static final FunctionDescriptor g_file_enumerator_close_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_close_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_close_finish",
        constants$630.g_file_enumerator_close_finish$FUNC
    );
    static final FunctionDescriptor g_file_enumerator_is_closed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_is_closed$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_is_closed",
        constants$630.g_file_enumerator_is_closed$FUNC
    );
    static final FunctionDescriptor g_file_enumerator_has_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_has_pending$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_has_pending",
        constants$630.g_file_enumerator_has_pending$FUNC
    );
    static final FunctionDescriptor g_file_enumerator_set_pending$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_enumerator_set_pending$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_set_pending",
        constants$630.g_file_enumerator_set_pending$FUNC
    );
    static final FunctionDescriptor g_file_enumerator_get_container$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_get_container$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_get_container",
        constants$630.g_file_enumerator_get_container$FUNC
    );
}

