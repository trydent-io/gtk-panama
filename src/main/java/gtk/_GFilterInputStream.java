// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GFilterInputStream {
 *     GInputStream parent_instance;
 *     GInputStream* base_stream;
 * };
 * }
 */
public class _GFilterInputStream {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_POINTER$LAYOUT.withName("g_class")
                ).withName("g_type_instance"),
                Constants$root.C_INT$LAYOUT.withName("ref_count"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("qdata")
            ).withName("parent_instance"),
            Constants$root.C_POINTER$LAYOUT.withName("priv")
        ).withName("parent_instance"),
        Constants$root.C_POINTER$LAYOUT.withName("base_stream")
    ).withName("_GFilterInputStream");
    public static MemoryLayout $LAYOUT() {
        return _GFilterInputStream.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    static final VarHandle base_stream$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("base_stream"));
    public static VarHandle base_stream$VH() {
        return _GFilterInputStream.base_stream$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GInputStream* base_stream;
     * }
     */
    public static MemorySegment base_stream$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GFilterInputStream.base_stream$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GInputStream* base_stream;
     * }
     */
    public static void base_stream$set(MemorySegment seg, MemorySegment x) {
        _GFilterInputStream.base_stream$VH.set(seg, x);
    }
    public static MemorySegment base_stream$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GFilterInputStream.base_stream$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void base_stream$set(MemorySegment seg, long index, MemorySegment x) {
        _GFilterInputStream.base_stream$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


