// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1823 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1823() {}
    static final FunctionDescriptor gtk_single_selection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_single_selection_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_single_selection_get_type",
        constants$1823.gtk_single_selection_get_type$FUNC
    );
    static final FunctionDescriptor gtk_single_selection_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_single_selection_new$MH = RuntimeHelper.downcallHandle(
        "gtk_single_selection_new",
        constants$1823.gtk_single_selection_new$FUNC
    );
    static final FunctionDescriptor gtk_single_selection_get_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_single_selection_get_model$MH = RuntimeHelper.downcallHandle(
        "gtk_single_selection_get_model",
        constants$1823.gtk_single_selection_get_model$FUNC
    );
    static final FunctionDescriptor gtk_single_selection_set_model$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_single_selection_set_model$MH = RuntimeHelper.downcallHandle(
        "gtk_single_selection_set_model",
        constants$1823.gtk_single_selection_set_model$FUNC
    );
    static final FunctionDescriptor gtk_single_selection_get_selected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_single_selection_get_selected$MH = RuntimeHelper.downcallHandle(
        "gtk_single_selection_get_selected",
        constants$1823.gtk_single_selection_get_selected$FUNC
    );
    static final FunctionDescriptor gtk_single_selection_set_selected$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_single_selection_set_selected$MH = RuntimeHelper.downcallHandle(
        "gtk_single_selection_set_selected",
        constants$1823.gtk_single_selection_set_selected$FUNC
    );
}

