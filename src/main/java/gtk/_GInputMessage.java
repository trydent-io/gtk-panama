// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GInputMessage {
 *     GSocketAddress** address;
 *     GInputVector* vectors;
 *     guint num_vectors;
 *     gsize bytes_received;
 *     gint flags;
 *     GSocketControlMessage*** control_messages;
 *     guint* num_control_messages;
 * };
 * }
 */
public class _GInputMessage {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("address"),
        Constants$root.C_POINTER$LAYOUT.withName("vectors"),
        Constants$root.C_INT$LAYOUT.withName("num_vectors"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("bytes_received"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("control_messages"),
        Constants$root.C_POINTER$LAYOUT.withName("num_control_messages")
    ).withName("_GInputMessage");
    public static MemoryLayout $LAYOUT() {
        return _GInputMessage.$struct$LAYOUT;
    }
    static final VarHandle address$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("address"));
    public static VarHandle address$VH() {
        return _GInputMessage.address$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSocketAddress** address;
     * }
     */
    public static MemorySegment address$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GInputMessage.address$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSocketAddress** address;
     * }
     */
    public static void address$set(MemorySegment seg, MemorySegment x) {
        _GInputMessage.address$VH.set(seg, x);
    }
    public static MemorySegment address$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GInputMessage.address$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void address$set(MemorySegment seg, long index, MemorySegment x) {
        _GInputMessage.address$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vectors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vectors"));
    public static VarHandle vectors$VH() {
        return _GInputMessage.vectors$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GInputVector* vectors;
     * }
     */
    public static MemorySegment vectors$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GInputMessage.vectors$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GInputVector* vectors;
     * }
     */
    public static void vectors$set(MemorySegment seg, MemorySegment x) {
        _GInputMessage.vectors$VH.set(seg, x);
    }
    public static MemorySegment vectors$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GInputMessage.vectors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vectors$set(MemorySegment seg, long index, MemorySegment x) {
        _GInputMessage.vectors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle num_vectors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_vectors"));
    public static VarHandle num_vectors$VH() {
        return _GInputMessage.num_vectors$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint num_vectors;
     * }
     */
    public static int num_vectors$get(MemorySegment seg) {
        return (int)_GInputMessage.num_vectors$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint num_vectors;
     * }
     */
    public static void num_vectors$set(MemorySegment seg, int x) {
        _GInputMessage.num_vectors$VH.set(seg, x);
    }
    public static int num_vectors$get(MemorySegment seg, long index) {
        return (int)_GInputMessage.num_vectors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_vectors$set(MemorySegment seg, long index, int x) {
        _GInputMessage.num_vectors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bytes_received$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bytes_received"));
    public static VarHandle bytes_received$VH() {
        return _GInputMessage.bytes_received$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gsize bytes_received;
     * }
     */
    public static long bytes_received$get(MemorySegment seg) {
        return (long)_GInputMessage.bytes_received$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gsize bytes_received;
     * }
     */
    public static void bytes_received$set(MemorySegment seg, long x) {
        _GInputMessage.bytes_received$VH.set(seg, x);
    }
    public static long bytes_received$get(MemorySegment seg, long index) {
        return (long)_GInputMessage.bytes_received$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bytes_received$set(MemorySegment seg, long index, long x) {
        _GInputMessage.bytes_received$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return _GInputMessage.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)_GInputMessage.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        _GInputMessage.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)_GInputMessage.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        _GInputMessage.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle control_messages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("control_messages"));
    public static VarHandle control_messages$VH() {
        return _GInputMessage.control_messages$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSocketControlMessage*** control_messages;
     * }
     */
    public static MemorySegment control_messages$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GInputMessage.control_messages$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSocketControlMessage*** control_messages;
     * }
     */
    public static void control_messages$set(MemorySegment seg, MemorySegment x) {
        _GInputMessage.control_messages$VH.set(seg, x);
    }
    public static MemorySegment control_messages$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GInputMessage.control_messages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void control_messages$set(MemorySegment seg, long index, MemorySegment x) {
        _GInputMessage.control_messages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle num_control_messages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_control_messages"));
    public static VarHandle num_control_messages$VH() {
        return _GInputMessage.num_control_messages$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint* num_control_messages;
     * }
     */
    public static MemorySegment num_control_messages$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GInputMessage.num_control_messages$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint* num_control_messages;
     * }
     */
    public static void num_control_messages$set(MemorySegment seg, MemorySegment x) {
        _GInputMessage.num_control_messages$VH.set(seg, x);
    }
    public static MemorySegment num_control_messages$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GInputMessage.num_control_messages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_control_messages$set(MemorySegment seg, long index, MemorySegment x) {
        _GInputMessage.num_control_messages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


