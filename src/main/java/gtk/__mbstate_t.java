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
 *     int __count;
 *     union  __value;
 * };
 * }
 */
public class __mbstate_t {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("__count"),
        MemoryLayout.unionLayout(
            Constants$root.C_INT$LAYOUT.withName("__wch"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("__wchb")
        ).withName("__value")
    );
    public static MemoryLayout $LAYOUT() {
        return __mbstate_t.$struct$LAYOUT;
    }
    static final VarHandle __count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__count"));
    public static VarHandle __count$VH() {
        return __mbstate_t.__count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __count;
     * }
     */
    public static int __count$get(MemorySegment seg) {
        return (int)__mbstate_t.__count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __count;
     * }
     */
    public static void __count$set(MemorySegment seg, int x) {
        __mbstate_t.__count$VH.set(seg, x);
    }
    public static int __count$get(MemorySegment seg, long index) {
        return (int)__mbstate_t.__count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __count$set(MemorySegment seg, long index, int x) {
        __mbstate_t.__count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     unsigned int __wch;
     *     char __wchb[4];
     * };
     * }
     */
    public static final class __value {

        // Suppresses default constructor, ensuring non-instantiability.
        private __value() {}
        static final UnionLayout __value$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_INT$LAYOUT.withName("__wch"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("__wchb")
        );
        public static MemoryLayout $LAYOUT() {
            return __value.__value$union$LAYOUT;
        }
        static final VarHandle __wch$VH = __value$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__wch"));
        public static VarHandle __wch$VH() {
            return __value.__wch$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * unsigned int __wch;
         * }
         */
        public static int __wch$get(MemorySegment seg) {
            return (int)__value.__wch$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * unsigned int __wch;
         * }
         */
        public static void __wch$set(MemorySegment seg, int x) {
            __value.__wch$VH.set(seg, x);
        }
        public static int __wch$get(MemorySegment seg, long index) {
            return (int)__value.__wch$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void __wch$set(MemorySegment seg, long index, int x) {
            __value.__wch$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment __wchb$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment __value$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


