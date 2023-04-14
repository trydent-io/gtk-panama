// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*hb_font_get_glyph_origin_func_t)(struct hb_font_t* font,void* font_data,unsigned int glyph,int* x,int* y,void* user_data);
 * }
 */
public interface hb_font_get_glyph_origin_func_t {

    int apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int glyph, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_get_glyph_origin_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$902.hb_font_get_glyph_origin_func_t_UP$MH, fi, constants$902.hb_font_get_glyph_origin_func_t$FUNC, scope);
    }
    static hb_font_get_glyph_origin_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _glyph, java.lang.foreign.MemorySegment _x, java.lang.foreign.MemorySegment _y, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$902.hb_font_get_glyph_origin_func_t_DOWN$MH.invokeExact(symbol, _font, _font_data, _glyph, _x, _y, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


