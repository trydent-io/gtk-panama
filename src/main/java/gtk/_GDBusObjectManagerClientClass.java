// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GDBusObjectManagerClientClass {
 *     GObjectClass parent_class;
 *     void (*interface_proxy_signal)(GDBusObjectManagerClient*,GDBusObjectProxy*,GDBusProxy*,const gchar*,const gchar*,GVariant*);
 *     void (*interface_proxy_properties_changed)(GDBusObjectManagerClient*,GDBusObjectProxy*,GDBusProxy*,GVariant*,const gchar**);
 *     gpointer padding[8];
 * };
 * }
 */
public class _GDBusObjectManagerClientClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("interface_proxy_signal"),
        Constants$root.C_POINTER$LAYOUT.withName("interface_proxy_properties_changed"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GDBusObjectManagerClientClass");
    public static MemoryLayout $LAYOUT() {
        return _GDBusObjectManagerClientClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor interface_proxy_signal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor interface_proxy_signal_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_proxy_signal_UP$MH = RuntimeHelper.upcallHandle(interface_proxy_signal.class, "apply", _GDBusObjectManagerClientClass.interface_proxy_signal_UP$FUNC);
    static final FunctionDescriptor interface_proxy_signal_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_proxy_signal_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerClientClass.interface_proxy_signal_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*interface_proxy_signal)(GDBusObjectManagerClient*,GDBusObjectProxy*,GDBusProxy*,const gchar*,const gchar*,GVariant*);
     * }
     */
    public interface interface_proxy_signal {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(interface_proxy_signal fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusObjectManagerClientClass.interface_proxy_signal_UP$MH, fi, _GDBusObjectManagerClientClass.interface_proxy_signal$FUNC, scope);
        }
        static interface_proxy_signal ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    _GDBusObjectManagerClientClass.interface_proxy_signal_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle interface_proxy_signal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_signal"));
    public static VarHandle interface_proxy_signal$VH() {
        return _GDBusObjectManagerClientClass.interface_proxy_signal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*interface_proxy_signal)(GDBusObjectManagerClient*,GDBusObjectProxy*,GDBusProxy*,const gchar*,const gchar*,GVariant*);
     * }
     */
    public static MemorySegment interface_proxy_signal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectManagerClientClass.interface_proxy_signal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*interface_proxy_signal)(GDBusObjectManagerClient*,GDBusObjectProxy*,GDBusProxy*,const gchar*,const gchar*,GVariant*);
     * }
     */
    public static void interface_proxy_signal$set(MemorySegment seg, MemorySegment x) {
        _GDBusObjectManagerClientClass.interface_proxy_signal$VH.set(seg, x);
    }
    public static MemorySegment interface_proxy_signal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectManagerClientClass.interface_proxy_signal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_proxy_signal$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusObjectManagerClientClass.interface_proxy_signal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static interface_proxy_signal interface_proxy_signal(MemorySegment segment, SegmentScope scope) {
        return interface_proxy_signal.ofAddress(interface_proxy_signal$get(segment), scope);
    }
    static final FunctionDescriptor interface_proxy_properties_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor interface_proxy_properties_changed_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_proxy_properties_changed_UP$MH = RuntimeHelper.upcallHandle(interface_proxy_properties_changed.class, "apply", _GDBusObjectManagerClientClass.interface_proxy_properties_changed_UP$FUNC);
    static final FunctionDescriptor interface_proxy_properties_changed_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_proxy_properties_changed_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerClientClass.interface_proxy_properties_changed_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*interface_proxy_properties_changed)(GDBusObjectManagerClient*,GDBusObjectProxy*,GDBusProxy*,GVariant*,const gchar**);
     * }
     */
    public interface interface_proxy_properties_changed {

        void apply(java.lang.foreign.MemorySegment tree_column, java.lang.foreign.MemorySegment cell, java.lang.foreign.MemorySegment tree_model, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(interface_proxy_properties_changed fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusObjectManagerClientClass.interface_proxy_properties_changed_UP$MH, fi, _GDBusObjectManagerClientClass.interface_proxy_properties_changed$FUNC, scope);
        }
        static interface_proxy_properties_changed ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tree_column, java.lang.foreign.MemorySegment _cell, java.lang.foreign.MemorySegment _tree_model, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GDBusObjectManagerClientClass.interface_proxy_properties_changed_DOWN$MH.invokeExact(symbol, _tree_column, _cell, _tree_model, _iter, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle interface_proxy_properties_changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("interface_proxy_properties_changed"));
    public static VarHandle interface_proxy_properties_changed$VH() {
        return _GDBusObjectManagerClientClass.interface_proxy_properties_changed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*interface_proxy_properties_changed)(GDBusObjectManagerClient*,GDBusObjectProxy*,GDBusProxy*,GVariant*,const gchar**);
     * }
     */
    public static MemorySegment interface_proxy_properties_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectManagerClientClass.interface_proxy_properties_changed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*interface_proxy_properties_changed)(GDBusObjectManagerClient*,GDBusObjectProxy*,GDBusProxy*,GVariant*,const gchar**);
     * }
     */
    public static void interface_proxy_properties_changed$set(MemorySegment seg, MemorySegment x) {
        _GDBusObjectManagerClientClass.interface_proxy_properties_changed$VH.set(seg, x);
    }
    public static MemorySegment interface_proxy_properties_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectManagerClientClass.interface_proxy_properties_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_proxy_properties_changed$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusObjectManagerClientClass.interface_proxy_properties_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static interface_proxy_properties_changed interface_proxy_properties_changed(MemorySegment segment, SegmentScope scope) {
        return interface_proxy_properties_changed.ofAddress(interface_proxy_properties_changed$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(152, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


