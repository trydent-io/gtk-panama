// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*pthread_once$__init_routine)();
 * }
 */
public interface pthread_once$__init_routine {

    void apply();
    static MemorySegment allocate(pthread_once$__init_routine fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$352.pthread_once$__init_routine_UP$MH, fi, constants$352.pthread_once$__init_routine$FUNC, scope);
    }
    static pthread_once$__init_routine ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                constants$352.pthread_once$__init_routine_DOWN$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


