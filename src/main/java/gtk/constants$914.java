// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$914 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$914() {}
    static final FunctionDescriptor hb_font_make_immutable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_make_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_font_make_immutable",
        constants$914.hb_font_make_immutable$FUNC
    );
    static final FunctionDescriptor hb_font_is_immutable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_is_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_font_is_immutable",
        constants$914.hb_font_is_immutable$FUNC
    );
    static final FunctionDescriptor hb_font_set_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_set_parent$MH = RuntimeHelper.downcallHandle(
        "hb_font_set_parent",
        constants$914.hb_font_set_parent$FUNC
    );
    static final FunctionDescriptor hb_font_get_parent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_parent$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_parent",
        constants$914.hb_font_get_parent$FUNC
    );
    static final FunctionDescriptor hb_font_set_face$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_set_face$MH = RuntimeHelper.downcallHandle(
        "hb_font_set_face",
        constants$914.hb_font_set_face$FUNC
    );
    static final FunctionDescriptor hb_font_get_face$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_face$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_face",
        constants$914.hb_font_get_face$FUNC
    );
}

