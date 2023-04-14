// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GLogField {
 *     const gchar* key;
 *     gconstpointer value;
 *     gssize length;
 * };
 * }
 */
public class _GLogField {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("key"),
        Constants$root.C_POINTER$LAYOUT.withName("value"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("length")
    ).withName("_GLogField");
    public static MemoryLayout $LAYOUT() {
        return _GLogField.$struct$LAYOUT;
    }
    static final VarHandle key$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("key"));
    public static VarHandle key$VH() {
        return _GLogField.key$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* key;
     * }
     */
    public static MemorySegment key$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GLogField.key$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* key;
     * }
     */
    public static void key$set(MemorySegment seg, MemorySegment x) {
        _GLogField.key$VH.set(seg, x);
    }
    public static MemorySegment key$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GLogField.key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key$set(MemorySegment seg, long index, MemorySegment x) {
        _GLogField.key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _GLogField.value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gconstpointer value;
     * }
     */
    public static MemorySegment value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GLogField.value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gconstpointer value;
     * }
     */
    public static void value$set(MemorySegment seg, MemorySegment x) {
        _GLogField.value$VH.set(seg, x);
    }
    public static MemorySegment value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GLogField.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, MemorySegment x) {
        _GLogField.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return _GLogField.length$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gssize length;
     * }
     */
    public static long length$get(MemorySegment seg) {
        return (long)_GLogField.length$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gssize length;
     * }
     */
    public static void length$set(MemorySegment seg, long x) {
        _GLogField.length$VH.set(seg, x);
    }
    public static long length$get(MemorySegment seg, long index) {
        return (long)_GLogField.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, long x) {
        _GLogField.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


