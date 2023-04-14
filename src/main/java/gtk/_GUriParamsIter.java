// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GUriParamsIter {
 *     gint dummy0;
 *     gpointer dummy1;
 *     gpointer dummy2;
 *     guint8 dummy3[256];
 * };
 * }
 */
public class _GUriParamsIter {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("dummy0"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("dummy1"),
        Constants$root.C_POINTER$LAYOUT.withName("dummy2"),
        MemoryLayout.sequenceLayout(256, Constants$root.C_CHAR$LAYOUT).withName("dummy3")
    ).withName("_GUriParamsIter");
    public static MemoryLayout $LAYOUT() {
        return _GUriParamsIter.$struct$LAYOUT;
    }
    static final VarHandle dummy0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy0"));
    public static VarHandle dummy0$VH() {
        return _GUriParamsIter.dummy0$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint dummy0;
     * }
     */
    public static int dummy0$get(MemorySegment seg) {
        return (int)_GUriParamsIter.dummy0$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint dummy0;
     * }
     */
    public static void dummy0$set(MemorySegment seg, int x) {
        _GUriParamsIter.dummy0$VH.set(seg, x);
    }
    public static int dummy0$get(MemorySegment seg, long index) {
        return (int)_GUriParamsIter.dummy0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy0$set(MemorySegment seg, long index, int x) {
        _GUriParamsIter.dummy0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy1"));
    public static VarHandle dummy1$VH() {
        return _GUriParamsIter.dummy1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy1;
     * }
     */
    public static MemorySegment dummy1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GUriParamsIter.dummy1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy1;
     * }
     */
    public static void dummy1$set(MemorySegment seg, MemorySegment x) {
        _GUriParamsIter.dummy1$VH.set(seg, x);
    }
    public static MemorySegment dummy1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GUriParamsIter.dummy1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy1$set(MemorySegment seg, long index, MemorySegment x) {
        _GUriParamsIter.dummy1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy2"));
    public static VarHandle dummy2$VH() {
        return _GUriParamsIter.dummy2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy2;
     * }
     */
    public static MemorySegment dummy2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GUriParamsIter.dummy2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy2;
     * }
     */
    public static void dummy2$set(MemorySegment seg, MemorySegment x) {
        _GUriParamsIter.dummy2$VH.set(seg, x);
    }
    public static MemorySegment dummy2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GUriParamsIter.dummy2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy2$set(MemorySegment seg, long index, MemorySegment x) {
        _GUriParamsIter.dummy2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dummy3$slice(MemorySegment seg) {
        return seg.asSlice(24, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


