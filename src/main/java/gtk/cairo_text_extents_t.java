// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     double x_bearing;
 *     double y_bearing;
 *     double width;
 *     double height;
 *     double x_advance;
 *     double y_advance;
 * };
 * }
 */
public class cairo_text_extents_t {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x_bearing"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y_bearing"),
        Constants$root.C_DOUBLE$LAYOUT.withName("width"),
        Constants$root.C_DOUBLE$LAYOUT.withName("height"),
        Constants$root.C_DOUBLE$LAYOUT.withName("x_advance"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y_advance")
    );
    public static MemoryLayout $LAYOUT() {
        return cairo_text_extents_t.$struct$LAYOUT;
    }
    static final VarHandle x_bearing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x_bearing"));
    public static VarHandle x_bearing$VH() {
        return cairo_text_extents_t.x_bearing$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x_bearing;
     * }
     */
    public static double x_bearing$get(MemorySegment seg) {
        return (double)cairo_text_extents_t.x_bearing$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x_bearing;
     * }
     */
    public static void x_bearing$set(MemorySegment seg, double x) {
        cairo_text_extents_t.x_bearing$VH.set(seg, x);
    }
    public static double x_bearing$get(MemorySegment seg, long index) {
        return (double)cairo_text_extents_t.x_bearing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_bearing$set(MemorySegment seg, long index, double x) {
        cairo_text_extents_t.x_bearing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_bearing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_bearing"));
    public static VarHandle y_bearing$VH() {
        return cairo_text_extents_t.y_bearing$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double y_bearing;
     * }
     */
    public static double y_bearing$get(MemorySegment seg) {
        return (double)cairo_text_extents_t.y_bearing$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double y_bearing;
     * }
     */
    public static void y_bearing$set(MemorySegment seg, double x) {
        cairo_text_extents_t.y_bearing$VH.set(seg, x);
    }
    public static double y_bearing$get(MemorySegment seg, long index) {
        return (double)cairo_text_extents_t.y_bearing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_bearing$set(MemorySegment seg, long index, double x) {
        cairo_text_extents_t.y_bearing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return cairo_text_extents_t.width$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double width;
     * }
     */
    public static double width$get(MemorySegment seg) {
        return (double)cairo_text_extents_t.width$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double width;
     * }
     */
    public static void width$set(MemorySegment seg, double x) {
        cairo_text_extents_t.width$VH.set(seg, x);
    }
    public static double width$get(MemorySegment seg, long index) {
        return (double)cairo_text_extents_t.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, double x) {
        cairo_text_extents_t.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return cairo_text_extents_t.height$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double height;
     * }
     */
    public static double height$get(MemorySegment seg) {
        return (double)cairo_text_extents_t.height$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double height;
     * }
     */
    public static void height$set(MemorySegment seg, double x) {
        cairo_text_extents_t.height$VH.set(seg, x);
    }
    public static double height$get(MemorySegment seg, long index) {
        return (double)cairo_text_extents_t.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, double x) {
        cairo_text_extents_t.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x_advance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x_advance"));
    public static VarHandle x_advance$VH() {
        return cairo_text_extents_t.x_advance$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x_advance;
     * }
     */
    public static double x_advance$get(MemorySegment seg) {
        return (double)cairo_text_extents_t.x_advance$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x_advance;
     * }
     */
    public static void x_advance$set(MemorySegment seg, double x) {
        cairo_text_extents_t.x_advance$VH.set(seg, x);
    }
    public static double x_advance$get(MemorySegment seg, long index) {
        return (double)cairo_text_extents_t.x_advance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_advance$set(MemorySegment seg, long index, double x) {
        cairo_text_extents_t.x_advance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_advance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_advance"));
    public static VarHandle y_advance$VH() {
        return cairo_text_extents_t.y_advance$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double y_advance;
     * }
     */
    public static double y_advance$get(MemorySegment seg) {
        return (double)cairo_text_extents_t.y_advance$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double y_advance;
     * }
     */
    public static void y_advance$set(MemorySegment seg, double x) {
        cairo_text_extents_t.y_advance$VH.set(seg, x);
    }
    public static double y_advance$get(MemorySegment seg, long index) {
        return (double)cairo_text_extents_t.y_advance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_advance$set(MemorySegment seg, long index, double x) {
        cairo_text_extents_t.y_advance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


