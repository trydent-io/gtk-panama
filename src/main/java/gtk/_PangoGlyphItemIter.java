// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoGlyphItemIter {
 *     PangoGlyphItem* glyph_item;
 *     const gchar* text;
 *     int start_glyph;
 *     int start_index;
 *     int start_char;
 *     int end_glyph;
 *     int end_index;
 *     int end_char;
 * };
 * }
 */
public class _PangoGlyphItemIter {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("glyph_item"),
        Constants$root.C_POINTER$LAYOUT.withName("text"),
        Constants$root.C_INT$LAYOUT.withName("start_glyph"),
        Constants$root.C_INT$LAYOUT.withName("start_index"),
        Constants$root.C_INT$LAYOUT.withName("start_char"),
        Constants$root.C_INT$LAYOUT.withName("end_glyph"),
        Constants$root.C_INT$LAYOUT.withName("end_index"),
        Constants$root.C_INT$LAYOUT.withName("end_char")
    ).withName("_PangoGlyphItemIter");
    public static MemoryLayout $LAYOUT() {
        return _PangoGlyphItemIter.$struct$LAYOUT;
    }
    static final VarHandle glyph_item$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("glyph_item"));
    public static VarHandle glyph_item$VH() {
        return _PangoGlyphItemIter.glyph_item$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoGlyphItem* glyph_item;
     * }
     */
    public static MemorySegment glyph_item$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoGlyphItemIter.glyph_item$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoGlyphItem* glyph_item;
     * }
     */
    public static void glyph_item$set(MemorySegment seg, MemorySegment x) {
        _PangoGlyphItemIter.glyph_item$VH.set(seg, x);
    }
    public static MemorySegment glyph_item$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoGlyphItemIter.glyph_item$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void glyph_item$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoGlyphItemIter.glyph_item$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("text"));
    public static VarHandle text$VH() {
        return _PangoGlyphItemIter.text$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* text;
     * }
     */
    public static MemorySegment text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoGlyphItemIter.text$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* text;
     * }
     */
    public static void text$set(MemorySegment seg, MemorySegment x) {
        _PangoGlyphItemIter.text$VH.set(seg, x);
    }
    public static MemorySegment text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoGlyphItemIter.text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void text$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoGlyphItemIter.text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle start_glyph$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start_glyph"));
    public static VarHandle start_glyph$VH() {
        return _PangoGlyphItemIter.start_glyph$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int start_glyph;
     * }
     */
    public static int start_glyph$get(MemorySegment seg) {
        return (int)_PangoGlyphItemIter.start_glyph$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int start_glyph;
     * }
     */
    public static void start_glyph$set(MemorySegment seg, int x) {
        _PangoGlyphItemIter.start_glyph$VH.set(seg, x);
    }
    public static int start_glyph$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphItemIter.start_glyph$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start_glyph$set(MemorySegment seg, long index, int x) {
        _PangoGlyphItemIter.start_glyph$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle start_index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start_index"));
    public static VarHandle start_index$VH() {
        return _PangoGlyphItemIter.start_index$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int start_index;
     * }
     */
    public static int start_index$get(MemorySegment seg) {
        return (int)_PangoGlyphItemIter.start_index$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int start_index;
     * }
     */
    public static void start_index$set(MemorySegment seg, int x) {
        _PangoGlyphItemIter.start_index$VH.set(seg, x);
    }
    public static int start_index$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphItemIter.start_index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start_index$set(MemorySegment seg, long index, int x) {
        _PangoGlyphItemIter.start_index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle start_char$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start_char"));
    public static VarHandle start_char$VH() {
        return _PangoGlyphItemIter.start_char$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int start_char;
     * }
     */
    public static int start_char$get(MemorySegment seg) {
        return (int)_PangoGlyphItemIter.start_char$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int start_char;
     * }
     */
    public static void start_char$set(MemorySegment seg, int x) {
        _PangoGlyphItemIter.start_char$VH.set(seg, x);
    }
    public static int start_char$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphItemIter.start_char$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start_char$set(MemorySegment seg, long index, int x) {
        _PangoGlyphItemIter.start_char$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle end_glyph$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("end_glyph"));
    public static VarHandle end_glyph$VH() {
        return _PangoGlyphItemIter.end_glyph$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int end_glyph;
     * }
     */
    public static int end_glyph$get(MemorySegment seg) {
        return (int)_PangoGlyphItemIter.end_glyph$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int end_glyph;
     * }
     */
    public static void end_glyph$set(MemorySegment seg, int x) {
        _PangoGlyphItemIter.end_glyph$VH.set(seg, x);
    }
    public static int end_glyph$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphItemIter.end_glyph$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void end_glyph$set(MemorySegment seg, long index, int x) {
        _PangoGlyphItemIter.end_glyph$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle end_index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("end_index"));
    public static VarHandle end_index$VH() {
        return _PangoGlyphItemIter.end_index$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int end_index;
     * }
     */
    public static int end_index$get(MemorySegment seg) {
        return (int)_PangoGlyphItemIter.end_index$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int end_index;
     * }
     */
    public static void end_index$set(MemorySegment seg, int x) {
        _PangoGlyphItemIter.end_index$VH.set(seg, x);
    }
    public static int end_index$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphItemIter.end_index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void end_index$set(MemorySegment seg, long index, int x) {
        _PangoGlyphItemIter.end_index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle end_char$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("end_char"));
    public static VarHandle end_char$VH() {
        return _PangoGlyphItemIter.end_char$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int end_char;
     * }
     */
    public static int end_char$get(MemorySegment seg) {
        return (int)_PangoGlyphItemIter.end_char$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int end_char;
     * }
     */
    public static void end_char$set(MemorySegment seg, int x) {
        _PangoGlyphItemIter.end_char$VH.set(seg, x);
    }
    public static int end_char$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphItemIter.end_char$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void end_char$set(MemorySegment seg, long index, int x) {
        _PangoGlyphItemIter.end_char$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


