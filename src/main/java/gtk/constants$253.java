// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$253 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$253() {}
    static final FunctionDescriptor g_option_group_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_free$MH = RuntimeHelper.downcallHandle(
        "g_option_group_free",
        constants$253.g_option_group_free$FUNC
    );
    static final FunctionDescriptor g_option_group_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_ref$MH = RuntimeHelper.downcallHandle(
        "g_option_group_ref",
        constants$253.g_option_group_ref$FUNC
    );
    static final FunctionDescriptor g_option_group_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_unref$MH = RuntimeHelper.downcallHandle(
        "g_option_group_unref",
        constants$253.g_option_group_unref$FUNC
    );
    static final FunctionDescriptor g_option_group_add_entries$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_add_entries$MH = RuntimeHelper.downcallHandle(
        "g_option_group_add_entries",
        constants$253.g_option_group_add_entries$FUNC
    );
    static final FunctionDescriptor g_option_group_set_translate_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_set_translate_func$MH = RuntimeHelper.downcallHandle(
        "g_option_group_set_translate_func",
        constants$253.g_option_group_set_translate_func$FUNC
    );
    static final FunctionDescriptor g_option_group_set_translation_domain$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_set_translation_domain$MH = RuntimeHelper.downcallHandle(
        "g_option_group_set_translation_domain",
        constants$253.g_option_group_set_translation_domain$FUNC
    );
}


