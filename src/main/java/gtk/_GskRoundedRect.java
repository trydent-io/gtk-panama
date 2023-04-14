// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GskRoundedRect {
 *     graphene_rect_t bounds;
 *     graphene_size_t corner[4];
 * };
 * }
 */
public class _GskRoundedRect {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("origin"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("width"),
                Constants$root.C_FLOAT$LAYOUT.withName("height")
            ).withName("size")
        ).withName("bounds"),
        MemoryLayout.sequenceLayout(4, MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("width"),
            Constants$root.C_FLOAT$LAYOUT.withName("height")
        ).withName("_graphene_size_t")).withName("corner")
    ).withName("_GskRoundedRect");
    public static MemoryLayout $LAYOUT() {
        return _GskRoundedRect.$struct$LAYOUT;
    }
    public static MemorySegment bounds$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment corner$slice(MemorySegment seg) {
        return seg.asSlice(16, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

