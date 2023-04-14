// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkCellLayoutIface {
 *     GTypeInterface g_iface;
 *     void (*pack_start)(GtkCellLayout*,GtkCellRenderer*,gboolean);
 *     void (*pack_end)(GtkCellLayout*,GtkCellRenderer*,gboolean);
 *     void (*clear)(GtkCellLayout*);
 *     void (*add_attribute)(GtkCellLayout*,GtkCellRenderer*,char*,int);
 *     void (*set_cell_data_func)(GtkCellLayout*,GtkCellRenderer*,GtkCellLayoutDataFunc,gpointer,GDestroyNotify);
 *     void (*clear_attributes)(GtkCellLayout*,GtkCellRenderer*);
 *     void (*reorder)(GtkCellLayout*,GtkCellRenderer*,int);
 *     GList* (*get_cells)(GtkCellLayout*);
 *     GtkCellArea* (*get_area)(GtkCellLayout*);
 * };
 * }
 */
public class _GtkCellLayoutIface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("pack_start"),
        Constants$root.C_POINTER$LAYOUT.withName("pack_end"),
        Constants$root.C_POINTER$LAYOUT.withName("clear"),
        Constants$root.C_POINTER$LAYOUT.withName("add_attribute"),
        Constants$root.C_POINTER$LAYOUT.withName("set_cell_data_func"),
        Constants$root.C_POINTER$LAYOUT.withName("clear_attributes"),
        Constants$root.C_POINTER$LAYOUT.withName("reorder"),
        Constants$root.C_POINTER$LAYOUT.withName("get_cells"),
        Constants$root.C_POINTER$LAYOUT.withName("get_area")
    ).withName("_GtkCellLayoutIface");
    public static MemoryLayout $LAYOUT() {
        return _GtkCellLayoutIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor pack_start$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor pack_start_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pack_start_UP$MH = RuntimeHelper.upcallHandle(pack_start.class, "apply", _GtkCellLayoutIface.pack_start_UP$FUNC);
    static final FunctionDescriptor pack_start_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pack_start_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellLayoutIface.pack_start_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*pack_start)(GtkCellLayout*,GtkCellRenderer*,gboolean);
     * }
     */
    public interface pack_start {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2);
        static MemorySegment allocate(pack_start fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellLayoutIface.pack_start_UP$MH, fi, _GtkCellLayoutIface.pack_start$FUNC, scope);
        }
        static pack_start ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2) -> {
                try {
                    _GtkCellLayoutIface.pack_start_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle pack_start$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pack_start"));
    public static VarHandle pack_start$VH() {
        return _GtkCellLayoutIface.pack_start$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*pack_start)(GtkCellLayout*,GtkCellRenderer*,gboolean);
     * }
     */
    public static MemorySegment pack_start$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.pack_start$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*pack_start)(GtkCellLayout*,GtkCellRenderer*,gboolean);
     * }
     */
    public static void pack_start$set(MemorySegment seg, MemorySegment x) {
        _GtkCellLayoutIface.pack_start$VH.set(seg, x);
    }
    public static MemorySegment pack_start$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.pack_start$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pack_start$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellLayoutIface.pack_start$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static pack_start pack_start(MemorySegment segment, SegmentScope scope) {
        return pack_start.ofAddress(pack_start$get(segment), scope);
    }
    static final FunctionDescriptor pack_end$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor pack_end_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pack_end_UP$MH = RuntimeHelper.upcallHandle(pack_end.class, "apply", _GtkCellLayoutIface.pack_end_UP$FUNC);
    static final FunctionDescriptor pack_end_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pack_end_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellLayoutIface.pack_end_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*pack_end)(GtkCellLayout*,GtkCellRenderer*,gboolean);
     * }
     */
    public interface pack_end {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2);
        static MemorySegment allocate(pack_end fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellLayoutIface.pack_end_UP$MH, fi, _GtkCellLayoutIface.pack_end$FUNC, scope);
        }
        static pack_end ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2) -> {
                try {
                    _GtkCellLayoutIface.pack_end_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle pack_end$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pack_end"));
    public static VarHandle pack_end$VH() {
        return _GtkCellLayoutIface.pack_end$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*pack_end)(GtkCellLayout*,GtkCellRenderer*,gboolean);
     * }
     */
    public static MemorySegment pack_end$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.pack_end$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*pack_end)(GtkCellLayout*,GtkCellRenderer*,gboolean);
     * }
     */
    public static void pack_end$set(MemorySegment seg, MemorySegment x) {
        _GtkCellLayoutIface.pack_end$VH.set(seg, x);
    }
    public static MemorySegment pack_end$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.pack_end$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pack_end$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellLayoutIface.pack_end$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static pack_end pack_end(MemorySegment segment, SegmentScope scope) {
        return pack_end.ofAddress(pack_end$get(segment), scope);
    }
    static final FunctionDescriptor clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor clear_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clear_UP$MH = RuntimeHelper.upcallHandle(clear.class, "apply", _GtkCellLayoutIface.clear_UP$FUNC);
    static final FunctionDescriptor clear_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clear_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellLayoutIface.clear_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*clear)(GtkCellLayout*);
     * }
     */
    public interface clear {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(clear fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellLayoutIface.clear_UP$MH, fi, _GtkCellLayoutIface.clear$FUNC, scope);
        }
        static clear ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkCellLayoutIface.clear_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle clear$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("clear"));
    public static VarHandle clear$VH() {
        return _GtkCellLayoutIface.clear$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*clear)(GtkCellLayout*);
     * }
     */
    public static MemorySegment clear$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.clear$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*clear)(GtkCellLayout*);
     * }
     */
    public static void clear$set(MemorySegment seg, MemorySegment x) {
        _GtkCellLayoutIface.clear$VH.set(seg, x);
    }
    public static MemorySegment clear$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.clear$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clear$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellLayoutIface.clear$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static clear clear(MemorySegment segment, SegmentScope scope) {
        return clear.ofAddress(clear$get(segment), scope);
    }
    static final FunctionDescriptor add_attribute$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor add_attribute_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle add_attribute_UP$MH = RuntimeHelper.upcallHandle(add_attribute.class, "apply", _GtkCellLayoutIface.add_attribute_UP$FUNC);
    static final FunctionDescriptor add_attribute_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle add_attribute_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellLayoutIface.add_attribute_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*add_attribute)(GtkCellLayout*,GtkCellRenderer*,char*,int);
     * }
     */
    public interface add_attribute {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);
        static MemorySegment allocate(add_attribute fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellLayoutIface.add_attribute_UP$MH, fi, _GtkCellLayoutIface.add_attribute$FUNC, scope);
        }
        static add_attribute ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    _GtkCellLayoutIface.add_attribute_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle add_attribute$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("add_attribute"));
    public static VarHandle add_attribute$VH() {
        return _GtkCellLayoutIface.add_attribute$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*add_attribute)(GtkCellLayout*,GtkCellRenderer*,char*,int);
     * }
     */
    public static MemorySegment add_attribute$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.add_attribute$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*add_attribute)(GtkCellLayout*,GtkCellRenderer*,char*,int);
     * }
     */
    public static void add_attribute$set(MemorySegment seg, MemorySegment x) {
        _GtkCellLayoutIface.add_attribute$VH.set(seg, x);
    }
    public static MemorySegment add_attribute$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.add_attribute$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void add_attribute$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellLayoutIface.add_attribute$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static add_attribute add_attribute(MemorySegment segment, SegmentScope scope) {
        return add_attribute.ofAddress(add_attribute$get(segment), scope);
    }
    static final FunctionDescriptor set_cell_data_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor set_cell_data_func_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_cell_data_func_UP$MH = RuntimeHelper.upcallHandle(set_cell_data_func.class, "apply", _GtkCellLayoutIface.set_cell_data_func_UP$FUNC);
    static final FunctionDescriptor set_cell_data_func_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_cell_data_func_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellLayoutIface.set_cell_data_func_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*set_cell_data_func)(GtkCellLayout*,GtkCellRenderer*,GtkCellLayoutDataFunc,gpointer,GDestroyNotify);
     * }
     */
    public interface set_cell_data_func {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(set_cell_data_func fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellLayoutIface.set_cell_data_func_UP$MH, fi, _GtkCellLayoutIface.set_cell_data_func$FUNC, scope);
        }
        static set_cell_data_func ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    _GtkCellLayoutIface.set_cell_data_func_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_cell_data_func$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_cell_data_func"));
    public static VarHandle set_cell_data_func$VH() {
        return _GtkCellLayoutIface.set_cell_data_func$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_cell_data_func)(GtkCellLayout*,GtkCellRenderer*,GtkCellLayoutDataFunc,gpointer,GDestroyNotify);
     * }
     */
    public static MemorySegment set_cell_data_func$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.set_cell_data_func$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_cell_data_func)(GtkCellLayout*,GtkCellRenderer*,GtkCellLayoutDataFunc,gpointer,GDestroyNotify);
     * }
     */
    public static void set_cell_data_func$set(MemorySegment seg, MemorySegment x) {
        _GtkCellLayoutIface.set_cell_data_func$VH.set(seg, x);
    }
    public static MemorySegment set_cell_data_func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.set_cell_data_func$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_cell_data_func$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellLayoutIface.set_cell_data_func$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_cell_data_func set_cell_data_func(MemorySegment segment, SegmentScope scope) {
        return set_cell_data_func.ofAddress(set_cell_data_func$get(segment), scope);
    }
    static final FunctionDescriptor clear_attributes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor clear_attributes_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clear_attributes_UP$MH = RuntimeHelper.upcallHandle(clear_attributes.class, "apply", _GtkCellLayoutIface.clear_attributes_UP$FUNC);
    static final FunctionDescriptor clear_attributes_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clear_attributes_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellLayoutIface.clear_attributes_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*clear_attributes)(GtkCellLayout*,GtkCellRenderer*);
     * }
     */
    public interface clear_attributes {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(clear_attributes fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellLayoutIface.clear_attributes_UP$MH, fi, _GtkCellLayoutIface.clear_attributes$FUNC, scope);
        }
        static clear_attributes ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GtkCellLayoutIface.clear_attributes_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle clear_attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("clear_attributes"));
    public static VarHandle clear_attributes$VH() {
        return _GtkCellLayoutIface.clear_attributes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*clear_attributes)(GtkCellLayout*,GtkCellRenderer*);
     * }
     */
    public static MemorySegment clear_attributes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.clear_attributes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*clear_attributes)(GtkCellLayout*,GtkCellRenderer*);
     * }
     */
    public static void clear_attributes$set(MemorySegment seg, MemorySegment x) {
        _GtkCellLayoutIface.clear_attributes$VH.set(seg, x);
    }
    public static MemorySegment clear_attributes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.clear_attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clear_attributes$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellLayoutIface.clear_attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static clear_attributes clear_attributes(MemorySegment segment, SegmentScope scope) {
        return clear_attributes.ofAddress(clear_attributes$get(segment), scope);
    }
    static final FunctionDescriptor reorder$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor reorder_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle reorder_UP$MH = RuntimeHelper.upcallHandle(reorder.class, "apply", _GtkCellLayoutIface.reorder_UP$FUNC);
    static final FunctionDescriptor reorder_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle reorder_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellLayoutIface.reorder_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*reorder)(GtkCellLayout*,GtkCellRenderer*,int);
     * }
     */
    public interface reorder {

        void apply(java.lang.foreign.MemorySegment data, java.lang.foreign.MemorySegment object, int is_last_ref);
        static MemorySegment allocate(reorder fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellLayoutIface.reorder_UP$MH, fi, _GtkCellLayoutIface.reorder$FUNC, scope);
        }
        static reorder ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _data, java.lang.foreign.MemorySegment _object, int _is_last_ref) -> {
                try {
                    _GtkCellLayoutIface.reorder_DOWN$MH.invokeExact(symbol, _data, _object, _is_last_ref);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reorder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reorder"));
    public static VarHandle reorder$VH() {
        return _GtkCellLayoutIface.reorder$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reorder)(GtkCellLayout*,GtkCellRenderer*,int);
     * }
     */
    public static MemorySegment reorder$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.reorder$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reorder)(GtkCellLayout*,GtkCellRenderer*,int);
     * }
     */
    public static void reorder$set(MemorySegment seg, MemorySegment x) {
        _GtkCellLayoutIface.reorder$VH.set(seg, x);
    }
    public static MemorySegment reorder$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.reorder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reorder$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellLayoutIface.reorder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reorder reorder(MemorySegment segment, SegmentScope scope) {
        return reorder.ofAddress(reorder$get(segment), scope);
    }
    static final FunctionDescriptor get_cells$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_cells_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_cells_UP$MH = RuntimeHelper.upcallHandle(get_cells.class, "apply", _GtkCellLayoutIface.get_cells_UP$FUNC);
    static final FunctionDescriptor get_cells_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_cells_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellLayoutIface.get_cells_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GList* (*get_cells)(GtkCellLayout*);
     * }
     */
    public interface get_cells {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_cells fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellLayoutIface.get_cells_UP$MH, fi, _GtkCellLayoutIface.get_cells$FUNC, scope);
        }
        static get_cells ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.get_cells_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_cells$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_cells"));
    public static VarHandle get_cells$VH() {
        return _GtkCellLayoutIface.get_cells$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GList* (*get_cells)(GtkCellLayout*);
     * }
     */
    public static MemorySegment get_cells$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.get_cells$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GList* (*get_cells)(GtkCellLayout*);
     * }
     */
    public static void get_cells$set(MemorySegment seg, MemorySegment x) {
        _GtkCellLayoutIface.get_cells$VH.set(seg, x);
    }
    public static MemorySegment get_cells$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.get_cells$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_cells$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellLayoutIface.get_cells$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_cells get_cells(MemorySegment segment, SegmentScope scope) {
        return get_cells.ofAddress(get_cells$get(segment), scope);
    }
    static final FunctionDescriptor get_area$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_area_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_area_UP$MH = RuntimeHelper.upcallHandle(get_area.class, "apply", _GtkCellLayoutIface.get_area_UP$FUNC);
    static final FunctionDescriptor get_area_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_area_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellLayoutIface.get_area_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GtkCellArea* (*get_area)(GtkCellLayout*);
     * }
     */
    public interface get_area {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_area fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellLayoutIface.get_area_UP$MH, fi, _GtkCellLayoutIface.get_area$FUNC, scope);
        }
        static get_area ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.get_area_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_area$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_area"));
    public static VarHandle get_area$VH() {
        return _GtkCellLayoutIface.get_area$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkCellArea* (*get_area)(GtkCellLayout*);
     * }
     */
    public static MemorySegment get_area$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.get_area$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkCellArea* (*get_area)(GtkCellLayout*);
     * }
     */
    public static void get_area$set(MemorySegment seg, MemorySegment x) {
        _GtkCellLayoutIface.get_area$VH.set(seg, x);
    }
    public static MemorySegment get_area$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellLayoutIface.get_area$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_area$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellLayoutIface.get_area$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_area get_area(MemorySegment segment, SegmentScope scope) {
        return get_area.ofAddress(get_area$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


