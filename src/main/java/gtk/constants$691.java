// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$691 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$691() {}
    static final FunctionDescriptor g_menu_prepend_submenu$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_prepend_submenu$MH = RuntimeHelper.downcallHandle(
        "g_menu_prepend_submenu",
        constants$691.g_menu_prepend_submenu$FUNC
    );
    static final FunctionDescriptor g_menu_append_submenu$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_append_submenu$MH = RuntimeHelper.downcallHandle(
        "g_menu_append_submenu",
        constants$691.g_menu_append_submenu$FUNC
    );
    static final FunctionDescriptor g_menu_item_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_menu_item_get_type$MH = RuntimeHelper.downcallHandle(
        "g_menu_item_get_type",
        constants$691.g_menu_item_get_type$FUNC
    );
    static final FunctionDescriptor g_menu_item_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_item_new$MH = RuntimeHelper.downcallHandle(
        "g_menu_item_new",
        constants$691.g_menu_item_new$FUNC
    );
    static final FunctionDescriptor g_menu_item_new_from_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_menu_item_new_from_model$MH = RuntimeHelper.downcallHandle(
        "g_menu_item_new_from_model",
        constants$691.g_menu_item_new_from_model$FUNC
    );
    static final FunctionDescriptor g_menu_item_new_submenu$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_menu_item_new_submenu$MH = RuntimeHelper.downcallHandle(
        "g_menu_item_new_submenu",
        constants$691.g_menu_item_new_submenu$FUNC
    );
}


