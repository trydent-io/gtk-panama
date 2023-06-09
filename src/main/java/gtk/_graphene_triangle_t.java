// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _graphene_triangle_t {
 *     graphene_vec3_t __graphene_private_a;
 *     graphene_vec3_t __graphene_private_b;
 *     graphene_vec3_t __graphene_private_c;
 * };
 * }
 */
public class _graphene_triangle_t {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("__graphene_private_value")
        ).withName("__graphene_private_a"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("__graphene_private_value")
        ).withName("__graphene_private_b"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("__graphene_private_value")
        ).withName("__graphene_private_c")
    ).withName("_graphene_triangle_t");
    public static MemoryLayout $LAYOUT() {
        return _graphene_triangle_t.$struct$LAYOUT;
    }
    public static MemorySegment __graphene_private_a$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment __graphene_private_b$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment __graphene_private_c$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


