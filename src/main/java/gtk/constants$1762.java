// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1762 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1762() {}
    static final FunctionDescriptor gtk_print_settings_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_print_settings_new$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_new",
        constants$1762.gtk_print_settings_new$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_copy$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_copy",
        constants$1762.gtk_print_settings_copy$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_new_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_new_from_file$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_new_from_file",
        constants$1762.gtk_print_settings_new_from_file$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_load_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_load_file$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_load_file",
        constants$1762.gtk_print_settings_load_file$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_to_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_to_file$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_to_file",
        constants$1762.gtk_print_settings_to_file$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_new_from_key_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_new_from_key_file$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_new_from_key_file",
        constants$1762.gtk_print_settings_new_from_key_file$FUNC
    );
}


