// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkSorterClass {
 *     GObjectClass parent_class;
 *     GtkOrdering (*compare)(GtkSorter*,gpointer,gpointer);
 *     GtkSorterOrder (*get_order)(GtkSorter*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 *     void (*_gtk_reserved5)();
 *     void (*_gtk_reserved6)();
 *     void (*_gtk_reserved7)();
 *     void (*_gtk_reserved8)();
 * };
 * }
 */
public class _GtkSorterClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("compare"),
        Constants$root.C_POINTER$LAYOUT.withName("get_order"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved5"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved8")
    ).withName("_GtkSorterClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkSorterClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor compare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor compare_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle compare_UP$MH = RuntimeHelper.upcallHandle(compare.class, "apply", _GtkSorterClass.compare_UP$FUNC);
    static final FunctionDescriptor compare_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle compare_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSorterClass.compare_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GtkOrdering (*compare)(GtkSorter*,gpointer,gpointer);
     * }
     */
    public interface compare {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(compare fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSorterClass.compare_UP$MH, fi, _GtkSorterClass.compare$FUNC, scope);
        }
        static compare ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)_GtkSorterClass.compare_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle compare$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("compare"));
    public static VarHandle compare$VH() {
        return _GtkSorterClass.compare$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkOrdering (*compare)(GtkSorter*,gpointer,gpointer);
     * }
     */
    public static MemorySegment compare$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass.compare$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkOrdering (*compare)(GtkSorter*,gpointer,gpointer);
     * }
     */
    public static void compare$set(MemorySegment seg, MemorySegment x) {
        _GtkSorterClass.compare$VH.set(seg, x);
    }
    public static MemorySegment compare$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass.compare$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void compare$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSorterClass.compare$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static compare compare(MemorySegment segment, SegmentScope scope) {
        return compare.ofAddress(compare$get(segment), scope);
    }
    static final FunctionDescriptor get_order$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_order_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_order_UP$MH = RuntimeHelper.upcallHandle(get_order.class, "apply", _GtkSorterClass.get_order_UP$FUNC);
    static final FunctionDescriptor get_order_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_order_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSorterClass.get_order_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GtkSorterOrder (*get_order)(GtkSorter*);
     * }
     */
    public interface get_order {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_order fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSorterClass.get_order_UP$MH, fi, _GtkSorterClass.get_order$FUNC, scope);
        }
        static get_order ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_GtkSorterClass.get_order_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_order$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_order"));
    public static VarHandle get_order$VH() {
        return _GtkSorterClass.get_order$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkSorterOrder (*get_order)(GtkSorter*);
     * }
     */
    public static MemorySegment get_order$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass.get_order$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkSorterOrder (*get_order)(GtkSorter*);
     * }
     */
    public static void get_order$set(MemorySegment seg, MemorySegment x) {
        _GtkSorterClass.get_order$VH.set(seg, x);
    }
    public static MemorySegment get_order$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass.get_order$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_order$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSorterClass.get_order$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_order get_order(MemorySegment segment, SegmentScope scope) {
        return get_order.ofAddress(get_order$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved1.class, "apply", _GtkSorterClass._gtk_reserved1_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSorterClass._gtk_reserved1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSorterClass._gtk_reserved1_UP$MH, fi, _GtkSorterClass._gtk_reserved1$FUNC, scope);
        }
        static _gtk_reserved1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSorterClass._gtk_reserved1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkSorterClass._gtk_reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        _GtkSorterClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSorterClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved2.class, "apply", _GtkSorterClass._gtk_reserved2_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSorterClass._gtk_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSorterClass._gtk_reserved2_UP$MH, fi, _GtkSorterClass._gtk_reserved2$FUNC, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSorterClass._gtk_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkSorterClass._gtk_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        _GtkSorterClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSorterClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved3.class, "apply", _GtkSorterClass._gtk_reserved3_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSorterClass._gtk_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSorterClass._gtk_reserved3_UP$MH, fi, _GtkSorterClass._gtk_reserved3$FUNC, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSorterClass._gtk_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkSorterClass._gtk_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        _GtkSorterClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSorterClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved4.class, "apply", _GtkSorterClass._gtk_reserved4_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSorterClass._gtk_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSorterClass._gtk_reserved4_UP$MH, fi, _GtkSorterClass._gtk_reserved4$FUNC, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSorterClass._gtk_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkSorterClass._gtk_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        _GtkSorterClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSorterClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved5_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved5_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved5.class, "apply", _GtkSorterClass._gtk_reserved5_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved5_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved5_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSorterClass._gtk_reserved5_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved5)();
     * }
     */
    public interface _gtk_reserved5 {

        void apply();
        static MemorySegment allocate(_gtk_reserved5 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSorterClass._gtk_reserved5_UP$MH, fi, _GtkSorterClass._gtk_reserved5$FUNC, scope);
        }
        static _gtk_reserved5 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSorterClass._gtk_reserved5_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"));
    public static VarHandle _gtk_reserved5$VH() {
        return _GtkSorterClass._gtk_reserved5$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved5)();
     * }
     */
    public static MemorySegment _gtk_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved5$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved5)();
     * }
     */
    public static void _gtk_reserved5$set(MemorySegment seg, MemorySegment x) {
        _GtkSorterClass._gtk_reserved5$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSorterClass._gtk_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved5 _gtk_reserved5(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved5.ofAddress(_gtk_reserved5$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved6$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved6_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved6_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved6.class, "apply", _GtkSorterClass._gtk_reserved6_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved6_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved6_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSorterClass._gtk_reserved6_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved6)();
     * }
     */
    public interface _gtk_reserved6 {

        void apply();
        static MemorySegment allocate(_gtk_reserved6 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSorterClass._gtk_reserved6_UP$MH, fi, _GtkSorterClass._gtk_reserved6$FUNC, scope);
        }
        static _gtk_reserved6 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSorterClass._gtk_reserved6_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved6$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"));
    public static VarHandle _gtk_reserved6$VH() {
        return _GtkSorterClass._gtk_reserved6$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved6)();
     * }
     */
    public static MemorySegment _gtk_reserved6$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved6$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved6)();
     * }
     */
    public static void _gtk_reserved6$set(MemorySegment seg, MemorySegment x) {
        _GtkSorterClass._gtk_reserved6$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved6$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSorterClass._gtk_reserved6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved6 _gtk_reserved6(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved6.ofAddress(_gtk_reserved6$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved7$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved7_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved7_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved7.class, "apply", _GtkSorterClass._gtk_reserved7_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved7_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved7_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSorterClass._gtk_reserved7_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved7)();
     * }
     */
    public interface _gtk_reserved7 {

        void apply();
        static MemorySegment allocate(_gtk_reserved7 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSorterClass._gtk_reserved7_UP$MH, fi, _GtkSorterClass._gtk_reserved7$FUNC, scope);
        }
        static _gtk_reserved7 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSorterClass._gtk_reserved7_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved7$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"));
    public static VarHandle _gtk_reserved7$VH() {
        return _GtkSorterClass._gtk_reserved7$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved7)();
     * }
     */
    public static MemorySegment _gtk_reserved7$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved7$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved7)();
     * }
     */
    public static void _gtk_reserved7$set(MemorySegment seg, MemorySegment x) {
        _GtkSorterClass._gtk_reserved7$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved7$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved7$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved7$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSorterClass._gtk_reserved7$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved7 _gtk_reserved7(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved7.ofAddress(_gtk_reserved7$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved8$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved8_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved8_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved8.class, "apply", _GtkSorterClass._gtk_reserved8_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved8_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved8_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSorterClass._gtk_reserved8_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved8)();
     * }
     */
    public interface _gtk_reserved8 {

        void apply();
        static MemorySegment allocate(_gtk_reserved8 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSorterClass._gtk_reserved8_UP$MH, fi, _GtkSorterClass._gtk_reserved8$FUNC, scope);
        }
        static _gtk_reserved8 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSorterClass._gtk_reserved8_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved8$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"));
    public static VarHandle _gtk_reserved8$VH() {
        return _GtkSorterClass._gtk_reserved8$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved8)();
     * }
     */
    public static MemorySegment _gtk_reserved8$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved8$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved8)();
     * }
     */
    public static void _gtk_reserved8$set(MemorySegment seg, MemorySegment x) {
        _GtkSorterClass._gtk_reserved8$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved8$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSorterClass._gtk_reserved8$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved8$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSorterClass._gtk_reserved8$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved8 _gtk_reserved8(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved8.ofAddress(_gtk_reserved8$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


