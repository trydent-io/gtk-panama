// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1804 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1804() {}
    static final FunctionDescriptor gtk_scrollable_get_hscroll_policy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scrollable_get_hscroll_policy$MH = RuntimeHelper.downcallHandle(
        "gtk_scrollable_get_hscroll_policy",
        constants$1804.gtk_scrollable_get_hscroll_policy$FUNC
    );
    static final FunctionDescriptor gtk_scrollable_set_hscroll_policy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_scrollable_set_hscroll_policy$MH = RuntimeHelper.downcallHandle(
        "gtk_scrollable_set_hscroll_policy",
        constants$1804.gtk_scrollable_set_hscroll_policy$FUNC
    );
    static final FunctionDescriptor gtk_scrollable_get_vscroll_policy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scrollable_get_vscroll_policy$MH = RuntimeHelper.downcallHandle(
        "gtk_scrollable_get_vscroll_policy",
        constants$1804.gtk_scrollable_get_vscroll_policy$FUNC
    );
    static final FunctionDescriptor gtk_scrollable_set_vscroll_policy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_scrollable_set_vscroll_policy$MH = RuntimeHelper.downcallHandle(
        "gtk_scrollable_set_vscroll_policy",
        constants$1804.gtk_scrollable_set_vscroll_policy$FUNC
    );
    static final FunctionDescriptor gtk_scrollable_get_border$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scrollable_get_border$MH = RuntimeHelper.downcallHandle(
        "gtk_scrollable_get_border",
        constants$1804.gtk_scrollable_get_border$FUNC
    );
    static final FunctionDescriptor gtk_scrollbar_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_scrollbar_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_scrollbar_get_type",
        constants$1804.gtk_scrollbar_get_type$FUNC
    );
}

