// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1409 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1409() {}
    static final FunctionDescriptor gtk_box_prepend$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_box_prepend$MH = RuntimeHelper.downcallHandle(
        "gtk_box_prepend",
        constants$1409.gtk_box_prepend$FUNC
    );
    static final FunctionDescriptor gtk_box_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_box_remove$MH = RuntimeHelper.downcallHandle(
        "gtk_box_remove",
        constants$1409.gtk_box_remove$FUNC
    );
    static final FunctionDescriptor gtk_box_insert_child_after$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_box_insert_child_after$MH = RuntimeHelper.downcallHandle(
        "gtk_box_insert_child_after",
        constants$1409.gtk_box_insert_child_after$FUNC
    );
    static final FunctionDescriptor gtk_box_reorder_child_after$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_box_reorder_child_after$MH = RuntimeHelper.downcallHandle(
        "gtk_box_reorder_child_after",
        constants$1409.gtk_box_reorder_child_after$FUNC
    );
    static final FunctionDescriptor gtk_builder_scope_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_builder_scope_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_scope_get_type",
        constants$1409.gtk_builder_scope_get_type$FUNC
    );
    static final FunctionDescriptor gtk_builder_cscope_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_builder_cscope_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_cscope_get_type",
        constants$1409.gtk_builder_cscope_get_type$FUNC
    );
}


