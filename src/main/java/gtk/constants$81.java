// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$81 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$81() {}
    static final FunctionDescriptor g_date_time_new_now_local$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_date_time_new_now_local$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_now_local",
        constants$81.g_date_time_new_now_local$FUNC
    );
    static final FunctionDescriptor g_date_time_new_now_utc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_date_time_new_now_utc$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_now_utc",
        constants$81.g_date_time_new_now_utc$FUNC
    );
    static final FunctionDescriptor g_date_time_new_from_unix_local$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_date_time_new_from_unix_local$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_from_unix_local",
        constants$81.g_date_time_new_from_unix_local$FUNC
    );
    static final FunctionDescriptor g_date_time_new_from_unix_utc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_date_time_new_from_unix_utc$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_from_unix_utc",
        constants$81.g_date_time_new_from_unix_utc$FUNC
    );
    static final FunctionDescriptor g_date_time_new_from_timeval_local$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_new_from_timeval_local$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_from_timeval_local",
        constants$81.g_date_time_new_from_timeval_local$FUNC
    );
    static final FunctionDescriptor g_date_time_new_from_timeval_utc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_new_from_timeval_utc$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_from_timeval_utc",
        constants$81.g_date_time_new_from_timeval_utc$FUNC
    );
}


