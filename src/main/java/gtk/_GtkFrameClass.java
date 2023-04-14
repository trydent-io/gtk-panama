// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkFrameClass {
 *     GtkWidgetClass parent_class;
 *     void (*compute_child_allocation)(GtkFrame*,GtkAllocation*);
 *     gpointer padding[8];
 * };
 * }
 */
public class _GtkFrameClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("compute_child_allocation"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GtkFrameClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkFrameClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 408);
    }
    static final FunctionDescriptor compute_child_allocation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor compute_child_allocation_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle compute_child_allocation_UP$MH = RuntimeHelper.upcallHandle(compute_child_allocation.class, "apply", _GtkFrameClass.compute_child_allocation_UP$FUNC);
    static final FunctionDescriptor compute_child_allocation_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle compute_child_allocation_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkFrameClass.compute_child_allocation_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*compute_child_allocation)(GtkFrame*,GtkAllocation*);
     * }
     */
    public interface compute_child_allocation {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(compute_child_allocation fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkFrameClass.compute_child_allocation_UP$MH, fi, _GtkFrameClass.compute_child_allocation$FUNC, scope);
        }
        static compute_child_allocation ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GtkFrameClass.compute_child_allocation_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle compute_child_allocation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("compute_child_allocation"));
    public static VarHandle compute_child_allocation$VH() {
        return _GtkFrameClass.compute_child_allocation$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*compute_child_allocation)(GtkFrame*,GtkAllocation*);
     * }
     */
    public static MemorySegment compute_child_allocation$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkFrameClass.compute_child_allocation$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*compute_child_allocation)(GtkFrame*,GtkAllocation*);
     * }
     */
    public static void compute_child_allocation$set(MemorySegment seg, MemorySegment x) {
        _GtkFrameClass.compute_child_allocation$VH.set(seg, x);
    }
    public static MemorySegment compute_child_allocation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkFrameClass.compute_child_allocation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void compute_child_allocation$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkFrameClass.compute_child_allocation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static compute_child_allocation compute_child_allocation(MemorySegment segment, SegmentScope scope) {
        return compute_child_allocation.ofAddress(compute_child_allocation$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(416, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

