// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$898 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$898() {}
    static final FunctionDescriptor hb_font_funcs_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_funcs_get_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_font_funcs_get_user_data",
        constants$898.hb_font_funcs_get_user_data$FUNC
    );
    static final FunctionDescriptor hb_font_funcs_make_immutable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_funcs_make_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_font_funcs_make_immutable",
        constants$898.hb_font_funcs_make_immutable$FUNC
    );
    static final FunctionDescriptor hb_font_funcs_is_immutable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_funcs_is_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_font_funcs_is_immutable",
        constants$898.hb_font_funcs_is_immutable$FUNC
    );
    static final FunctionDescriptor hb_font_get_font_extents_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor hb_font_get_font_extents_func_t_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_font_extents_func_t_UP$MH = RuntimeHelper.upcallHandle(hb_font_get_font_extents_func_t.class, "apply", constants$898.hb_font_get_font_extents_func_t_UP$FUNC);
    static final FunctionDescriptor hb_font_get_font_extents_func_t_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_font_extents_func_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$898.hb_font_get_font_extents_func_t_DOWN$FUNC
    );
    static final FunctionDescriptor hb_font_get_font_h_extents_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor hb_font_get_font_h_extents_func_t_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_font_h_extents_func_t_UP$MH = RuntimeHelper.upcallHandle(hb_font_get_font_h_extents_func_t.class, "apply", constants$898.hb_font_get_font_h_extents_func_t_UP$FUNC);
}

