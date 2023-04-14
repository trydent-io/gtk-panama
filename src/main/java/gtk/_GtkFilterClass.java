// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkFilterClass {
 *     GObjectClass parent_class;
 *     gboolean (*match)(GtkFilter*,gpointer);
 *     GtkFilterMatch (*get_strictness)(GtkFilter*);
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
public class _GtkFilterClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("match"),
        Constants$root.C_POINTER$LAYOUT.withName("get_strictness"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved5"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved8")
    ).withName("_GtkFilterClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkFilterClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor match$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor match_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle match_UP$MH = RuntimeHelper.upcallHandle(match.class, "apply", _GtkFilterClass.match_UP$FUNC);
    static final FunctionDescriptor match_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle match_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFilterClass.match_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*match)(GtkFilter*,gpointer);
     * }
     */
    public interface match {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(match fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFilterClass.match_UP$MH, fi, _GtkFilterClass.match$FUNC, scope);
        }
        static match ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)_GtkFilterClass.match_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle match$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("match"));
    public static VarHandle match$VH() {
        return _GtkFilterClass.match$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*match)(GtkFilter*,gpointer);
     * }
     */
    public static MemorySegment match$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass.match$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*match)(GtkFilter*,gpointer);
     * }
     */
    public static void match$set(MemorySegment seg, MemorySegment x) {
        _GtkFilterClass.match$VH.set(seg, x);
    }
    public static MemorySegment match$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass.match$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void match$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFilterClass.match$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static match match(MemorySegment segment, SegmentScope scope) {
        return match.ofAddress(match$get(segment), scope);
    }
    static final FunctionDescriptor get_strictness$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_strictness_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_strictness_UP$MH = RuntimeHelper.upcallHandle(get_strictness.class, "apply", _GtkFilterClass.get_strictness_UP$FUNC);
    static final FunctionDescriptor get_strictness_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_strictness_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFilterClass.get_strictness_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GtkFilterMatch (*get_strictness)(GtkFilter*);
     * }
     */
    public interface get_strictness {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_strictness fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFilterClass.get_strictness_UP$MH, fi, _GtkFilterClass.get_strictness$FUNC, scope);
        }
        static get_strictness ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_GtkFilterClass.get_strictness_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_strictness$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_strictness"));
    public static VarHandle get_strictness$VH() {
        return _GtkFilterClass.get_strictness$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkFilterMatch (*get_strictness)(GtkFilter*);
     * }
     */
    public static MemorySegment get_strictness$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass.get_strictness$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkFilterMatch (*get_strictness)(GtkFilter*);
     * }
     */
    public static void get_strictness$set(MemorySegment seg, MemorySegment x) {
        _GtkFilterClass.get_strictness$VH.set(seg, x);
    }
    public static MemorySegment get_strictness$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass.get_strictness$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_strictness$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFilterClass.get_strictness$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_strictness get_strictness(MemorySegment segment, SegmentScope scope) {
        return get_strictness.ofAddress(get_strictness$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved1.class, "apply", _GtkFilterClass._gtk_reserved1_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFilterClass._gtk_reserved1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFilterClass._gtk_reserved1_UP$MH, fi, _GtkFilterClass._gtk_reserved1$FUNC, scope);
        }
        static _gtk_reserved1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkFilterClass._gtk_reserved1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkFilterClass._gtk_reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        _GtkFilterClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFilterClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved2.class, "apply", _GtkFilterClass._gtk_reserved2_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFilterClass._gtk_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFilterClass._gtk_reserved2_UP$MH, fi, _GtkFilterClass._gtk_reserved2$FUNC, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkFilterClass._gtk_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkFilterClass._gtk_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        _GtkFilterClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFilterClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved3.class, "apply", _GtkFilterClass._gtk_reserved3_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFilterClass._gtk_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFilterClass._gtk_reserved3_UP$MH, fi, _GtkFilterClass._gtk_reserved3$FUNC, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkFilterClass._gtk_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkFilterClass._gtk_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        _GtkFilterClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFilterClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved4.class, "apply", _GtkFilterClass._gtk_reserved4_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFilterClass._gtk_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFilterClass._gtk_reserved4_UP$MH, fi, _GtkFilterClass._gtk_reserved4$FUNC, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkFilterClass._gtk_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkFilterClass._gtk_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        _GtkFilterClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFilterClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved5_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved5_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved5.class, "apply", _GtkFilterClass._gtk_reserved5_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved5_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved5_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFilterClass._gtk_reserved5_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved5)();
     * }
     */
    public interface _gtk_reserved5 {

        void apply();
        static MemorySegment allocate(_gtk_reserved5 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFilterClass._gtk_reserved5_UP$MH, fi, _GtkFilterClass._gtk_reserved5$FUNC, scope);
        }
        static _gtk_reserved5 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkFilterClass._gtk_reserved5_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"));
    public static VarHandle _gtk_reserved5$VH() {
        return _GtkFilterClass._gtk_reserved5$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved5)();
     * }
     */
    public static MemorySegment _gtk_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved5$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved5)();
     * }
     */
    public static void _gtk_reserved5$set(MemorySegment seg, MemorySegment x) {
        _GtkFilterClass._gtk_reserved5$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFilterClass._gtk_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved5 _gtk_reserved5(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved5.ofAddress(_gtk_reserved5$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved6$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved6_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved6_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved6.class, "apply", _GtkFilterClass._gtk_reserved6_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved6_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved6_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFilterClass._gtk_reserved6_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved6)();
     * }
     */
    public interface _gtk_reserved6 {

        void apply();
        static MemorySegment allocate(_gtk_reserved6 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFilterClass._gtk_reserved6_UP$MH, fi, _GtkFilterClass._gtk_reserved6$FUNC, scope);
        }
        static _gtk_reserved6 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkFilterClass._gtk_reserved6_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved6$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"));
    public static VarHandle _gtk_reserved6$VH() {
        return _GtkFilterClass._gtk_reserved6$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved6)();
     * }
     */
    public static MemorySegment _gtk_reserved6$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved6$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved6)();
     * }
     */
    public static void _gtk_reserved6$set(MemorySegment seg, MemorySegment x) {
        _GtkFilterClass._gtk_reserved6$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved6$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFilterClass._gtk_reserved6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved6 _gtk_reserved6(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved6.ofAddress(_gtk_reserved6$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved7$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved7_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved7_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved7.class, "apply", _GtkFilterClass._gtk_reserved7_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved7_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved7_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFilterClass._gtk_reserved7_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved7)();
     * }
     */
    public interface _gtk_reserved7 {

        void apply();
        static MemorySegment allocate(_gtk_reserved7 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFilterClass._gtk_reserved7_UP$MH, fi, _GtkFilterClass._gtk_reserved7$FUNC, scope);
        }
        static _gtk_reserved7 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkFilterClass._gtk_reserved7_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved7$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"));
    public static VarHandle _gtk_reserved7$VH() {
        return _GtkFilterClass._gtk_reserved7$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved7)();
     * }
     */
    public static MemorySegment _gtk_reserved7$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved7$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved7)();
     * }
     */
    public static void _gtk_reserved7$set(MemorySegment seg, MemorySegment x) {
        _GtkFilterClass._gtk_reserved7$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved7$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved7$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved7$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFilterClass._gtk_reserved7$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved7 _gtk_reserved7(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved7.ofAddress(_gtk_reserved7$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved8$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved8_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved8_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved8.class, "apply", _GtkFilterClass._gtk_reserved8_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved8_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved8_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFilterClass._gtk_reserved8_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved8)();
     * }
     */
    public interface _gtk_reserved8 {

        void apply();
        static MemorySegment allocate(_gtk_reserved8 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFilterClass._gtk_reserved8_UP$MH, fi, _GtkFilterClass._gtk_reserved8$FUNC, scope);
        }
        static _gtk_reserved8 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkFilterClass._gtk_reserved8_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved8$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"));
    public static VarHandle _gtk_reserved8$VH() {
        return _GtkFilterClass._gtk_reserved8$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved8)();
     * }
     */
    public static MemorySegment _gtk_reserved8$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved8$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved8)();
     * }
     */
    public static void _gtk_reserved8$set(MemorySegment seg, MemorySegment x) {
        _GtkFilterClass._gtk_reserved8$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved8$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFilterClass._gtk_reserved8$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved8$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFilterClass._gtk_reserved8$VH.set(seg.asSlice(index*sizeof()), x);
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


