// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1710 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1710() {}
    static final FunctionDescriptor gtk_media_controls_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_media_controls_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_media_controls_get_type",
        constants$1710.gtk_media_controls_get_type$FUNC
    );
    static final FunctionDescriptor gtk_media_controls_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_media_controls_new$MH = RuntimeHelper.downcallHandle(
        "gtk_media_controls_new",
        constants$1710.gtk_media_controls_new$FUNC
    );
    static final FunctionDescriptor gtk_media_controls_get_media_stream$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_media_controls_get_media_stream$MH = RuntimeHelper.downcallHandle(
        "gtk_media_controls_get_media_stream",
        constants$1710.gtk_media_controls_get_media_stream$FUNC
    );
    static final FunctionDescriptor gtk_media_controls_set_media_stream$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_media_controls_set_media_stream$MH = RuntimeHelper.downcallHandle(
        "gtk_media_controls_set_media_stream",
        constants$1710.gtk_media_controls_set_media_stream$FUNC
    );
    static final FunctionDescriptor gtk_media_file_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_media_file_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_media_file_get_type",
        constants$1710.gtk_media_file_get_type$FUNC
    );
    static final FunctionDescriptor gtk_media_file_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_media_file_new$MH = RuntimeHelper.downcallHandle(
        "gtk_media_file_new",
        constants$1710.gtk_media_file_new$FUNC
    );
}

