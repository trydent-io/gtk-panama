// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GMemoryMonitorInterface {
 *     GTypeInterface g_iface;
 *     void (*low_memory_warning)(GMemoryMonitor*,GMemoryMonitorWarningLevel);
 * };
 * }
 */
public class _GMemoryMonitorInterface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("low_memory_warning")
    ).withName("_GMemoryMonitorInterface");
    public static MemoryLayout $LAYOUT() {
        return _GMemoryMonitorInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor low_memory_warning$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor low_memory_warning_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle low_memory_warning_UP$MH = RuntimeHelper.upcallHandle(low_memory_warning.class, "apply", _GMemoryMonitorInterface.low_memory_warning_UP$FUNC);
    static final FunctionDescriptor low_memory_warning_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle low_memory_warning_DOWN$MH = RuntimeHelper.downcallHandle(
        _GMemoryMonitorInterface.low_memory_warning_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*low_memory_warning)(GMemoryMonitor*,GMemoryMonitorWarningLevel);
     * }
     */
    public interface low_memory_warning {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(low_memory_warning fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GMemoryMonitorInterface.low_memory_warning_UP$MH, fi, _GMemoryMonitorInterface.low_memory_warning$FUNC, scope);
        }
        static low_memory_warning ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    _GMemoryMonitorInterface.low_memory_warning_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle low_memory_warning$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("low_memory_warning"));
    public static VarHandle low_memory_warning$VH() {
        return _GMemoryMonitorInterface.low_memory_warning$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*low_memory_warning)(GMemoryMonitor*,GMemoryMonitorWarningLevel);
     * }
     */
    public static MemorySegment low_memory_warning$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GMemoryMonitorInterface.low_memory_warning$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*low_memory_warning)(GMemoryMonitor*,GMemoryMonitorWarningLevel);
     * }
     */
    public static void low_memory_warning$set(MemorySegment seg, MemorySegment x) {
        _GMemoryMonitorInterface.low_memory_warning$VH.set(seg, x);
    }
    public static MemorySegment low_memory_warning$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GMemoryMonitorInterface.low_memory_warning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void low_memory_warning$set(MemorySegment seg, long index, MemorySegment x) {
        _GMemoryMonitorInterface.low_memory_warning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static low_memory_warning low_memory_warning(MemorySegment segment, SegmentScope scope) {
        return low_memory_warning.ofAddress(low_memory_warning$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


