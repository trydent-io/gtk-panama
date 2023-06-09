// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoAnalysis {
 *     PangoEngineShape* shape_engine;
 *     PangoEngineLang* lang_engine;
 *     PangoFont* font;
 *     guint8 level;
 *     guint8 gravity;
 *     guint8 flags;
 *     guint8 script;
 *     PangoLanguage* language;
 *     GSList* extra_attrs;
 * };
 * }
 */
public class _PangoAnalysis {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("shape_engine"),
        Constants$root.C_POINTER$LAYOUT.withName("lang_engine"),
        Constants$root.C_POINTER$LAYOUT.withName("font"),
        Constants$root.C_CHAR$LAYOUT.withName("level"),
        Constants$root.C_CHAR$LAYOUT.withName("gravity"),
        Constants$root.C_CHAR$LAYOUT.withName("flags"),
        Constants$root.C_CHAR$LAYOUT.withName("script"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("language"),
        Constants$root.C_POINTER$LAYOUT.withName("extra_attrs")
    ).withName("_PangoAnalysis");
    public static MemoryLayout $LAYOUT() {
        return _PangoAnalysis.$struct$LAYOUT;
    }
    static final VarHandle shape_engine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("shape_engine"));
    public static VarHandle shape_engine$VH() {
        return _PangoAnalysis.shape_engine$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoEngineShape* shape_engine;
     * }
     */
    public static MemorySegment shape_engine$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoAnalysis.shape_engine$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoEngineShape* shape_engine;
     * }
     */
    public static void shape_engine$set(MemorySegment seg, MemorySegment x) {
        _PangoAnalysis.shape_engine$VH.set(seg, x);
    }
    public static MemorySegment shape_engine$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoAnalysis.shape_engine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void shape_engine$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoAnalysis.shape_engine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lang_engine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lang_engine"));
    public static VarHandle lang_engine$VH() {
        return _PangoAnalysis.lang_engine$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoEngineLang* lang_engine;
     * }
     */
    public static MemorySegment lang_engine$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoAnalysis.lang_engine$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoEngineLang* lang_engine;
     * }
     */
    public static void lang_engine$set(MemorySegment seg, MemorySegment x) {
        _PangoAnalysis.lang_engine$VH.set(seg, x);
    }
    public static MemorySegment lang_engine$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoAnalysis.lang_engine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lang_engine$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoAnalysis.lang_engine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle font$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("font"));
    public static VarHandle font$VH() {
        return _PangoAnalysis.font$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoFont* font;
     * }
     */
    public static MemorySegment font$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoAnalysis.font$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoFont* font;
     * }
     */
    public static void font$set(MemorySegment seg, MemorySegment x) {
        _PangoAnalysis.font$VH.set(seg, x);
    }
    public static MemorySegment font$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoAnalysis.font$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoAnalysis.font$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle level$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("level"));
    public static VarHandle level$VH() {
        return _PangoAnalysis.level$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint8 level;
     * }
     */
    public static byte level$get(MemorySegment seg) {
        return (byte)_PangoAnalysis.level$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint8 level;
     * }
     */
    public static void level$set(MemorySegment seg, byte x) {
        _PangoAnalysis.level$VH.set(seg, x);
    }
    public static byte level$get(MemorySegment seg, long index) {
        return (byte)_PangoAnalysis.level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void level$set(MemorySegment seg, long index, byte x) {
        _PangoAnalysis.level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle gravity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gravity"));
    public static VarHandle gravity$VH() {
        return _PangoAnalysis.gravity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint8 gravity;
     * }
     */
    public static byte gravity$get(MemorySegment seg) {
        return (byte)_PangoAnalysis.gravity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint8 gravity;
     * }
     */
    public static void gravity$set(MemorySegment seg, byte x) {
        _PangoAnalysis.gravity$VH.set(seg, x);
    }
    public static byte gravity$get(MemorySegment seg, long index) {
        return (byte)_PangoAnalysis.gravity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gravity$set(MemorySegment seg, long index, byte x) {
        _PangoAnalysis.gravity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return _PangoAnalysis.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint8 flags;
     * }
     */
    public static byte flags$get(MemorySegment seg) {
        return (byte)_PangoAnalysis.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint8 flags;
     * }
     */
    public static void flags$set(MemorySegment seg, byte x) {
        _PangoAnalysis.flags$VH.set(seg, x);
    }
    public static byte flags$get(MemorySegment seg, long index) {
        return (byte)_PangoAnalysis.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, byte x) {
        _PangoAnalysis.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle script$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("script"));
    public static VarHandle script$VH() {
        return _PangoAnalysis.script$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint8 script;
     * }
     */
    public static byte script$get(MemorySegment seg) {
        return (byte)_PangoAnalysis.script$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint8 script;
     * }
     */
    public static void script$set(MemorySegment seg, byte x) {
        _PangoAnalysis.script$VH.set(seg, x);
    }
    public static byte script$get(MemorySegment seg, long index) {
        return (byte)_PangoAnalysis.script$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void script$set(MemorySegment seg, long index, byte x) {
        _PangoAnalysis.script$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle language$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("language"));
    public static VarHandle language$VH() {
        return _PangoAnalysis.language$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoLanguage* language;
     * }
     */
    public static MemorySegment language$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoAnalysis.language$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoLanguage* language;
     * }
     */
    public static void language$set(MemorySegment seg, MemorySegment x) {
        _PangoAnalysis.language$VH.set(seg, x);
    }
    public static MemorySegment language$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoAnalysis.language$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void language$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoAnalysis.language$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle extra_attrs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("extra_attrs"));
    public static VarHandle extra_attrs$VH() {
        return _PangoAnalysis.extra_attrs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSList* extra_attrs;
     * }
     */
    public static MemorySegment extra_attrs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoAnalysis.extra_attrs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSList* extra_attrs;
     * }
     */
    public static void extra_attrs$set(MemorySegment seg, MemorySegment x) {
        _PangoAnalysis.extra_attrs$VH.set(seg, x);
    }
    public static MemorySegment extra_attrs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoAnalysis.extra_attrs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void extra_attrs$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoAnalysis.extra_attrs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


