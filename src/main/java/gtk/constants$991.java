// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$991 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$991() {}
    static final FunctionDescriptor pango_glyph_item_iter_prev_cluster$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_item_iter_prev_cluster$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_iter_prev_cluster",
        constants$991.pango_glyph_item_iter_prev_cluster$FUNC
    );
    static final FunctionDescriptor pango_tab_array_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_tab_array_new$MH = RuntimeHelper.downcallHandle(
        "pango_tab_array_new",
        constants$991.pango_tab_array_new$FUNC
    );
    static final FunctionDescriptor pango_tab_array_new_with_positions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_tab_array_new_with_positions$MH = RuntimeHelper.downcallHandleVariadic(
        "pango_tab_array_new_with_positions",
        constants$991.pango_tab_array_new_with_positions$FUNC
    );
    static final FunctionDescriptor pango_tab_array_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_tab_array_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_tab_array_get_type",
        constants$991.pango_tab_array_get_type$FUNC
    );
    static final FunctionDescriptor pango_tab_array_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_tab_array_copy$MH = RuntimeHelper.downcallHandle(
        "pango_tab_array_copy",
        constants$991.pango_tab_array_copy$FUNC
    );
    static final FunctionDescriptor pango_tab_array_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_tab_array_free$MH = RuntimeHelper.downcallHandle(
        "pango_tab_array_free",
        constants$991.pango_tab_array_free$FUNC
    );
}


