// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GCond {
 *     gpointer p;
 *     guint i[2];
 * };
 * }
 */
public class _GCond {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("p"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("i")
    ).withName("_GCond");
    public static MemoryLayout $LAYOUT() {
        return _GCond.$struct$LAYOUT;
    }
    static final VarHandle p$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("p"));
    public static VarHandle p$VH() {
        return _GCond.p$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer p;
     * }
     */
    public static MemorySegment p$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCond.p$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer p;
     * }
     */
    public static void p$set(MemorySegment seg, MemorySegment x) {
        _GCond.p$VH.set(seg, x);
    }
    public static MemorySegment p$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCond.p$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void p$set(MemorySegment seg, long index, MemorySegment x) {
        _GCond.p$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment i$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


