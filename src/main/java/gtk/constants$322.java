// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$322 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$322() {}
    static final FunctionDescriptor GTraverseFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTraverseFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$322.GTraverseFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GTraverseNodeFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GTraverseNodeFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTraverseNodeFunc_UP$MH = RuntimeHelper.upcallHandle(GTraverseNodeFunc.class, "apply", constants$322.GTraverseNodeFunc_UP$FUNC);
    static final FunctionDescriptor GTraverseNodeFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTraverseNodeFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$322.GTraverseNodeFunc_DOWN$FUNC
    );
    static final FunctionDescriptor g_tree_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_new$MH = RuntimeHelper.downcallHandle(
        "g_tree_new",
        constants$322.g_tree_new$FUNC
    );
    static final FunctionDescriptor g_tree_new_with_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_new_with_data$MH = RuntimeHelper.downcallHandle(
        "g_tree_new_with_data",
        constants$322.g_tree_new_with_data$FUNC
    );
    static final FunctionDescriptor g_tree_new_full$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_new_full$MH = RuntimeHelper.downcallHandle(
        "g_tree_new_full",
        constants$322.g_tree_new_full$FUNC
    );
}


