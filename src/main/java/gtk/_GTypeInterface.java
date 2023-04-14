// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GTypeInterface {
 *     GType g_type;
 *     GType g_instance_type;
 * };
 * }
 */
public class _GTypeInterface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
    ).withName("_GTypeInterface");
    public static MemoryLayout $LAYOUT() {
        return _GTypeInterface.$struct$LAYOUT;
    }
    static final VarHandle g_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("g_type"));
    public static VarHandle g_type$VH() {
        return _GTypeInterface.g_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GType g_type;
     * }
     */
    public static long g_type$get(MemorySegment seg) {
        return (long)_GTypeInterface.g_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GType g_type;
     * }
     */
    public static void g_type$set(MemorySegment seg, long x) {
        _GTypeInterface.g_type$VH.set(seg, x);
    }
    public static long g_type$get(MemorySegment seg, long index) {
        return (long)_GTypeInterface.g_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void g_type$set(MemorySegment seg, long index, long x) {
        _GTypeInterface.g_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle g_instance_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("g_instance_type"));
    public static VarHandle g_instance_type$VH() {
        return _GTypeInterface.g_instance_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GType g_instance_type;
     * }
     */
    public static long g_instance_type$get(MemorySegment seg) {
        return (long)_GTypeInterface.g_instance_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GType g_instance_type;
     * }
     */
    public static void g_instance_type$set(MemorySegment seg, long x) {
        _GTypeInterface.g_instance_type$VH.set(seg, x);
    }
    public static long g_instance_type$get(MemorySegment seg, long index) {
        return (long)_GTypeInterface.g_instance_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void g_instance_type$set(MemorySegment seg, long index, long x) {
        _GTypeInterface.g_instance_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


