// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$917 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$917() {}
    static final FunctionDescriptor hb_font_set_var_named_instance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_set_var_named_instance$MH = RuntimeHelper.downcallHandle(
        "hb_font_set_var_named_instance",
        constants$917.hb_font_set_var_named_instance$FUNC
    );
    static final FunctionDescriptor hb_glyph_info_get_glyph_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_glyph_info_get_glyph_flags$MH = RuntimeHelper.downcallHandle(
        "hb_glyph_info_get_glyph_flags",
        constants$917.hb_glyph_info_get_glyph_flags$FUNC
    );
    static final FunctionDescriptor hb_segment_properties_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_segment_properties_equal$MH = RuntimeHelper.downcallHandle(
        "hb_segment_properties_equal",
        constants$917.hb_segment_properties_equal$FUNC
    );
    static final FunctionDescriptor hb_segment_properties_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_segment_properties_hash$MH = RuntimeHelper.downcallHandle(
        "hb_segment_properties_hash",
        constants$917.hb_segment_properties_hash$FUNC
    );
    static final FunctionDescriptor hb_buffer_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_buffer_create$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_create",
        constants$917.hb_buffer_create$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_empty$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_buffer_get_empty$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_empty",
        constants$917.hb_buffer_get_empty$FUNC
    );
}


