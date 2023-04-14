// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GSocketConnectionClass {
 *     GIOStreamClass parent_class;
 *     void (*_g_reserved1)();
 *     void (*_g_reserved2)();
 *     void (*_g_reserved3)();
 *     void (*_g_reserved4)();
 *     void (*_g_reserved5)();
 *     void (*_g_reserved6)();
 * };
 * }
 */
public class _GSocketConnectionClass {

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
            Constants$root.C_POINTER$LAYOUT.withName("get_input_stream"),
            Constants$root.C_POINTER$LAYOUT.withName("get_output_stream"),
            Constants$root.C_POINTER$LAYOUT.withName("close_fn"),
            Constants$root.C_POINTER$LAYOUT.withName("close_async"),
            Constants$root.C_POINTER$LAYOUT.withName("close_finish"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved6"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved7"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved8"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved9"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved10")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved6")
    ).withName("_GSocketConnectionClass");
    public static MemoryLayout $LAYOUT() {
        return _GSocketConnectionClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 256);
    }
    static final FunctionDescriptor _g_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1_UP$MH = RuntimeHelper.upcallHandle(_g_reserved1.class, "apply", _GSocketConnectionClass._g_reserved1_UP$FUNC);
    static final FunctionDescriptor _g_reserved1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GSocketConnectionClass._g_reserved1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved1)();
     * }
     */
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GSocketConnectionClass._g_reserved1_UP$MH, fi, _GSocketConnectionClass._g_reserved1$FUNC, scope);
        }
        static _g_reserved1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GSocketConnectionClass._g_reserved1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
    public static VarHandle _g_reserved1$VH() {
        return _GSocketConnectionClass._g_reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static MemorySegment _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static void _g_reserved1$set(MemorySegment seg, MemorySegment x) {
        _GSocketConnectionClass._g_reserved1$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        _GSocketConnectionClass._g_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1(MemorySegment segment, SegmentScope scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2_UP$MH = RuntimeHelper.upcallHandle(_g_reserved2.class, "apply", _GSocketConnectionClass._g_reserved2_UP$FUNC);
    static final FunctionDescriptor _g_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GSocketConnectionClass._g_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved2)();
     * }
     */
    public interface _g_reserved2 {

        void apply();
        static MemorySegment allocate(_g_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GSocketConnectionClass._g_reserved2_UP$MH, fi, _GSocketConnectionClass._g_reserved2$FUNC, scope);
        }
        static _g_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GSocketConnectionClass._g_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    public static VarHandle _g_reserved2$VH() {
        return _GSocketConnectionClass._g_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static MemorySegment _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static void _g_reserved2$set(MemorySegment seg, MemorySegment x) {
        _GSocketConnectionClass._g_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _GSocketConnectionClass._g_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2(MemorySegment segment, SegmentScope scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3_UP$MH = RuntimeHelper.upcallHandle(_g_reserved3.class, "apply", _GSocketConnectionClass._g_reserved3_UP$FUNC);
    static final FunctionDescriptor _g_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GSocketConnectionClass._g_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved3)();
     * }
     */
    public interface _g_reserved3 {

        void apply();
        static MemorySegment allocate(_g_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GSocketConnectionClass._g_reserved3_UP$MH, fi, _GSocketConnectionClass._g_reserved3$FUNC, scope);
        }
        static _g_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GSocketConnectionClass._g_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"));
    public static VarHandle _g_reserved3$VH() {
        return _GSocketConnectionClass._g_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static MemorySegment _g_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static void _g_reserved3$set(MemorySegment seg, MemorySegment x) {
        _GSocketConnectionClass._g_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _GSocketConnectionClass._g_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3(MemorySegment segment, SegmentScope scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved4_UP$MH = RuntimeHelper.upcallHandle(_g_reserved4.class, "apply", _GSocketConnectionClass._g_reserved4_UP$FUNC);
    static final FunctionDescriptor _g_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GSocketConnectionClass._g_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved4)();
     * }
     */
    public interface _g_reserved4 {

        void apply();
        static MemorySegment allocate(_g_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GSocketConnectionClass._g_reserved4_UP$MH, fi, _GSocketConnectionClass._g_reserved4$FUNC, scope);
        }
        static _g_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GSocketConnectionClass._g_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"));
    public static VarHandle _g_reserved4$VH() {
        return _GSocketConnectionClass._g_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static MemorySegment _g_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static void _g_reserved4$set(MemorySegment seg, MemorySegment x) {
        _GSocketConnectionClass._g_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _GSocketConnectionClass._g_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4(MemorySegment segment, SegmentScope scope) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved5_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved5_UP$MH = RuntimeHelper.upcallHandle(_g_reserved5.class, "apply", _GSocketConnectionClass._g_reserved5_UP$FUNC);
    static final FunctionDescriptor _g_reserved5_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved5_DOWN$MH = RuntimeHelper.downcallHandle(
        _GSocketConnectionClass._g_reserved5_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved5)();
     * }
     */
    public interface _g_reserved5 {

        void apply();
        static MemorySegment allocate(_g_reserved5 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GSocketConnectionClass._g_reserved5_UP$MH, fi, _GSocketConnectionClass._g_reserved5$FUNC, scope);
        }
        static _g_reserved5 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GSocketConnectionClass._g_reserved5_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"));
    public static VarHandle _g_reserved5$VH() {
        return _GSocketConnectionClass._g_reserved5$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static MemorySegment _g_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved5$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static void _g_reserved5$set(MemorySegment seg, MemorySegment x) {
        _GSocketConnectionClass._g_reserved5$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        _GSocketConnectionClass._g_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5(MemorySegment segment, SegmentScope scope) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved6$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved6_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved6_UP$MH = RuntimeHelper.upcallHandle(_g_reserved6.class, "apply", _GSocketConnectionClass._g_reserved6_UP$FUNC);
    static final FunctionDescriptor _g_reserved6_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved6_DOWN$MH = RuntimeHelper.downcallHandle(
        _GSocketConnectionClass._g_reserved6_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved6)();
     * }
     */
    public interface _g_reserved6 {

        void apply();
        static MemorySegment allocate(_g_reserved6 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GSocketConnectionClass._g_reserved6_UP$MH, fi, _GSocketConnectionClass._g_reserved6$FUNC, scope);
        }
        static _g_reserved6 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GSocketConnectionClass._g_reserved6_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved6$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"));
    public static VarHandle _g_reserved6$VH() {
        return _GSocketConnectionClass._g_reserved6$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved6)();
     * }
     */
    public static MemorySegment _g_reserved6$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved6$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved6)();
     * }
     */
    public static void _g_reserved6$set(MemorySegment seg, MemorySegment x) {
        _GSocketConnectionClass._g_reserved6$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GSocketConnectionClass._g_reserved6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved6$set(MemorySegment seg, long index, MemorySegment x) {
        _GSocketConnectionClass._g_reserved6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved6 _g_reserved6(MemorySegment segment, SegmentScope scope) {
        return _g_reserved6.ofAddress(_g_reserved6$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


