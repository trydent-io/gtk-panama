// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1347 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1347() {}
    static final FunctionDescriptor gtk_application_set_accels_for_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_application_set_accels_for_action$MH = RuntimeHelper.downcallHandle(
        "gtk_application_set_accels_for_action",
        constants$1347.gtk_application_set_accels_for_action$FUNC
    );
    static final FunctionDescriptor gtk_application_get_menu_by_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_application_get_menu_by_id$MH = RuntimeHelper.downcallHandle(
        "gtk_application_get_menu_by_id",
        constants$1347.gtk_application_get_menu_by_id$FUNC
    );
    static final FunctionDescriptor gtk_window_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_window_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_type",
        constants$1347.gtk_window_get_type$FUNC
    );
    static final FunctionDescriptor gtk_window_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_window_new$MH = RuntimeHelper.downcallHandle(
        "gtk_window_new",
        constants$1347.gtk_window_new$FUNC
    );
    static final FunctionDescriptor gtk_window_set_title$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_title$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_title",
        constants$1347.gtk_window_set_title$FUNC
    );
    static final FunctionDescriptor gtk_window_get_title$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_title$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_title",
        constants$1347.gtk_window_get_title$FUNC
    );
}

