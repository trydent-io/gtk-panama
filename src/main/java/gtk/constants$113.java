// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$113 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$113() {}
    static final FunctionDescriptor g_date_set_day$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_date_set_day$MH = RuntimeHelper.downcallHandle(
        "g_date_set_day",
        constants$113.g_date_set_day$FUNC
    );
    static final FunctionDescriptor g_date_set_year$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_date_set_year$MH = RuntimeHelper.downcallHandle(
        "g_date_set_year",
        constants$113.g_date_set_year$FUNC
    );
    static final FunctionDescriptor g_date_set_dmy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_date_set_dmy$MH = RuntimeHelper.downcallHandle(
        "g_date_set_dmy",
        constants$113.g_date_set_dmy$FUNC
    );
    static final FunctionDescriptor g_date_set_julian$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_set_julian$MH = RuntimeHelper.downcallHandle(
        "g_date_set_julian",
        constants$113.g_date_set_julian$FUNC
    );
    static final FunctionDescriptor g_date_is_first_of_month$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_is_first_of_month$MH = RuntimeHelper.downcallHandle(
        "g_date_is_first_of_month",
        constants$113.g_date_is_first_of_month$FUNC
    );
    static final FunctionDescriptor g_date_is_last_of_month$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_is_last_of_month$MH = RuntimeHelper.downcallHandle(
        "g_date_is_last_of_month",
        constants$113.g_date_is_last_of_month$FUNC
    );
}


