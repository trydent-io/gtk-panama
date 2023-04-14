// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkBuildableParser {
 *     void (*start_element)(GtkBuildableParseContext*,char*,char**,char**,gpointer,GError**);
 *     void (*end_element)(GtkBuildableParseContext*,char*,gpointer,GError**);
 *     void (*text)(GtkBuildableParseContext*,char*,gsize,gpointer,GError**);
 *     void (*error)(GtkBuildableParseContext*,GError*,gpointer);
 *     gpointer padding[4];
 * };
 * }
 */
public class _GtkBuildableParser {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("start_element"),
        Constants$root.C_POINTER$LAYOUT.withName("end_element"),
        Constants$root.C_POINTER$LAYOUT.withName("text"),
        Constants$root.C_POINTER$LAYOUT.withName("error"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GtkBuildableParser");
    public static MemoryLayout $LAYOUT() {
        return _GtkBuildableParser.$struct$LAYOUT;
    }
    static final FunctionDescriptor start_element$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor start_element_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle start_element_UP$MH = RuntimeHelper.upcallHandle(start_element.class, "apply", _GtkBuildableParser.start_element_UP$FUNC);
    static final FunctionDescriptor start_element_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle start_element_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableParser.start_element_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*start_element)(GtkBuildableParseContext*,char*,char**,char**,gpointer,GError**);
     * }
     */
    public interface start_element {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(start_element fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkBuildableParser.start_element_UP$MH, fi, _GtkBuildableParser.start_element$FUNC, scope);
        }
        static start_element ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    _GtkBuildableParser.start_element_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle start_element$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start_element"));
    public static VarHandle start_element$VH() {
        return _GtkBuildableParser.start_element$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*start_element)(GtkBuildableParseContext*,char*,char**,char**,gpointer,GError**);
     * }
     */
    public static MemorySegment start_element$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBuildableParser.start_element$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*start_element)(GtkBuildableParseContext*,char*,char**,char**,gpointer,GError**);
     * }
     */
    public static void start_element$set(MemorySegment seg, MemorySegment x) {
        _GtkBuildableParser.start_element$VH.set(seg, x);
    }
    public static MemorySegment start_element$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBuildableParser.start_element$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start_element$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBuildableParser.start_element$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static start_element start_element(MemorySegment segment, SegmentScope scope) {
        return start_element.ofAddress(start_element$get(segment), scope);
    }
    static final FunctionDescriptor end_element$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor end_element_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle end_element_UP$MH = RuntimeHelper.upcallHandle(end_element.class, "apply", _GtkBuildableParser.end_element_UP$FUNC);
    static final FunctionDescriptor end_element_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle end_element_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableParser.end_element_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*end_element)(GtkBuildableParseContext*,char*,gpointer,GError**);
     * }
     */
    public interface end_element {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(end_element fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkBuildableParser.end_element_UP$MH, fi, _GtkBuildableParser.end_element$FUNC, scope);
        }
        static end_element ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    _GtkBuildableParser.end_element_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle end_element$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("end_element"));
    public static VarHandle end_element$VH() {
        return _GtkBuildableParser.end_element$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*end_element)(GtkBuildableParseContext*,char*,gpointer,GError**);
     * }
     */
    public static MemorySegment end_element$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBuildableParser.end_element$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*end_element)(GtkBuildableParseContext*,char*,gpointer,GError**);
     * }
     */
    public static void end_element$set(MemorySegment seg, MemorySegment x) {
        _GtkBuildableParser.end_element$VH.set(seg, x);
    }
    public static MemorySegment end_element$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBuildableParser.end_element$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void end_element$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBuildableParser.end_element$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static end_element end_element(MemorySegment segment, SegmentScope scope) {
        return end_element.ofAddress(end_element$get(segment), scope);
    }
    static final FunctionDescriptor text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor text_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle text_UP$MH = RuntimeHelper.upcallHandle(text.class, "apply", _GtkBuildableParser.text_UP$FUNC);
    static final FunctionDescriptor text_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle text_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableParser.text_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*text)(GtkBuildableParseContext*,char*,gsize,gpointer,GError**);
     * }
     */
    public interface text {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(text fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkBuildableParser.text_UP$MH, fi, _GtkBuildableParser.text$FUNC, scope);
        }
        static text ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    _GtkBuildableParser.text_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("text"));
    public static VarHandle text$VH() {
        return _GtkBuildableParser.text$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*text)(GtkBuildableParseContext*,char*,gsize,gpointer,GError**);
     * }
     */
    public static MemorySegment text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBuildableParser.text$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*text)(GtkBuildableParseContext*,char*,gsize,gpointer,GError**);
     * }
     */
    public static void text$set(MemorySegment seg, MemorySegment x) {
        _GtkBuildableParser.text$VH.set(seg, x);
    }
    public static MemorySegment text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBuildableParser.text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void text$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBuildableParser.text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static text text(MemorySegment segment, SegmentScope scope) {
        return text.ofAddress(text$get(segment), scope);
    }
    static final FunctionDescriptor error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor error_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle error_UP$MH = RuntimeHelper.upcallHandle(error.class, "apply", _GtkBuildableParser.error_UP$FUNC);
    static final FunctionDescriptor error_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle error_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableParser.error_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*error)(GtkBuildableParseContext*,GError*,gpointer);
     * }
     */
    public interface error {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(error fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkBuildableParser.error_UP$MH, fi, _GtkBuildableParser.error$FUNC, scope);
        }
        static error ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    _GtkBuildableParser.error_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle error$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("error"));
    public static VarHandle error$VH() {
        return _GtkBuildableParser.error$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*error)(GtkBuildableParseContext*,GError*,gpointer);
     * }
     */
    public static MemorySegment error$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBuildableParser.error$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*error)(GtkBuildableParseContext*,GError*,gpointer);
     * }
     */
    public static void error$set(MemorySegment seg, MemorySegment x) {
        _GtkBuildableParser.error$VH.set(seg, x);
    }
    public static MemorySegment error$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBuildableParser.error$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void error$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBuildableParser.error$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static error error(MemorySegment segment, SegmentScope scope) {
        return error.ofAddress(error$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(32, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


