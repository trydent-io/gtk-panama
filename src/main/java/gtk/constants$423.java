// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$423 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$423() {}
    static final FunctionDescriptor GWeakNotify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GWeakNotify_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GWeakNotify_UP$MH = RuntimeHelper.upcallHandle(GWeakNotify.class, "apply", constants$423.GWeakNotify_UP$FUNC);
    static final FunctionDescriptor GWeakNotify_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GWeakNotify_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$423.GWeakNotify_DOWN$FUNC
    );
    static final FunctionDescriptor g_initially_unowned_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_initially_unowned_get_type$MH = RuntimeHelper.downcallHandle(
        "g_initially_unowned_get_type",
        constants$423.g_initially_unowned_get_type$FUNC
    );
    static final FunctionDescriptor g_object_class_install_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_install_property$MH = RuntimeHelper.downcallHandle(
        "g_object_class_install_property",
        constants$423.g_object_class_install_property$FUNC
    );
    static final FunctionDescriptor g_object_class_find_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_find_property$MH = RuntimeHelper.downcallHandle(
        "g_object_class_find_property",
        constants$423.g_object_class_find_property$FUNC
    );
    static final FunctionDescriptor g_object_class_list_properties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_class_list_properties$MH = RuntimeHelper.downcallHandle(
        "g_object_class_list_properties",
        constants$423.g_object_class_list_properties$FUNC
    );
}

