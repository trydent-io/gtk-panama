// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GDBusInterfaceIface {
 *     GTypeInterface parent_iface;
 *     GDBusInterfaceInfo* (*get_info)(GDBusInterface*);
 *     GDBusObject* (*get_object)(GDBusInterface*);
 *     void (*set_object)(GDBusInterface*,GDBusObject*);
 *     GDBusObject* (*dup_object)(GDBusInterface*);
 * };
 * }
 */
public class _GDBusInterfaceIface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("get_info"),
        Constants$root.C_POINTER$LAYOUT.withName("get_object"),
        Constants$root.C_POINTER$LAYOUT.withName("set_object"),
        Constants$root.C_POINTER$LAYOUT.withName("dup_object")
    ).withName("_GDBusInterfaceIface");
    public static MemoryLayout $LAYOUT() {
        return _GDBusInterfaceIface.$struct$LAYOUT;
    }
    public static MemorySegment parent_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_info_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_info_UP$MH = RuntimeHelper.upcallHandle(get_info.class, "apply", _GDBusInterfaceIface.get_info_UP$FUNC);
    static final FunctionDescriptor get_info_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_info_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceIface.get_info_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GDBusInterfaceInfo* (*get_info)(GDBusInterface*);
     * }
     */
    public interface get_info {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_info fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusInterfaceIface.get_info_UP$MH, fi, _GDBusInterfaceIface.get_info$FUNC, scope);
        }
        static get_info ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.get_info_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_info$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_info"));
    public static VarHandle get_info$VH() {
        return _GDBusInterfaceIface.get_info$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusInterfaceInfo* (*get_info)(GDBusInterface*);
     * }
     */
    public static MemorySegment get_info$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.get_info$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusInterfaceInfo* (*get_info)(GDBusInterface*);
     * }
     */
    public static void get_info$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceIface.get_info$VH.set(seg, x);
    }
    public static MemorySegment get_info$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.get_info$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_info$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceIface.get_info$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_info get_info(MemorySegment segment, SegmentScope scope) {
        return get_info.ofAddress(get_info$get(segment), scope);
    }
    static final FunctionDescriptor get_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_object_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_object_UP$MH = RuntimeHelper.upcallHandle(get_object.class, "apply", _GDBusInterfaceIface.get_object_UP$FUNC);
    static final FunctionDescriptor get_object_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_object_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceIface.get_object_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GDBusObject* (*get_object)(GDBusInterface*);
     * }
     */
    public interface get_object {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_object fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusInterfaceIface.get_object_UP$MH, fi, _GDBusInterfaceIface.get_object$FUNC, scope);
        }
        static get_object ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.get_object_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_object$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_object"));
    public static VarHandle get_object$VH() {
        return _GDBusInterfaceIface.get_object$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusObject* (*get_object)(GDBusInterface*);
     * }
     */
    public static MemorySegment get_object$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.get_object$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusObject* (*get_object)(GDBusInterface*);
     * }
     */
    public static void get_object$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceIface.get_object$VH.set(seg, x);
    }
    public static MemorySegment get_object$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.get_object$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_object$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceIface.get_object$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_object get_object(MemorySegment segment, SegmentScope scope) {
        return get_object.ofAddress(get_object$get(segment), scope);
    }
    static final FunctionDescriptor set_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor set_object_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_object_UP$MH = RuntimeHelper.upcallHandle(set_object.class, "apply", _GDBusInterfaceIface.set_object_UP$FUNC);
    static final FunctionDescriptor set_object_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_object_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceIface.set_object_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*set_object)(GDBusInterface*,GDBusObject*);
     * }
     */
    public interface set_object {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(set_object fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusInterfaceIface.set_object_UP$MH, fi, _GDBusInterfaceIface.set_object$FUNC, scope);
        }
        static set_object ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GDBusInterfaceIface.set_object_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_object$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_object"));
    public static VarHandle set_object$VH() {
        return _GDBusInterfaceIface.set_object$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_object)(GDBusInterface*,GDBusObject*);
     * }
     */
    public static MemorySegment set_object$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.set_object$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_object)(GDBusInterface*,GDBusObject*);
     * }
     */
    public static void set_object$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceIface.set_object$VH.set(seg, x);
    }
    public static MemorySegment set_object$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.set_object$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_object$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceIface.set_object$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_object set_object(MemorySegment segment, SegmentScope scope) {
        return set_object.ofAddress(set_object$get(segment), scope);
    }
    static final FunctionDescriptor dup_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor dup_object_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle dup_object_UP$MH = RuntimeHelper.upcallHandle(dup_object.class, "apply", _GDBusInterfaceIface.dup_object_UP$FUNC);
    static final FunctionDescriptor dup_object_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle dup_object_DOWN$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceIface.dup_object_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GDBusObject* (*dup_object)(GDBusInterface*);
     * }
     */
    public interface dup_object {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(dup_object fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GDBusInterfaceIface.dup_object_UP$MH, fi, _GDBusInterfaceIface.dup_object$FUNC, scope);
        }
        static dup_object ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.dup_object_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle dup_object$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dup_object"));
    public static VarHandle dup_object$VH() {
        return _GDBusInterfaceIface.dup_object$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDBusObject* (*dup_object)(GDBusInterface*);
     * }
     */
    public static MemorySegment dup_object$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.dup_object$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDBusObject* (*dup_object)(GDBusInterface*);
     * }
     */
    public static void dup_object$set(MemorySegment seg, MemorySegment x) {
        _GDBusInterfaceIface.dup_object$VH.set(seg, x);
    }
    public static MemorySegment dup_object$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GDBusInterfaceIface.dup_object$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dup_object$set(MemorySegment seg, long index, MemorySegment x) {
        _GDBusInterfaceIface.dup_object$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static dup_object dup_object(MemorySegment segment, SegmentScope scope) {
        return dup_object.ofAddress(dup_object$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


