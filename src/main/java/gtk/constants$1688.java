// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1688 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1688() {}
    static final FunctionDescriptor gtk_link_button_set_visited$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_link_button_set_visited$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_set_visited",
        constants$1688.gtk_link_button_set_visited$FUNC
    );
    static final FunctionDescriptor GtkListBoxFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkListBoxFilterFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxFilterFunc_UP$MH = RuntimeHelper.upcallHandle(GtkListBoxFilterFunc.class, "apply", constants$1688.GtkListBoxFilterFunc_UP$FUNC);
    static final FunctionDescriptor GtkListBoxFilterFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxFilterFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1688.GtkListBoxFilterFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GtkListBoxSortFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkListBoxSortFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxSortFunc_UP$MH = RuntimeHelper.upcallHandle(GtkListBoxSortFunc.class, "apply", constants$1688.GtkListBoxSortFunc_UP$FUNC);
    static final FunctionDescriptor GtkListBoxSortFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxSortFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1688.GtkListBoxSortFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GtkListBoxUpdateHeaderFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkListBoxUpdateHeaderFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxUpdateHeaderFunc_UP$MH = RuntimeHelper.upcallHandle(GtkListBoxUpdateHeaderFunc.class, "apply", constants$1688.GtkListBoxUpdateHeaderFunc_UP$FUNC);
}


