// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GdkContentDeserializeFunc)(struct _GdkContentDeserializer* deserializer);
 * }
 */
public interface GdkContentDeserializeFunc {

    void apply(java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GdkContentDeserializeFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1069.GdkContentDeserializeFunc_UP$MH, fi, constants$1069.GdkContentDeserializeFunc$FUNC, scope);
    }
    static GdkContentDeserializeFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1069.GdkContentDeserializeFunc_DOWN$MH.invokeExact(symbol, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

