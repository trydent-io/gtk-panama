// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GtkTreeModelFilterVisibleFunc)(struct _GtkTreeModel* model,struct _GtkTreeIter* iter,void* data);
 * }
 */
public interface GtkTreeModelFilterVisibleFunc {

    int apply(java.lang.foreign.MemorySegment row1, java.lang.foreign.MemorySegment row2, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkTreeModelFilterVisibleFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1503.GtkTreeModelFilterVisibleFunc_UP$MH, fi, constants$1503.GtkTreeModelFilterVisibleFunc$FUNC, scope);
    }
    static GtkTreeModelFilterVisibleFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _row1, java.lang.foreign.MemorySegment _row2, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1503.GtkTreeModelFilterVisibleFunc_DOWN$MH.invokeExact(symbol, _row1, _row2, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


