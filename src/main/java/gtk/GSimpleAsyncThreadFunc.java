// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GSimpleAsyncThreadFunc)(struct _GSimpleAsyncResult* res,struct _GObject* object,struct _GCancellable* cancellable);
 * }
 */
public interface GSimpleAsyncThreadFunc {

    void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GSimpleAsyncThreadFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$463.GSimpleAsyncThreadFunc_UP$MH, fi, constants$463.GSimpleAsyncThreadFunc$FUNC, scope);
    }
    static GSimpleAsyncThreadFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$463.GSimpleAsyncThreadFunc_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


