// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1084 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1084() {}
    static final FunctionDescriptor gdk_device_tool_get_tool_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_tool_get_tool_type$MH = RuntimeHelper.downcallHandle(
        "gdk_device_tool_get_tool_type",
        constants$1084.gdk_device_tool_get_tool_type$FUNC
    );
    static final FunctionDescriptor gdk_device_tool_get_axes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_tool_get_axes$MH = RuntimeHelper.downcallHandle(
        "gdk_device_tool_get_axes",
        constants$1084.gdk_device_tool_get_axes$FUNC
    );
    static final FunctionDescriptor gdk_device_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_device_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_type",
        constants$1084.gdk_device_get_type$FUNC
    );
    static final FunctionDescriptor gdk_device_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_name$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_name",
        constants$1084.gdk_device_get_name$FUNC
    );
    static final FunctionDescriptor gdk_device_get_vendor_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_vendor_id$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_vendor_id",
        constants$1084.gdk_device_get_vendor_id$FUNC
    );
    static final FunctionDescriptor gdk_device_get_product_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_product_id$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_product_id",
        constants$1084.gdk_device_get_product_id$FUNC
    );
}

