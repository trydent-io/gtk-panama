// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1756 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1756() {}
    static final FunctionDescriptor gtk_picture_set_resource$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_picture_set_resource$MH = RuntimeHelper.downcallHandle(
        "gtk_picture_set_resource",
        constants$1756.gtk_picture_set_resource$FUNC
    );
    static final FunctionDescriptor gtk_picture_set_pixbuf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_picture_set_pixbuf$MH = RuntimeHelper.downcallHandle(
        "gtk_picture_set_pixbuf",
        constants$1756.gtk_picture_set_pixbuf$FUNC
    );
    static final FunctionDescriptor gtk_picture_set_keep_aspect_ratio$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_picture_set_keep_aspect_ratio$MH = RuntimeHelper.downcallHandle(
        "gtk_picture_set_keep_aspect_ratio",
        constants$1756.gtk_picture_set_keep_aspect_ratio$FUNC
    );
    static final FunctionDescriptor gtk_picture_get_keep_aspect_ratio$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_picture_get_keep_aspect_ratio$MH = RuntimeHelper.downcallHandle(
        "gtk_picture_get_keep_aspect_ratio",
        constants$1756.gtk_picture_get_keep_aspect_ratio$FUNC
    );
    static final FunctionDescriptor gtk_picture_set_can_shrink$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_picture_set_can_shrink$MH = RuntimeHelper.downcallHandle(
        "gtk_picture_set_can_shrink",
        constants$1756.gtk_picture_set_can_shrink$FUNC
    );
    static final FunctionDescriptor gtk_picture_get_can_shrink$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_picture_get_can_shrink$MH = RuntimeHelper.downcallHandle(
        "gtk_picture_get_can_shrink",
        constants$1756.gtk_picture_get_can_shrink$FUNC
    );
}


