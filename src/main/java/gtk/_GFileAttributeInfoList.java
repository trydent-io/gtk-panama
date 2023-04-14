// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GFileAttributeInfoList {
 *     GFileAttributeInfo* infos;
 *     int n_infos;
 * };
 * }
 */
public class _GFileAttributeInfoList {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("infos"),
        Constants$root.C_INT$LAYOUT.withName("n_infos"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GFileAttributeInfoList");
    public static MemoryLayout $LAYOUT() {
        return _GFileAttributeInfoList.$struct$LAYOUT;
    }
    static final VarHandle infos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("infos"));
    public static VarHandle infos$VH() {
        return _GFileAttributeInfoList.infos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GFileAttributeInfo* infos;
     * }
     */
    public static MemorySegment infos$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GFileAttributeInfoList.infos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GFileAttributeInfo* infos;
     * }
     */
    public static void infos$set(MemorySegment seg, MemorySegment x) {
        _GFileAttributeInfoList.infos$VH.set(seg, x);
    }
    public static MemorySegment infos$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GFileAttributeInfoList.infos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void infos$set(MemorySegment seg, long index, MemorySegment x) {
        _GFileAttributeInfoList.infos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle n_infos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("n_infos"));
    public static VarHandle n_infos$VH() {
        return _GFileAttributeInfoList.n_infos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int n_infos;
     * }
     */
    public static int n_infos$get(MemorySegment seg) {
        return (int)_GFileAttributeInfoList.n_infos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int n_infos;
     * }
     */
    public static void n_infos$set(MemorySegment seg, int x) {
        _GFileAttributeInfoList.n_infos$VH.set(seg, x);
    }
    public static int n_infos$get(MemorySegment seg, long index) {
        return (int)_GFileAttributeInfoList.n_infos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n_infos$set(MemorySegment seg, long index, int x) {
        _GFileAttributeInfoList.n_infos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


