// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1849 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1849() {}
    static final FunctionDescriptor gtk_statusbar_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_statusbar_new$MH = RuntimeHelper.downcallHandle(
        "gtk_statusbar_new",
        constants$1849.gtk_statusbar_new$FUNC
    );
    static final FunctionDescriptor gtk_statusbar_get_context_id$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_statusbar_get_context_id$MH = RuntimeHelper.downcallHandle(
        "gtk_statusbar_get_context_id",
        constants$1849.gtk_statusbar_get_context_id$FUNC
    );
    static final FunctionDescriptor gtk_statusbar_push$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_statusbar_push$MH = RuntimeHelper.downcallHandle(
        "gtk_statusbar_push",
        constants$1849.gtk_statusbar_push$FUNC
    );
    static final FunctionDescriptor gtk_statusbar_pop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_statusbar_pop$MH = RuntimeHelper.downcallHandle(
        "gtk_statusbar_pop",
        constants$1849.gtk_statusbar_pop$FUNC
    );
    static final FunctionDescriptor gtk_statusbar_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_statusbar_remove$MH = RuntimeHelper.downcallHandle(
        "gtk_statusbar_remove",
        constants$1849.gtk_statusbar_remove$FUNC
    );
    static final FunctionDescriptor gtk_statusbar_remove_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_statusbar_remove_all$MH = RuntimeHelper.downcallHandle(
        "gtk_statusbar_remove_all",
        constants$1849.gtk_statusbar_remove_all$FUNC
    );
}


