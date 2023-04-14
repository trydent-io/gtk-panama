// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GPollableSourceFunc)(struct _GObject* pollable_stream,void* user_data);
 * }
 */
public interface GPollableSourceFunc {

    int apply(java.lang.foreign.MemorySegment row, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GPollableSourceFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$464.GPollableSourceFunc_UP$MH, fi, constants$464.GPollableSourceFunc$FUNC, scope);
    }
    static GPollableSourceFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _row, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$464.GPollableSourceFunc_DOWN$MH.invokeExact(symbol, _row, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


