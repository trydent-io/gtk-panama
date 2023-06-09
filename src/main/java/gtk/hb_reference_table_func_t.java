// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct hb_blob_t* (*hb_reference_table_func_t)(struct hb_face_t* face,unsigned int tag,void* user_data);
 * }
 */
public interface hb_reference_table_func_t {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment face, int tag, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_reference_table_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$893.hb_reference_table_func_t_UP$MH, fi, constants$893.hb_reference_table_func_t$FUNC, scope);
    }
    static hb_reference_table_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _face, int _tag, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$893.hb_reference_table_func_t_DOWN$MH.invokeExact(symbol, _face, _tag, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


