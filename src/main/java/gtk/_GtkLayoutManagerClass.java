// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkLayoutManagerClass {
 *     GObjectClass parent_class;
 *     GtkSizeRequestMode (*get_request_mode)(GtkLayoutManager*,GtkWidget*);
 *     void (*measure)(GtkLayoutManager*,GtkWidget*,GtkOrientation,int,int*,int*,int*,int*);
 *     void (*allocate)(GtkLayoutManager*,GtkWidget*,int,int,int);
 *     GType layout_child_type;
 *     GtkLayoutChild* (*create_layout_child)(GtkLayoutManager*,GtkWidget*,GtkWidget*);
 *     void (*root)(GtkLayoutManager*);
 *     void (*unroot)(GtkLayoutManager*);
 *     gpointer _padding[16];
 * };
 * }
 */
public class _GtkLayoutManagerClass {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
        Constants$root.C_POINTER$LAYOUT.withName("get_request_mode"),
        Constants$root.C_POINTER$LAYOUT.withName("measure"),
        Constants$root.C_POINTER$LAYOUT.withName("allocate"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("layout_child_type"),
        Constants$root.C_POINTER$LAYOUT.withName("create_layout_child"),
        Constants$root.C_POINTER$LAYOUT.withName("root"),
        Constants$root.C_POINTER$LAYOUT.withName("unroot"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_POINTER$LAYOUT).withName("_padding")
    ).withName("_GtkLayoutManagerClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkLayoutManagerClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_request_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_request_mode_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_request_mode_UP$MH = RuntimeHelper.upcallHandle(get_request_mode.class, "apply", _GtkLayoutManagerClass.get_request_mode_UP$FUNC);
    static final FunctionDescriptor get_request_mode_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_request_mode_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkLayoutManagerClass.get_request_mode_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GtkSizeRequestMode (*get_request_mode)(GtkLayoutManager*,GtkWidget*);
     * }
     */
    public interface get_request_mode {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(get_request_mode fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkLayoutManagerClass.get_request_mode_UP$MH, fi, _GtkLayoutManagerClass.get_request_mode$FUNC, scope);
        }
        static get_request_mode ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)_GtkLayoutManagerClass.get_request_mode_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_request_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"));
    public static VarHandle get_request_mode$VH() {
        return _GtkLayoutManagerClass.get_request_mode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkSizeRequestMode (*get_request_mode)(GtkLayoutManager*,GtkWidget*);
     * }
     */
    public static MemorySegment get_request_mode$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.get_request_mode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkSizeRequestMode (*get_request_mode)(GtkLayoutManager*,GtkWidget*);
     * }
     */
    public static void get_request_mode$set(MemorySegment seg, MemorySegment x) {
        _GtkLayoutManagerClass.get_request_mode$VH.set(seg, x);
    }
    public static MemorySegment get_request_mode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.get_request_mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_request_mode$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkLayoutManagerClass.get_request_mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_request_mode get_request_mode(MemorySegment segment, SegmentScope scope) {
        return get_request_mode.ofAddress(get_request_mode$get(segment), scope);
    }
    static final FunctionDescriptor measure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor measure_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle measure_UP$MH = RuntimeHelper.upcallHandle(measure.class, "apply", _GtkLayoutManagerClass.measure_UP$FUNC);
    static final FunctionDescriptor measure_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle measure_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkLayoutManagerClass.measure_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*measure)(GtkLayoutManager*,GtkWidget*,GtkOrientation,int,int*,int*,int*,int*);
     * }
     */
    public interface measure {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6, java.lang.foreign.MemorySegment _x7);
        static MemorySegment allocate(measure fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkLayoutManagerClass.measure_UP$MH, fi, _GtkLayoutManagerClass.measure$FUNC, scope);
        }
        static measure ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6, java.lang.foreign.MemorySegment __x7) -> {
                try {
                    _GtkLayoutManagerClass.measure_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle measure$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("measure"));
    public static VarHandle measure$VH() {
        return _GtkLayoutManagerClass.measure$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*measure)(GtkLayoutManager*,GtkWidget*,GtkOrientation,int,int*,int*,int*,int*);
     * }
     */
    public static MemorySegment measure$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.measure$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*measure)(GtkLayoutManager*,GtkWidget*,GtkOrientation,int,int*,int*,int*,int*);
     * }
     */
    public static void measure$set(MemorySegment seg, MemorySegment x) {
        _GtkLayoutManagerClass.measure$VH.set(seg, x);
    }
    public static MemorySegment measure$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.measure$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void measure$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkLayoutManagerClass.measure$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static measure measure(MemorySegment segment, SegmentScope scope) {
        return measure.ofAddress(measure$get(segment), scope);
    }
    static final FunctionDescriptor allocate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor allocate_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle allocate_UP$MH = RuntimeHelper.upcallHandle(allocate.class, "apply", _GtkLayoutManagerClass.allocate_UP$FUNC);
    static final FunctionDescriptor allocate_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle allocate_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkLayoutManagerClass.allocate_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*allocate)(GtkLayoutManager*,GtkWidget*,int,int,int);
     * }
     */
    public interface allocate {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, int _x4);
        static MemorySegment allocate(allocate fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkLayoutManagerClass.allocate_UP$MH, fi, _GtkLayoutManagerClass.allocate$FUNC, scope);
        }
        static allocate ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, int __x4) -> {
                try {
                    _GtkLayoutManagerClass.allocate_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle allocate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("allocate"));
    public static VarHandle allocate$VH() {
        return _GtkLayoutManagerClass.allocate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*allocate)(GtkLayoutManager*,GtkWidget*,int,int,int);
     * }
     */
    public static MemorySegment allocate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.allocate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*allocate)(GtkLayoutManager*,GtkWidget*,int,int,int);
     * }
     */
    public static void allocate$set(MemorySegment seg, MemorySegment x) {
        _GtkLayoutManagerClass.allocate$VH.set(seg, x);
    }
    public static MemorySegment allocate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.allocate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void allocate$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkLayoutManagerClass.allocate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static allocate allocate(MemorySegment segment, SegmentScope scope) {
        return allocate.ofAddress(allocate$get(segment), scope);
    }
    static final VarHandle layout_child_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("layout_child_type"));
    public static VarHandle layout_child_type$VH() {
        return _GtkLayoutManagerClass.layout_child_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GType layout_child_type;
     * }
     */
    public static long layout_child_type$get(MemorySegment seg) {
        return (long)_GtkLayoutManagerClass.layout_child_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GType layout_child_type;
     * }
     */
    public static void layout_child_type$set(MemorySegment seg, long x) {
        _GtkLayoutManagerClass.layout_child_type$VH.set(seg, x);
    }
    public static long layout_child_type$get(MemorySegment seg, long index) {
        return (long)_GtkLayoutManagerClass.layout_child_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void layout_child_type$set(MemorySegment seg, long index, long x) {
        _GtkLayoutManagerClass.layout_child_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor create_layout_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor create_layout_child_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_layout_child_UP$MH = RuntimeHelper.upcallHandle(create_layout_child.class, "apply", _GtkLayoutManagerClass.create_layout_child_UP$FUNC);
    static final FunctionDescriptor create_layout_child_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_layout_child_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkLayoutManagerClass.create_layout_child_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GtkLayoutChild* (*create_layout_child)(GtkLayoutManager*,GtkWidget*,GtkWidget*);
     * }
     */
    public interface create_layout_child {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(create_layout_child fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkLayoutManagerClass.create_layout_child_UP$MH, fi, _GtkLayoutManagerClass.create_layout_child$FUNC, scope);
        }
        static create_layout_child ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _vfs, java.lang.foreign.MemorySegment _identifier, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.create_layout_child_DOWN$MH.invokeExact(symbol, _vfs, _identifier, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle create_layout_child$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("create_layout_child"));
    public static VarHandle create_layout_child$VH() {
        return _GtkLayoutManagerClass.create_layout_child$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkLayoutChild* (*create_layout_child)(GtkLayoutManager*,GtkWidget*,GtkWidget*);
     * }
     */
    public static MemorySegment create_layout_child$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.create_layout_child$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkLayoutChild* (*create_layout_child)(GtkLayoutManager*,GtkWidget*,GtkWidget*);
     * }
     */
    public static void create_layout_child$set(MemorySegment seg, MemorySegment x) {
        _GtkLayoutManagerClass.create_layout_child$VH.set(seg, x);
    }
    public static MemorySegment create_layout_child$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.create_layout_child$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void create_layout_child$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkLayoutManagerClass.create_layout_child$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static create_layout_child create_layout_child(MemorySegment segment, SegmentScope scope) {
        return create_layout_child.ofAddress(create_layout_child$get(segment), scope);
    }
    static final FunctionDescriptor root$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor root_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle root_UP$MH = RuntimeHelper.upcallHandle(root.class, "apply", _GtkLayoutManagerClass.root_UP$FUNC);
    static final FunctionDescriptor root_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle root_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkLayoutManagerClass.root_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*root)(GtkLayoutManager*);
     * }
     */
    public interface root {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(root fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkLayoutManagerClass.root_UP$MH, fi, _GtkLayoutManagerClass.root$FUNC, scope);
        }
        static root ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkLayoutManagerClass.root_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("root"));
    public static VarHandle root$VH() {
        return _GtkLayoutManagerClass.root$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*root)(GtkLayoutManager*);
     * }
     */
    public static MemorySegment root$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.root$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*root)(GtkLayoutManager*);
     * }
     */
    public static void root$set(MemorySegment seg, MemorySegment x) {
        _GtkLayoutManagerClass.root$VH.set(seg, x);
    }
    public static MemorySegment root$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkLayoutManagerClass.root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static root root(MemorySegment segment, SegmentScope scope) {
        return root.ofAddress(root$get(segment), scope);
    }
    static final FunctionDescriptor unroot$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor unroot_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle unroot_UP$MH = RuntimeHelper.upcallHandle(unroot.class, "apply", _GtkLayoutManagerClass.unroot_UP$FUNC);
    static final FunctionDescriptor unroot_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle unroot_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkLayoutManagerClass.unroot_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*unroot)(GtkLayoutManager*);
     * }
     */
    public interface unroot {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(unroot fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkLayoutManagerClass.unroot_UP$MH, fi, _GtkLayoutManagerClass.unroot$FUNC, scope);
        }
        static unroot ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkLayoutManagerClass.unroot_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle unroot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unroot"));
    public static VarHandle unroot$VH() {
        return _GtkLayoutManagerClass.unroot$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*unroot)(GtkLayoutManager*);
     * }
     */
    public static MemorySegment unroot$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.unroot$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*unroot)(GtkLayoutManager*);
     * }
     */
    public static void unroot$set(MemorySegment seg, MemorySegment x) {
        _GtkLayoutManagerClass.unroot$VH.set(seg, x);
    }
    public static MemorySegment unroot$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkLayoutManagerClass.unroot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unroot$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkLayoutManagerClass.unroot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static unroot unroot(MemorySegment segment, SegmentScope scope) {
        return unroot.ofAddress(unroot$get(segment), scope);
    }
    public static MemorySegment _padding$slice(MemorySegment seg) {
        return seg.asSlice(192, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


