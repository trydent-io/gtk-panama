// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GDBusNodeInfo {
 *     gint ref_count;
 *     gchar* path;
 *     GDBusInterfaceInfo** interfaces;
 *     GDBusNodeInfo** nodes;
 *     GDBusAnnotationInfo** annotations;
 * };
 * }
 */
public class _GDBusNodeInfo {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("path"),
        Constants$root.C_POINTER$LAYOUT.withName("interfaces"),
        Constants$root.C_POINTER$LAYOUT.withName("nodes"),
        Constants$root.C_POINTER$LAYOUT.withName("annotations")
    ).withName("_GDBusNodeInfo");
    public static MemoryLayout $LAYOUT() {
        return _GDBusNodeInfo.$struct$LAYOUT;
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _GDBusNodeInfo.ref_count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint ref_count;
     * }
     */
    public static int ref_count$get(MemorySegment seg) {
        return (int)_GDBusNodeInfo.ref_count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint ref_count;
     * }
     */
    public static void ref_count$set(MemorySegment seg, int x) {
        _GDBusNodeInfo.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_GDBusNodeInfo.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _GDBusNodeInfo.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle path$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("path"));
    public static VarHandle path$VH() {
        return _GDBusNodeInfo.path$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* path;
     * }
     */
    public static MemorySegment path$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusNodeInfo.path$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* path;
     * }
     */
    public static void path$set(MemorySegment seg, MemorySegment x) {
        _GDBusNodeInfo.path$VH.set(seg, x);
    }
    public static MemorySegment path$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusNodeInfo.path$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void path$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusNodeInfo.path$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle interfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("interfaces"));
    public static VarHandle interfaces$VH() {
        return _GDBusNodeInfo.interfaces$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusInterfaceInfo** interfaces;
     * }
     */
    public static MemorySegment interfaces$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusNodeInfo.interfaces$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusInterfaceInfo** interfaces;
     * }
     */
    public static void interfaces$set(MemorySegment seg, MemorySegment x) {
        _GDBusNodeInfo.interfaces$VH.set(seg, x);
    }
    public static MemorySegment interfaces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusNodeInfo.interfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void interfaces$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusNodeInfo.interfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nodes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nodes"));
    public static VarHandle nodes$VH() {
        return _GDBusNodeInfo.nodes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusNodeInfo** nodes;
     * }
     */
    public static MemorySegment nodes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusNodeInfo.nodes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusNodeInfo** nodes;
     * }
     */
    public static void nodes$set(MemorySegment seg, MemorySegment x) {
        _GDBusNodeInfo.nodes$VH.set(seg, x);
    }
    public static MemorySegment nodes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusNodeInfo.nodes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nodes$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusNodeInfo.nodes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle annotations$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("annotations"));
    public static VarHandle annotations$VH() {
        return _GDBusNodeInfo.annotations$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusAnnotationInfo** annotations;
     * }
     */
    public static MemorySegment annotations$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusNodeInfo.annotations$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusAnnotationInfo** annotations;
     * }
     */
    public static void annotations$set(MemorySegment seg, MemorySegment x) {
        _GDBusNodeInfo.annotations$VH.set(seg, x);
    }
    public static MemorySegment annotations$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusNodeInfo.annotations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void annotations$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusNodeInfo.annotations$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


