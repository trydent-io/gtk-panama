// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned int (*hb_unicode_eastasian_width_func_t)(struct hb_unicode_funcs_t* ufuncs,unsigned int unicode,void* user_data);
 * }
 */
public interface hb_unicode_eastasian_width_func_t {

    int apply(java.lang.foreign.MemorySegment ufuncs, int unicode, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_unicode_eastasian_width_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$928.hb_unicode_eastasian_width_func_t_UP$MH, fi, constants$928.hb_unicode_eastasian_width_func_t$FUNC, scope);
    }
    static hb_unicode_eastasian_width_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _ufuncs, int _unicode, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$928.hb_unicode_eastasian_width_func_t_DOWN$MH.invokeExact(symbol, _ufuncs, _unicode, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


