// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1299 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1299() {}
    static final FunctionDescriptor gsk_renderer_get_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_renderer_get_surface$MH = RuntimeHelper.downcallHandle(
        "gsk_renderer_get_surface",
        constants$1299.gsk_renderer_get_surface$FUNC
    );
    static final FunctionDescriptor gsk_renderer_realize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_renderer_realize$MH = RuntimeHelper.downcallHandle(
        "gsk_renderer_realize",
        constants$1299.gsk_renderer_realize$FUNC
    );
    static final FunctionDescriptor gsk_renderer_unrealize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_renderer_unrealize$MH = RuntimeHelper.downcallHandle(
        "gsk_renderer_unrealize",
        constants$1299.gsk_renderer_unrealize$FUNC
    );
    static final FunctionDescriptor gsk_renderer_is_realized$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_renderer_is_realized$MH = RuntimeHelper.downcallHandle(
        "gsk_renderer_is_realized",
        constants$1299.gsk_renderer_is_realized$FUNC
    );
    static final FunctionDescriptor gsk_renderer_render_texture$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_renderer_render_texture$MH = RuntimeHelper.downcallHandle(
        "gsk_renderer_render_texture",
        constants$1299.gsk_renderer_render_texture$FUNC
    );
    static final FunctionDescriptor gsk_renderer_render$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_renderer_render$MH = RuntimeHelper.downcallHandle(
        "gsk_renderer_render",
        constants$1299.gsk_renderer_render$FUNC
    );
}


