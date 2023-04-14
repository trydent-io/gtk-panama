// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GDataForeachFunc)(unsigned int key_id,void* data,void* user_data);
 * }
 */
public interface GDataForeachFunc {

    void apply(int key_id, java.lang.foreign.MemorySegment data, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GDataForeachFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$105.GDataForeachFunc_UP$MH, fi, constants$105.GDataForeachFunc$FUNC, scope);
    }
    static GDataForeachFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int _key_id, java.lang.foreign.MemorySegment _data, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$105.GDataForeachFunc_DOWN$MH.invokeExact(symbol, _key_id, _data, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


