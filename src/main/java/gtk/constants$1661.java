// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1661 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1661() {}
    static final FunctionDescriptor gtk_icon_view_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_icon_view_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_type",
        constants$1661.gtk_icon_view_get_type$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_icon_view_new$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_new",
        constants$1661.gtk_icon_view_new$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_new_with_area$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_new_with_area$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_new_with_area",
        constants$1661.gtk_icon_view_new_with_area$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_new_with_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_new_with_model$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_new_with_model",
        constants$1661.gtk_icon_view_new_with_model$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_set_model$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_set_model$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_set_model",
        constants$1661.gtk_icon_view_set_model$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_model$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_model",
        constants$1661.gtk_icon_view_get_model$FUNC
    );
}


