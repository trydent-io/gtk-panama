// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GtkFlowBoxSortFunc)(struct _GtkFlowBoxChild* child1,struct _GtkFlowBoxChild* child2,void* user_data);
 * }
 */
public interface GtkFlowBoxSortFunc {

    int apply(java.lang.foreign.MemorySegment row1, java.lang.foreign.MemorySegment row2, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkFlowBoxSortFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1622.GtkFlowBoxSortFunc_UP$MH, fi, constants$1622.GtkFlowBoxSortFunc$FUNC, scope);
    }
    static GtkFlowBoxSortFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _row1, java.lang.foreign.MemorySegment _row2, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1622.GtkFlowBoxSortFunc_DOWN$MH.invokeExact(symbol, _row1, _row2, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


