// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GIOFunc)(struct _GIOChannel* source,enum  condition,void* data);
 * }
 */
public interface GIOFunc {

    int apply(java.lang.foreign.MemorySegment datagram_based, int condition, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GIOFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$196.GIOFunc_UP$MH, fi, constants$196.GIOFunc$FUNC, scope);
    }
    static GIOFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _datagram_based, int _condition, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$196.GIOFunc_DOWN$MH.invokeExact(symbol, _datagram_based, _condition, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


