// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$238 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$238() {}
    static final FunctionDescriptor g_variant_new_va$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_va$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_va",
        constants$238.g_variant_new_va$FUNC
    );
    static final FunctionDescriptor g_variant_get_va$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_va$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_va",
        constants$238.g_variant_get_va$FUNC
    );
    static final FunctionDescriptor g_variant_check_format_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_check_format_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_check_format_string",
        constants$238.g_variant_check_format_string$FUNC
    );
    static final FunctionDescriptor g_variant_parse$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_parse$MH = RuntimeHelper.downcallHandle(
        "g_variant_parse",
        constants$238.g_variant_parse$FUNC
    );
    static final FunctionDescriptor g_variant_new_parsed$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_parsed$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_new_parsed",
        constants$238.g_variant_new_parsed$FUNC
    );
    static final FunctionDescriptor g_variant_new_parsed_va$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_parsed_va$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_parsed_va",
        constants$238.g_variant_new_parsed_va$FUNC
    );
}


