// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1011 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1011() {}
    static final FunctionDescriptor pango_layout_iter_get_run_baseline$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_get_run_baseline$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_get_run_baseline",
        constants$1011.pango_layout_iter_get_run_baseline$FUNC
    );
    static final FunctionDescriptor pango_markup_parser_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_markup_parser_new$MH = RuntimeHelper.downcallHandle(
        "pango_markup_parser_new",
        constants$1011.pango_markup_parser_new$FUNC
    );
    static final FunctionDescriptor pango_markup_parser_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_markup_parser_finish$MH = RuntimeHelper.downcallHandle(
        "pango_markup_parser_finish",
        constants$1011.pango_markup_parser_finish$FUNC
    );
    static final FunctionDescriptor pango_parse_markup$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_parse_markup$MH = RuntimeHelper.downcallHandle(
        "pango_parse_markup",
        constants$1011.pango_parse_markup$FUNC
    );
    static final FunctionDescriptor pango_renderer_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_renderer_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_get_type",
        constants$1011.pango_renderer_get_type$FUNC
    );
    static final FunctionDescriptor pango_renderer_draw_layout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_draw_layout$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_layout",
        constants$1011.pango_renderer_draw_layout$FUNC
    );
}


