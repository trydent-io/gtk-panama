// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GtkMenuButtonCreatePopupFunc)(struct _GtkMenuButton* menu_button,void* user_data);
 * }
 */
public interface GtkMenuButtonCreatePopupFunc {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GtkMenuButtonCreatePopupFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1716.GtkMenuButtonCreatePopupFunc_UP$MH, fi, constants$1716.GtkMenuButtonCreatePopupFunc$FUNC, scope);
    }
    static GtkMenuButtonCreatePopupFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$1716.GtkMenuButtonCreatePopupFunc_DOWN$MH.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


