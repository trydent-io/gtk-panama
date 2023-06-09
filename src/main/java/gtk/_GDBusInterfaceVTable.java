// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GDBusInterfaceVTable {
 *     GDBusInterfaceMethodCallFunc method_call;
 *     GDBusInterfaceGetPropertyFunc get_property;
 *     GDBusInterfaceSetPropertyFunc set_property;
 *     gpointer padding[8];
 * };
 * }
 */
public class _GDBusInterfaceVTable {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("method_call"),
        Constants$root.C_POINTER$LAYOUT.withName("get_property"),
        Constants$root.C_POINTER$LAYOUT.withName("set_property"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GDBusInterfaceVTable");
    public static MemoryLayout $LAYOUT() {
        return _GDBusInterfaceVTable.$struct$LAYOUT;
    }
    static final VarHandle method_call$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("method_call"));
    public static VarHandle method_call$VH() {
        return _GDBusInterfaceVTable.method_call$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusInterfaceMethodCallFunc method_call;
     * }
     */
    public static MemorySegment method_call$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceVTable.method_call$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusInterfaceMethodCallFunc method_call;
     * }
     */
    public static void method_call$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceVTable.method_call$VH.set(seg, x);
    }
    public static MemorySegment method_call$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceVTable.method_call$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void method_call$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceVTable.method_call$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GDBusInterfaceMethodCallFunc method_call(MemorySegment segment, SegmentScope scope) {
        return GDBusInterfaceMethodCallFunc.ofAddress(method_call$get(segment), scope);
    }
    static final VarHandle get_property$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_property"));
    public static VarHandle get_property$VH() {
        return _GDBusInterfaceVTable.get_property$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusInterfaceGetPropertyFunc get_property;
     * }
     */
    public static MemorySegment get_property$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceVTable.get_property$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusInterfaceGetPropertyFunc get_property;
     * }
     */
    public static void get_property$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceVTable.get_property$VH.set(seg, x);
    }
    public static MemorySegment get_property$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceVTable.get_property$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_property$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceVTable.get_property$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GDBusInterfaceGetPropertyFunc get_property(MemorySegment segment, SegmentScope scope) {
        return GDBusInterfaceGetPropertyFunc.ofAddress(get_property$get(segment), scope);
    }
    static final VarHandle set_property$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_property"));
    public static VarHandle set_property$VH() {
        return _GDBusInterfaceVTable.set_property$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusInterfaceSetPropertyFunc set_property;
     * }
     */
    public static MemorySegment set_property$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceVTable.set_property$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusInterfaceSetPropertyFunc set_property;
     * }
     */
    public static void set_property$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceVTable.set_property$VH.set(seg, x);
    }
    public static MemorySegment set_property$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceVTable.set_property$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_property$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceVTable.set_property$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GDBusInterfaceSetPropertyFunc set_property(MemorySegment segment, SegmentScope scope) {
        return GDBusInterfaceSetPropertyFunc.ofAddress(set_property$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(24, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


