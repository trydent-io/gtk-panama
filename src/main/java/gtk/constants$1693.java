// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1693 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1693() {}
    static final FunctionDescriptor gtk_list_box_select_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_select_row$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_select_row",
        constants$1693.gtk_list_box_select_row$FUNC
    );
    static final FunctionDescriptor gtk_list_box_set_placeholder$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_placeholder$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_placeholder",
        constants$1693.gtk_list_box_set_placeholder$FUNC
    );
    static final FunctionDescriptor gtk_list_box_set_adjustment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_adjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_adjustment",
        constants$1693.gtk_list_box_set_adjustment$FUNC
    );
    static final FunctionDescriptor gtk_list_box_get_adjustment$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_get_adjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_get_adjustment",
        constants$1693.gtk_list_box_get_adjustment$FUNC
    );
    static final FunctionDescriptor GtkListBoxForeachFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkListBoxForeachFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxForeachFunc_UP$MH = RuntimeHelper.upcallHandle(GtkListBoxForeachFunc.class, "apply", constants$1693.GtkListBoxForeachFunc_UP$FUNC);
    static final FunctionDescriptor GtkListBoxForeachFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxForeachFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1693.GtkListBoxForeachFunc_DOWN$FUNC
    );
}

