// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$161 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$161() {}
    static final FunctionDescriptor g_slist_last$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_last$MH = RuntimeHelper.downcallHandle(
        "g_slist_last",
        constants$161.g_slist_last$FUNC
    );
    static final FunctionDescriptor g_slist_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_length$MH = RuntimeHelper.downcallHandle(
        "g_slist_length",
        constants$161.g_slist_length$FUNC
    );
    static final FunctionDescriptor g_slist_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_foreach$MH = RuntimeHelper.downcallHandle(
        "g_slist_foreach",
        constants$161.g_slist_foreach$FUNC
    );
    static final FunctionDescriptor g_slist_sort$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_sort$MH = RuntimeHelper.downcallHandle(
        "g_slist_sort",
        constants$161.g_slist_sort$FUNC
    );
    static final FunctionDescriptor g_slist_sort_with_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_sort_with_data$MH = RuntimeHelper.downcallHandle(
        "g_slist_sort_with_data",
        constants$161.g_slist_sort_with_data$FUNC
    );
    static final FunctionDescriptor g_slist_nth_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_slist_nth_data$MH = RuntimeHelper.downcallHandle(
        "g_slist_nth_data",
        constants$161.g_slist_nth_data$FUNC
    );
}

