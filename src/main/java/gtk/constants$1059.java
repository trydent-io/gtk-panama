// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1059 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1059() {}
    static final FunctionDescriptor gdk_pixbuf_get_from_texture$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_get_from_texture$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_from_texture",
        constants$1059.gdk_pixbuf_get_from_texture$FUNC
    );
    static final FunctionDescriptor PangoCairoShapeRendererFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PangoCairoShapeRendererFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PangoCairoShapeRendererFunc_UP$MH = RuntimeHelper.upcallHandle(PangoCairoShapeRendererFunc.class, "apply", constants$1059.PangoCairoShapeRendererFunc_UP$FUNC);
    static final FunctionDescriptor PangoCairoShapeRendererFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PangoCairoShapeRendererFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1059.PangoCairoShapeRendererFunc_DOWN$FUNC
    );
    static final FunctionDescriptor pango_cairo_font_map_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_cairo_font_map_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_cairo_font_map_get_type",
        constants$1059.pango_cairo_font_map_get_type$FUNC
    );
    static final FunctionDescriptor pango_cairo_font_map_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle pango_cairo_font_map_new$MH = RuntimeHelper.downcallHandle(
        "pango_cairo_font_map_new",
        constants$1059.pango_cairo_font_map_new$FUNC
    );
    static final FunctionDescriptor pango_cairo_font_map_new_for_font_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_cairo_font_map_new_for_font_type$MH = RuntimeHelper.downcallHandle(
        "pango_cairo_font_map_new_for_font_type",
        constants$1059.pango_cairo_font_map_new_for_font_type$FUNC
    );
}

