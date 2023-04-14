// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GDBusObjectIface {
 *     GTypeInterface parent_iface;
 *     const gchar* (*get_object_path)(GDBusObject*);
 *     GList* (*get_interfaces)(GDBusObject*);
 *     GDBusInterface* (*get_interface)(GDBusObject*,const gchar*);
 *     void (*interface_added)(GDBusObject*,GDBusInterface*);
 *     void (*interface_removed)(GDBusObject*,GDBusInterface*);
 * };
 * }
 */
public class _GDBusObjectIface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("get_object_path"),
        Constants$root.C_POINTER$LAYOUT.withName("get_interfaces"),
        Constants$root.C_POINTER$LAYOUT.withName("get_interface"),
        Constants$root.C_POINTER$LAYOUT.withName("interface_added"),
        Constants$root.C_POINTER$LAYOUT.withName("interface_removed")
    ).withName("_GDBusObjectIface");
    public static MemoryLayout $LAYOUT() {
        return _GDBusObjectIface.$struct$LAYOUT;
    }
    public static MemorySegment parent_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_object_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_object_path_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_object_path_UP$MH = RuntimeHelper.upcallHandle(get_object_path.class, "apply", _GDBusObjectIface.get_object_path_UP$FUNC);
    static final FunctionDescriptor get_object_path_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_object_path_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectIface.get_object_path_DOWN$FUNC
    );
    /**
     * {@snippet :
 * const gchar* (*get_object_path)(GDBusObject*);
     * }
     */
    public interface get_object_path {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_object_path fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusObjectIface.get_object_path_UP$MH, fi, _GDBusObjectIface.get_object_path$FUNC, scope);
        }
        static get_object_path ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GDBusObjectIface.get_object_path_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_object_path$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_object_path"));
    public static VarHandle get_object_path$VH() {
        return _GDBusObjectIface.get_object_path$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* (*get_object_path)(GDBusObject*);
     * }
     */
    public static MemorySegment get_object_path$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectIface.get_object_path$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* (*get_object_path)(GDBusObject*);
     * }
     */
    public static void get_object_path$set(MemorySegment seg, MemorySegment x) {
        _GDBusObjectIface.get_object_path$VH.set(seg, x);
    }
    public static MemorySegment get_object_path$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectIface.get_object_path$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_object_path$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusObjectIface.get_object_path$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_object_path get_object_path(MemorySegment segment, SegmentScope scope) {
        return get_object_path.ofAddress(get_object_path$get(segment), scope);
    }
    static final FunctionDescriptor get_interfaces$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_interfaces_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_interfaces_UP$MH = RuntimeHelper.upcallHandle(get_interfaces.class, "apply", _GDBusObjectIface.get_interfaces_UP$FUNC);
    static final FunctionDescriptor get_interfaces_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_interfaces_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectIface.get_interfaces_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GList* (*get_interfaces)(GDBusObject*);
     * }
     */
    public interface get_interfaces {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_interfaces fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusObjectIface.get_interfaces_UP$MH, fi, _GDBusObjectIface.get_interfaces$FUNC, scope);
        }
        static get_interfaces ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GDBusObjectIface.get_interfaces_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_interfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_interfaces"));
    public static VarHandle get_interfaces$VH() {
        return _GDBusObjectIface.get_interfaces$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GList* (*get_interfaces)(GDBusObject*);
     * }
     */
    public static MemorySegment get_interfaces$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectIface.get_interfaces$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GList* (*get_interfaces)(GDBusObject*);
     * }
     */
    public static void get_interfaces$set(MemorySegment seg, MemorySegment x) {
        _GDBusObjectIface.get_interfaces$VH.set(seg, x);
    }
    public static MemorySegment get_interfaces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectIface.get_interfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_interfaces$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusObjectIface.get_interfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_interfaces get_interfaces(MemorySegment segment, SegmentScope scope) {
        return get_interfaces.ofAddress(get_interfaces$get(segment), scope);
    }
    static final FunctionDescriptor get_interface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_interface_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_interface_UP$MH = RuntimeHelper.upcallHandle(get_interface.class, "apply", _GDBusObjectIface.get_interface_UP$FUNC);
    static final FunctionDescriptor get_interface_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_interface_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectIface.get_interface_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GDBusInterface* (*get_interface)(GDBusObject*,const gchar*);
     * }
     */
    public interface get_interface {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment item, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_interface fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusObjectIface.get_interface_UP$MH, fi, _GDBusObjectIface.get_interface$FUNC, scope);
        }
        static get_interface ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _item, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GDBusObjectIface.get_interface_DOWN$MH.invokeExact(symbol, _item, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_interface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_interface"));
    public static VarHandle get_interface$VH() {
        return _GDBusObjectIface.get_interface$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusInterface* (*get_interface)(GDBusObject*,const gchar*);
     * }
     */
    public static MemorySegment get_interface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectIface.get_interface$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusInterface* (*get_interface)(GDBusObject*,const gchar*);
     * }
     */
    public static void get_interface$set(MemorySegment seg, MemorySegment x) {
        _GDBusObjectIface.get_interface$VH.set(seg, x);
    }
    public static MemorySegment get_interface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectIface.get_interface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_interface$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusObjectIface.get_interface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_interface get_interface(MemorySegment segment, SegmentScope scope) {
        return get_interface.ofAddress(get_interface$get(segment), scope);
    }
    static final FunctionDescriptor interface_added$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor interface_added_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_added_UP$MH = RuntimeHelper.upcallHandle(interface_added.class, "apply", _GDBusObjectIface.interface_added_UP$FUNC);
    static final FunctionDescriptor interface_added_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_added_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectIface.interface_added_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*interface_added)(GDBusObject*,GDBusInterface*);
     * }
     */
    public interface interface_added {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(interface_added fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusObjectIface.interface_added_UP$MH, fi, _GDBusObjectIface.interface_added$FUNC, scope);
        }
        static interface_added ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GDBusObjectIface.interface_added_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle interface_added$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("interface_added"));
    public static VarHandle interface_added$VH() {
        return _GDBusObjectIface.interface_added$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*interface_added)(GDBusObject*,GDBusInterface*);
     * }
     */
    public static MemorySegment interface_added$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectIface.interface_added$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*interface_added)(GDBusObject*,GDBusInterface*);
     * }
     */
    public static void interface_added$set(MemorySegment seg, MemorySegment x) {
        _GDBusObjectIface.interface_added$VH.set(seg, x);
    }
    public static MemorySegment interface_added$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectIface.interface_added$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_added$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusObjectIface.interface_added$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static interface_added interface_added(MemorySegment segment, SegmentScope scope) {
        return interface_added.ofAddress(interface_added$get(segment), scope);
    }
    static final FunctionDescriptor interface_removed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor interface_removed_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_removed_UP$MH = RuntimeHelper.upcallHandle(interface_removed.class, "apply", _GDBusObjectIface.interface_removed_UP$FUNC);
    static final FunctionDescriptor interface_removed_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_removed_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectIface.interface_removed_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*interface_removed)(GDBusObject*,GDBusInterface*);
     * }
     */
    public interface interface_removed {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(interface_removed fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusObjectIface.interface_removed_UP$MH, fi, _GDBusObjectIface.interface_removed$FUNC, scope);
        }
        static interface_removed ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GDBusObjectIface.interface_removed_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle interface_removed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("interface_removed"));
    public static VarHandle interface_removed$VH() {
        return _GDBusObjectIface.interface_removed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*interface_removed)(GDBusObject*,GDBusInterface*);
     * }
     */
    public static MemorySegment interface_removed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectIface.interface_removed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*interface_removed)(GDBusObject*,GDBusInterface*);
     * }
     */
    public static void interface_removed$set(MemorySegment seg, MemorySegment x) {
        _GDBusObjectIface.interface_removed$VH.set(seg, x);
    }
    public static MemorySegment interface_removed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusObjectIface.interface_removed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_removed$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusObjectIface.interface_removed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static interface_removed interface_removed(MemorySegment segment, SegmentScope scope) {
        return interface_removed.ofAddress(interface_removed$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

