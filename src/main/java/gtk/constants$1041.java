// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1041 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1041() {}
    static final FunctionDescriptor gdk_pixbuf_fill$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_fill$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_fill",
        constants$1041.gdk_pixbuf_fill$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_save$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_save$MH = RuntimeHelper.downcallHandleVariadic(
        "gdk_pixbuf_save",
        constants$1041.gdk_pixbuf_save$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_savev$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_savev$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_savev",
        constants$1041.gdk_pixbuf_savev$FUNC
    );
    static final FunctionDescriptor GdkPixbufSaveFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GdkPixbufSaveFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GdkPixbufSaveFunc_UP$MH = RuntimeHelper.upcallHandle(GdkPixbufSaveFunc.class, "apply", constants$1041.GdkPixbufSaveFunc_UP$FUNC);
    static final FunctionDescriptor GdkPixbufSaveFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GdkPixbufSaveFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1041.GdkPixbufSaveFunc_DOWN$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_save_to_callback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_save_to_callback$MH = RuntimeHelper.downcallHandleVariadic(
        "gdk_pixbuf_save_to_callback",
        constants$1041.gdk_pixbuf_save_to_callback$FUNC
    );
}

