// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1781 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1781() {}
    static final FunctionDescriptor GtkPageSetupDoneFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkPageSetupDoneFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1781.GtkPageSetupDoneFunc_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_print_run_page_setup_dialog_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_run_page_setup_dialog_async$MH = RuntimeHelper.downcallHandle(
        "gtk_print_run_page_setup_dialog_async",
        constants$1781.gtk_print_run_page_setup_dialog_async$FUNC
    );
    static final FunctionDescriptor gtk_progress_bar_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_progress_bar_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_get_type",
        constants$1781.gtk_progress_bar_get_type$FUNC
    );
    static final FunctionDescriptor gtk_progress_bar_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_progress_bar_new$MH = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_new",
        constants$1781.gtk_progress_bar_new$FUNC
    );
    static final FunctionDescriptor gtk_progress_bar_pulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_progress_bar_pulse$MH = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_pulse",
        constants$1781.gtk_progress_bar_pulse$FUNC
    );
    static final FunctionDescriptor gtk_progress_bar_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_progress_bar_set_text$MH = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_set_text",
        constants$1781.gtk_progress_bar_set_text$FUNC
    );
}


