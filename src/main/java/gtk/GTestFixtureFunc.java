// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GTestFixtureFunc)(void* fixture,void* user_data);
 * }
 */
public interface GTestFixtureFunc {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GTestFixtureFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$305.GTestFixtureFunc_UP$MH, fi, constants$305.GTestFixtureFunc$FUNC, scope);
    }
    static GTestFixtureFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$305.GTestFixtureFunc_DOWN$MH.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


