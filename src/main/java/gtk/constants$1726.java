// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1726 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1726() {}
    static final FunctionDescriptor gtk_native_realize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_realize$MH = RuntimeHelper.downcallHandle(
        "gtk_native_realize",
        constants$1726.gtk_native_realize$FUNC
    );
    static final FunctionDescriptor gtk_native_unrealize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_unrealize$MH = RuntimeHelper.downcallHandle(
        "gtk_native_unrealize",
        constants$1726.gtk_native_unrealize$FUNC
    );
    static final FunctionDescriptor gtk_native_get_for_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_get_for_surface$MH = RuntimeHelper.downcallHandle(
        "gtk_native_get_for_surface",
        constants$1726.gtk_native_get_for_surface$FUNC
    );
    static final FunctionDescriptor gtk_native_get_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_get_surface$MH = RuntimeHelper.downcallHandle(
        "gtk_native_get_surface",
        constants$1726.gtk_native_get_surface$FUNC
    );
    static final FunctionDescriptor gtk_native_get_renderer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_get_renderer$MH = RuntimeHelper.downcallHandle(
        "gtk_native_get_renderer",
        constants$1726.gtk_native_get_renderer$FUNC
    );
    static final FunctionDescriptor gtk_native_get_surface_transform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_get_surface_transform$MH = RuntimeHelper.downcallHandle(
        "gtk_native_get_surface_transform",
        constants$1726.gtk_native_get_surface_transform$FUNC
    );
}


