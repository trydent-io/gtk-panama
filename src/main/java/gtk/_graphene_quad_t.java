// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _graphene_quad_t {
 *     graphene_point_t __graphene_private_points[4];
 * };
 * }
 */
public class _graphene_quad_t {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("_graphene_point_t")).withName("__graphene_private_points")
    ).withName("_graphene_quad_t");
    public static MemoryLayout $LAYOUT() {
        return _graphene_quad_t.$struct$LAYOUT;
    }
    public static MemorySegment __graphene_private_points$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


