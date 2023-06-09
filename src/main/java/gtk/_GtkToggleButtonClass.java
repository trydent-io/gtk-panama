// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkToggleButtonClass {
 *     GtkButtonClass parent_class;
 *     void (*toggled)(GtkToggleButton*);
 *     gpointer padding[8];
 * };
 * }
 */
public class _GtkToggleButtonClass {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            Constants$root.C_POINTER$LAYOUT.withName("clicked"),
            Constants$root.C_POINTER$LAYOUT.withName("activate"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("toggled"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GtkToggleButtonClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkToggleButtonClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 488);
    }
    static final FunctionDescriptor toggled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor toggled_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle toggled_UP$MH = RuntimeHelper.upcallHandle(toggled.class, "apply", _GtkToggleButtonClass.toggled_UP$FUNC);
    static final FunctionDescriptor toggled_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle toggled_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkToggleButtonClass.toggled_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*toggled)(GtkToggleButton*);
     * }
     */
    public interface toggled {

        void apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(toggled fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkToggleButtonClass.toggled_UP$MH, fi, _GtkToggleButtonClass.toggled$FUNC, scope);
        }
        static toggled ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkToggleButtonClass.toggled_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle toggled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("toggled"));
    public static VarHandle toggled$VH() {
        return _GtkToggleButtonClass.toggled$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*toggled)(GtkToggleButton*);
     * }
     */
    public static MemorySegment toggled$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkToggleButtonClass.toggled$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*toggled)(GtkToggleButton*);
     * }
     */
    public static void toggled$set(MemorySegment seg, MemorySegment x) {
        _GtkToggleButtonClass.toggled$VH.set(seg, x);
    }
    public static MemorySegment toggled$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkToggleButtonClass.toggled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void toggled$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkToggleButtonClass.toggled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static toggled toggled(MemorySegment segment, SegmentScope scope) {
        return toggled.ofAddress(toggled$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(496, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


