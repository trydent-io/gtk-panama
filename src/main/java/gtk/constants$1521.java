// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1521 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1521() {}
    static final FunctionDescriptor gtk_entry_get_icon_activatable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_get_icon_activatable$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_icon_activatable",
        constants$1521.gtk_entry_get_icon_activatable$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_icon_sensitive$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_icon_sensitive$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_icon_sensitive",
        constants$1521.gtk_entry_set_icon_sensitive$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_icon_sensitive$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_get_icon_sensitive$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_icon_sensitive",
        constants$1521.gtk_entry_get_icon_sensitive$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_icon_at_pos$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_get_icon_at_pos$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_icon_at_pos",
        constants$1521.gtk_entry_get_icon_at_pos$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_icon_tooltip_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_set_icon_tooltip_text$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_icon_tooltip_text",
        constants$1521.gtk_entry_set_icon_tooltip_text$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_icon_tooltip_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_get_icon_tooltip_text$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_icon_tooltip_text",
        constants$1521.gtk_entry_get_icon_tooltip_text$FUNC
    );
}


