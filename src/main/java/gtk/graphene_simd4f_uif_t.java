// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union {
 *     unsigned int ui[4];
 *     float f[4];
 * };
 * }
 */
public class graphene_simd4f_uif_t {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, Constants$root.C_INT$LAYOUT).withName("ui"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("f")
    );
    public static MemoryLayout $LAYOUT() {
        return graphene_simd4f_uif_t.$union$LAYOUT;
    }
    public static MemorySegment ui$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment f$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


