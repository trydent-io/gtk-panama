// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1515 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1515() {}
    static final FunctionDescriptor gtk_entry_new_with_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_new_with_buffer$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_new_with_buffer",
        constants$1515.gtk_entry_new_with_buffer$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_buffer$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_buffer",
        constants$1515.gtk_entry_get_buffer$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_buffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_set_buffer$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_buffer",
        constants$1515.gtk_entry_set_buffer$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_visibility$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_visibility$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_visibility",
        constants$1515.gtk_entry_set_visibility$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_visibility$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_visibility$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_visibility",
        constants$1515.gtk_entry_get_visibility$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_invisible_char$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_invisible_char$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_invisible_char",
        constants$1515.gtk_entry_set_invisible_char$FUNC
    );
}

