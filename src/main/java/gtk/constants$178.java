// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$178 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$178() {}
    static final FunctionDescriptor g_idle_add$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_idle_add$MH = RuntimeHelper.downcallHandle(
        "g_idle_add",
        constants$178.g_idle_add$FUNC
    );
    static final FunctionDescriptor g_idle_add_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_idle_add_full$MH = RuntimeHelper.downcallHandle(
        "g_idle_add_full",
        constants$178.g_idle_add_full$FUNC
    );
    static final FunctionDescriptor g_idle_remove_by_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_idle_remove_by_data$MH = RuntimeHelper.downcallHandle(
        "g_idle_remove_by_data",
        constants$178.g_idle_remove_by_data$FUNC
    );
    static final FunctionDescriptor g_main_context_invoke_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_invoke_full$MH = RuntimeHelper.downcallHandle(
        "g_main_context_invoke_full",
        constants$178.g_main_context_invoke_full$FUNC
    );
    static final FunctionDescriptor g_main_context_invoke$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_invoke$MH = RuntimeHelper.downcallHandle(
        "g_main_context_invoke",
        constants$178.g_main_context_invoke$FUNC
    );
    static final StructLayout g_timeout_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_timeout_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_timeout_funcs", constants$178.g_timeout_funcs$LAYOUT);
}

