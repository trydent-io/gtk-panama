// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$270 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$270() {}
    static final FunctionDescriptor g_ref_string_release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_string_release$MH = RuntimeHelper.downcallHandle(
        "g_ref_string_release",
        constants$270.g_ref_string_release$FUNC
    );
    static final FunctionDescriptor g_ref_string_length$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_string_length$MH = RuntimeHelper.downcallHandle(
        "g_ref_string_length",
        constants$270.g_ref_string_length$FUNC
    );
    static final FunctionDescriptor g_regex_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_regex_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_regex_error_quark",
        constants$270.g_regex_error_quark$FUNC
    );
    static final FunctionDescriptor GRegexEvalCallback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GRegexEvalCallback_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GRegexEvalCallback_UP$MH = RuntimeHelper.upcallHandle(GRegexEvalCallback.class, "apply", constants$270.GRegexEvalCallback_UP$FUNC);
    static final FunctionDescriptor GRegexEvalCallback_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GRegexEvalCallback_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$270.GRegexEvalCallback_DOWN$FUNC
    );
    static final FunctionDescriptor g_regex_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_new$MH = RuntimeHelper.downcallHandle(
        "g_regex_new",
        constants$270.g_regex_new$FUNC
    );
}


