// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1927 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1927() {}
    static final FunctionDescriptor gtk_tree_store_insert_with_values$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_store_insert_with_values$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_tree_store_insert_with_values",
        constants$1927.gtk_tree_store_insert_with_values$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_insert_with_valuesv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_store_insert_with_valuesv$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_insert_with_valuesv",
        constants$1927.gtk_tree_store_insert_with_valuesv$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_prepend$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_prepend$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_prepend",
        constants$1927.gtk_tree_store_prepend$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_append$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_append",
        constants$1927.gtk_tree_store_append$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_is_ancestor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_is_ancestor$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_is_ancestor",
        constants$1927.gtk_tree_store_is_ancestor$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_iter_depth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_iter_depth$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_iter_depth",
        constants$1927.gtk_tree_store_iter_depth$FUNC
    );
}


