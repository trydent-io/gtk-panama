// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1730 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1730() {}
    static final FunctionDescriptor gtk_notebook_page_num$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_page_num$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_page_num",
        constants$1730.gtk_notebook_page_num$FUNC
    );
    static final FunctionDescriptor gtk_notebook_set_current_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_set_current_page$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_set_current_page",
        constants$1730.gtk_notebook_set_current_page$FUNC
    );
    static final FunctionDescriptor gtk_notebook_next_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_next_page$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_next_page",
        constants$1730.gtk_notebook_next_page$FUNC
    );
    static final FunctionDescriptor gtk_notebook_prev_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_prev_page$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_prev_page",
        constants$1730.gtk_notebook_prev_page$FUNC
    );
    static final FunctionDescriptor gtk_notebook_set_show_border$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_set_show_border$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_set_show_border",
        constants$1730.gtk_notebook_set_show_border$FUNC
    );
    static final FunctionDescriptor gtk_notebook_get_show_border$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_show_border$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_show_border",
        constants$1730.gtk_notebook_get_show_border$FUNC
    );
}


