// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*cairo_surface_observer_callback_t)(struct _cairo_surface* observer,struct _cairo_surface* target,void* data);
 * }
 */
public interface cairo_surface_observer_callback_t {

    void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(cairo_surface_observer_callback_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$850.cairo_surface_observer_callback_t_UP$MH, fi, constants$850.cairo_surface_observer_callback_t$FUNC, scope);
    }
    static cairo_surface_observer_callback_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$851.cairo_surface_observer_callback_t_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

