// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GStaticPrivate {
 *     guint index;
 * };
 * }
 */
public class _GStaticPrivate {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("index")
    ).withName("_GStaticPrivate");
    public static MemoryLayout $LAYOUT() {
        return _GStaticPrivate.$struct$LAYOUT;
    }
    static final VarHandle index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("index"));
    public static VarHandle index$VH() {
        return _GStaticPrivate.index$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint index;
     * }
     */
    public static int index$get(MemorySegment seg) {
        return (int)_GStaticPrivate.index$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint index;
     * }
     */
    public static void index$set(MemorySegment seg, int x) {
        _GStaticPrivate.index$VH.set(seg, x);
    }
    public static int index$get(MemorySegment seg, long index) {
        return (int)_GStaticPrivate.index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void index$set(MemorySegment seg, long index, int x) {
        _GStaticPrivate.index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


