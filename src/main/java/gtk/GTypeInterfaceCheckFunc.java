// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GTypeInterfaceCheckFunc)(void* check_data,void* g_iface);
 * }
 */
public interface GTypeInterfaceCheckFunc {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GTypeInterfaceCheckFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$379.GTypeInterfaceCheckFunc_UP$MH, fi, constants$379.GTypeInterfaceCheckFunc$FUNC, scope);
    }
    static GTypeInterfaceCheckFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$379.GTypeInterfaceCheckFunc_DOWN$MH.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


