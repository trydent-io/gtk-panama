// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$967 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$967() {}
    static final FunctionDescriptor pango_attr_list_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_attr_list_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_get_type",
        constants$967.pango_attr_list_get_type$FUNC
    );
    static final FunctionDescriptor pango_attr_list_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle pango_attr_list_new$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_new",
        constants$967.pango_attr_list_new$FUNC
    );
    static final FunctionDescriptor pango_attr_list_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_ref$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_ref",
        constants$967.pango_attr_list_ref$FUNC
    );
    static final FunctionDescriptor pango_attr_list_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_unref$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_unref",
        constants$967.pango_attr_list_unref$FUNC
    );
    static final FunctionDescriptor pango_attr_list_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_copy$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_copy",
        constants$967.pango_attr_list_copy$FUNC
    );
    static final FunctionDescriptor pango_attr_list_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_insert$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_insert",
        constants$967.pango_attr_list_insert$FUNC
    );
}

