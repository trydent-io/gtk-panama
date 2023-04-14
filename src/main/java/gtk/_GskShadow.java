// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GskShadow {
 *     GdkRGBA color;
 *     float dx;
 *     float dy;
 *     float radius;
 * };
 * }
 */
public class _GskShadow {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("red"),
            Constants$root.C_FLOAT$LAYOUT.withName("green"),
            Constants$root.C_FLOAT$LAYOUT.withName("blue"),
            Constants$root.C_FLOAT$LAYOUT.withName("alpha")
        ).withName("color"),
        Constants$root.C_FLOAT$LAYOUT.withName("dx"),
        Constants$root.C_FLOAT$LAYOUT.withName("dy"),
        Constants$root.C_FLOAT$LAYOUT.withName("radius")
    ).withName("_GskShadow");
    public static MemoryLayout $LAYOUT() {
        return _GskShadow.$struct$LAYOUT;
    }
    public static MemorySegment color$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle dx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dx"));
    public static VarHandle dx$VH() {
        return _GskShadow.dx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float dx;
     * }
     */
    public static float dx$get(MemorySegment seg) {
        return (float)_GskShadow.dx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float dx;
     * }
     */
    public static void dx$set(MemorySegment seg, float x) {
        _GskShadow.dx$VH.set(seg, x);
    }
    public static float dx$get(MemorySegment seg, long index) {
        return (float)_GskShadow.dx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dx$set(MemorySegment seg, long index, float x) {
        _GskShadow.dx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dy"));
    public static VarHandle dy$VH() {
        return _GskShadow.dy$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float dy;
     * }
     */
    public static float dy$get(MemorySegment seg) {
        return (float)_GskShadow.dy$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float dy;
     * }
     */
    public static void dy$set(MemorySegment seg, float x) {
        _GskShadow.dy$VH.set(seg, x);
    }
    public static float dy$get(MemorySegment seg, long index) {
        return (float)_GskShadow.dy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dy$set(MemorySegment seg, long index, float x) {
        _GskShadow.dy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle radius$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("radius"));
    public static VarHandle radius$VH() {
        return _GskShadow.radius$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float radius;
     * }
     */
    public static float radius$get(MemorySegment seg) {
        return (float)_GskShadow.radius$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float radius;
     * }
     */
    public static void radius$set(MemorySegment seg, float x) {
        _GskShadow.radius$VH.set(seg, x);
    }
    public static float radius$get(MemorySegment seg, long index) {
        return (float)_GskShadow.radius$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void radius$set(MemorySegment seg, long index, float x) {
        _GskShadow.radius$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


