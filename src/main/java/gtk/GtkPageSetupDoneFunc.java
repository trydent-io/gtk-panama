// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GtkPageSetupDoneFunc)(struct _GtkPageSetup* page_setup,void* data);
 * }
 */
public interface GtkPageSetupDoneFunc {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GtkPageSetupDoneFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1780.GtkPageSetupDoneFunc_UP$MH, fi, constants$1780.GtkPageSetupDoneFunc$FUNC, scope);
    }
    static GtkPageSetupDoneFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$1781.GtkPageSetupDoneFunc_DOWN$MH.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

