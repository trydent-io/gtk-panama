// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1753 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1753() {}
    static final FunctionDescriptor gtk_password_entry_set_show_peek_icon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_password_entry_set_show_peek_icon$MH = RuntimeHelper.downcallHandle(
        "gtk_password_entry_set_show_peek_icon",
        constants$1753.gtk_password_entry_set_show_peek_icon$FUNC
    );
    static final FunctionDescriptor gtk_password_entry_get_show_peek_icon$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_password_entry_get_show_peek_icon$MH = RuntimeHelper.downcallHandle(
        "gtk_password_entry_get_show_peek_icon",
        constants$1753.gtk_password_entry_get_show_peek_icon$FUNC
    );
    static final FunctionDescriptor gtk_password_entry_set_extra_menu$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_password_entry_set_extra_menu$MH = RuntimeHelper.downcallHandle(
        "gtk_password_entry_set_extra_menu",
        constants$1753.gtk_password_entry_set_extra_menu$FUNC
    );
    static final FunctionDescriptor gtk_password_entry_get_extra_menu$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_password_entry_get_extra_menu$MH = RuntimeHelper.downcallHandle(
        "gtk_password_entry_get_extra_menu",
        constants$1753.gtk_password_entry_get_extra_menu$FUNC
    );
    static final FunctionDescriptor gtk_password_entry_buffer_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_password_entry_buffer_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_password_entry_buffer_get_type",
        constants$1753.gtk_password_entry_buffer_get_type$FUNC
    );
    static final FunctionDescriptor gtk_password_entry_buffer_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_password_entry_buffer_new$MH = RuntimeHelper.downcallHandle(
        "gtk_password_entry_buffer_new",
        constants$1753.gtk_password_entry_buffer_new$FUNC
    );
}

