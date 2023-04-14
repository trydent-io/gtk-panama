// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GEnumValue {
 *     gint value;
 *     const gchar* value_name;
 *     const gchar* value_nick;
 * };
 * }
 */
public class _GEnumValue {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("value"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("value_name"),
        Constants$root.C_POINTER$LAYOUT.withName("value_nick")
    ).withName("_GEnumValue");
    public static MemoryLayout $LAYOUT() {
        return _GEnumValue.$struct$LAYOUT;
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _GEnumValue.value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint value;
     * }
     */
    public static int value$get(MemorySegment seg) {
        return (int)_GEnumValue.value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint value;
     * }
     */
    public static void value$set(MemorySegment seg, int x) {
        _GEnumValue.value$VH.set(seg, x);
    }
    public static int value$get(MemorySegment seg, long index) {
        return (int)_GEnumValue.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, int x) {
        _GEnumValue.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value_name"));
    public static VarHandle value_name$VH() {
        return _GEnumValue.value_name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* value_name;
     * }
     */
    public static MemorySegment value_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GEnumValue.value_name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* value_name;
     * }
     */
    public static void value_name$set(MemorySegment seg, MemorySegment x) {
        _GEnumValue.value_name$VH.set(seg, x);
    }
    public static MemorySegment value_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GEnumValue.value_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_name$set(MemorySegment seg, long index, MemorySegment x) {
        _GEnumValue.value_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value_nick$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value_nick"));
    public static VarHandle value_nick$VH() {
        return _GEnumValue.value_nick$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* value_nick;
     * }
     */
    public static MemorySegment value_nick$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GEnumValue.value_nick$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* value_nick;
     * }
     */
    public static void value_nick$set(MemorySegment seg, MemorySegment x) {
        _GEnumValue.value_nick$VH.set(seg, x);
    }
    public static MemorySegment value_nick$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GEnumValue.value_nick$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_nick$set(MemorySegment seg, long index, MemorySegment x) {
        _GEnumValue.value_nick$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

