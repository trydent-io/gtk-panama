// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1924 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1924() {}
    static final FunctionDescriptor gtk_tree_selection_path_is_selected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_path_is_selected$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_path_is_selected",
        constants$1924.gtk_tree_selection_path_is_selected$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_iter_is_selected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_iter_is_selected$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_iter_is_selected",
        constants$1924.gtk_tree_selection_iter_is_selected$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_select_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_select_all$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_select_all",
        constants$1924.gtk_tree_selection_select_all$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_unselect_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_unselect_all$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_unselect_all",
        constants$1924.gtk_tree_selection_unselect_all$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_select_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_select_range$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_select_range",
        constants$1924.gtk_tree_selection_select_range$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_unselect_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_unselect_range$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_unselect_range",
        constants$1924.gtk_tree_selection_unselect_range$FUNC
    );
}


