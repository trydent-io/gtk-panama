// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoFontsetClass {
 *     GObjectClass parent_class;
 *     PangoFont* (*get_font)(PangoFontset*,guint);
 *     PangoFontMetrics* (*get_metrics)(PangoFontset*);
 *     PangoLanguage* (*get_language)(PangoFontset*);
 *     void (*foreach)(PangoFontset*,PangoFontsetForeachFunc,gpointer);
 *     void (*_pango_reserved1)();
 *     void (*_pango_reserved2)();
 *     void (*_pango_reserved3)();
 *     void (*_pango_reserved4)();
 * };
 * }
 */
public class _PangoFontsetClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_font"),
        Constants$root.C_POINTER$LAYOUT.withName("get_metrics"),
        Constants$root.C_POINTER$LAYOUT.withName("get_language"),
        Constants$root.C_POINTER$LAYOUT.withName("foreach"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved4")
    ).withName("_PangoFontsetClass");
    public static MemoryLayout $LAYOUT() {
        return _PangoFontsetClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_font$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor get_font_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_font_UP$MH = RuntimeHelper.upcallHandle(get_font.class, "apply", _PangoFontsetClass.get_font_UP$FUNC);
    static final FunctionDescriptor get_font_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_font_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass.get_font_DOWN$FUNC
    );
    /**
     * {@snippet :
 * PangoFont* (*get_font)(PangoFontset*,guint);
     * }
     */
    public interface get_font {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(get_font fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontsetClass.get_font_UP$MH, fi, _PangoFontsetClass.get_font$FUNC, scope);
        }
        static get_font ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_PangoFontsetClass.get_font_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_font$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_font"));
    public static VarHandle get_font$VH() {
        return _PangoFontsetClass.get_font$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoFont* (*get_font)(PangoFontset*,guint);
     * }
     */
    public static MemorySegment get_font$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass.get_font$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoFont* (*get_font)(PangoFontset*,guint);
     * }
     */
    public static void get_font$set(MemorySegment seg, MemorySegment x) {
        _PangoFontsetClass.get_font$VH.set(seg, x);
    }
    public static MemorySegment get_font$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass.get_font$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_font$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontsetClass.get_font$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_font get_font(MemorySegment segment, SegmentScope scope) {
        return get_font.ofAddress(get_font$get(segment), scope);
    }
    static final FunctionDescriptor get_metrics$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_metrics_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_metrics_UP$MH = RuntimeHelper.upcallHandle(get_metrics.class, "apply", _PangoFontsetClass.get_metrics_UP$FUNC);
    static final FunctionDescriptor get_metrics_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_metrics_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass.get_metrics_DOWN$FUNC
    );
    /**
     * {@snippet :
 * PangoFontMetrics* (*get_metrics)(PangoFontset*);
     * }
     */
    public interface get_metrics {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_metrics fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontsetClass.get_metrics_UP$MH, fi, _PangoFontsetClass.get_metrics$FUNC, scope);
        }
        static get_metrics ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_PangoFontsetClass.get_metrics_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_metrics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_metrics"));
    public static VarHandle get_metrics$VH() {
        return _PangoFontsetClass.get_metrics$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoFontMetrics* (*get_metrics)(PangoFontset*);
     * }
     */
    public static MemorySegment get_metrics$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass.get_metrics$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoFontMetrics* (*get_metrics)(PangoFontset*);
     * }
     */
    public static void get_metrics$set(MemorySegment seg, MemorySegment x) {
        _PangoFontsetClass.get_metrics$VH.set(seg, x);
    }
    public static MemorySegment get_metrics$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass.get_metrics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_metrics$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontsetClass.get_metrics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_metrics get_metrics(MemorySegment segment, SegmentScope scope) {
        return get_metrics.ofAddress(get_metrics$get(segment), scope);
    }
    static final FunctionDescriptor get_language$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_language_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_language_UP$MH = RuntimeHelper.upcallHandle(get_language.class, "apply", _PangoFontsetClass.get_language_UP$FUNC);
    static final FunctionDescriptor get_language_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_language_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass.get_language_DOWN$FUNC
    );
    /**
     * {@snippet :
 * PangoLanguage* (*get_language)(PangoFontset*);
     * }
     */
    public interface get_language {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_language fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontsetClass.get_language_UP$MH, fi, _PangoFontsetClass.get_language$FUNC, scope);
        }
        static get_language ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_PangoFontsetClass.get_language_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_language$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_language"));
    public static VarHandle get_language$VH() {
        return _PangoFontsetClass.get_language$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoLanguage* (*get_language)(PangoFontset*);
     * }
     */
    public static MemorySegment get_language$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass.get_language$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoLanguage* (*get_language)(PangoFontset*);
     * }
     */
    public static void get_language$set(MemorySegment seg, MemorySegment x) {
        _PangoFontsetClass.get_language$VH.set(seg, x);
    }
    public static MemorySegment get_language$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass.get_language$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_language$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontsetClass.get_language$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_language get_language(MemorySegment segment, SegmentScope scope) {
        return get_language.ofAddress(get_language$get(segment), scope);
    }
    static final FunctionDescriptor foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor foreach_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle foreach_UP$MH = RuntimeHelper.upcallHandle(foreach.class, "apply", _PangoFontsetClass.foreach_UP$FUNC);
    static final FunctionDescriptor foreach_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle foreach_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass.foreach_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*foreach)(PangoFontset*,PangoFontsetForeachFunc,gpointer);
     * }
     */
    public interface foreach {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(foreach fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontsetClass.foreach_UP$MH, fi, _PangoFontsetClass.foreach$FUNC, scope);
        }
        static foreach ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    _PangoFontsetClass.foreach_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle foreach$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("foreach"));
    public static VarHandle foreach$VH() {
        return _PangoFontsetClass.foreach$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*foreach)(PangoFontset*,PangoFontsetForeachFunc,gpointer);
     * }
     */
    public static MemorySegment foreach$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass.foreach$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*foreach)(PangoFontset*,PangoFontsetForeachFunc,gpointer);
     * }
     */
    public static void foreach$set(MemorySegment seg, MemorySegment x) {
        _PangoFontsetClass.foreach$VH.set(seg, x);
    }
    public static MemorySegment foreach$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass.foreach$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void foreach$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontsetClass.foreach$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static foreach foreach(MemorySegment segment, SegmentScope scope) {
        return foreach.ofAddress(foreach$get(segment), scope);
    }
    static final FunctionDescriptor _pango_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _pango_reserved1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved1_UP$MH = RuntimeHelper.upcallHandle(_pango_reserved1.class, "apply", _PangoFontsetClass._pango_reserved1_UP$FUNC);
    static final FunctionDescriptor _pango_reserved1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved1_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass._pango_reserved1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_pango_reserved1)();
     * }
     */
    public interface _pango_reserved1 {

        void apply();
        static MemorySegment allocate(_pango_reserved1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontsetClass._pango_reserved1_UP$MH, fi, _PangoFontsetClass._pango_reserved1$FUNC, scope);
        }
        static _pango_reserved1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _PangoFontsetClass._pango_reserved1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved1"));
    public static VarHandle _pango_reserved1$VH() {
        return _PangoFontsetClass._pango_reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved1)();
     * }
     */
    public static MemorySegment _pango_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass._pango_reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved1)();
     * }
     */
    public static void _pango_reserved1$set(MemorySegment seg, MemorySegment x) {
        _PangoFontsetClass._pango_reserved1$VH.set(seg, x);
    }
    public static MemorySegment _pango_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass._pango_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontsetClass._pango_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved1 _pango_reserved1(MemorySegment segment, SegmentScope scope) {
        return _pango_reserved1.ofAddress(_pango_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _pango_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _pango_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved2_UP$MH = RuntimeHelper.upcallHandle(_pango_reserved2.class, "apply", _PangoFontsetClass._pango_reserved2_UP$FUNC);
    static final FunctionDescriptor _pango_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass._pango_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_pango_reserved2)();
     * }
     */
    public interface _pango_reserved2 {

        void apply();
        static MemorySegment allocate(_pango_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontsetClass._pango_reserved2_UP$MH, fi, _PangoFontsetClass._pango_reserved2$FUNC, scope);
        }
        static _pango_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _PangoFontsetClass._pango_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"));
    public static VarHandle _pango_reserved2$VH() {
        return _PangoFontsetClass._pango_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved2)();
     * }
     */
    public static MemorySegment _pango_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass._pango_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved2)();
     * }
     */
    public static void _pango_reserved2$set(MemorySegment seg, MemorySegment x) {
        _PangoFontsetClass._pango_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _pango_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass._pango_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontsetClass._pango_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved2 _pango_reserved2(MemorySegment segment, SegmentScope scope) {
        return _pango_reserved2.ofAddress(_pango_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _pango_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _pango_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved3_UP$MH = RuntimeHelper.upcallHandle(_pango_reserved3.class, "apply", _PangoFontsetClass._pango_reserved3_UP$FUNC);
    static final FunctionDescriptor _pango_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass._pango_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_pango_reserved3)();
     * }
     */
    public interface _pango_reserved3 {

        void apply();
        static MemorySegment allocate(_pango_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontsetClass._pango_reserved3_UP$MH, fi, _PangoFontsetClass._pango_reserved3$FUNC, scope);
        }
        static _pango_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _PangoFontsetClass._pango_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved3"));
    public static VarHandle _pango_reserved3$VH() {
        return _PangoFontsetClass._pango_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved3)();
     * }
     */
    public static MemorySegment _pango_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass._pango_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved3)();
     * }
     */
    public static void _pango_reserved3$set(MemorySegment seg, MemorySegment x) {
        _PangoFontsetClass._pango_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _pango_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass._pango_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontsetClass._pango_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved3 _pango_reserved3(MemorySegment segment, SegmentScope scope) {
        return _pango_reserved3.ofAddress(_pango_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _pango_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _pango_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved4_UP$MH = RuntimeHelper.upcallHandle(_pango_reserved4.class, "apply", _PangoFontsetClass._pango_reserved4_UP$FUNC);
    static final FunctionDescriptor _pango_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass._pango_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_pango_reserved4)();
     * }
     */
    public interface _pango_reserved4 {

        void apply();
        static MemorySegment allocate(_pango_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontsetClass._pango_reserved4_UP$MH, fi, _PangoFontsetClass._pango_reserved4$FUNC, scope);
        }
        static _pango_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _PangoFontsetClass._pango_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"));
    public static VarHandle _pango_reserved4$VH() {
        return _PangoFontsetClass._pango_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved4)();
     * }
     */
    public static MemorySegment _pango_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass._pango_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved4)();
     * }
     */
    public static void _pango_reserved4$set(MemorySegment seg, MemorySegment x) {
        _PangoFontsetClass._pango_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _pango_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontsetClass._pango_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontsetClass._pango_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved4 _pango_reserved4(MemorySegment segment, SegmentScope scope) {
        return _pango_reserved4.ofAddress(_pango_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


