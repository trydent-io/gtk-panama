// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GListModel* (*GtkTreeListModelCreateModelFunc)(void* item,void* user_data);
 * }
 */
public interface GtkTreeListModelCreateModelFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment item, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkTreeListModelCreateModelFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1914.GtkTreeListModelCreateModelFunc_UP$MH, fi, constants$1914.GtkTreeListModelCreateModelFunc$FUNC, scope);
    }
    static GtkTreeListModelCreateModelFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _item, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$1914.GtkTreeListModelCreateModelFunc_DOWN$MH.invokeExact(symbol, _item, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


