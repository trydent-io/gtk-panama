// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GHook {
 *     gpointer data;
 *     GHook* next;
 *     GHook* prev;
 *     guint ref_count;
 *     gulong hook_id;
 *     guint flags;
 *     gpointer func;
 *     GDestroyNotify destroy;
 * };
 * }
 */
public class _GHook {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_POINTER$LAYOUT.withName("next"),
        Constants$root.C_POINTER$LAYOUT.withName("prev"),
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hook_id"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("func"),
        Constants$root.C_POINTER$LAYOUT.withName("destroy")
    ).withName("_GHook");
    public static MemoryLayout $LAYOUT() {
        return _GHook.$struct$LAYOUT;
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return _GHook.data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer data;
     * }
     */
    public static MemorySegment data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GHook.data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer data;
     * }
     */
    public static void data$set(MemorySegment seg, MemorySegment x) {
        _GHook.data$VH.set(seg, x);
    }
    public static MemorySegment data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GHook.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemorySegment x) {
        _GHook.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return _GHook.next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GHook* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GHook.next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GHook* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        _GHook.next$VH.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GHook.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        _GHook.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle prev$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prev"));
    public static VarHandle prev$VH() {
        return _GHook.prev$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GHook* prev;
     * }
     */
    public static MemorySegment prev$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GHook.prev$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GHook* prev;
     * }
     */
    public static void prev$set(MemorySegment seg, MemorySegment x) {
        _GHook.prev$VH.set(seg, x);
    }
    public static MemorySegment prev$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GHook.prev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prev$set(MemorySegment seg, long index, MemorySegment x) {
        _GHook.prev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _GHook.ref_count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint ref_count;
     * }
     */
    public static int ref_count$get(MemorySegment seg) {
        return (int)_GHook.ref_count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint ref_count;
     * }
     */
    public static void ref_count$set(MemorySegment seg, int x) {
        _GHook.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_GHook.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _GHook.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hook_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hook_id"));
    public static VarHandle hook_id$VH() {
        return _GHook.hook_id$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gulong hook_id;
     * }
     */
    public static long hook_id$get(MemorySegment seg) {
        return (long)_GHook.hook_id$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gulong hook_id;
     * }
     */
    public static void hook_id$set(MemorySegment seg, long x) {
        _GHook.hook_id$VH.set(seg, x);
    }
    public static long hook_id$get(MemorySegment seg, long index) {
        return (long)_GHook.hook_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hook_id$set(MemorySegment seg, long index, long x) {
        _GHook.hook_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return _GHook.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)_GHook.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        _GHook.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)_GHook.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        _GHook.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle func$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("func"));
    public static VarHandle func$VH() {
        return _GHook.func$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer func;
     * }
     */
    public static MemorySegment func$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GHook.func$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer func;
     * }
     */
    public static void func$set(MemorySegment seg, MemorySegment x) {
        _GHook.func$VH.set(seg, x);
    }
    public static MemorySegment func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GHook.func$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void func$set(MemorySegment seg, long index, MemorySegment x) {
        _GHook.func$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle destroy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("destroy"));
    public static VarHandle destroy$VH() {
        return _GHook.destroy$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDestroyNotify destroy;
     * }
     */
    public static MemorySegment destroy$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GHook.destroy$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDestroyNotify destroy;
     * }
     */
    public static void destroy$set(MemorySegment seg, MemorySegment x) {
        _GHook.destroy$VH.set(seg, x);
    }
    public static MemorySegment destroy$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GHook.destroy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void destroy$set(MemorySegment seg, long index, MemorySegment x) {
        _GHook.destroy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GDestroyNotify destroy(MemorySegment segment, SegmentScope scope) {
        return GDestroyNotify.ofAddress(destroy$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


