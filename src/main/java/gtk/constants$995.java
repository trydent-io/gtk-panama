// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$995 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$995() {}
    static final FunctionDescriptor pango_layout_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_text$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_text",
        constants$995.pango_layout_set_text$FUNC
    );
    static final FunctionDescriptor pango_layout_get_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_text$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_text",
        constants$995.pango_layout_get_text$FUNC
    );
    static final FunctionDescriptor pango_layout_get_character_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_character_count$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_character_count",
        constants$995.pango_layout_get_character_count$FUNC
    );
    static final FunctionDescriptor pango_layout_set_markup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_markup$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_markup",
        constants$995.pango_layout_set_markup$FUNC
    );
    static final FunctionDescriptor pango_layout_set_markup_with_accel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_set_markup_with_accel$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_markup_with_accel",
        constants$995.pango_layout_set_markup_with_accel$FUNC
    );
    static final FunctionDescriptor pango_layout_set_font_description$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_set_font_description$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_font_description",
        constants$995.pango_layout_set_font_description$FUNC
    );
}


