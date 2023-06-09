// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GHookFindFunc)(struct _GHook* hook,void* data);
 * }
 */
public interface GHookFindFunc {

    int apply(java.lang.foreign.MemorySegment row, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GHookFindFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$150.GHookFindFunc_UP$MH, fi, constants$150.GHookFindFunc$FUNC, scope);
    }
    static GHookFindFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _row, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$150.GHookFindFunc_DOWN$MH.invokeExact(symbol, _row, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


