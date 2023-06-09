// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GCompletion {
 *     GList* items;
 *     GCompletionFunc func;
 *     gchar* prefix;
 *     GList* cache;
 *     GCompletionStrncmpFunc strncmp_func;
 * };
 * }
 */
public class _GCompletion {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("items"),
        Constants$root.C_POINTER$LAYOUT.withName("func"),
        Constants$root.C_POINTER$LAYOUT.withName("prefix"),
        Constants$root.C_POINTER$LAYOUT.withName("cache"),
        Constants$root.C_POINTER$LAYOUT.withName("strncmp_func")
    ).withName("_GCompletion");
    public static MemoryLayout $LAYOUT() {
        return _GCompletion.$struct$LAYOUT;
    }
    static final VarHandle items$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("items"));
    public static VarHandle items$VH() {
        return _GCompletion.items$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GList* items;
     * }
     */
    public static MemorySegment items$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCompletion.items$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GList* items;
     * }
     */
    public static void items$set(MemorySegment seg, MemorySegment x) {
        _GCompletion.items$VH.set(seg, x);
    }
    public static MemorySegment items$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCompletion.items$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void items$set(MemorySegment seg, long index, MemorySegment x) {
        _GCompletion.items$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle func$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("func"));
    public static VarHandle func$VH() {
        return _GCompletion.func$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GCompletionFunc func;
     * }
     */
    public static MemorySegment func$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCompletion.func$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GCompletionFunc func;
     * }
     */
    public static void func$set(MemorySegment seg, MemorySegment x) {
        _GCompletion.func$VH.set(seg, x);
    }
    public static MemorySegment func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCompletion.func$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void func$set(MemorySegment seg, long index, MemorySegment x) {
        _GCompletion.func$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GCompletionFunc func(MemorySegment segment, SegmentScope scope) {
        return GCompletionFunc.ofAddress(func$get(segment), scope);
    }
    static final VarHandle prefix$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prefix"));
    public static VarHandle prefix$VH() {
        return _GCompletion.prefix$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* prefix;
     * }
     */
    public static MemorySegment prefix$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCompletion.prefix$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* prefix;
     * }
     */
    public static void prefix$set(MemorySegment seg, MemorySegment x) {
        _GCompletion.prefix$VH.set(seg, x);
    }
    public static MemorySegment prefix$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCompletion.prefix$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prefix$set(MemorySegment seg, long index, MemorySegment x) {
        _GCompletion.prefix$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cache$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cache"));
    public static VarHandle cache$VH() {
        return _GCompletion.cache$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GList* cache;
     * }
     */
    public static MemorySegment cache$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCompletion.cache$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GList* cache;
     * }
     */
    public static void cache$set(MemorySegment seg, MemorySegment x) {
        _GCompletion.cache$VH.set(seg, x);
    }
    public static MemorySegment cache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCompletion.cache$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cache$set(MemorySegment seg, long index, MemorySegment x) {
        _GCompletion.cache$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle strncmp_func$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("strncmp_func"));
    public static VarHandle strncmp_func$VH() {
        return _GCompletion.strncmp_func$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GCompletionStrncmpFunc strncmp_func;
     * }
     */
    public static MemorySegment strncmp_func$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCompletion.strncmp_func$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GCompletionStrncmpFunc strncmp_func;
     * }
     */
    public static void strncmp_func$set(MemorySegment seg, MemorySegment x) {
        _GCompletion.strncmp_func$VH.set(seg, x);
    }
    public static MemorySegment strncmp_func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCompletion.strncmp_func$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void strncmp_func$set(MemorySegment seg, long index, MemorySegment x) {
        _GCompletion.strncmp_func$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GCompletionStrncmpFunc strncmp_func(MemorySegment segment, SegmentScope scope) {
        return GCompletionStrncmpFunc.ofAddress(strncmp_func$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


