// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1434 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1434() {}
    static final FunctionDescriptor gtk_tree_model_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_get_flags$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_get_flags",
        constants$1434.gtk_tree_model_get_flags$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_get_n_columns$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_get_n_columns$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_get_n_columns",
        constants$1434.gtk_tree_model_get_n_columns$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_get_column_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_model_get_column_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_get_column_type",
        constants$1434.gtk_tree_model_get_column_type$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_get_iter$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_get_iter$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_get_iter",
        constants$1434.gtk_tree_model_get_iter$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_get_iter_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_get_iter_from_string$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_get_iter_from_string",
        constants$1434.gtk_tree_model_get_iter_from_string$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_get_string_from_iter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_get_string_from_iter$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_get_string_from_iter",
        constants$1434.gtk_tree_model_get_string_from_iter$FUNC
    );
}

