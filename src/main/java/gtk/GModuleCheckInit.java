// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * char* (*GModuleCheckInit)(struct _GModule* module);
 * }
 */
public interface GModuleCheckInit {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GModuleCheckInit fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$672.GModuleCheckInit_UP$MH, fi, constants$672.GModuleCheckInit$FUNC, scope);
    }
    static GModuleCheckInit ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$672.GModuleCheckInit_DOWN$MH.invokeExact(symbol, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

