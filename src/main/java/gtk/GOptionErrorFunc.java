// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GOptionErrorFunc)(struct _GOptionContext* context,struct _GOptionGroup* group,void* data,struct _GError** error);
 * }
 */
public interface GOptionErrorFunc {

    void apply(java.lang.foreign.MemorySegment model, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GOptionErrorFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$248.GOptionErrorFunc_UP$MH, fi, constants$248.GOptionErrorFunc$FUNC, scope);
    }
    static GOptionErrorFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _model, java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$248.GOptionErrorFunc_DOWN$MH.invokeExact(symbol, _model, _path, _iter, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


