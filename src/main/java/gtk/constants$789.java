// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$789 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$789() {}
    static final FunctionDescriptor g_test_dbus_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_test_dbus_new$MH = RuntimeHelper.downcallHandle(
        "g_test_dbus_new",
        constants$789.g_test_dbus_new$FUNC
    );
    static final FunctionDescriptor g_test_dbus_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_dbus_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_test_dbus_get_flags",
        constants$789.g_test_dbus_get_flags$FUNC
    );
    static final FunctionDescriptor g_test_dbus_get_bus_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_dbus_get_bus_address$MH = RuntimeHelper.downcallHandle(
        "g_test_dbus_get_bus_address",
        constants$789.g_test_dbus_get_bus_address$FUNC
    );
    static final FunctionDescriptor g_test_dbus_add_service_dir$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_dbus_add_service_dir$MH = RuntimeHelper.downcallHandle(
        "g_test_dbus_add_service_dir",
        constants$789.g_test_dbus_add_service_dir$FUNC
    );
    static final FunctionDescriptor g_test_dbus_up$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_dbus_up$MH = RuntimeHelper.downcallHandle(
        "g_test_dbus_up",
        constants$789.g_test_dbus_up$FUNC
    );
    static final FunctionDescriptor g_test_dbus_stop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_dbus_stop$MH = RuntimeHelper.downcallHandle(
        "g_test_dbus_stop",
        constants$789.g_test_dbus_stop$FUNC
    );
}


