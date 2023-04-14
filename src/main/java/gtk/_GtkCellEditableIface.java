// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkCellEditableIface {
 *     GTypeInterface g_iface;
 *     void (*editing_done)(GtkCellEditable*);
 *     void (*remove_widget)(GtkCellEditable*);
 *     void (*start_editing)(GtkCellEditable*,GdkEvent*);
 * };
 * }
 */
public class _GtkCellEditableIface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("editing_done"),
        Constants$root.C_POINTER$LAYOUT.withName("remove_widget"),
        Constants$root.C_POINTER$LAYOUT.withName("start_editing")
    ).withName("_GtkCellEditableIface");
    public static MemoryLayout $LAYOUT() {
        return _GtkCellEditableIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor editing_done$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor editing_done_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle editing_done_UP$MH = RuntimeHelper.upcallHandle(editing_done.class, "apply", _GtkCellEditableIface.editing_done_UP$FUNC);
    static final FunctionDescriptor editing_done_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle editing_done_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellEditableIface.editing_done_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*editing_done)(GtkCellEditable*);
     * }
     */
    public interface editing_done {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(editing_done fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellEditableIface.editing_done_UP$MH, fi, _GtkCellEditableIface.editing_done$FUNC, scope);
        }
        static editing_done ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkCellEditableIface.editing_done_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle editing_done$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("editing_done"));
    public static VarHandle editing_done$VH() {
        return _GtkCellEditableIface.editing_done$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*editing_done)(GtkCellEditable*);
     * }
     */
    public static MemorySegment editing_done$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellEditableIface.editing_done$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*editing_done)(GtkCellEditable*);
     * }
     */
    public static void editing_done$set(MemorySegment seg, MemorySegment x) {
        _GtkCellEditableIface.editing_done$VH.set(seg, x);
    }
    public static MemorySegment editing_done$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellEditableIface.editing_done$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void editing_done$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellEditableIface.editing_done$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static editing_done editing_done(MemorySegment segment, SegmentScope scope) {
        return editing_done.ofAddress(editing_done$get(segment), scope);
    }
    static final FunctionDescriptor remove_widget$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor remove_widget_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle remove_widget_UP$MH = RuntimeHelper.upcallHandle(remove_widget.class, "apply", _GtkCellEditableIface.remove_widget_UP$FUNC);
    static final FunctionDescriptor remove_widget_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle remove_widget_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellEditableIface.remove_widget_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*remove_widget)(GtkCellEditable*);
     * }
     */
    public interface remove_widget {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(remove_widget fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellEditableIface.remove_widget_UP$MH, fi, _GtkCellEditableIface.remove_widget$FUNC, scope);
        }
        static remove_widget ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkCellEditableIface.remove_widget_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle remove_widget$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("remove_widget"));
    public static VarHandle remove_widget$VH() {
        return _GtkCellEditableIface.remove_widget$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*remove_widget)(GtkCellEditable*);
     * }
     */
    public static MemorySegment remove_widget$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellEditableIface.remove_widget$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*remove_widget)(GtkCellEditable*);
     * }
     */
    public static void remove_widget$set(MemorySegment seg, MemorySegment x) {
        _GtkCellEditableIface.remove_widget$VH.set(seg, x);
    }
    public static MemorySegment remove_widget$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellEditableIface.remove_widget$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void remove_widget$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellEditableIface.remove_widget$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static remove_widget remove_widget(MemorySegment segment, SegmentScope scope) {
        return remove_widget.ofAddress(remove_widget$get(segment), scope);
    }
    static final FunctionDescriptor start_editing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor start_editing_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle start_editing_UP$MH = RuntimeHelper.upcallHandle(start_editing.class, "apply", _GtkCellEditableIface.start_editing_UP$FUNC);
    static final FunctionDescriptor start_editing_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle start_editing_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellEditableIface.start_editing_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*start_editing)(GtkCellEditable*,GdkEvent*);
     * }
     */
    public interface start_editing {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(start_editing fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellEditableIface.start_editing_UP$MH, fi, _GtkCellEditableIface.start_editing$FUNC, scope);
        }
        static start_editing ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GtkCellEditableIface.start_editing_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle start_editing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start_editing"));
    public static VarHandle start_editing$VH() {
        return _GtkCellEditableIface.start_editing$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*start_editing)(GtkCellEditable*,GdkEvent*);
     * }
     */
    public static MemorySegment start_editing$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellEditableIface.start_editing$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*start_editing)(GtkCellEditable*,GdkEvent*);
     * }
     */
    public static void start_editing$set(MemorySegment seg, MemorySegment x) {
        _GtkCellEditableIface.start_editing$VH.set(seg, x);
    }
    public static MemorySegment start_editing$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellEditableIface.start_editing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start_editing$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellEditableIface.start_editing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static start_editing start_editing(MemorySegment segment, SegmentScope scope) {
        return start_editing.ofAddress(start_editing$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

