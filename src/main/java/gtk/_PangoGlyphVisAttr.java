// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoGlyphVisAttr {
 *      *     guint is_cluster_start;
 *     guint is_color;
 * };
 * }
 */
public class _PangoGlyphVisAttr {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(32)
    ).withName("_PangoGlyphVisAttr");
    public static MemoryLayout $LAYOUT() {
        return _PangoGlyphVisAttr.$struct$LAYOUT;
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

