// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1805 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1805() {}
    static final FunctionDescriptor gtk_scrollbar_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scrollbar_new$MH = RuntimeHelper.downcallHandle(
        "gtk_scrollbar_new",
        constants$1805.gtk_scrollbar_new$FUNC
    );
    static final FunctionDescriptor gtk_scrollbar_set_adjustment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scrollbar_set_adjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_scrollbar_set_adjustment",
        constants$1805.gtk_scrollbar_set_adjustment$FUNC
    );
    static final FunctionDescriptor gtk_scrollbar_get_adjustment$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scrollbar_get_adjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_scrollbar_get_adjustment",
        constants$1805.gtk_scrollbar_get_adjustment$FUNC
    );
    static final FunctionDescriptor gtk_scrolled_window_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_scrolled_window_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_scrolled_window_get_type",
        constants$1805.gtk_scrolled_window_get_type$FUNC
    );
    static final FunctionDescriptor gtk_scrolled_window_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_scrolled_window_new$MH = RuntimeHelper.downcallHandle(
        "gtk_scrolled_window_new",
        constants$1805.gtk_scrolled_window_new$FUNC
    );
    static final FunctionDescriptor gtk_scrolled_window_set_hadjustment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scrolled_window_set_hadjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_scrolled_window_set_hadjustment",
        constants$1805.gtk_scrolled_window_set_hadjustment$FUNC
    );
}

