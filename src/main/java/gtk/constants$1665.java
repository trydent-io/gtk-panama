// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1665 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1665() {}
    static final FunctionDescriptor gtk_icon_view_set_margin$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_view_set_margin$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_set_margin",
        constants$1665.gtk_icon_view_set_margin$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_margin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_margin$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_margin",
        constants$1665.gtk_icon_view_get_margin$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_set_item_padding$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_view_set_item_padding$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_set_item_padding",
        constants$1665.gtk_icon_view_set_item_padding$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_item_padding$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_item_padding$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_item_padding",
        constants$1665.gtk_icon_view_get_item_padding$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_path_at_pos$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_path_at_pos$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_path_at_pos",
        constants$1665.gtk_icon_view_get_path_at_pos$FUNC
    );
    static final FunctionDescriptor gtk_icon_view_get_item_at_pos$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_item_at_pos$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_item_at_pos",
        constants$1665.gtk_icon_view_get_item_at_pos$FUNC
    );
}

