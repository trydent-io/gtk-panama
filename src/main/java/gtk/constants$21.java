// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$21 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$21() {}
    static final FunctionDescriptor g_array_set_clear_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_set_clear_func$MH = RuntimeHelper.downcallHandle(
        "g_array_set_clear_func",
        constants$21.g_array_set_clear_func$FUNC
    );
    static final FunctionDescriptor g_ptr_array_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_ptr_array_new$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_new",
        constants$21.g_ptr_array_new$FUNC
    );
    static final FunctionDescriptor g_ptr_array_new_with_free_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_new_with_free_func$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_new_with_free_func",
        constants$21.g_ptr_array_new_with_free_func$FUNC
    );
    static final FunctionDescriptor g_ptr_array_steal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_steal$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_steal",
        constants$21.g_ptr_array_steal$FUNC
    );
    static final FunctionDescriptor g_ptr_array_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_copy$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_copy",
        constants$21.g_ptr_array_copy$FUNC
    );
    static final FunctionDescriptor g_ptr_array_sized_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_ptr_array_sized_new$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_sized_new",
        constants$21.g_ptr_array_sized_new$FUNC
    );
}


