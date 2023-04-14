// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkRangeClass {
 *     GtkWidgetClass parent_class;
 *     void (*value_changed)(GtkRange*);
 *     void (*adjust_bounds)(GtkRange*,double);
 *     void (*move_slider)(GtkRange*,GtkScrollType);
 *     void (*get_range_border)(GtkRange*,GtkBorder*);
 *     gboolean (*change_value)(GtkRange*,GtkScrollType,double);
 *     gpointer padding[8];
 * };
 * }
 */
public class _GtkRangeClass {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
                ).withName("g_type_class"),
                Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
                Constants$root.C_POINTER$LAYOUT.withName("constructor"),
                Constants$root.C_POINTER$LAYOUT.withName("set_property"),
                Constants$root.C_POINTER$LAYOUT.withName("get_property"),
                Constants$root.C_POINTER$LAYOUT.withName("dispose"),
                Constants$root.C_POINTER$LAYOUT.withName("finalize"),
                Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
                Constants$root.C_POINTER$LAYOUT.withName("notify"),
                Constants$root.C_POINTER$LAYOUT.withName("constructed"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
                MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("show"),
            Constants$root.C_POINTER$LAYOUT.withName("hide"),
            Constants$root.C_POINTER$LAYOUT.withName("map"),
            Constants$root.C_POINTER$LAYOUT.withName("unmap"),
            Constants$root.C_POINTER$LAYOUT.withName("realize"),
            Constants$root.C_POINTER$LAYOUT.withName("unrealize"),
            Constants$root.C_POINTER$LAYOUT.withName("root"),
            Constants$root.C_POINTER$LAYOUT.withName("unroot"),
            Constants$root.C_POINTER$LAYOUT.withName("size_allocate"),
            Constants$root.C_POINTER$LAYOUT.withName("state_flags_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("direction_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("get_request_mode"),
            Constants$root.C_POINTER$LAYOUT.withName("measure"),
            Constants$root.C_POINTER$LAYOUT.withName("mnemonic_activate"),
            Constants$root.C_POINTER$LAYOUT.withName("grab_focus"),
            Constants$root.C_POINTER$LAYOUT.withName("focus"),
            Constants$root.C_POINTER$LAYOUT.withName("set_focus_child"),
            Constants$root.C_POINTER$LAYOUT.withName("move_focus"),
            Constants$root.C_POINTER$LAYOUT.withName("keynav_failed"),
            Constants$root.C_POINTER$LAYOUT.withName("query_tooltip"),
            Constants$root.C_POINTER$LAYOUT.withName("compute_expand"),
            Constants$root.C_POINTER$LAYOUT.withName("css_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("system_setting_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("snapshot"),
            Constants$root.C_POINTER$LAYOUT.withName("contains"),
            Constants$root.C_POINTER$LAYOUT.withName("priv"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("value_changed"),
        Constants$root.C_POINTER$LAYOUT.withName("adjust_bounds"),
        Constants$root.C_POINTER$LAYOUT.withName("move_slider"),
        Constants$root.C_POINTER$LAYOUT.withName("get_range_border"),
        Constants$root.C_POINTER$LAYOUT.withName("change_value"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GtkRangeClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkRangeClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 408);
    }
    static final FunctionDescriptor value_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor value_changed_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_changed_UP$MH = RuntimeHelper.upcallHandle(value_changed.class, "apply", _GtkRangeClass.value_changed_UP$FUNC);
    static final FunctionDescriptor value_changed_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_changed_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkRangeClass.value_changed_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*value_changed)(GtkRange*);
     * }
     */
    public interface value_changed {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(value_changed fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkRangeClass.value_changed_UP$MH, fi, _GtkRangeClass.value_changed$FUNC, scope);
        }
        static value_changed ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkRangeClass.value_changed_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle value_changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value_changed"));
    public static VarHandle value_changed$VH() {
        return _GtkRangeClass.value_changed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*value_changed)(GtkRange*);
     * }
     */
    public static MemorySegment value_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkRangeClass.value_changed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*value_changed)(GtkRange*);
     * }
     */
    public static void value_changed$set(MemorySegment seg, MemorySegment x) {
        _GtkRangeClass.value_changed$VH.set(seg, x);
    }
    public static MemorySegment value_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkRangeClass.value_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_changed$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkRangeClass.value_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_changed value_changed(MemorySegment segment, SegmentScope scope) {
        return value_changed.ofAddress(value_changed$get(segment), scope);
    }
    static final FunctionDescriptor adjust_bounds$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final FunctionDescriptor adjust_bounds_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle adjust_bounds_UP$MH = RuntimeHelper.upcallHandle(adjust_bounds.class, "apply", _GtkRangeClass.adjust_bounds_UP$FUNC);
    static final FunctionDescriptor adjust_bounds_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle adjust_bounds_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkRangeClass.adjust_bounds_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*adjust_bounds)(GtkRange*,double);
     * }
     */
    public interface adjust_bounds {

        void apply(java.lang.foreign.MemorySegment _x0, double _x1);
        static MemorySegment allocate(adjust_bounds fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkRangeClass.adjust_bounds_UP$MH, fi, _GtkRangeClass.adjust_bounds$FUNC, scope);
        }
        static adjust_bounds ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, double __x1) -> {
                try {
                    _GtkRangeClass.adjust_bounds_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle adjust_bounds$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("adjust_bounds"));
    public static VarHandle adjust_bounds$VH() {
        return _GtkRangeClass.adjust_bounds$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*adjust_bounds)(GtkRange*,double);
     * }
     */
    public static MemorySegment adjust_bounds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkRangeClass.adjust_bounds$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*adjust_bounds)(GtkRange*,double);
     * }
     */
    public static void adjust_bounds$set(MemorySegment seg, MemorySegment x) {
        _GtkRangeClass.adjust_bounds$VH.set(seg, x);
    }
    public static MemorySegment adjust_bounds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkRangeClass.adjust_bounds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void adjust_bounds$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkRangeClass.adjust_bounds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static adjust_bounds adjust_bounds(MemorySegment segment, SegmentScope scope) {
        return adjust_bounds.ofAddress(adjust_bounds$get(segment), scope);
    }
    static final FunctionDescriptor move_slider$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor move_slider_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle move_slider_UP$MH = RuntimeHelper.upcallHandle(move_slider.class, "apply", _GtkRangeClass.move_slider_UP$FUNC);
    static final FunctionDescriptor move_slider_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle move_slider_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkRangeClass.move_slider_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*move_slider)(GtkRange*,GtkScrollType);
     * }
     */
    public interface move_slider {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(move_slider fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkRangeClass.move_slider_UP$MH, fi, _GtkRangeClass.move_slider$FUNC, scope);
        }
        static move_slider ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    _GtkRangeClass.move_slider_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle move_slider$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("move_slider"));
    public static VarHandle move_slider$VH() {
        return _GtkRangeClass.move_slider$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*move_slider)(GtkRange*,GtkScrollType);
     * }
     */
    public static MemorySegment move_slider$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkRangeClass.move_slider$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*move_slider)(GtkRange*,GtkScrollType);
     * }
     */
    public static void move_slider$set(MemorySegment seg, MemorySegment x) {
        _GtkRangeClass.move_slider$VH.set(seg, x);
    }
    public static MemorySegment move_slider$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkRangeClass.move_slider$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void move_slider$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkRangeClass.move_slider$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static move_slider move_slider(MemorySegment segment, SegmentScope scope) {
        return move_slider.ofAddress(move_slider$get(segment), scope);
    }
    static final FunctionDescriptor get_range_border$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_range_border_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_range_border_UP$MH = RuntimeHelper.upcallHandle(get_range_border.class, "apply", _GtkRangeClass.get_range_border_UP$FUNC);
    static final FunctionDescriptor get_range_border_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_range_border_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkRangeClass.get_range_border_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*get_range_border)(GtkRange*,GtkBorder*);
     * }
     */
    public interface get_range_border {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(get_range_border fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkRangeClass.get_range_border_UP$MH, fi, _GtkRangeClass.get_range_border$FUNC, scope);
        }
        static get_range_border ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GtkRangeClass.get_range_border_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_range_border$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_range_border"));
    public static VarHandle get_range_border$VH() {
        return _GtkRangeClass.get_range_border$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_range_border)(GtkRange*,GtkBorder*);
     * }
     */
    public static MemorySegment get_range_border$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkRangeClass.get_range_border$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_range_border)(GtkRange*,GtkBorder*);
     * }
     */
    public static void get_range_border$set(MemorySegment seg, MemorySegment x) {
        _GtkRangeClass.get_range_border$VH.set(seg, x);
    }
    public static MemorySegment get_range_border$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkRangeClass.get_range_border$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_range_border$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkRangeClass.get_range_border$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_range_border get_range_border(MemorySegment segment, SegmentScope scope) {
        return get_range_border.ofAddress(get_range_border$get(segment), scope);
    }
    static final FunctionDescriptor change_value$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final FunctionDescriptor change_value_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle change_value_UP$MH = RuntimeHelper.upcallHandle(change_value.class, "apply", _GtkRangeClass.change_value_UP$FUNC);
    static final FunctionDescriptor change_value_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle change_value_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkRangeClass.change_value_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*change_value)(GtkRange*,GtkScrollType,double);
     * }
     */
    public interface change_value {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, double _x2);
        static MemorySegment allocate(change_value fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkRangeClass.change_value_UP$MH, fi, _GtkRangeClass.change_value$FUNC, scope);
        }
        static change_value ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, double __x2) -> {
                try {
                    return (int)_GtkRangeClass.change_value_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle change_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("change_value"));
    public static VarHandle change_value$VH() {
        return _GtkRangeClass.change_value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*change_value)(GtkRange*,GtkScrollType,double);
     * }
     */
    public static MemorySegment change_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkRangeClass.change_value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*change_value)(GtkRange*,GtkScrollType,double);
     * }
     */
    public static void change_value$set(MemorySegment seg, MemorySegment x) {
        _GtkRangeClass.change_value$VH.set(seg, x);
    }
    public static MemorySegment change_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkRangeClass.change_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void change_value$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkRangeClass.change_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static change_value change_value(MemorySegment segment, SegmentScope scope) {
        return change_value.ofAddress(change_value$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(448, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


