// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$950 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$950() {}
    static final FunctionDescriptor pango_font_metrics_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_metrics_ref$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_ref",
        constants$950.pango_font_metrics_ref$FUNC
    );
    static final FunctionDescriptor pango_font_metrics_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_metrics_unref$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_unref",
        constants$950.pango_font_metrics_unref$FUNC
    );
    static final FunctionDescriptor pango_font_metrics_get_ascent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_metrics_get_ascent$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_get_ascent",
        constants$950.pango_font_metrics_get_ascent$FUNC
    );
    static final FunctionDescriptor pango_font_metrics_get_descent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_metrics_get_descent$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_get_descent",
        constants$950.pango_font_metrics_get_descent$FUNC
    );
    static final FunctionDescriptor pango_font_metrics_get_height$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_metrics_get_height$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_get_height",
        constants$950.pango_font_metrics_get_height$FUNC
    );
    static final FunctionDescriptor pango_font_metrics_get_approximate_char_width$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_metrics_get_approximate_char_width$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_get_approximate_char_width",
        constants$950.pango_font_metrics_get_approximate_char_width$FUNC
    );
}

