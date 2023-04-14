// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     GMutex* mutex;
 *     pthread_mutex_t unused;
 * };
 * }
 */
public class GStaticMutex {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("mutex"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("__lock"),
                Constants$root.C_INT$LAYOUT.withName("__count"),
                Constants$root.C_INT$LAYOUT.withName("__owner"),
                Constants$root.C_INT$LAYOUT.withName("__nusers"),
                Constants$root.C_INT$LAYOUT.withName("__kind"),
                Constants$root.C_SHORT$LAYOUT.withName("__spins"),
                Constants$root.C_SHORT$LAYOUT.withName("__elision"),
                MemoryLayout.structLayout(
                    Constants$root.C_POINTER$LAYOUT.withName("__prev"),
                    Constants$root.C_POINTER$LAYOUT.withName("__next")
                ).withName("__list")
            ).withName("__data"),
            MemoryLayout.sequenceLayout(40, Constants$root.C_CHAR$LAYOUT).withName("__size"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("__align")
        ).withName("unused")
    );
    public static MemoryLayout $LAYOUT() {
        return GStaticMutex.$struct$LAYOUT;
    }
    static final VarHandle mutex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mutex"));
    public static VarHandle mutex$VH() {
        return GStaticMutex.mutex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GMutex* mutex;
     * }
     */
    public static MemorySegment mutex$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)GStaticMutex.mutex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GMutex* mutex;
     * }
     */
    public static void mutex$set(MemorySegment seg, MemorySegment x) {
        GStaticMutex.mutex$VH.set(seg, x);
    }
    public static MemorySegment mutex$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)GStaticMutex.mutex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mutex$set(MemorySegment seg, long index, MemorySegment x) {
        GStaticMutex.mutex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment unused$slice(MemorySegment seg) {
        return seg.asSlice(8, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


