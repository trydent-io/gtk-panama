// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1433 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1433() {}
    static final FunctionDescriptor gtk_tree_row_reference_deleted$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_row_reference_deleted$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_row_reference_deleted",
        constants$1433.gtk_tree_row_reference_deleted$FUNC
    );
    static final FunctionDescriptor gtk_tree_row_reference_reordered$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_row_reference_reordered$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_row_reference_reordered",
        constants$1433.gtk_tree_row_reference_reordered$FUNC
    );
    static final FunctionDescriptor gtk_tree_iter_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_iter_copy$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_iter_copy",
        constants$1433.gtk_tree_iter_copy$FUNC
    );
    static final FunctionDescriptor gtk_tree_iter_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_iter_free$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_iter_free",
        constants$1433.gtk_tree_iter_free$FUNC
    );
    static final FunctionDescriptor gtk_tree_iter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tree_iter_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_iter_get_type",
        constants$1433.gtk_tree_iter_get_type$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tree_model_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_get_type",
        constants$1433.gtk_tree_model_get_type$FUNC
    );
}


