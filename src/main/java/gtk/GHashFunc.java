// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned int (*GHashFunc)(void* key);
 * }
 */
public interface GHashFunc {

    int apply(java.lang.foreign.MemorySegment key);
    static MemorySegment allocate(GHashFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$7.GHashFunc_UP$MH, fi, constants$7.GHashFunc$FUNC, scope);
    }
    static GHashFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _key) -> {
            try {
                return (int)constants$7.GHashFunc_DOWN$MH.invokeExact(symbol, _key);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


