// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$982 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$982() {}
    static final FunctionDescriptor pango_shape_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_shape_full$MH = RuntimeHelper.downcallHandle(
        "pango_shape_full",
        constants$982.pango_shape_full$FUNC
    );
    static final FunctionDescriptor pango_shape_with_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_shape_with_flags$MH = RuntimeHelper.downcallHandle(
        "pango_shape_with_flags",
        constants$982.pango_shape_with_flags$FUNC
    );
    static final FunctionDescriptor pango_shape_item$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_shape_item$MH = RuntimeHelper.downcallHandle(
        "pango_shape_item",
        constants$982.pango_shape_item$FUNC
    );
    static final FunctionDescriptor pango_engine_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_engine_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_engine_get_type",
        constants$982.pango_engine_get_type$FUNC
    );
    static final FunctionDescriptor pango_engine_lang_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_engine_lang_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_engine_lang_get_type",
        constants$982.pango_engine_lang_get_type$FUNC
    );
    static final FunctionDescriptor pango_engine_shape_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_engine_shape_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_engine_shape_get_type",
        constants$982.pango_engine_shape_get_type$FUNC
    );
}


