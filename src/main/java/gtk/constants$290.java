// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$290 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$290() {}
    static final FunctionDescriptor GSpawnChildSetupFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GSpawnChildSetupFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSpawnChildSetupFunc_UP$MH = RuntimeHelper.upcallHandle(GSpawnChildSetupFunc.class, "apply", constants$290.GSpawnChildSetupFunc_UP$FUNC);
    static final FunctionDescriptor GSpawnChildSetupFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSpawnChildSetupFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$290.GSpawnChildSetupFunc_DOWN$FUNC
    );
    static final FunctionDescriptor g_spawn_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_spawn_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_spawn_error_quark",
        constants$290.g_spawn_error_quark$FUNC
    );
    static final FunctionDescriptor g_spawn_exit_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_spawn_exit_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_spawn_exit_error_quark",
        constants$290.g_spawn_exit_error_quark$FUNC
    );
    static final FunctionDescriptor g_spawn_async$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_spawn_async$MH = RuntimeHelper.downcallHandle(
        "g_spawn_async",
        constants$290.g_spawn_async$FUNC
    );
    static final FunctionDescriptor g_spawn_async_with_pipes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_spawn_async_with_pipes$MH = RuntimeHelper.downcallHandle(
        "g_spawn_async_with_pipes",
        constants$290.g_spawn_async_with_pipes$FUNC
    );
}


