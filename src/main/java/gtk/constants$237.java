// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$237 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$237() {}
    static final FunctionDescriptor g_variant_builder_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_close$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_close",
        constants$237.g_variant_builder_close$FUNC
    );
    static final FunctionDescriptor g_variant_builder_add_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add_value$MH = RuntimeHelper.downcallHandle(
        "g_variant_builder_add_value",
        constants$237.g_variant_builder_add_value$FUNC
    );
    static final FunctionDescriptor g_variant_builder_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_builder_add",
        constants$237.g_variant_builder_add$FUNC
    );
    static final FunctionDescriptor g_variant_builder_add_parsed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add_parsed$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_builder_add_parsed",
        constants$237.g_variant_builder_add_parsed$FUNC
    );
    static final FunctionDescriptor g_variant_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_new",
        constants$237.g_variant_new$FUNC
    );
    static final FunctionDescriptor g_variant_get$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_get",
        constants$237.g_variant_get$FUNC
    );
}

