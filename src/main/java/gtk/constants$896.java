// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$896 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$896() {}
    static final FunctionDescriptor hb_face_get_glyph_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_get_glyph_count$MH = RuntimeHelper.downcallHandle(
        "hb_face_get_glyph_count",
        constants$896.hb_face_get_glyph_count$FUNC
    );
    static final FunctionDescriptor hb_face_get_table_tags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_get_table_tags$MH = RuntimeHelper.downcallHandle(
        "hb_face_get_table_tags",
        constants$896.hb_face_get_table_tags$FUNC
    );
    static final FunctionDescriptor hb_face_collect_unicodes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_collect_unicodes$MH = RuntimeHelper.downcallHandle(
        "hb_face_collect_unicodes",
        constants$896.hb_face_collect_unicodes$FUNC
    );
    static final FunctionDescriptor hb_face_collect_variation_selectors$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_collect_variation_selectors$MH = RuntimeHelper.downcallHandle(
        "hb_face_collect_variation_selectors",
        constants$896.hb_face_collect_variation_selectors$FUNC
    );
    static final FunctionDescriptor hb_face_collect_variation_unicodes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_collect_variation_unicodes$MH = RuntimeHelper.downcallHandle(
        "hb_face_collect_variation_unicodes",
        constants$896.hb_face_collect_variation_unicodes$FUNC
    );
    static final FunctionDescriptor hb_face_builder_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_face_builder_create$MH = RuntimeHelper.downcallHandle(
        "hb_face_builder_create",
        constants$896.hb_face_builder_create$FUNC
    );
}


