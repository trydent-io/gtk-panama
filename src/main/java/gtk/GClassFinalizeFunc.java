// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GClassFinalizeFunc)(void* g_class,void* class_data);
 * }
 */
public interface GClassFinalizeFunc {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GClassFinalizeFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$377.GClassFinalizeFunc_UP$MH, fi, constants$377.GClassFinalizeFunc$FUNC, scope);
    }
    static GClassFinalizeFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$377.GClassFinalizeFunc_DOWN$MH.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


