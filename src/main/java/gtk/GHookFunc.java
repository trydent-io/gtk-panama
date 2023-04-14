// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GHookFunc)(void* data);
 * }
 */
public interface GHookFunc {

    void apply(java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GHookFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$151.GHookFunc_UP$MH, fi, constants$151.GHookFunc$FUNC, scope);
    }
    static GHookFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$151.GHookFunc_DOWN$MH.invokeExact(symbol, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


