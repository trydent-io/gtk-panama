// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$213 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$213() {}
    static final FunctionDescriptor g_mapped_file_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_free$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_free",
        constants$213.g_mapped_file_free$FUNC
    );
    static final FunctionDescriptor g_markup_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_markup_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_markup_error_quark",
        constants$213.g_markup_error_quark$FUNC
    );
    static final FunctionDescriptor g_markup_parse_context_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_markup_parse_context_new$MH = RuntimeHelper.downcallHandle(
        "g_markup_parse_context_new",
        constants$213.g_markup_parse_context_new$FUNC
    );
    static final FunctionDescriptor g_markup_parse_context_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_markup_parse_context_ref$MH = RuntimeHelper.downcallHandle(
        "g_markup_parse_context_ref",
        constants$213.g_markup_parse_context_ref$FUNC
    );
    static final FunctionDescriptor g_markup_parse_context_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_markup_parse_context_unref$MH = RuntimeHelper.downcallHandle(
        "g_markup_parse_context_unref",
        constants$213.g_markup_parse_context_unref$FUNC
    );
    static final FunctionDescriptor g_markup_parse_context_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_markup_parse_context_free$MH = RuntimeHelper.downcallHandle(
        "g_markup_parse_context_free",
        constants$213.g_markup_parse_context_free$FUNC
    );
}


