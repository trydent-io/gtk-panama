// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1697 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1697() {}
    static final FunctionDescriptor gtk_list_box_bind_model$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_bind_model$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_bind_model",
        constants$1697.gtk_list_box_bind_model$FUNC
    );
    static final FunctionDescriptor gtk_list_box_set_show_separators$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_show_separators$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_show_separators",
        constants$1697.gtk_list_box_set_show_separators$FUNC
    );
    static final FunctionDescriptor gtk_list_box_get_show_separators$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_get_show_separators$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_get_show_separators",
        constants$1697.gtk_list_box_get_show_separators$FUNC
    );
    static final FunctionDescriptor gtk_list_item_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_list_item_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_list_item_get_type",
        constants$1697.gtk_list_item_get_type$FUNC
    );
    static final FunctionDescriptor gtk_list_item_get_item$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_item_get_item$MH = RuntimeHelper.downcallHandle(
        "gtk_list_item_get_item",
        constants$1697.gtk_list_item_get_item$FUNC
    );
    static final FunctionDescriptor gtk_list_item_get_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_item_get_position$MH = RuntimeHelper.downcallHandle(
        "gtk_list_item_get_position",
        constants$1697.gtk_list_item_get_position$FUNC
    );
}

