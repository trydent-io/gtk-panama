// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoFontFamilyClass {
 *     GObjectClass parent_class;
 *     void (*list_faces)(PangoFontFamily*,PangoFontFace***,int*);
 *     char* (*get_name)(PangoFontFamily*);
 *     gboolean (*is_monospace)(PangoFontFamily*);
 *     gboolean (*is_variable)(PangoFontFamily*);
 *     PangoFontFace* (*get_face)(PangoFontFamily*,char*);
 *     void (*_pango_reserved2)();
 * };
 * }
 */
public class _PangoFontFamilyClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("list_faces"),
        Constants$root.C_POINTER$LAYOUT.withName("get_name"),
        Constants$root.C_POINTER$LAYOUT.withName("is_monospace"),
        Constants$root.C_POINTER$LAYOUT.withName("is_variable"),
        Constants$root.C_POINTER$LAYOUT.withName("get_face"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved2")
    ).withName("_PangoFontFamilyClass");
    public static MemoryLayout $LAYOUT() {
        return _PangoFontFamilyClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor list_faces$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor list_faces_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle list_faces_UP$MH = RuntimeHelper.upcallHandle(list_faces.class, "apply", _PangoFontFamilyClass.list_faces_UP$FUNC);
    static final FunctionDescriptor list_faces_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle list_faces_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass.list_faces_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*list_faces)(PangoFontFamily*,PangoFontFace***,int*);
     * }
     */
    public interface list_faces {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(list_faces fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFamilyClass.list_faces_UP$MH, fi, _PangoFontFamilyClass.list_faces$FUNC, scope);
        }
        static list_faces ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _PangoFontFamilyClass.list_faces_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle list_faces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("list_faces"));
    public static VarHandle list_faces$VH() {
        return _PangoFontFamilyClass.list_faces$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*list_faces)(PangoFontFamily*,PangoFontFace***,int*);
     * }
     */
    public static MemorySegment list_faces$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.list_faces$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*list_faces)(PangoFontFamily*,PangoFontFace***,int*);
     * }
     */
    public static void list_faces$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFamilyClass.list_faces$VH.set(seg, x);
    }
    public static MemorySegment list_faces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.list_faces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void list_faces$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFamilyClass.list_faces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static list_faces list_faces(MemorySegment segment, SegmentScope scope) {
        return list_faces.ofAddress(list_faces$get(segment), scope);
    }
    static final FunctionDescriptor get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_name_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_name_UP$MH = RuntimeHelper.upcallHandle(get_name.class, "apply", _PangoFontFamilyClass.get_name_UP$FUNC);
    static final FunctionDescriptor get_name_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_name_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass.get_name_DOWN$FUNC
    );
    /**
     * {@snippet :
 * char* (*get_name)(PangoFontFamily*);
     * }
     */
    public interface get_name {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_name fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFamilyClass.get_name_UP$MH, fi, _PangoFontFamilyClass.get_name$FUNC, scope);
        }
        static get_name ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.get_name_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_name"));
    public static VarHandle get_name$VH() {
        return _PangoFontFamilyClass.get_name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_name)(PangoFontFamily*);
     * }
     */
    public static MemorySegment get_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.get_name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_name)(PangoFontFamily*);
     * }
     */
    public static void get_name$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFamilyClass.get_name$VH.set(seg, x);
    }
    public static MemorySegment get_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.get_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_name$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFamilyClass.get_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_name get_name(MemorySegment segment, SegmentScope scope) {
        return get_name.ofAddress(get_name$get(segment), scope);
    }
    static final FunctionDescriptor is_monospace$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor is_monospace_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_monospace_UP$MH = RuntimeHelper.upcallHandle(is_monospace.class, "apply", _PangoFontFamilyClass.is_monospace_UP$FUNC);
    static final FunctionDescriptor is_monospace_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_monospace_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass.is_monospace_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*is_monospace)(PangoFontFamily*);
     * }
     */
    public interface is_monospace {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(is_monospace fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFamilyClass.is_monospace_UP$MH, fi, _PangoFontFamilyClass.is_monospace$FUNC, scope);
        }
        static is_monospace ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_PangoFontFamilyClass.is_monospace_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_monospace$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_monospace"));
    public static VarHandle is_monospace$VH() {
        return _PangoFontFamilyClass.is_monospace$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*is_monospace)(PangoFontFamily*);
     * }
     */
    public static MemorySegment is_monospace$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.is_monospace$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*is_monospace)(PangoFontFamily*);
     * }
     */
    public static void is_monospace$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFamilyClass.is_monospace$VH.set(seg, x);
    }
    public static MemorySegment is_monospace$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.is_monospace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_monospace$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFamilyClass.is_monospace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_monospace is_monospace(MemorySegment segment, SegmentScope scope) {
        return is_monospace.ofAddress(is_monospace$get(segment), scope);
    }
    static final FunctionDescriptor is_variable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor is_variable_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_variable_UP$MH = RuntimeHelper.upcallHandle(is_variable.class, "apply", _PangoFontFamilyClass.is_variable_UP$FUNC);
    static final FunctionDescriptor is_variable_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_variable_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass.is_variable_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*is_variable)(PangoFontFamily*);
     * }
     */
    public interface is_variable {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(is_variable fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFamilyClass.is_variable_UP$MH, fi, _PangoFontFamilyClass.is_variable$FUNC, scope);
        }
        static is_variable ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_PangoFontFamilyClass.is_variable_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_variable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_variable"));
    public static VarHandle is_variable$VH() {
        return _PangoFontFamilyClass.is_variable$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*is_variable)(PangoFontFamily*);
     * }
     */
    public static MemorySegment is_variable$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.is_variable$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*is_variable)(PangoFontFamily*);
     * }
     */
    public static void is_variable$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFamilyClass.is_variable$VH.set(seg, x);
    }
    public static MemorySegment is_variable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.is_variable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_variable$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFamilyClass.is_variable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_variable is_variable(MemorySegment segment, SegmentScope scope) {
        return is_variable.ofAddress(is_variable$get(segment), scope);
    }
    static final FunctionDescriptor get_face$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_face_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_face_UP$MH = RuntimeHelper.upcallHandle(get_face.class, "apply", _PangoFontFamilyClass.get_face_UP$FUNC);
    static final FunctionDescriptor get_face_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_face_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass.get_face_DOWN$FUNC
    );
    /**
     * {@snippet :
 * PangoFontFace* (*get_face)(PangoFontFamily*,char*);
     * }
     */
    public interface get_face {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment item, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_face fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFamilyClass.get_face_UP$MH, fi, _PangoFontFamilyClass.get_face$FUNC, scope);
        }
        static get_face ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _item, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.get_face_DOWN$MH.invokeExact(symbol, _item, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_face$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_face"));
    public static VarHandle get_face$VH() {
        return _PangoFontFamilyClass.get_face$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoFontFace* (*get_face)(PangoFontFamily*,char*);
     * }
     */
    public static MemorySegment get_face$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.get_face$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoFontFace* (*get_face)(PangoFontFamily*,char*);
     * }
     */
    public static void get_face$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFamilyClass.get_face$VH.set(seg, x);
    }
    public static MemorySegment get_face$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass.get_face$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_face$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFamilyClass.get_face$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_face get_face(MemorySegment segment, SegmentScope scope) {
        return get_face.ofAddress(get_face$get(segment), scope);
    }
    static final FunctionDescriptor _pango_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _pango_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved2_UP$MH = RuntimeHelper.upcallHandle(_pango_reserved2.class, "apply", _PangoFontFamilyClass._pango_reserved2_UP$FUNC);
    static final FunctionDescriptor _pango_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass._pango_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_pango_reserved2)();
     * }
     */
    public interface _pango_reserved2 {

        void apply();
        static MemorySegment allocate(_pango_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFamilyClass._pango_reserved2_UP$MH, fi, _PangoFontFamilyClass._pango_reserved2$FUNC, scope);
        }
        static _pango_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _PangoFontFamilyClass._pango_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"));
    public static VarHandle _pango_reserved2$VH() {
        return _PangoFontFamilyClass._pango_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved2)();
     * }
     */
    public static MemorySegment _pango_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass._pango_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved2)();
     * }
     */
    public static void _pango_reserved2$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFamilyClass._pango_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _pango_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFamilyClass._pango_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFamilyClass._pango_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved2 _pango_reserved2(MemorySegment segment, SegmentScope scope) {
        return _pango_reserved2.ofAddress(_pango_reserved2$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

