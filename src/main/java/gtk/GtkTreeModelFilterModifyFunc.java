// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GtkTreeModelFilterModifyFunc)(struct _GtkTreeModel* model,struct _GtkTreeIter* iter,struct _GValue* value,int column,void* data);
 * }
 */
public interface GtkTreeModelFilterModifyFunc {

    void apply(java.lang.foreign.MemorySegment model, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment value, int column, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GtkTreeModelFilterModifyFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1504.GtkTreeModelFilterModifyFunc_UP$MH, fi, constants$1504.GtkTreeModelFilterModifyFunc$FUNC, scope);
    }
    static GtkTreeModelFilterModifyFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _model, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _value, int _column, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$1504.GtkTreeModelFilterModifyFunc_DOWN$MH.invokeExact(symbol, _model, _iter, _value, _column, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


