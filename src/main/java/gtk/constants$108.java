// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$108 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$108() {}
    static final FunctionDescriptor g_dataset_id_set_data_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dataset_id_set_data_full$MH = RuntimeHelper.downcallHandle(
        "g_dataset_id_set_data_full",
        constants$108.g_dataset_id_set_data_full$FUNC
    );
    static final FunctionDescriptor g_dataset_id_remove_no_notify$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dataset_id_remove_no_notify$MH = RuntimeHelper.downcallHandle(
        "g_dataset_id_remove_no_notify",
        constants$108.g_dataset_id_remove_no_notify$FUNC
    );
    static final FunctionDescriptor g_dataset_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dataset_foreach$MH = RuntimeHelper.downcallHandle(
        "g_dataset_foreach",
        constants$108.g_dataset_foreach$FUNC
    );
    static final FunctionDescriptor g_date_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_date_new$MH = RuntimeHelper.downcallHandle(
        "g_date_new",
        constants$108.g_date_new$FUNC
    );
    static final FunctionDescriptor g_date_new_dmy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_date_new_dmy$MH = RuntimeHelper.downcallHandle(
        "g_date_new_dmy",
        constants$108.g_date_new_dmy$FUNC
    );
    static final FunctionDescriptor g_date_new_julian$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_new_julian$MH = RuntimeHelper.downcallHandle(
        "g_date_new_julian",
        constants$108.g_date_new_julian$FUNC
    );
}

