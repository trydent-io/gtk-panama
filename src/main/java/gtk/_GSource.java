// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GSource {
 *     gpointer callback_data;
 *     GSourceCallbackFuncs* callback_funcs;
 *     const GSourceFuncs* source_funcs;
 *     guint ref_count;
 *     GMainContext* context;
 *     gint priority;
 *     guint flags;
 *     guint source_id;
 *     GSList* poll_fds;
 *     GSource* prev;
 *     GSource* next;
 *     char* name;
 *     GSourcePrivate* priv;
 * };
 * }
 */
public class _GSource {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("callback_data"),
        Constants$root.C_POINTER$LAYOUT.withName("callback_funcs"),
        Constants$root.C_POINTER$LAYOUT.withName("source_funcs"),
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("context"),
        Constants$root.C_INT$LAYOUT.withName("priority"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        Constants$root.C_INT$LAYOUT.withName("source_id"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("poll_fds"),
        Constants$root.C_POINTER$LAYOUT.withName("prev"),
        Constants$root.C_POINTER$LAYOUT.withName("next"),
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_POINTER$LAYOUT.withName("priv")
    ).withName("_GSource");
    public static MemoryLayout $LAYOUT() {
        return _GSource.$struct$LAYOUT;
    }
    static final VarHandle callback_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("callback_data"));
    public static VarHandle callback_data$VH() {
        return _GSource.callback_data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer callback_data;
     * }
     */
    public static MemorySegment callback_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSource.callback_data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer callback_data;
     * }
     */
    public static void callback_data$set(MemorySegment seg, MemorySegment x) {
        _GSource.callback_data$VH.set(seg, x);
    }
    public static MemorySegment callback_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSource.callback_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void callback_data$set(MemorySegment seg, long index, MemorySegment x) {
        _GSource.callback_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle callback_funcs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("callback_funcs"));
    public static VarHandle callback_funcs$VH() {
        return _GSource.callback_funcs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSourceCallbackFuncs* callback_funcs;
     * }
     */
    public static MemorySegment callback_funcs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSource.callback_funcs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSourceCallbackFuncs* callback_funcs;
     * }
     */
    public static void callback_funcs$set(MemorySegment seg, MemorySegment x) {
        _GSource.callback_funcs$VH.set(seg, x);
    }
    public static MemorySegment callback_funcs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSource.callback_funcs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void callback_funcs$set(MemorySegment seg, long index, MemorySegment x) {
        _GSource.callback_funcs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle source_funcs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("source_funcs"));
    public static VarHandle source_funcs$VH() {
        return _GSource.source_funcs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const GSourceFuncs* source_funcs;
     * }
     */
    public static MemorySegment source_funcs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSource.source_funcs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const GSourceFuncs* source_funcs;
     * }
     */
    public static void source_funcs$set(MemorySegment seg, MemorySegment x) {
        _GSource.source_funcs$VH.set(seg, x);
    }
    public static MemorySegment source_funcs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSource.source_funcs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void source_funcs$set(MemorySegment seg, long index, MemorySegment x) {
        _GSource.source_funcs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _GSource.ref_count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint ref_count;
     * }
     */
    public static int ref_count$get(MemorySegment seg) {
        return (int)_GSource.ref_count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint ref_count;
     * }
     */
    public static void ref_count$set(MemorySegment seg, int x) {
        _GSource.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_GSource.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _GSource.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle context$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("context"));
    public static VarHandle context$VH() {
        return _GSource.context$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GMainContext* context;
     * }
     */
    public static MemorySegment context$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSource.context$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GMainContext* context;
     * }
     */
    public static void context$set(MemorySegment seg, MemorySegment x) {
        _GSource.context$VH.set(seg, x);
    }
    public static MemorySegment context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSource.context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void context$set(MemorySegment seg, long index, MemorySegment x) {
        _GSource.context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle priority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priority"));
    public static VarHandle priority$VH() {
        return _GSource.priority$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint priority;
     * }
     */
    public static int priority$get(MemorySegment seg) {
        return (int)_GSource.priority$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint priority;
     * }
     */
    public static void priority$set(MemorySegment seg, int x) {
        _GSource.priority$VH.set(seg, x);
    }
    public static int priority$get(MemorySegment seg, long index) {
        return (int)_GSource.priority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priority$set(MemorySegment seg, long index, int x) {
        _GSource.priority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return _GSource.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)_GSource.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        _GSource.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)_GSource.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        _GSource.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle source_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("source_id"));
    public static VarHandle source_id$VH() {
        return _GSource.source_id$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint source_id;
     * }
     */
    public static int source_id$get(MemorySegment seg) {
        return (int)_GSource.source_id$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint source_id;
     * }
     */
    public static void source_id$set(MemorySegment seg, int x) {
        _GSource.source_id$VH.set(seg, x);
    }
    public static int source_id$get(MemorySegment seg, long index) {
        return (int)_GSource.source_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void source_id$set(MemorySegment seg, long index, int x) {
        _GSource.source_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle poll_fds$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("poll_fds"));
    public static VarHandle poll_fds$VH() {
        return _GSource.poll_fds$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSList* poll_fds;
     * }
     */
    public static MemorySegment poll_fds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSource.poll_fds$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSList* poll_fds;
     * }
     */
    public static void poll_fds$set(MemorySegment seg, MemorySegment x) {
        _GSource.poll_fds$VH.set(seg, x);
    }
    public static MemorySegment poll_fds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSource.poll_fds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void poll_fds$set(MemorySegment seg, long index, MemorySegment x) {
        _GSource.poll_fds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle prev$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prev"));
    public static VarHandle prev$VH() {
        return _GSource.prev$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSource* prev;
     * }
     */
    public static MemorySegment prev$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSource.prev$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSource* prev;
     * }
     */
    public static void prev$set(MemorySegment seg, MemorySegment x) {
        _GSource.prev$VH.set(seg, x);
    }
    public static MemorySegment prev$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSource.prev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prev$set(MemorySegment seg, long index, MemorySegment x) {
        _GSource.prev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return _GSource.next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSource* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSource.next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSource* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        _GSource.next$VH.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSource.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        _GSource.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _GSource.name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSource.name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        _GSource.name$VH.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSource.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        _GSource.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle priv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    public static VarHandle priv$VH() {
        return _GSource.priv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSourcePrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSource.priv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSourcePrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        _GSource.priv$VH.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSource.priv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        _GSource.priv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


