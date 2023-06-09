// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*hb_font_get_glyph_extents_func_t)(struct hb_font_t* font,void* font_data,unsigned int glyph,struct hb_glyph_extents_t* extents,void* user_data);
 * }
 */
public interface hb_font_get_glyph_extents_func_t {

    int apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int glyph, java.lang.foreign.MemorySegment extents, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_get_glyph_extents_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$904.hb_font_get_glyph_extents_func_t_UP$MH, fi, constants$904.hb_font_get_glyph_extents_func_t$FUNC, scope);
    }
    static hb_font_get_glyph_extents_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _glyph, java.lang.foreign.MemorySegment _extents, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$904.hb_font_get_glyph_extents_func_t_DOWN$MH.invokeExact(symbol, _font, _font_data, _glyph, _extents, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


