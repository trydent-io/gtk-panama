// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$369 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$369() {}
    static final FunctionDescriptor g_static_rw_lock_writer_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_writer_lock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_writer_lock",
        constants$369.g_static_rw_lock_writer_lock$FUNC
    );
    static final FunctionDescriptor g_static_rw_lock_writer_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_writer_trylock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_writer_trylock",
        constants$369.g_static_rw_lock_writer_trylock$FUNC
    );
    static final FunctionDescriptor g_static_rw_lock_writer_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_writer_unlock$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_writer_unlock",
        constants$369.g_static_rw_lock_writer_unlock$FUNC
    );
    static final FunctionDescriptor g_static_rw_lock_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rw_lock_free$MH = RuntimeHelper.downcallHandle(
        "g_static_rw_lock_free",
        constants$369.g_static_rw_lock_free$FUNC
    );
    static final FunctionDescriptor g_private_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_private_new$MH = RuntimeHelper.downcallHandle(
        "g_private_new",
        constants$369.g_private_new$FUNC
    );
    static final FunctionDescriptor g_static_private_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_private_init$MH = RuntimeHelper.downcallHandle(
        "g_static_private_init",
        constants$369.g_static_private_init$FUNC
    );
}


