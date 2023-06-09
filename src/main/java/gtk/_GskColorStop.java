// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GskColorStop {
 *     float offset;
 *     GdkRGBA color;
 * };
 * }
 */
public class _GskColorStop {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("offset"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("red"),
            Constants$root.C_FLOAT$LAYOUT.withName("green"),
            Constants$root.C_FLOAT$LAYOUT.withName("blue"),
            Constants$root.C_FLOAT$LAYOUT.withName("alpha")
        ).withName("color")
    ).withName("_GskColorStop");
    public static MemoryLayout $LAYOUT() {
        return _GskColorStop.$struct$LAYOUT;
    }
    static final VarHandle offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    public static VarHandle offset$VH() {
        return _GskColorStop.offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float offset;
     * }
     */
    public static float offset$get(MemorySegment seg) {
        return (float)_GskColorStop.offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float offset;
     * }
     */
    public static void offset$set(MemorySegment seg, float x) {
        _GskColorStop.offset$VH.set(seg, x);
    }
    public static float offset$get(MemorySegment seg, long index) {
        return (float)_GskColorStop.offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, float x) {
        _GskColorStop.offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment color$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


