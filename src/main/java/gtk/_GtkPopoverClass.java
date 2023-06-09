// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkPopoverClass {
 *     GtkWidgetClass parent_class;
 *     void (*closed)(GtkPopover*);
 *     void (*activate_default)(GtkPopover*);
 *     gpointer reserved[8];
 * };
 * }
 */
public class _GtkPopoverClass {

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
            Constants$root.C_POINTER$LAYOUT.withName("show"),
            Constants$root.C_POINTER$LAYOUT.withName("hide"),
            Constants$root.C_POINTER$LAYOUT.withName("map"),
            Constants$root.C_POINTER$LAYOUT.withName("unmap"),
            Constants$root.C_POINTER$LAYOUT.withName("realize"),
            Constants$root.C_POINTER$LAYOUT.withName("unrealize"),
            Constants$root.C_POINTER$LAYOUT.withName("root"),
            Constants$root.C_POINTER$LAYOUT.withName("unroot"),
            Constants$root.C_POINTER$LAYOUT.withName("size_allocate"),
            Constants$root.C_POINTER$LAYOUT.withName("state_flags_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("direction_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("get_request_mode"),
            Constants$root.C_POINTER$LAYOUT.withName("measure"),
            Constants$root.C_POINTER$LAYOUT.withName("mnemonic_activate"),
            Constants$root.C_POINTER$LAYOUT.withName("grab_focus"),
            Constants$root.C_POINTER$LAYOUT.withName("focus"),
            Constants$root.C_POINTER$LAYOUT.withName("set_focus_child"),
            Constants$root.C_POINTER$LAYOUT.withName("move_focus"),
            Constants$root.C_POINTER$LAYOUT.withName("keynav_failed"),
            Constants$root.C_POINTER$LAYOUT.withName("query_tooltip"),
            Constants$root.C_POINTER$LAYOUT.withName("compute_expand"),
            Constants$root.C_POINTER$LAYOUT.withName("css_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("system_setting_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("snapshot"),
            Constants$root.C_POINTER$LAYOUT.withName("contains"),
            Constants$root.C_POINTER$LAYOUT.withName("priv"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("closed"),
        Constants$root.C_POINTER$LAYOUT.withName("activate_default"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("reserved")
    ).withName("_GtkPopoverClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkPopoverClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 408);
    }
    static final FunctionDescriptor closed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor closed_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle closed_UP$MH = RuntimeHelper.upcallHandle(closed.class, "apply", _GtkPopoverClass.closed_UP$FUNC);
    static final FunctionDescriptor closed_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle closed_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkPopoverClass.closed_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*closed)(GtkPopover*);
     * }
     */
    public interface closed {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(closed fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkPopoverClass.closed_UP$MH, fi, _GtkPopoverClass.closed$FUNC, scope);
        }
        static closed ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkPopoverClass.closed_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle closed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("closed"));
    public static VarHandle closed$VH() {
        return _GtkPopoverClass.closed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*closed)(GtkPopover*);
     * }
     */
    public static MemorySegment closed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkPopoverClass.closed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*closed)(GtkPopover*);
     * }
     */
    public static void closed$set(MemorySegment seg, MemorySegment x) {
        _GtkPopoverClass.closed$VH.set(seg, x);
    }
    public static MemorySegment closed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkPopoverClass.closed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void closed$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkPopoverClass.closed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static closed closed(MemorySegment segment, SegmentScope scope) {
        return closed.ofAddress(closed$get(segment), scope);
    }
    static final FunctionDescriptor activate_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor activate_default_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate_default_UP$MH = RuntimeHelper.upcallHandle(activate_default.class, "apply", _GtkPopoverClass.activate_default_UP$FUNC);
    static final FunctionDescriptor activate_default_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate_default_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkPopoverClass.activate_default_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*activate_default)(GtkPopover*);
     * }
     */
    public interface activate_default {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(activate_default fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkPopoverClass.activate_default_UP$MH, fi, _GtkPopoverClass.activate_default$FUNC, scope);
        }
        static activate_default ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkPopoverClass.activate_default_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle activate_default$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("activate_default"));
    public static VarHandle activate_default$VH() {
        return _GtkPopoverClass.activate_default$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate_default)(GtkPopover*);
     * }
     */
    public static MemorySegment activate_default$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkPopoverClass.activate_default$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate_default)(GtkPopover*);
     * }
     */
    public static void activate_default$set(MemorySegment seg, MemorySegment x) {
        _GtkPopoverClass.activate_default$VH.set(seg, x);
    }
    public static MemorySegment activate_default$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkPopoverClass.activate_default$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void activate_default$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkPopoverClass.activate_default$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate_default activate_default(MemorySegment segment, SegmentScope scope) {
        return activate_default.ofAddress(activate_default$get(segment), scope);
    }
    public static MemorySegment reserved$slice(MemorySegment seg) {
        return seg.asSlice(424, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


