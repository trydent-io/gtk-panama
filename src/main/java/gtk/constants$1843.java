// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1843 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1843() {}
    static final FunctionDescriptor gtk_spin_button_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_spin_button_new$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_new",
        constants$1843.gtk_spin_button_new$FUNC
    );
    static final FunctionDescriptor gtk_spin_button_new_with_range$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_spin_button_new_with_range$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_new_with_range",
        constants$1843.gtk_spin_button_new_with_range$FUNC
    );
    static final FunctionDescriptor gtk_spin_button_set_adjustment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_spin_button_set_adjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_set_adjustment",
        constants$1843.gtk_spin_button_set_adjustment$FUNC
    );
    static final FunctionDescriptor gtk_spin_button_get_adjustment$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_spin_button_get_adjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_get_adjustment",
        constants$1843.gtk_spin_button_get_adjustment$FUNC
    );
    static final FunctionDescriptor gtk_spin_button_set_digits$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_spin_button_set_digits$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_set_digits",
        constants$1843.gtk_spin_button_set_digits$FUNC
    );
    static final FunctionDescriptor gtk_spin_button_get_digits$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_spin_button_get_digits$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_get_digits",
        constants$1843.gtk_spin_button_get_digits$FUNC
    );
}

