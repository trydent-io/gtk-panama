// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$830 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$830() {}
    static final FunctionDescriptor cairo_tag_begin$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_tag_begin$MH = RuntimeHelper.downcallHandle(
        "cairo_tag_begin",
        constants$830.cairo_tag_begin$FUNC
    );
    static final FunctionDescriptor cairo_tag_end$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_tag_end$MH = RuntimeHelper.downcallHandle(
        "cairo_tag_end",
        constants$830.cairo_tag_end$FUNC
    );
    static final FunctionDescriptor cairo_glyph_allocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_glyph_allocate$MH = RuntimeHelper.downcallHandle(
        "cairo_glyph_allocate",
        constants$830.cairo_glyph_allocate$FUNC
    );
    static final FunctionDescriptor cairo_glyph_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_glyph_free$MH = RuntimeHelper.downcallHandle(
        "cairo_glyph_free",
        constants$830.cairo_glyph_free$FUNC
    );
    static final FunctionDescriptor cairo_text_cluster_allocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_text_cluster_allocate$MH = RuntimeHelper.downcallHandle(
        "cairo_text_cluster_allocate",
        constants$830.cairo_text_cluster_allocate$FUNC
    );
    static final FunctionDescriptor cairo_text_cluster_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_text_cluster_free$MH = RuntimeHelper.downcallHandle(
        "cairo_text_cluster_free",
        constants$830.cairo_text_cluster_free$FUNC
    );
}

