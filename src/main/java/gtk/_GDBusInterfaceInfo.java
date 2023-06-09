// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GDBusInterfaceInfo {
 *     gint ref_count;
 *     gchar* name;
 *     GDBusMethodInfo** methods;
 *     GDBusSignalInfo** signals;
 *     GDBusPropertyInfo** properties;
 *     GDBusAnnotationInfo** annotations;
 * };
 * }
 */
public class _GDBusInterfaceInfo {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_POINTER$LAYOUT.withName("methods"),
        Constants$root.C_POINTER$LAYOUT.withName("signals"),
        Constants$root.C_POINTER$LAYOUT.withName("properties"),
        Constants$root.C_POINTER$LAYOUT.withName("annotations")
    ).withName("_GDBusInterfaceInfo");
    public static MemoryLayout $LAYOUT() {
        return _GDBusInterfaceInfo.$struct$LAYOUT;
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _GDBusInterfaceInfo.ref_count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint ref_count;
     * }
     */
    public static int ref_count$get(MemorySegment seg) {
        return (int)_GDBusInterfaceInfo.ref_count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint ref_count;
     * }
     */
    public static void ref_count$set(MemorySegment seg, int x) {
        _GDBusInterfaceInfo.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_GDBusInterfaceInfo.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _GDBusInterfaceInfo.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _GDBusInterfaceInfo.name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceInfo.name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceInfo.name$VH.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceInfo.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceInfo.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle methods$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("methods"));
    public static VarHandle methods$VH() {
        return _GDBusInterfaceInfo.methods$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusMethodInfo** methods;
     * }
     */
    public static MemorySegment methods$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceInfo.methods$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusMethodInfo** methods;
     * }
     */
    public static void methods$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceInfo.methods$VH.set(seg, x);
    }
    public static MemorySegment methods$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceInfo.methods$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void methods$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceInfo.methods$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle signals$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("signals"));
    public static VarHandle signals$VH() {
        return _GDBusInterfaceInfo.signals$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusSignalInfo** signals;
     * }
     */
    public static MemorySegment signals$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceInfo.signals$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusSignalInfo** signals;
     * }
     */
    public static void signals$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceInfo.signals$VH.set(seg, x);
    }
    public static MemorySegment signals$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceInfo.signals$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void signals$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceInfo.signals$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle properties$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("properties"));
    public static VarHandle properties$VH() {
        return _GDBusInterfaceInfo.properties$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusPropertyInfo** properties;
     * }
     */
    public static MemorySegment properties$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceInfo.properties$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusPropertyInfo** properties;
     * }
     */
    public static void properties$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceInfo.properties$VH.set(seg, x);
    }
    public static MemorySegment properties$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceInfo.properties$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void properties$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceInfo.properties$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle annotations$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("annotations"));
    public static VarHandle annotations$VH() {
        return _GDBusInterfaceInfo.annotations$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusAnnotationInfo** annotations;
     * }
     */
    public static MemorySegment annotations$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceInfo.annotations$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusAnnotationInfo** annotations;
     * }
     */
    public static void annotations$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceInfo.annotations$VH.set(seg, x);
    }
    public static MemorySegment annotations$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceInfo.annotations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void annotations$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceInfo.annotations$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


