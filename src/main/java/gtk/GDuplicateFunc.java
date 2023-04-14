// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*GDuplicateFunc)(void* data,void* user_data);
 * }
 */
public interface GDuplicateFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment item, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GDuplicateFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$106.GDuplicateFunc_UP$MH, fi, constants$106.GDuplicateFunc$FUNC, scope);
    }
    static GDuplicateFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _item, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$106.GDuplicateFunc_DOWN$MH.invokeExact(symbol, _item, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

