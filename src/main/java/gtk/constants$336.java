// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$336 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$336() {}
    static final FunctionDescriptor g_mem_chunk_clean$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mem_chunk_clean$MH = RuntimeHelper.downcallHandle(
        "g_mem_chunk_clean",
        constants$336.g_mem_chunk_clean$FUNC
    );
    static final FunctionDescriptor g_mem_chunk_reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mem_chunk_reset$MH = RuntimeHelper.downcallHandle(
        "g_mem_chunk_reset",
        constants$336.g_mem_chunk_reset$FUNC
    );
    static final FunctionDescriptor g_mem_chunk_print$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mem_chunk_print$MH = RuntimeHelper.downcallHandle(
        "g_mem_chunk_print",
        constants$336.g_mem_chunk_print$FUNC
    );
    static final FunctionDescriptor g_mem_chunk_info$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_mem_chunk_info$MH = RuntimeHelper.downcallHandle(
        "g_mem_chunk_info",
        constants$336.g_mem_chunk_info$FUNC
    );
    static final FunctionDescriptor g_blow_chunks$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_blow_chunks$MH = RuntimeHelper.downcallHandle(
        "g_blow_chunks",
        constants$336.g_blow_chunks$FUNC
    );
    static final FunctionDescriptor g_allocator_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_allocator_new$MH = RuntimeHelper.downcallHandle(
        "g_allocator_new",
        constants$336.g_allocator_new$FUNC
    );
}

