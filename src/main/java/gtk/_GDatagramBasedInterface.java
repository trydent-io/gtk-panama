// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GDatagramBasedInterface {
 *     GTypeInterface g_iface;
 *     gint (*receive_messages)(GDatagramBased*,GInputMessage*,guint,gint,gint64,GCancellable*,GError**);
 *     gint (*send_messages)(GDatagramBased*,GOutputMessage*,guint,gint,gint64,GCancellable*,GError**);
 *     GSource* (*create_source)(GDatagramBased*,GIOCondition,GCancellable*);
 *     GIOCondition (*condition_check)(GDatagramBased*,GIOCondition);
 *     gboolean (*condition_wait)(GDatagramBased*,GIOCondition,gint64,GCancellable*,GError**);
 * };
 * }
 */
public class _GDatagramBasedInterface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("receive_messages"),
        Constants$root.C_POINTER$LAYOUT.withName("send_messages"),
        Constants$root.C_POINTER$LAYOUT.withName("create_source"),
        Constants$root.C_POINTER$LAYOUT.withName("condition_check"),
        Constants$root.C_POINTER$LAYOUT.withName("condition_wait")
    ).withName("_GDatagramBasedInterface");
    public static MemoryLayout $LAYOUT() {
        return _GDatagramBasedInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor receive_messages$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor receive_messages_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle receive_messages_UP$MH = RuntimeHelper.upcallHandle(receive_messages.class, "apply", _GDatagramBasedInterface.receive_messages_UP$FUNC);
    static final FunctionDescriptor receive_messages_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle receive_messages_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDatagramBasedInterface.receive_messages_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gint (*receive_messages)(GDatagramBased*,GInputMessage*,guint,gint,gint64,GCancellable*,GError**);
     * }
     */
    public interface receive_messages {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, long _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(receive_messages fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDatagramBasedInterface.receive_messages_UP$MH, fi, _GDatagramBasedInterface.receive_messages$FUNC, scope);
        }
        static receive_messages ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, long __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)_GDatagramBasedInterface.receive_messages_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle receive_messages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("receive_messages"));
    public static VarHandle receive_messages$VH() {
        return _GDatagramBasedInterface.receive_messages$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint (*receive_messages)(GDatagramBased*,GInputMessage*,guint,gint,gint64,GCancellable*,GError**);
     * }
     */
    public static MemorySegment receive_messages$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.receive_messages$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint (*receive_messages)(GDatagramBased*,GInputMessage*,guint,gint,gint64,GCancellable*,GError**);
     * }
     */
    public static void receive_messages$set(MemorySegment seg, MemorySegment x) {
        _GDatagramBasedInterface.receive_messages$VH.set(seg, x);
    }
    public static MemorySegment receive_messages$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.receive_messages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void receive_messages$set(MemorySegment seg, long index, MemorySegment x) {
        _GDatagramBasedInterface.receive_messages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static receive_messages receive_messages(MemorySegment segment, SegmentScope scope) {
        return receive_messages.ofAddress(receive_messages$get(segment), scope);
    }
    static final FunctionDescriptor send_messages$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor send_messages_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle send_messages_UP$MH = RuntimeHelper.upcallHandle(send_messages.class, "apply", _GDatagramBasedInterface.send_messages_UP$FUNC);
    static final FunctionDescriptor send_messages_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle send_messages_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDatagramBasedInterface.send_messages_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gint (*send_messages)(GDatagramBased*,GOutputMessage*,guint,gint,gint64,GCancellable*,GError**);
     * }
     */
    public interface send_messages {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, long _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(send_messages fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDatagramBasedInterface.send_messages_UP$MH, fi, _GDatagramBasedInterface.send_messages$FUNC, scope);
        }
        static send_messages ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, long __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    return (int)_GDatagramBasedInterface.send_messages_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle send_messages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_messages"));
    public static VarHandle send_messages$VH() {
        return _GDatagramBasedInterface.send_messages$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint (*send_messages)(GDatagramBased*,GOutputMessage*,guint,gint,gint64,GCancellable*,GError**);
     * }
     */
    public static MemorySegment send_messages$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.send_messages$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint (*send_messages)(GDatagramBased*,GOutputMessage*,guint,gint,gint64,GCancellable*,GError**);
     * }
     */
    public static void send_messages$set(MemorySegment seg, MemorySegment x) {
        _GDatagramBasedInterface.send_messages$VH.set(seg, x);
    }
    public static MemorySegment send_messages$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.send_messages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_messages$set(MemorySegment seg, long index, MemorySegment x) {
        _GDatagramBasedInterface.send_messages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static send_messages send_messages(MemorySegment segment, SegmentScope scope) {
        return send_messages.ofAddress(send_messages$get(segment), scope);
    }
    static final FunctionDescriptor create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor create_source_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_source_UP$MH = RuntimeHelper.upcallHandle(create_source.class, "apply", _GDatagramBasedInterface.create_source_UP$FUNC);
    static final FunctionDescriptor create_source_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_source_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDatagramBasedInterface.create_source_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GSource* (*create_source)(GDatagramBased*,GIOCondition,GCancellable*);
     * }
     */
    public interface create_source {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(create_source fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDatagramBasedInterface.create_source_UP$MH, fi, _GDatagramBasedInterface.create_source$FUNC, scope);
        }
        static create_source ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.create_source_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle create_source$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("create_source"));
    public static VarHandle create_source$VH() {
        return _GDatagramBasedInterface.create_source$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSource* (*create_source)(GDatagramBased*,GIOCondition,GCancellable*);
     * }
     */
    public static MemorySegment create_source$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.create_source$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSource* (*create_source)(GDatagramBased*,GIOCondition,GCancellable*);
     * }
     */
    public static void create_source$set(MemorySegment seg, MemorySegment x) {
        _GDatagramBasedInterface.create_source$VH.set(seg, x);
    }
    public static MemorySegment create_source$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.create_source$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void create_source$set(MemorySegment seg, long index, MemorySegment x) {
        _GDatagramBasedInterface.create_source$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static create_source create_source(MemorySegment segment, SegmentScope scope) {
        return create_source.ofAddress(create_source$get(segment), scope);
    }
    static final FunctionDescriptor condition_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor condition_check_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle condition_check_UP$MH = RuntimeHelper.upcallHandle(condition_check.class, "apply", _GDatagramBasedInterface.condition_check_UP$FUNC);
    static final FunctionDescriptor condition_check_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle condition_check_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDatagramBasedInterface.condition_check_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GIOCondition (*condition_check)(GDatagramBased*,GIOCondition);
     * }
     */
    public interface condition_check {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(condition_check fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDatagramBasedInterface.condition_check_UP$MH, fi, _GDatagramBasedInterface.condition_check$FUNC, scope);
        }
        static condition_check ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)_GDatagramBasedInterface.condition_check_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle condition_check$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("condition_check"));
    public static VarHandle condition_check$VH() {
        return _GDatagramBasedInterface.condition_check$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GIOCondition (*condition_check)(GDatagramBased*,GIOCondition);
     * }
     */
    public static MemorySegment condition_check$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.condition_check$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GIOCondition (*condition_check)(GDatagramBased*,GIOCondition);
     * }
     */
    public static void condition_check$set(MemorySegment seg, MemorySegment x) {
        _GDatagramBasedInterface.condition_check$VH.set(seg, x);
    }
    public static MemorySegment condition_check$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.condition_check$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void condition_check$set(MemorySegment seg, long index, MemorySegment x) {
        _GDatagramBasedInterface.condition_check$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static condition_check condition_check(MemorySegment segment, SegmentScope scope) {
        return condition_check.ofAddress(condition_check$get(segment), scope);
    }
    static final FunctionDescriptor condition_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor condition_wait_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle condition_wait_UP$MH = RuntimeHelper.upcallHandle(condition_wait.class, "apply", _GDatagramBasedInterface.condition_wait_UP$FUNC);
    static final FunctionDescriptor condition_wait_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle condition_wait_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDatagramBasedInterface.condition_wait_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*condition_wait)(GDatagramBased*,GIOCondition,gint64,GCancellable*,GError**);
     * }
     */
    public interface condition_wait {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, long _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(condition_wait fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDatagramBasedInterface.condition_wait_UP$MH, fi, _GDatagramBasedInterface.condition_wait$FUNC, scope);
        }
        static condition_wait ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, long __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)_GDatagramBasedInterface.condition_wait_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle condition_wait$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("condition_wait"));
    public static VarHandle condition_wait$VH() {
        return _GDatagramBasedInterface.condition_wait$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*condition_wait)(GDatagramBased*,GIOCondition,gint64,GCancellable*,GError**);
     * }
     */
    public static MemorySegment condition_wait$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.condition_wait$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*condition_wait)(GDatagramBased*,GIOCondition,gint64,GCancellable*,GError**);
     * }
     */
    public static void condition_wait$set(MemorySegment seg, MemorySegment x) {
        _GDatagramBasedInterface.condition_wait$VH.set(seg, x);
    }
    public static MemorySegment condition_wait$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDatagramBasedInterface.condition_wait$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void condition_wait$set(MemorySegment seg, long index, MemorySegment x) {
        _GDatagramBasedInterface.condition_wait$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static condition_wait condition_wait(MemorySegment segment, SegmentScope scope) {
        return condition_wait.ofAddress(condition_wait$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


