// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GClosure {
 *      *     guint ref_count;
 *     guint meta_marshal_nouse;
 *     guint n_guards;
 *     guint n_fnotifiers;
 *     guint n_inotifiers;
 *     guint in_inotify;
 *     guint floating;
 *     guint derivative_flag;
 *     guint in_marshal;
 *     guint is_invalid;
 *     void (*marshal)(GClosure*,GValue*,guint,const GValue*,gpointer,gpointer);
 *     gpointer data;
 *     GClosureNotifyData* notifiers;
 * };
 * }
 */
public class _GClosure {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(64),
        Constants$root.C_POINTER$LAYOUT.withName("marshal"),
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_POINTER$LAYOUT.withName("notifiers")
    ).withName("_GClosure");
    public static MemoryLayout $LAYOUT() {
        return _GClosure.$struct$LAYOUT;
    }
    static final FunctionDescriptor marshal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor marshal_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle marshal_UP$MH = RuntimeHelper.upcallHandle(marshal.class, "apply", _GClosure.marshal_UP$FUNC);
    static final FunctionDescriptor marshal_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle marshal_DOWN$MH = RuntimeHelper.downcallHandle(
        _GClosure.marshal_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*marshal)(GClosure*,GValue*,guint,const GValue*,gpointer,gpointer);
     * }
     */
    public interface marshal {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(marshal fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GClosure.marshal_UP$MH, fi, _GClosure.marshal$FUNC, scope);
        }
        static marshal ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    _GClosure.marshal_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle marshal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("marshal"));
    public static VarHandle marshal$VH() {
        return _GClosure.marshal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*marshal)(GClosure*,GValue*,guint,const GValue*,gpointer,gpointer);
     * }
     */
    public static MemorySegment marshal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GClosure.marshal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*marshal)(GClosure*,GValue*,guint,const GValue*,gpointer,gpointer);
     * }
     */
    public static void marshal$set(MemorySegment seg, MemorySegment x) {
        _GClosure.marshal$VH.set(seg, x);
    }
    public static MemorySegment marshal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GClosure.marshal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void marshal$set(MemorySegment seg, long index, MemorySegment x) {
        _GClosure.marshal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static marshal marshal(MemorySegment segment, SegmentScope scope) {
        return marshal.ofAddress(marshal$get(segment), scope);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return _GClosure.data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer data;
     * }
     */
    public static MemorySegment data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GClosure.data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer data;
     * }
     */
    public static void data$set(MemorySegment seg, MemorySegment x) {
        _GClosure.data$VH.set(seg, x);
    }
    public static MemorySegment data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GClosure.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemorySegment x) {
        _GClosure.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle notifiers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("notifiers"));
    public static VarHandle notifiers$VH() {
        return _GClosure.notifiers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GClosureNotifyData* notifiers;
     * }
     */
    public static MemorySegment notifiers$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GClosure.notifiers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GClosureNotifyData* notifiers;
     * }
     */
    public static void notifiers$set(MemorySegment seg, MemorySegment x) {
        _GClosure.notifiers$VH.set(seg, x);
    }
    public static MemorySegment notifiers$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GClosure.notifiers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void notifiers$set(MemorySegment seg, long index, MemorySegment x) {
        _GClosure.notifiers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


