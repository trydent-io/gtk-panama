// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1505 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1505() {}
    static final FunctionDescriptor gtk_tree_model_filter_set_visible_column$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_model_filter_set_visible_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_set_visible_column",
        constants$1505.gtk_tree_model_filter_set_visible_column$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_filter_get_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_filter_get_model$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_get_model",
        constants$1505.gtk_tree_model_filter_get_model$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_filter_convert_child_iter_to_iter$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_filter_convert_child_iter_to_iter$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_convert_child_iter_to_iter",
        constants$1505.gtk_tree_model_filter_convert_child_iter_to_iter$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_filter_convert_iter_to_child_iter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_filter_convert_iter_to_child_iter$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_convert_iter_to_child_iter",
        constants$1505.gtk_tree_model_filter_convert_iter_to_child_iter$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_filter_convert_child_path_to_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_filter_convert_child_path_to_path$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_convert_child_path_to_path",
        constants$1505.gtk_tree_model_filter_convert_child_path_to_path$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_filter_convert_path_to_child_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_filter_convert_path_to_child_path$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_convert_path_to_child_path",
        constants$1505.gtk_tree_model_filter_convert_path_to_child_path$FUNC
    );
}

