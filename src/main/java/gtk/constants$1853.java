// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1853 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1853() {}
    static final FunctionDescriptor gtk_string_list_splice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_string_list_splice$MH = RuntimeHelper.downcallHandle(
        "gtk_string_list_splice",
        constants$1853.gtk_string_list_splice$FUNC
    );
    static final FunctionDescriptor gtk_string_list_get_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_string_list_get_string$MH = RuntimeHelper.downcallHandle(
        "gtk_string_list_get_string",
        constants$1853.gtk_string_list_get_string$FUNC
    );
    static final FunctionDescriptor gtk_string_sorter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_string_sorter_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_string_sorter_get_type",
        constants$1853.gtk_string_sorter_get_type$FUNC
    );
    static final FunctionDescriptor gtk_string_sorter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_string_sorter_new$MH = RuntimeHelper.downcallHandle(
        "gtk_string_sorter_new",
        constants$1853.gtk_string_sorter_new$FUNC
    );
    static final FunctionDescriptor gtk_string_sorter_get_expression$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_string_sorter_get_expression$MH = RuntimeHelper.downcallHandle(
        "gtk_string_sorter_get_expression",
        constants$1853.gtk_string_sorter_get_expression$FUNC
    );
    static final FunctionDescriptor gtk_string_sorter_set_expression$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_string_sorter_set_expression$MH = RuntimeHelper.downcallHandle(
        "gtk_string_sorter_set_expression",
        constants$1853.gtk_string_sorter_set_expression$FUNC
    );
}

