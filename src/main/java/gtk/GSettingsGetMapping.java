// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GSettingsGetMapping)(struct _GVariant* value,void** result,void* user_data);
 * }
 */
public interface GSettingsGetMapping {

    int apply(java.lang.foreign.MemorySegment row1, java.lang.foreign.MemorySegment row2, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GSettingsGetMapping fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$741.GSettingsGetMapping_UP$MH, fi, constants$741.GSettingsGetMapping$FUNC, scope);
    }
    static GSettingsGetMapping ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _row1, java.lang.foreign.MemorySegment _row2, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$741.GSettingsGetMapping_DOWN$MH.invokeExact(symbol, _row1, _row2, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


