// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct timeval {
 *     __time_t tv_sec;
 *     __suseconds_t tv_usec;
 * };
 * }
 */
public class timeval {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("tv_usec")
    ).withName("timeval");
    public static MemoryLayout $LAYOUT() {
        return timeval.$struct$LAYOUT;
    }
    static final VarHandle tv_sec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tv_sec"));
    public static VarHandle tv_sec$VH() {
        return timeval.tv_sec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __time_t tv_sec;
     * }
     */
    public static long tv_sec$get(MemorySegment seg) {
        return (long)timeval.tv_sec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __time_t tv_sec;
     * }
     */
    public static void tv_sec$set(MemorySegment seg, long x) {
        timeval.tv_sec$VH.set(seg, x);
    }
    public static long tv_sec$get(MemorySegment seg, long index) {
        return (long)timeval.tv_sec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_sec$set(MemorySegment seg, long index, long x) {
        timeval.tv_sec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tv_usec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tv_usec"));
    public static VarHandle tv_usec$VH() {
        return timeval.tv_usec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __suseconds_t tv_usec;
     * }
     */
    public static long tv_usec$get(MemorySegment seg) {
        return (long)timeval.tv_usec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __suseconds_t tv_usec;
     * }
     */
    public static void tv_usec$set(MemorySegment seg, long x) {
        timeval.tv_usec$VH.set(seg, x);
    }
    public static long tv_usec$get(MemorySegment seg, long index) {
        return (long)timeval.tv_usec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_usec$set(MemorySegment seg, long index, long x) {
        timeval.tv_usec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


