// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$437 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$437() {}
    static final FunctionDescriptor g_binding_unbind$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_binding_unbind$MH = RuntimeHelper.downcallHandle(
        "g_binding_unbind",
        constants$437.g_binding_unbind$FUNC
    );
    static final FunctionDescriptor g_object_bind_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_object_bind_property$MH = RuntimeHelper.downcallHandle(
        "g_object_bind_property",
        constants$437.g_object_bind_property$FUNC
    );
    static final FunctionDescriptor g_object_bind_property_full$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_bind_property_full$MH = RuntimeHelper.downcallHandle(
        "g_object_bind_property_full",
        constants$437.g_object_bind_property_full$FUNC
    );
    static final FunctionDescriptor g_object_bind_property_with_closures$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_bind_property_with_closures$MH = RuntimeHelper.downcallHandle(
        "g_object_bind_property_with_closures",
        constants$437.g_object_bind_property_with_closures$FUNC
    );
    static final FunctionDescriptor g_binding_group_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_binding_group_get_type$MH = RuntimeHelper.downcallHandle(
        "g_binding_group_get_type",
        constants$437.g_binding_group_get_type$FUNC
    );
    static final FunctionDescriptor g_binding_group_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_binding_group_new$MH = RuntimeHelper.downcallHandle(
        "g_binding_group_new",
        constants$437.g_binding_group_new$FUNC
    );
}


