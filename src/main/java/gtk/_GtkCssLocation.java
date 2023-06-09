// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkCssLocation {
 *     gsize bytes;
 *     gsize chars;
 *     gsize lines;
 *     gsize line_bytes;
 *     gsize line_chars;
 * };
 * }
 */
public class _GtkCssLocation {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("bytes"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("chars"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lines"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("line_bytes"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("line_chars")
    ).withName("_GtkCssLocation");
    public static MemoryLayout $LAYOUT() {
        return _GtkCssLocation.$struct$LAYOUT;
    }
    static final VarHandle bytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bytes"));
    public static VarHandle bytes$VH() {
        return _GtkCssLocation.bytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gsize bytes;
     * }
     */
    public static long bytes$get(MemorySegment seg) {
        return (long)_GtkCssLocation.bytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gsize bytes;
     * }
     */
    public static void bytes$set(MemorySegment seg, long x) {
        _GtkCssLocation.bytes$VH.set(seg, x);
    }
    public static long bytes$get(MemorySegment seg, long index) {
        return (long)_GtkCssLocation.bytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bytes$set(MemorySegment seg, long index, long x) {
        _GtkCssLocation.bytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle chars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("chars"));
    public static VarHandle chars$VH() {
        return _GtkCssLocation.chars$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gsize chars;
     * }
     */
    public static long chars$get(MemorySegment seg) {
        return (long)_GtkCssLocation.chars$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gsize chars;
     * }
     */
    public static void chars$set(MemorySegment seg, long x) {
        _GtkCssLocation.chars$VH.set(seg, x);
    }
    public static long chars$get(MemorySegment seg, long index) {
        return (long)_GtkCssLocation.chars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void chars$set(MemorySegment seg, long index, long x) {
        _GtkCssLocation.chars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lines$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lines"));
    public static VarHandle lines$VH() {
        return _GtkCssLocation.lines$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gsize lines;
     * }
     */
    public static long lines$get(MemorySegment seg) {
        return (long)_GtkCssLocation.lines$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gsize lines;
     * }
     */
    public static void lines$set(MemorySegment seg, long x) {
        _GtkCssLocation.lines$VH.set(seg, x);
    }
    public static long lines$get(MemorySegment seg, long index) {
        return (long)_GtkCssLocation.lines$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lines$set(MemorySegment seg, long index, long x) {
        _GtkCssLocation.lines$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle line_bytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("line_bytes"));
    public static VarHandle line_bytes$VH() {
        return _GtkCssLocation.line_bytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gsize line_bytes;
     * }
     */
    public static long line_bytes$get(MemorySegment seg) {
        return (long)_GtkCssLocation.line_bytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gsize line_bytes;
     * }
     */
    public static void line_bytes$set(MemorySegment seg, long x) {
        _GtkCssLocation.line_bytes$VH.set(seg, x);
    }
    public static long line_bytes$get(MemorySegment seg, long index) {
        return (long)_GtkCssLocation.line_bytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void line_bytes$set(MemorySegment seg, long index, long x) {
        _GtkCssLocation.line_bytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle line_chars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("line_chars"));
    public static VarHandle line_chars$VH() {
        return _GtkCssLocation.line_chars$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gsize line_chars;
     * }
     */
    public static long line_chars$get(MemorySegment seg) {
        return (long)_GtkCssLocation.line_chars$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gsize line_chars;
     * }
     */
    public static void line_chars$set(MemorySegment seg, long x) {
        _GtkCssLocation.line_chars$VH.set(seg, x);
    }
    public static long line_chars$get(MemorySegment seg, long index) {
        return (long)_GtkCssLocation.line_chars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void line_chars$set(MemorySegment seg, long index, long x) {
        _GtkCssLocation.line_chars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


