// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1815 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1815() {}
    static final FunctionDescriptor gtk_settings_reset_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_settings_reset_property$MH = RuntimeHelper.downcallHandle(
        "gtk_settings_reset_property",
        constants$1815.gtk_settings_reset_property$FUNC
    );
    static final FunctionDescriptor gtk_shortcut_controller_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_shortcut_controller_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_shortcut_controller_get_type",
        constants$1815.gtk_shortcut_controller_get_type$FUNC
    );
    static final FunctionDescriptor gtk_shortcut_controller_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_shortcut_controller_new$MH = RuntimeHelper.downcallHandle(
        "gtk_shortcut_controller_new",
        constants$1815.gtk_shortcut_controller_new$FUNC
    );
    static final FunctionDescriptor gtk_shortcut_controller_new_for_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_shortcut_controller_new_for_model$MH = RuntimeHelper.downcallHandle(
        "gtk_shortcut_controller_new_for_model",
        constants$1815.gtk_shortcut_controller_new_for_model$FUNC
    );
    static final FunctionDescriptor gtk_shortcut_controller_set_mnemonics_modifiers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_shortcut_controller_set_mnemonics_modifiers$MH = RuntimeHelper.downcallHandle(
        "gtk_shortcut_controller_set_mnemonics_modifiers",
        constants$1815.gtk_shortcut_controller_set_mnemonics_modifiers$FUNC
    );
    static final FunctionDescriptor gtk_shortcut_controller_get_mnemonics_modifiers$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_shortcut_controller_get_mnemonics_modifiers$MH = RuntimeHelper.downcallHandle(
        "gtk_shortcut_controller_get_mnemonics_modifiers",
        constants$1815.gtk_shortcut_controller_get_mnemonics_modifiers$FUNC
    );
}

