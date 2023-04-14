// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkStyleContextClass {
 *     GObjectClass parent_class;
 *     void (*changed)(GtkStyleContext*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkStyleContextClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("changed"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
    ).withName("_GtkStyleContextClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkStyleContextClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor changed_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle changed_UP$MH = RuntimeHelper.upcallHandle(changed.class, "apply", _GtkStyleContextClass.changed_UP$FUNC);
    static final FunctionDescriptor changed_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle changed_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkStyleContextClass.changed_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*changed)(GtkStyleContext*);
     * }
     */
    public interface changed {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(changed fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkStyleContextClass.changed_UP$MH, fi, _GtkStyleContextClass.changed$FUNC, scope);
        }
        static changed ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkStyleContextClass.changed_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("changed"));
    public static VarHandle changed$VH() {
        return _GtkStyleContextClass.changed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*changed)(GtkStyleContext*);
     * }
     */
    public static MemorySegment changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyleContextClass.changed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*changed)(GtkStyleContext*);
     * }
     */
    public static void changed$set(MemorySegment seg, MemorySegment x) {
        _GtkStyleContextClass.changed$VH.set(seg, x);
    }
    public static MemorySegment changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyleContextClass.changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void changed$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyleContextClass.changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static changed changed(MemorySegment segment, SegmentScope scope) {
        return changed.ofAddress(changed$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved1.class, "apply", _GtkStyleContextClass._gtk_reserved1_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkStyleContextClass._gtk_reserved1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkStyleContextClass._gtk_reserved1_UP$MH, fi, _GtkStyleContextClass._gtk_reserved1$FUNC, scope);
        }
        static _gtk_reserved1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkStyleContextClass._gtk_reserved1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkStyleContextClass._gtk_reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyleContextClass._gtk_reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        _GtkStyleContextClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyleContextClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyleContextClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved2.class, "apply", _GtkStyleContextClass._gtk_reserved2_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkStyleContextClass._gtk_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkStyleContextClass._gtk_reserved2_UP$MH, fi, _GtkStyleContextClass._gtk_reserved2$FUNC, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkStyleContextClass._gtk_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkStyleContextClass._gtk_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyleContextClass._gtk_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        _GtkStyleContextClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyleContextClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyleContextClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved3.class, "apply", _GtkStyleContextClass._gtk_reserved3_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkStyleContextClass._gtk_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkStyleContextClass._gtk_reserved3_UP$MH, fi, _GtkStyleContextClass._gtk_reserved3$FUNC, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkStyleContextClass._gtk_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkStyleContextClass._gtk_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyleContextClass._gtk_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        _GtkStyleContextClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyleContextClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyleContextClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved4.class, "apply", _GtkStyleContextClass._gtk_reserved4_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkStyleContextClass._gtk_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkStyleContextClass._gtk_reserved4_UP$MH, fi, _GtkStyleContextClass._gtk_reserved4$FUNC, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkStyleContextClass._gtk_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkStyleContextClass._gtk_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyleContextClass._gtk_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        _GtkStyleContextClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyleContextClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyleContextClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

