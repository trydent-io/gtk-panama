// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GAppLaunchContextClass {
 *     GObjectClass parent_class;
 *     char* (*get_display)(GAppLaunchContext*,GAppInfo*,GList*);
 *     char* (*get_startup_notify_id)(GAppLaunchContext*,GAppInfo*,GList*);
 *     void (*launch_failed)(GAppLaunchContext*,char*);
 *     void (*launched)(GAppLaunchContext*,GAppInfo*,GVariant*);
 *     void (*launch_started)(GAppLaunchContext*,GAppInfo*,GVariant*);
 *     void (*_g_reserved1)();
 *     void (*_g_reserved2)();
 *     void (*_g_reserved3)();
 * };
 * }
 */
public class _GAppLaunchContextClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_display"),
        Constants$root.C_POINTER$LAYOUT.withName("get_startup_notify_id"),
        Constants$root.C_POINTER$LAYOUT.withName("launch_failed"),
        Constants$root.C_POINTER$LAYOUT.withName("launched"),
        Constants$root.C_POINTER$LAYOUT.withName("launch_started"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3")
    ).withName("_GAppLaunchContextClass");
    public static MemoryLayout $LAYOUT() {
        return _GAppLaunchContextClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_display_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_display_UP$MH = RuntimeHelper.upcallHandle(get_display.class, "apply", _GAppLaunchContextClass.get_display_UP$FUNC);
    static final FunctionDescriptor get_display_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_display_DOWN$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass.get_display_DOWN$FUNC
    );
    /**
     * {@snippet :
 * char* (*get_display)(GAppLaunchContext*,GAppInfo*,GList*);
     * }
     */
    public interface get_display {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_display fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GAppLaunchContextClass.get_display_UP$MH, fi, _GAppLaunchContextClass.get_display$FUNC, scope);
        }
        static get_display ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _vfs, java.lang.foreign.MemorySegment _identifier, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.get_display_DOWN$MH.invokeExact(symbol, _vfs, _identifier, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_display"));
    public static VarHandle get_display$VH() {
        return _GAppLaunchContextClass.get_display$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_display)(GAppLaunchContext*,GAppInfo*,GList*);
     * }
     */
    public static MemorySegment get_display$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.get_display$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_display)(GAppLaunchContext*,GAppInfo*,GList*);
     * }
     */
    public static void get_display$set(MemorySegment seg, MemorySegment x) {
        _GAppLaunchContextClass.get_display$VH.set(seg, x);
    }
    public static MemorySegment get_display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.get_display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_display$set(MemorySegment seg, long index, MemorySegment x) {
        _GAppLaunchContextClass.get_display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_display get_display(MemorySegment segment, SegmentScope scope) {
        return get_display.ofAddress(get_display$get(segment), scope);
    }
    static final FunctionDescriptor get_startup_notify_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_startup_notify_id_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_startup_notify_id_UP$MH = RuntimeHelper.upcallHandle(get_startup_notify_id.class, "apply", _GAppLaunchContextClass.get_startup_notify_id_UP$FUNC);
    static final FunctionDescriptor get_startup_notify_id_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_startup_notify_id_DOWN$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass.get_startup_notify_id_DOWN$FUNC
    );
    /**
     * {@snippet :
 * char* (*get_startup_notify_id)(GAppLaunchContext*,GAppInfo*,GList*);
     * }
     */
    public interface get_startup_notify_id {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_startup_notify_id fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GAppLaunchContextClass.get_startup_notify_id_UP$MH, fi, _GAppLaunchContextClass.get_startup_notify_id$FUNC, scope);
        }
        static get_startup_notify_id ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _vfs, java.lang.foreign.MemorySegment _identifier, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.get_startup_notify_id_DOWN$MH.invokeExact(symbol, _vfs, _identifier, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_startup_notify_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_startup_notify_id"));
    public static VarHandle get_startup_notify_id$VH() {
        return _GAppLaunchContextClass.get_startup_notify_id$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_startup_notify_id)(GAppLaunchContext*,GAppInfo*,GList*);
     * }
     */
    public static MemorySegment get_startup_notify_id$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.get_startup_notify_id$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_startup_notify_id)(GAppLaunchContext*,GAppInfo*,GList*);
     * }
     */
    public static void get_startup_notify_id$set(MemorySegment seg, MemorySegment x) {
        _GAppLaunchContextClass.get_startup_notify_id$VH.set(seg, x);
    }
    public static MemorySegment get_startup_notify_id$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.get_startup_notify_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_startup_notify_id$set(MemorySegment seg, long index, MemorySegment x) {
        _GAppLaunchContextClass.get_startup_notify_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_startup_notify_id get_startup_notify_id(MemorySegment segment, SegmentScope scope) {
        return get_startup_notify_id.ofAddress(get_startup_notify_id$get(segment), scope);
    }
    static final FunctionDescriptor launch_failed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor launch_failed_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle launch_failed_UP$MH = RuntimeHelper.upcallHandle(launch_failed.class, "apply", _GAppLaunchContextClass.launch_failed_UP$FUNC);
    static final FunctionDescriptor launch_failed_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle launch_failed_DOWN$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass.launch_failed_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*launch_failed)(GAppLaunchContext*,char*);
     * }
     */
    public interface launch_failed {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(launch_failed fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GAppLaunchContextClass.launch_failed_UP$MH, fi, _GAppLaunchContextClass.launch_failed$FUNC, scope);
        }
        static launch_failed ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GAppLaunchContextClass.launch_failed_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle launch_failed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("launch_failed"));
    public static VarHandle launch_failed$VH() {
        return _GAppLaunchContextClass.launch_failed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*launch_failed)(GAppLaunchContext*,char*);
     * }
     */
    public static MemorySegment launch_failed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.launch_failed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*launch_failed)(GAppLaunchContext*,char*);
     * }
     */
    public static void launch_failed$set(MemorySegment seg, MemorySegment x) {
        _GAppLaunchContextClass.launch_failed$VH.set(seg, x);
    }
    public static MemorySegment launch_failed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.launch_failed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void launch_failed$set(MemorySegment seg, long index, MemorySegment x) {
        _GAppLaunchContextClass.launch_failed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static launch_failed launch_failed(MemorySegment segment, SegmentScope scope) {
        return launch_failed.ofAddress(launch_failed$get(segment), scope);
    }
    static final FunctionDescriptor launched$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor launched_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle launched_UP$MH = RuntimeHelper.upcallHandle(launched.class, "apply", _GAppLaunchContextClass.launched_UP$FUNC);
    static final FunctionDescriptor launched_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle launched_DOWN$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass.launched_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*launched)(GAppLaunchContext*,GAppInfo*,GVariant*);
     * }
     */
    public interface launched {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(launched fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GAppLaunchContextClass.launched_UP$MH, fi, _GAppLaunchContextClass.launched$FUNC, scope);
        }
        static launched ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GAppLaunchContextClass.launched_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle launched$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("launched"));
    public static VarHandle launched$VH() {
        return _GAppLaunchContextClass.launched$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*launched)(GAppLaunchContext*,GAppInfo*,GVariant*);
     * }
     */
    public static MemorySegment launched$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.launched$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*launched)(GAppLaunchContext*,GAppInfo*,GVariant*);
     * }
     */
    public static void launched$set(MemorySegment seg, MemorySegment x) {
        _GAppLaunchContextClass.launched$VH.set(seg, x);
    }
    public static MemorySegment launched$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.launched$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void launched$set(MemorySegment seg, long index, MemorySegment x) {
        _GAppLaunchContextClass.launched$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static launched launched(MemorySegment segment, SegmentScope scope) {
        return launched.ofAddress(launched$get(segment), scope);
    }
    static final FunctionDescriptor launch_started$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor launch_started_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle launch_started_UP$MH = RuntimeHelper.upcallHandle(launch_started.class, "apply", _GAppLaunchContextClass.launch_started_UP$FUNC);
    static final FunctionDescriptor launch_started_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle launch_started_DOWN$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass.launch_started_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*launch_started)(GAppLaunchContext*,GAppInfo*,GVariant*);
     * }
     */
    public interface launch_started {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(launch_started fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GAppLaunchContextClass.launch_started_UP$MH, fi, _GAppLaunchContextClass.launch_started$FUNC, scope);
        }
        static launch_started ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GAppLaunchContextClass.launch_started_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle launch_started$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("launch_started"));
    public static VarHandle launch_started$VH() {
        return _GAppLaunchContextClass.launch_started$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*launch_started)(GAppLaunchContext*,GAppInfo*,GVariant*);
     * }
     */
    public static MemorySegment launch_started$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.launch_started$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*launch_started)(GAppLaunchContext*,GAppInfo*,GVariant*);
     * }
     */
    public static void launch_started$set(MemorySegment seg, MemorySegment x) {
        _GAppLaunchContextClass.launch_started$VH.set(seg, x);
    }
    public static MemorySegment launch_started$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass.launch_started$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void launch_started$set(MemorySegment seg, long index, MemorySegment x) {
        _GAppLaunchContextClass.launch_started$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static launch_started launch_started(MemorySegment segment, SegmentScope scope) {
        return launch_started.ofAddress(launch_started$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1_UP$MH = RuntimeHelper.upcallHandle(_g_reserved1.class, "apply", _GAppLaunchContextClass._g_reserved1_UP$FUNC);
    static final FunctionDescriptor _g_reserved1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass._g_reserved1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved1)();
     * }
     */
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GAppLaunchContextClass._g_reserved1_UP$MH, fi, _GAppLaunchContextClass._g_reserved1$FUNC, scope);
        }
        static _g_reserved1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GAppLaunchContextClass._g_reserved1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
    public static VarHandle _g_reserved1$VH() {
        return _GAppLaunchContextClass._g_reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static MemorySegment _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass._g_reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static void _g_reserved1$set(MemorySegment seg, MemorySegment x) {
        _GAppLaunchContextClass._g_reserved1$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass._g_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        _GAppLaunchContextClass._g_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1(MemorySegment segment, SegmentScope scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2_UP$MH = RuntimeHelper.upcallHandle(_g_reserved2.class, "apply", _GAppLaunchContextClass._g_reserved2_UP$FUNC);
    static final FunctionDescriptor _g_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass._g_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved2)();
     * }
     */
    public interface _g_reserved2 {

        void apply();
        static MemorySegment allocate(_g_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GAppLaunchContextClass._g_reserved2_UP$MH, fi, _GAppLaunchContextClass._g_reserved2$FUNC, scope);
        }
        static _g_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GAppLaunchContextClass._g_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    public static VarHandle _g_reserved2$VH() {
        return _GAppLaunchContextClass._g_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static MemorySegment _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass._g_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static void _g_reserved2$set(MemorySegment seg, MemorySegment x) {
        _GAppLaunchContextClass._g_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass._g_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _GAppLaunchContextClass._g_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2(MemorySegment segment, SegmentScope scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _g_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _g_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3_UP$MH = RuntimeHelper.upcallHandle(_g_reserved3.class, "apply", _GAppLaunchContextClass._g_reserved3_UP$FUNC);
    static final FunctionDescriptor _g_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GAppLaunchContextClass._g_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_g_reserved3)();
     * }
     */
    public interface _g_reserved3 {

        void apply();
        static MemorySegment allocate(_g_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GAppLaunchContextClass._g_reserved3_UP$MH, fi, _GAppLaunchContextClass._g_reserved3$FUNC, scope);
        }
        static _g_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GAppLaunchContextClass._g_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"));
    public static VarHandle _g_reserved3$VH() {
        return _GAppLaunchContextClass._g_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static MemorySegment _g_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass._g_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static void _g_reserved3$set(MemorySegment seg, MemorySegment x) {
        _GAppLaunchContextClass._g_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _g_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GAppLaunchContextClass._g_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _GAppLaunchContextClass._g_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3(MemorySegment segment, SegmentScope scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


