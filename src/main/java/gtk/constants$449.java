// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$449 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$449() {}
    static final FunctionDescriptor g_type_module_register_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_module_register_type$MH = RuntimeHelper.downcallHandle(
        "g_type_module_register_type",
        constants$449.g_type_module_register_type$FUNC
    );
    static final FunctionDescriptor g_type_module_add_interface$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_module_add_interface$MH = RuntimeHelper.downcallHandle(
        "g_type_module_add_interface",
        constants$449.g_type_module_add_interface$FUNC
    );
    static final FunctionDescriptor g_type_module_register_enum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_module_register_enum$MH = RuntimeHelper.downcallHandle(
        "g_type_module_register_enum",
        constants$449.g_type_module_register_enum$FUNC
    );
    static final FunctionDescriptor g_type_module_register_flags$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_module_register_flags$MH = RuntimeHelper.downcallHandle(
        "g_type_module_register_flags",
        constants$449.g_type_module_register_flags$FUNC
    );
    static final FunctionDescriptor GTypePluginUse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GTypePluginUse_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTypePluginUse_UP$MH = RuntimeHelper.upcallHandle(GTypePluginUse.class, "apply", constants$449.GTypePluginUse_UP$FUNC);
    static final FunctionDescriptor GTypePluginUse_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTypePluginUse_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$449.GTypePluginUse_DOWN$FUNC
    );
}


