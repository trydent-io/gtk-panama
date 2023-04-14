// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GProxyInterface {
 *     GTypeInterface g_iface;
 *     GIOStream* (*connect)(GProxy*,GIOStream*,GProxyAddress*,GCancellable*,GError**);
 *     void (*connect_async)(GProxy*,GIOStream*,GProxyAddress*,GCancellable*,GAsyncReadyCallback,gpointer);
 *     GIOStream* (*connect_finish)(GProxy*,GAsyncResult*,GError**);
 *     gboolean (*supports_hostname)(GProxy*);
 * };
 * }
 */
public class _GProxyInterface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("connect"),
        Constants$root.C_POINTER$LAYOUT.withName("connect_async"),
        Constants$root.C_POINTER$LAYOUT.withName("connect_finish"),
        Constants$root.C_POINTER$LAYOUT.withName("supports_hostname")
    ).withName("_GProxyInterface");
    public static MemoryLayout $LAYOUT() {
        return _GProxyInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor connect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor connect_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle connect_UP$MH = RuntimeHelper.upcallHandle(connect.class, "apply", _GProxyInterface.connect_UP$FUNC);
    static final FunctionDescriptor connect_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle connect_DOWN$MH = RuntimeHelper.downcallHandle(
        _GProxyInterface.connect_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GIOStream* (*connect)(GProxy*,GIOStream*,GProxyAddress*,GCancellable*,GError**);
     * }
     */
    public interface connect {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment connection, java.lang.foreign.MemorySegment sender, java.lang.foreign.MemorySegment object_path, java.lang.foreign.MemorySegment node, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(connect fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GProxyInterface.connect_UP$MH, fi, _GProxyInterface.connect$FUNC, scope);
        }
        static connect ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _connection, java.lang.foreign.MemorySegment _sender, java.lang.foreign.MemorySegment _object_path, java.lang.foreign.MemorySegment _node, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GProxyInterface.connect_DOWN$MH.invokeExact(symbol, _connection, _sender, _object_path, _node, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle connect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("connect"));
    public static VarHandle connect$VH() {
        return _GProxyInterface.connect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GIOStream* (*connect)(GProxy*,GIOStream*,GProxyAddress*,GCancellable*,GError**);
     * }
     */
    public static MemorySegment connect$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GProxyInterface.connect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GIOStream* (*connect)(GProxy*,GIOStream*,GProxyAddress*,GCancellable*,GError**);
     * }
     */
    public static void connect$set(MemorySegment seg, MemorySegment x) {
        _GProxyInterface.connect$VH.set(seg, x);
    }
    public static MemorySegment connect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GProxyInterface.connect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void connect$set(MemorySegment seg, long index, MemorySegment x) {
        _GProxyInterface.connect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static connect connect(MemorySegment segment, SegmentScope scope) {
        return connect.ofAddress(connect$get(segment), scope);
    }
    static final FunctionDescriptor connect_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor connect_async_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle connect_async_UP$MH = RuntimeHelper.upcallHandle(connect_async.class, "apply", _GProxyInterface.connect_async_UP$FUNC);
    static final FunctionDescriptor connect_async_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle connect_async_DOWN$MH = RuntimeHelper.downcallHandle(
        _GProxyInterface.connect_async_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*connect_async)(GProxy*,GIOStream*,GProxyAddress*,GCancellable*,GAsyncReadyCallback,gpointer);
     * }
     */
    public interface connect_async {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(connect_async fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GProxyInterface.connect_async_UP$MH, fi, _GProxyInterface.connect_async$FUNC, scope);
        }
        static connect_async ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    _GProxyInterface.connect_async_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle connect_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("connect_async"));
    public static VarHandle connect_async$VH() {
        return _GProxyInterface.connect_async$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*connect_async)(GProxy*,GIOStream*,GProxyAddress*,GCancellable*,GAsyncReadyCallback,gpointer);
     * }
     */
    public static MemorySegment connect_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GProxyInterface.connect_async$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*connect_async)(GProxy*,GIOStream*,GProxyAddress*,GCancellable*,GAsyncReadyCallback,gpointer);
     * }
     */
    public static void connect_async$set(MemorySegment seg, MemorySegment x) {
        _GProxyInterface.connect_async$VH.set(seg, x);
    }
    public static MemorySegment connect_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GProxyInterface.connect_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void connect_async$set(MemorySegment seg, long index, MemorySegment x) {
        _GProxyInterface.connect_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static connect_async connect_async(MemorySegment segment, SegmentScope scope) {
        return connect_async.ofAddress(connect_async$get(segment), scope);
    }
    static final FunctionDescriptor connect_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor connect_finish_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle connect_finish_UP$MH = RuntimeHelper.upcallHandle(connect_finish.class, "apply", _GProxyInterface.connect_finish_UP$FUNC);
    static final FunctionDescriptor connect_finish_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle connect_finish_DOWN$MH = RuntimeHelper.downcallHandle(
        _GProxyInterface.connect_finish_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GIOStream* (*connect_finish)(GProxy*,GAsyncResult*,GError**);
     * }
     */
    public interface connect_finish {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(connect_finish fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GProxyInterface.connect_finish_UP$MH, fi, _GProxyInterface.connect_finish$FUNC, scope);
        }
        static connect_finish ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _vfs, java.lang.foreign.MemorySegment _identifier, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GProxyInterface.connect_finish_DOWN$MH.invokeExact(symbol, _vfs, _identifier, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle connect_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("connect_finish"));
    public static VarHandle connect_finish$VH() {
        return _GProxyInterface.connect_finish$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GIOStream* (*connect_finish)(GProxy*,GAsyncResult*,GError**);
     * }
     */
    public static MemorySegment connect_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GProxyInterface.connect_finish$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GIOStream* (*connect_finish)(GProxy*,GAsyncResult*,GError**);
     * }
     */
    public static void connect_finish$set(MemorySegment seg, MemorySegment x) {
        _GProxyInterface.connect_finish$VH.set(seg, x);
    }
    public static MemorySegment connect_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GProxyInterface.connect_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void connect_finish$set(MemorySegment seg, long index, MemorySegment x) {
        _GProxyInterface.connect_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static connect_finish connect_finish(MemorySegment segment, SegmentScope scope) {
        return connect_finish.ofAddress(connect_finish$get(segment), scope);
    }
    static final FunctionDescriptor supports_hostname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor supports_hostname_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle supports_hostname_UP$MH = RuntimeHelper.upcallHandle(supports_hostname.class, "apply", _GProxyInterface.supports_hostname_UP$FUNC);
    static final FunctionDescriptor supports_hostname_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle supports_hostname_DOWN$MH = RuntimeHelper.downcallHandle(
        _GProxyInterface.supports_hostname_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*supports_hostname)(GProxy*);
     * }
     */
    public interface supports_hostname {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(supports_hostname fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GProxyInterface.supports_hostname_UP$MH, fi, _GProxyInterface.supports_hostname$FUNC, scope);
        }
        static supports_hostname ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_GProxyInterface.supports_hostname_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle supports_hostname$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("supports_hostname"));
    public static VarHandle supports_hostname$VH() {
        return _GProxyInterface.supports_hostname$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*supports_hostname)(GProxy*);
     * }
     */
    public static MemorySegment supports_hostname$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GProxyInterface.supports_hostname$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*supports_hostname)(GProxy*);
     * }
     */
    public static void supports_hostname$set(MemorySegment seg, MemorySegment x) {
        _GProxyInterface.supports_hostname$VH.set(seg, x);
    }
    public static MemorySegment supports_hostname$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GProxyInterface.supports_hostname$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void supports_hostname$set(MemorySegment seg, long index, MemorySegment x) {
        _GProxyInterface.supports_hostname$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static supports_hostname supports_hostname(MemorySegment segment, SegmentScope scope) {
        return supports_hostname.ofAddress(supports_hostname$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


