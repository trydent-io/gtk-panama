// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1410 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1410() {}
    static final FunctionDescriptor gtk_builder_cscope_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_builder_cscope_new$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_cscope_new",
        constants$1410.gtk_builder_cscope_new$FUNC
    );
    static final FunctionDescriptor gtk_builder_cscope_add_callback_symbol$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_cscope_add_callback_symbol$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_cscope_add_callback_symbol",
        constants$1410.gtk_builder_cscope_add_callback_symbol$FUNC
    );
    static final FunctionDescriptor gtk_builder_cscope_add_callback_symbols$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_cscope_add_callback_symbols$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_builder_cscope_add_callback_symbols",
        constants$1410.gtk_builder_cscope_add_callback_symbols$FUNC
    );
    static final FunctionDescriptor gtk_builder_cscope_lookup_callback_symbol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_cscope_lookup_callback_symbol$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_cscope_lookup_callback_symbol",
        constants$1410.gtk_builder_cscope_lookup_callback_symbol$FUNC
    );
    static final FunctionDescriptor gtk_builder_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_builder_error_quark$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_error_quark",
        constants$1410.gtk_builder_error_quark$FUNC
    );
    static final FunctionDescriptor gtk_builder_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_builder_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_get_type",
        constants$1410.gtk_builder_get_type$FUNC
    );
}


