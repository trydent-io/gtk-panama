// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1326 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1326() {}
    static final FunctionDescriptor gtk_widget_keynav_failed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_keynav_failed$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_keynav_failed",
        constants$1326.gtk_widget_keynav_failed$FUNC
    );
    static final FunctionDescriptor gtk_widget_error_bell$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_error_bell$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_error_bell",
        constants$1326.gtk_widget_error_bell$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_size_request$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_size_request$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_size_request",
        constants$1326.gtk_widget_set_size_request$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_size_request$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_size_request$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_size_request",
        constants$1326.gtk_widget_get_size_request$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_opacity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_widget_set_opacity$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_opacity",
        constants$1326.gtk_widget_set_opacity$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_opacity$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_opacity$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_opacity",
        constants$1326.gtk_widget_get_opacity$FUNC
    );
}

