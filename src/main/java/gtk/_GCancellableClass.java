// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GCancellableClass {
 *     GObjectClass parent_class;
 *     void (*cancelled)(GCancellable*);
 *     void (*_g_reserved1)();
 *     void (*_g_reserved2)();
 *     void (*_g_reserved3)();
 *     void (*_g_reserved4)();
 *     void (*_g_reserved5)();
 * };
 * }
 */
public class _GCancellableClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("cancelled"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5")
    ).withName("_GCancellableClass");
    public static MemoryLayout $LAYOUT() {
        return _GCancellableClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor cancelled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor cancelled_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cancelled_UP$MH = RuntimeHelper.upcallHandle(cancelled.class, "apply", _GCancellableClass.cancelled_UP$FUNC);
    static final FunctionDescriptor cancelled_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cancelled_DOWN$MH = RuntimeHelper.downcallHandle(
        _GCancellableClass.cancelled_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*cancelled)(GCancellable*);
     * }
     */
    public interface cancelled {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(cancelled fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GCancellableClass.cancelled_UP$MH, fi, _GCancellableClass.cancelled$FUNC, scope);
        }
        static cancelled ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GCancellableClass.cancelled_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle cancelled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cancelled"));
    public static VarHandle cancelled$VH() {
        return _GCancellableClass.cancelled$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*cancelled)(GCancellable*);
     * }
     */
    public static MemorySegment cancelled$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass.cancelled$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*cancelled)(GCancellable*);
     * }
     */
    public static void cancelled$set(MemorySegment seg, MemorySegment x) {
        _GCancellableClass.cancelled$VH.set(seg, x);
    }
    public static MemorySegment cancelled$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass.cancelled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cancelled$set(MemorySegment seg, long index, MemorySegment x) {
        _GCancellableClass.cancelled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static cancelled cancelled(MemorySegment segment, SegmentScope scope) {
        return cancelled.ofAddress(cancelled$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1_UP$MH = RuntimeHelper.upcallHandle(_g_reserved1.class, "apply", _GCancellableClass._g_reserved1_UP$FUNC);
    static final FunctionDescriptor _g_reserved1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GCancellableClass._g_reserved1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved1)();
     * }
     */
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GCancellableClass._g_reserved1_UP$MH, fi, _GCancellableClass._g_reserved1$FUNC, scope);
        }
        static _g_reserved1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GCancellableClass._g_reserved1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
    public static VarHandle _g_reserved1$VH() {
        return _GCancellableClass._g_reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static MemorySegment _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass._g_reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static void _g_reserved1$set(MemorySegment seg, MemorySegment x) {
        _GCancellableClass._g_reserved1$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass._g_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        _GCancellableClass._g_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1(MemorySegment segment, SegmentScope scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2_UP$MH = RuntimeHelper.upcallHandle(_g_reserved2.class, "apply", _GCancellableClass._g_reserved2_UP$FUNC);
    static final FunctionDescriptor _g_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GCancellableClass._g_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved2)();
     * }
     */
    public interface _g_reserved2 {

        void apply();
        static MemorySegment allocate(_g_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GCancellableClass._g_reserved2_UP$MH, fi, _GCancellableClass._g_reserved2$FUNC, scope);
        }
        static _g_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GCancellableClass._g_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    public static VarHandle _g_reserved2$VH() {
        return _GCancellableClass._g_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static MemorySegment _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass._g_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static void _g_reserved2$set(MemorySegment seg, MemorySegment x) {
        _GCancellableClass._g_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass._g_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _GCancellableClass._g_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2(MemorySegment segment, SegmentScope scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3_UP$MH = RuntimeHelper.upcallHandle(_g_reserved3.class, "apply", _GCancellableClass._g_reserved3_UP$FUNC);
    static final FunctionDescriptor _g_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GCancellableClass._g_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved3)();
     * }
     */
    public interface _g_reserved3 {

        void apply();
        static MemorySegment allocate(_g_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GCancellableClass._g_reserved3_UP$MH, fi, _GCancellableClass._g_reserved3$FUNC, scope);
        }
        static _g_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GCancellableClass._g_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"));
    public static VarHandle _g_reserved3$VH() {
        return _GCancellableClass._g_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static MemorySegment _g_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass._g_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static void _g_reserved3$set(MemorySegment seg, MemorySegment x) {
        _GCancellableClass._g_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass._g_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _GCancellableClass._g_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3(MemorySegment segment, SegmentScope scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved4_UP$MH = RuntimeHelper.upcallHandle(_g_reserved4.class, "apply", _GCancellableClass._g_reserved4_UP$FUNC);
    static final FunctionDescriptor _g_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GCancellableClass._g_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved4)();
     * }
     */
    public interface _g_reserved4 {

        void apply();
        static MemorySegment allocate(_g_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GCancellableClass._g_reserved4_UP$MH, fi, _GCancellableClass._g_reserved4$FUNC, scope);
        }
        static _g_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GCancellableClass._g_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"));
    public static VarHandle _g_reserved4$VH() {
        return _GCancellableClass._g_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static MemorySegment _g_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass._g_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static void _g_reserved4$set(MemorySegment seg, MemorySegment x) {
        _GCancellableClass._g_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass._g_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _GCancellableClass._g_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4(MemorySegment segment, SegmentScope scope) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved5_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved5_UP$MH = RuntimeHelper.upcallHandle(_g_reserved5.class, "apply", _GCancellableClass._g_reserved5_UP$FUNC);
    static final FunctionDescriptor _g_reserved5_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved5_DOWN$MH = RuntimeHelper.downcallHandle(
        _GCancellableClass._g_reserved5_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved5)();
     * }
     */
    public interface _g_reserved5 {

        void apply();
        static MemorySegment allocate(_g_reserved5 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GCancellableClass._g_reserved5_UP$MH, fi, _GCancellableClass._g_reserved5$FUNC, scope);
        }
        static _g_reserved5 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GCancellableClass._g_reserved5_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"));
    public static VarHandle _g_reserved5$VH() {
        return _GCancellableClass._g_reserved5$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static MemorySegment _g_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass._g_reserved5$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static void _g_reserved5$set(MemorySegment seg, MemorySegment x) {
        _GCancellableClass._g_reserved5$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCancellableClass._g_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        _GCancellableClass._g_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5(MemorySegment segment, SegmentScope scope) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


