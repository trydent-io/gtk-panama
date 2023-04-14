// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GFileProgressCallback)(long current_num_bytes,long total_num_bytes,void* user_data);
 * }
 */
public interface GFileProgressCallback {

    void apply(long current_num_bytes, long total_num_bytes, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GFileProgressCallback fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$461.GFileProgressCallback_UP$MH, fi, constants$461.GFileProgressCallback$FUNC, scope);
    }
    static GFileProgressCallback ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (long _current_num_bytes, long _total_num_bytes, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$461.GFileProgressCallback_DOWN$MH.invokeExact(symbol, _current_num_bytes, _total_num_bytes, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


