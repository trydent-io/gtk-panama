// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum _cairo_status (*cairo_user_scaled_font_init_func_t)(struct _cairo_scaled_font* scaled_font,struct _cairo* cr,struct * extents);
 * }
 */
public interface cairo_user_scaled_font_init_func_t {

    int apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data, java.lang.foreign.MemorySegment other);
    static MemorySegment allocate(cairo_user_scaled_font_init_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$841.cairo_user_scaled_font_init_func_t_UP$MH, fi, constants$841.cairo_user_scaled_font_init_func_t$FUNC, scope);
    }
    static cairo_user_scaled_font_init_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pattern, java.lang.foreign.MemorySegment _callback_data, java.lang.foreign.MemorySegment _other) -> {
            try {
                return (int)constants$841.cairo_user_scaled_font_init_func_t_DOWN$MH.invokeExact(symbol, _pattern, _callback_data, _other);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


