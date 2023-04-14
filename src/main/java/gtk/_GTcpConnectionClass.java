// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GTcpConnectionClass {
 *     GSocketConnectionClass parent_class;
 * };
 * }
 */
public class _GTcpConnectionClass {

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
                Constants$root.C_POINTER$LAYOUT.withName("get_input_stream"),
                Constants$root.C_POINTER$LAYOUT.withName("get_output_stream"),
                Constants$root.C_POINTER$LAYOUT.withName("close_fn"),
                Constants$root.C_POINTER$LAYOUT.withName("close_async"),
                Constants$root.C_POINTER$LAYOUT.withName("close_finish"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved6"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved7"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved8"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved9"),
                Constants$root.C_POINTER$LAYOUT.withName("_g_reserved10")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5"),
            Constants$root.C_POINTER$LAYOUT.withName("_g_reserved6")
        ).withName("parent_class")
    ).withName("_GTcpConnectionClass");
    public static MemoryLayout $LAYOUT() {
        return _GTcpConnectionClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 304);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


