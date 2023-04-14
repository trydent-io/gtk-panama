// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GQueue {
 *     GList* head;
 *     GList* tail;
 *     guint length;
 * };
 * }
 */
public class _GQueue {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("head"),
        Constants$root.C_POINTER$LAYOUT.withName("tail"),
        Constants$root.C_INT$LAYOUT.withName("length"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GQueue");
    public static MemoryLayout $LAYOUT() {
        return _GQueue.$struct$LAYOUT;
    }
    static final VarHandle head$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("head"));
    public static VarHandle head$VH() {
        return _GQueue.head$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GList* head;
     * }
     */
    public static MemorySegment head$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GQueue.head$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GList* head;
     * }
     */
    public static void head$set(MemorySegment seg, MemorySegment x) {
        _GQueue.head$VH.set(seg, x);
    }
    public static MemorySegment head$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GQueue.head$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void head$set(MemorySegment seg, long index, MemorySegment x) {
        _GQueue.head$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tail"));
    public static VarHandle tail$VH() {
        return _GQueue.tail$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GList* tail;
     * }
     */
    public static MemorySegment tail$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GQueue.tail$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GList* tail;
     * }
     */
    public static void tail$set(MemorySegment seg, MemorySegment x) {
        _GQueue.tail$VH.set(seg, x);
    }
    public static MemorySegment tail$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GQueue.tail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tail$set(MemorySegment seg, long index, MemorySegment x) {
        _GQueue.tail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return _GQueue.length$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)_GQueue.length$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        _GQueue.length$VH.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)_GQueue.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        _GQueue.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


