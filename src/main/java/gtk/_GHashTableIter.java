// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GHashTableIter {
 *     gpointer dummy1;
 *     gpointer dummy2;
 *     gpointer dummy3;
 *     int dummy4;
 *     gboolean dummy5;
 *     gpointer dummy6;
 * };
 * }
 */
public class _GHashTableIter {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("dummy1"),
        Constants$root.C_POINTER$LAYOUT.withName("dummy2"),
        Constants$root.C_POINTER$LAYOUT.withName("dummy3"),
        Constants$root.C_INT$LAYOUT.withName("dummy4"),
        Constants$root.C_INT$LAYOUT.withName("dummy5"),
        Constants$root.C_POINTER$LAYOUT.withName("dummy6")
    ).withName("_GHashTableIter");
    public static MemoryLayout $LAYOUT() {
        return _GHashTableIter.$struct$LAYOUT;
    }
    static final VarHandle dummy1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy1"));
    public static VarHandle dummy1$VH() {
        return _GHashTableIter.dummy1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy1;
     * }
     */
    public static MemorySegment dummy1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GHashTableIter.dummy1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy1;
     * }
     */
    public static void dummy1$set(MemorySegment seg, MemorySegment x) {
        _GHashTableIter.dummy1$VH.set(seg, x);
    }
    public static MemorySegment dummy1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GHashTableIter.dummy1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy1$set(MemorySegment seg, long index, MemorySegment x) {
        _GHashTableIter.dummy1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy2"));
    public static VarHandle dummy2$VH() {
        return _GHashTableIter.dummy2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy2;
     * }
     */
    public static MemorySegment dummy2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GHashTableIter.dummy2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy2;
     * }
     */
    public static void dummy2$set(MemorySegment seg, MemorySegment x) {
        _GHashTableIter.dummy2$VH.set(seg, x);
    }
    public static MemorySegment dummy2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GHashTableIter.dummy2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy2$set(MemorySegment seg, long index, MemorySegment x) {
        _GHashTableIter.dummy2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy3"));
    public static VarHandle dummy3$VH() {
        return _GHashTableIter.dummy3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy3;
     * }
     */
    public static MemorySegment dummy3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GHashTableIter.dummy3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy3;
     * }
     */
    public static void dummy3$set(MemorySegment seg, MemorySegment x) {
        _GHashTableIter.dummy3$VH.set(seg, x);
    }
    public static MemorySegment dummy3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GHashTableIter.dummy3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy3$set(MemorySegment seg, long index, MemorySegment x) {
        _GHashTableIter.dummy3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy4"));
    public static VarHandle dummy4$VH() {
        return _GHashTableIter.dummy4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy4;
     * }
     */
    public static int dummy4$get(MemorySegment seg) {
        return (int)_GHashTableIter.dummy4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy4;
     * }
     */
    public static void dummy4$set(MemorySegment seg, int x) {
        _GHashTableIter.dummy4$VH.set(seg, x);
    }
    public static int dummy4$get(MemorySegment seg, long index) {
        return (int)_GHashTableIter.dummy4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy4$set(MemorySegment seg, long index, int x) {
        _GHashTableIter.dummy4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy5"));
    public static VarHandle dummy5$VH() {
        return _GHashTableIter.dummy5$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean dummy5;
     * }
     */
    public static int dummy5$get(MemorySegment seg) {
        return (int)_GHashTableIter.dummy5$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean dummy5;
     * }
     */
    public static void dummy5$set(MemorySegment seg, int x) {
        _GHashTableIter.dummy5$VH.set(seg, x);
    }
    public static int dummy5$get(MemorySegment seg, long index) {
        return (int)_GHashTableIter.dummy5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy5$set(MemorySegment seg, long index, int x) {
        _GHashTableIter.dummy5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy6$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy6"));
    public static VarHandle dummy6$VH() {
        return _GHashTableIter.dummy6$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy6;
     * }
     */
    public static MemorySegment dummy6$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GHashTableIter.dummy6$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy6;
     * }
     */
    public static void dummy6$set(MemorySegment seg, MemorySegment x) {
        _GHashTableIter.dummy6$VH.set(seg, x);
    }
    public static MemorySegment dummy6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GHashTableIter.dummy6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy6$set(MemorySegment seg, long index, MemorySegment x) {
        _GHashTableIter.dummy6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


