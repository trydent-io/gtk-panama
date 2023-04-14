// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoAttrFloat {
 *     PangoAttribute attr;
 *     double value;
 * };
 * }
 */
public class _PangoAttrFloat {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("klass"),
            Constants$root.C_INT$LAYOUT.withName("start_index"),
            Constants$root.C_INT$LAYOUT.withName("end_index")
        ).withName("attr"),
        Constants$root.C_DOUBLE$LAYOUT.withName("value")
    ).withName("_PangoAttrFloat");
    public static MemoryLayout $LAYOUT() {
        return _PangoAttrFloat.$struct$LAYOUT;
    }
    public static MemorySegment attr$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _PangoAttrFloat.value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double value;
     * }
     */
    public static double value$get(MemorySegment seg) {
        return (double)_PangoAttrFloat.value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double value;
     * }
     */
    public static void value$set(MemorySegment seg, double x) {
        _PangoAttrFloat.value$VH.set(seg, x);
    }
    public static double value$get(MemorySegment seg, long index) {
        return (double)_PangoAttrFloat.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, double x) {
        _PangoAttrFloat.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


