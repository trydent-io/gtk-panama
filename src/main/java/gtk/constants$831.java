// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$831 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$831() {}
    static final FunctionDescriptor cairo_font_options_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle cairo_font_options_create$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_create",
        constants$831.cairo_font_options_create$FUNC
    );
    static final FunctionDescriptor cairo_font_options_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_copy$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_copy",
        constants$831.cairo_font_options_copy$FUNC
    );
    static final FunctionDescriptor cairo_font_options_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_destroy",
        constants$831.cairo_font_options_destroy$FUNC
    );
    static final FunctionDescriptor cairo_font_options_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_status$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_status",
        constants$831.cairo_font_options_status$FUNC
    );
    static final FunctionDescriptor cairo_font_options_merge$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_merge$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_merge",
        constants$831.cairo_font_options_merge$FUNC
    );
    static final FunctionDescriptor cairo_font_options_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_equal$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_equal",
        constants$831.cairo_font_options_equal$FUNC
    );
}

