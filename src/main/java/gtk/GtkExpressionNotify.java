// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GtkExpressionNotify)(void* user_data);
 * }
 */
public interface GtkExpressionNotify {

    void apply(java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkExpressionNotify fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1398.GtkExpressionNotify_UP$MH, fi, constants$1398.GtkExpressionNotify$FUNC, scope);
    }
    static GtkExpressionNotify ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1398.GtkExpressionNotify_DOWN$MH.invokeExact(symbol, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

