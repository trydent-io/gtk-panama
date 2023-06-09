// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GStaticRWLock {
 *     GStaticMutex mutex;
 *     GCond* read_cond;
 *     GCond* write_cond;
 *     guint read_counter;
 *     gboolean have_writer;
 *     guint want_to_read;
 *     guint want_to_write;
 * };
 * }
 */
public class _GStaticRWLock {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("mutex"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_INT$LAYOUT.withName("__lock"),
                    Constants$root.C_INT$LAYOUT.withName("__count"),
                    Constants$root.C_INT$LAYOUT.withName("__owner"),
                    Constants$root.C_INT$LAYOUT.withName("__nusers"),
                    Constants$root.C_INT$LAYOUT.withName("__kind"),
                    Constants$root.C_SHORT$LAYOUT.withName("__spins"),
                    Constants$root.C_SHORT$LAYOUT.withName("__elision"),
                    MemoryLayout.structLayout(
                        Constants$root.C_POINTER$LAYOUT.withName("__prev"),
                        Constants$root.C_POINTER$LAYOUT.withName("__next")
                    ).withName("__list")
                ).withName("__data"),
                MemoryLayout.sequenceLayout(40, Constants$root.C_CHAR$LAYOUT).withName("__size"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("__align")
            ).withName("unused")
        ).withName("mutex"),
        Constants$root.C_POINTER$LAYOUT.withName("read_cond"),
        Constants$root.C_POINTER$LAYOUT.withName("write_cond"),
        Constants$root.C_INT$LAYOUT.withName("read_counter"),
        Constants$root.C_INT$LAYOUT.withName("have_writer"),
        Constants$root.C_INT$LAYOUT.withName("want_to_read"),
        Constants$root.C_INT$LAYOUT.withName("want_to_write")
    ).withName("_GStaticRWLock");
    public static MemoryLayout $LAYOUT() {
        return _GStaticRWLock.$struct$LAYOUT;
    }
    public static MemorySegment mutex$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    static final VarHandle read_cond$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("read_cond"));
    public static VarHandle read_cond$VH() {
        return _GStaticRWLock.read_cond$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GCond* read_cond;
     * }
     */
    public static MemorySegment read_cond$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GStaticRWLock.read_cond$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GCond* read_cond;
     * }
     */
    public static void read_cond$set(MemorySegment seg, MemorySegment x) {
        _GStaticRWLock.read_cond$VH.set(seg, x);
    }
    public static MemorySegment read_cond$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GStaticRWLock.read_cond$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void read_cond$set(MemorySegment seg, long index, MemorySegment x) {
        _GStaticRWLock.read_cond$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle write_cond$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("write_cond"));
    public static VarHandle write_cond$VH() {
        return _GStaticRWLock.write_cond$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GCond* write_cond;
     * }
     */
    public static MemorySegment write_cond$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GStaticRWLock.write_cond$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GCond* write_cond;
     * }
     */
    public static void write_cond$set(MemorySegment seg, MemorySegment x) {
        _GStaticRWLock.write_cond$VH.set(seg, x);
    }
    public static MemorySegment write_cond$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GStaticRWLock.write_cond$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void write_cond$set(MemorySegment seg, long index, MemorySegment x) {
        _GStaticRWLock.write_cond$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle read_counter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("read_counter"));
    public static VarHandle read_counter$VH() {
        return _GStaticRWLock.read_counter$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint read_counter;
     * }
     */
    public static int read_counter$get(MemorySegment seg) {
        return (int)_GStaticRWLock.read_counter$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint read_counter;
     * }
     */
    public static void read_counter$set(MemorySegment seg, int x) {
        _GStaticRWLock.read_counter$VH.set(seg, x);
    }
    public static int read_counter$get(MemorySegment seg, long index) {
        return (int)_GStaticRWLock.read_counter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void read_counter$set(MemorySegment seg, long index, int x) {
        _GStaticRWLock.read_counter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle have_writer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("have_writer"));
    public static VarHandle have_writer$VH() {
        return _GStaticRWLock.have_writer$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean have_writer;
     * }
     */
    public static int have_writer$get(MemorySegment seg) {
        return (int)_GStaticRWLock.have_writer$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean have_writer;
     * }
     */
    public static void have_writer$set(MemorySegment seg, int x) {
        _GStaticRWLock.have_writer$VH.set(seg, x);
    }
    public static int have_writer$get(MemorySegment seg, long index) {
        return (int)_GStaticRWLock.have_writer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void have_writer$set(MemorySegment seg, long index, int x) {
        _GStaticRWLock.have_writer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle want_to_read$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("want_to_read"));
    public static VarHandle want_to_read$VH() {
        return _GStaticRWLock.want_to_read$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint want_to_read;
     * }
     */
    public static int want_to_read$get(MemorySegment seg) {
        return (int)_GStaticRWLock.want_to_read$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint want_to_read;
     * }
     */
    public static void want_to_read$set(MemorySegment seg, int x) {
        _GStaticRWLock.want_to_read$VH.set(seg, x);
    }
    public static int want_to_read$get(MemorySegment seg, long index) {
        return (int)_GStaticRWLock.want_to_read$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void want_to_read$set(MemorySegment seg, long index, int x) {
        _GStaticRWLock.want_to_read$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle want_to_write$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("want_to_write"));
    public static VarHandle want_to_write$VH() {
        return _GStaticRWLock.want_to_write$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint want_to_write;
     * }
     */
    public static int want_to_write$get(MemorySegment seg) {
        return (int)_GStaticRWLock.want_to_write$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint want_to_write;
     * }
     */
    public static void want_to_write$set(MemorySegment seg, int x) {
        _GStaticRWLock.want_to_write$VH.set(seg, x);
    }
    public static int want_to_write$get(MemorySegment seg, long index) {
        return (int)_GStaticRWLock.want_to_write$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void want_to_write$set(MemorySegment seg, long index, int x) {
        _GStaticRWLock.want_to_write$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


