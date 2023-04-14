// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkTextIter {
 *     gpointer dummy1;
 *     gpointer dummy2;
 *     int dummy3;
 *     int dummy4;
 *     int dummy5;
 *     int dummy6;
 *     int dummy7;
 *     int dummy8;
 *     gpointer dummy9;
 *     gpointer dummy10;
 *     int dummy11;
 *     int dummy12;
 *     int dummy13;
 *     gpointer dummy14;
 * };
 * }
 */
public class _GtkTextIter {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("dummy1"),
        Constants$root.C_POINTER$LAYOUT.withName("dummy2"),
        Constants$root.C_INT$LAYOUT.withName("dummy3"),
        Constants$root.C_INT$LAYOUT.withName("dummy4"),
        Constants$root.C_INT$LAYOUT.withName("dummy5"),
        Constants$root.C_INT$LAYOUT.withName("dummy6"),
        Constants$root.C_INT$LAYOUT.withName("dummy7"),
        Constants$root.C_INT$LAYOUT.withName("dummy8"),
        Constants$root.C_POINTER$LAYOUT.withName("dummy9"),
        Constants$root.C_POINTER$LAYOUT.withName("dummy10"),
        Constants$root.C_INT$LAYOUT.withName("dummy11"),
        Constants$root.C_INT$LAYOUT.withName("dummy12"),
        Constants$root.C_INT$LAYOUT.withName("dummy13"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("dummy14")
    ).withName("_GtkTextIter");
    public static MemoryLayout $LAYOUT() {
        return _GtkTextIter.$struct$LAYOUT;
    }
    static final VarHandle dummy1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy1"));
    public static VarHandle dummy1$VH() {
        return _GtkTextIter.dummy1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy1;
     * }
     */
    public static MemorySegment dummy1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextIter.dummy1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy1;
     * }
     */
    public static void dummy1$set(MemorySegment seg, MemorySegment x) {
        _GtkTextIter.dummy1$VH.set(seg, x);
    }
    public static MemorySegment dummy1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextIter.dummy1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy1$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextIter.dummy1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy2"));
    public static VarHandle dummy2$VH() {
        return _GtkTextIter.dummy2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy2;
     * }
     */
    public static MemorySegment dummy2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextIter.dummy2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy2;
     * }
     */
    public static void dummy2$set(MemorySegment seg, MemorySegment x) {
        _GtkTextIter.dummy2$VH.set(seg, x);
    }
    public static MemorySegment dummy2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextIter.dummy2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy2$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextIter.dummy2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy3"));
    public static VarHandle dummy3$VH() {
        return _GtkTextIter.dummy3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy3;
     * }
     */
    public static int dummy3$get(MemorySegment seg) {
        return (int)_GtkTextIter.dummy3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy3;
     * }
     */
    public static void dummy3$set(MemorySegment seg, int x) {
        _GtkTextIter.dummy3$VH.set(seg, x);
    }
    public static int dummy3$get(MemorySegment seg, long index) {
        return (int)_GtkTextIter.dummy3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy3$set(MemorySegment seg, long index, int x) {
        _GtkTextIter.dummy3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy4"));
    public static VarHandle dummy4$VH() {
        return _GtkTextIter.dummy4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy4;
     * }
     */
    public static int dummy4$get(MemorySegment seg) {
        return (int)_GtkTextIter.dummy4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy4;
     * }
     */
    public static void dummy4$set(MemorySegment seg, int x) {
        _GtkTextIter.dummy4$VH.set(seg, x);
    }
    public static int dummy4$get(MemorySegment seg, long index) {
        return (int)_GtkTextIter.dummy4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy4$set(MemorySegment seg, long index, int x) {
        _GtkTextIter.dummy4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy5"));
    public static VarHandle dummy5$VH() {
        return _GtkTextIter.dummy5$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy5;
     * }
     */
    public static int dummy5$get(MemorySegment seg) {
        return (int)_GtkTextIter.dummy5$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy5;
     * }
     */
    public static void dummy5$set(MemorySegment seg, int x) {
        _GtkTextIter.dummy5$VH.set(seg, x);
    }
    public static int dummy5$get(MemorySegment seg, long index) {
        return (int)_GtkTextIter.dummy5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy5$set(MemorySegment seg, long index, int x) {
        _GtkTextIter.dummy5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy6$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy6"));
    public static VarHandle dummy6$VH() {
        return _GtkTextIter.dummy6$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy6;
     * }
     */
    public static int dummy6$get(MemorySegment seg) {
        return (int)_GtkTextIter.dummy6$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy6;
     * }
     */
    public static void dummy6$set(MemorySegment seg, int x) {
        _GtkTextIter.dummy6$VH.set(seg, x);
    }
    public static int dummy6$get(MemorySegment seg, long index) {
        return (int)_GtkTextIter.dummy6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy6$set(MemorySegment seg, long index, int x) {
        _GtkTextIter.dummy6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy7$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy7"));
    public static VarHandle dummy7$VH() {
        return _GtkTextIter.dummy7$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy7;
     * }
     */
    public static int dummy7$get(MemorySegment seg) {
        return (int)_GtkTextIter.dummy7$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy7;
     * }
     */
    public static void dummy7$set(MemorySegment seg, int x) {
        _GtkTextIter.dummy7$VH.set(seg, x);
    }
    public static int dummy7$get(MemorySegment seg, long index) {
        return (int)_GtkTextIter.dummy7$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy7$set(MemorySegment seg, long index, int x) {
        _GtkTextIter.dummy7$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy8$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy8"));
    public static VarHandle dummy8$VH() {
        return _GtkTextIter.dummy8$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy8;
     * }
     */
    public static int dummy8$get(MemorySegment seg) {
        return (int)_GtkTextIter.dummy8$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy8;
     * }
     */
    public static void dummy8$set(MemorySegment seg, int x) {
        _GtkTextIter.dummy8$VH.set(seg, x);
    }
    public static int dummy8$get(MemorySegment seg, long index) {
        return (int)_GtkTextIter.dummy8$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy8$set(MemorySegment seg, long index, int x) {
        _GtkTextIter.dummy8$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy9$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy9"));
    public static VarHandle dummy9$VH() {
        return _GtkTextIter.dummy9$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy9;
     * }
     */
    public static MemorySegment dummy9$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextIter.dummy9$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy9;
     * }
     */
    public static void dummy9$set(MemorySegment seg, MemorySegment x) {
        _GtkTextIter.dummy9$VH.set(seg, x);
    }
    public static MemorySegment dummy9$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextIter.dummy9$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy9$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextIter.dummy9$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy10$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy10"));
    public static VarHandle dummy10$VH() {
        return _GtkTextIter.dummy10$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy10;
     * }
     */
    public static MemorySegment dummy10$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextIter.dummy10$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy10;
     * }
     */
    public static void dummy10$set(MemorySegment seg, MemorySegment x) {
        _GtkTextIter.dummy10$VH.set(seg, x);
    }
    public static MemorySegment dummy10$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextIter.dummy10$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy10$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextIter.dummy10$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy11$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy11"));
    public static VarHandle dummy11$VH() {
        return _GtkTextIter.dummy11$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy11;
     * }
     */
    public static int dummy11$get(MemorySegment seg) {
        return (int)_GtkTextIter.dummy11$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy11;
     * }
     */
    public static void dummy11$set(MemorySegment seg, int x) {
        _GtkTextIter.dummy11$VH.set(seg, x);
    }
    public static int dummy11$get(MemorySegment seg, long index) {
        return (int)_GtkTextIter.dummy11$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy11$set(MemorySegment seg, long index, int x) {
        _GtkTextIter.dummy11$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy12$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy12"));
    public static VarHandle dummy12$VH() {
        return _GtkTextIter.dummy12$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy12;
     * }
     */
    public static int dummy12$get(MemorySegment seg) {
        return (int)_GtkTextIter.dummy12$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy12;
     * }
     */
    public static void dummy12$set(MemorySegment seg, int x) {
        _GtkTextIter.dummy12$VH.set(seg, x);
    }
    public static int dummy12$get(MemorySegment seg, long index) {
        return (int)_GtkTextIter.dummy12$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy12$set(MemorySegment seg, long index, int x) {
        _GtkTextIter.dummy12$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy13$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy13"));
    public static VarHandle dummy13$VH() {
        return _GtkTextIter.dummy13$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dummy13;
     * }
     */
    public static int dummy13$get(MemorySegment seg) {
        return (int)_GtkTextIter.dummy13$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dummy13;
     * }
     */
    public static void dummy13$set(MemorySegment seg, int x) {
        _GtkTextIter.dummy13$VH.set(seg, x);
    }
    public static int dummy13$get(MemorySegment seg, long index) {
        return (int)_GtkTextIter.dummy13$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy13$set(MemorySegment seg, long index, int x) {
        _GtkTextIter.dummy13$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dummy14$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dummy14"));
    public static VarHandle dummy14$VH() {
        return _GtkTextIter.dummy14$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer dummy14;
     * }
     */
    public static MemorySegment dummy14$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextIter.dummy14$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer dummy14;
     * }
     */
    public static void dummy14$set(MemorySegment seg, MemorySegment x) {
        _GtkTextIter.dummy14$VH.set(seg, x);
    }
    public static MemorySegment dummy14$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextIter.dummy14$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dummy14$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextIter.dummy14$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

