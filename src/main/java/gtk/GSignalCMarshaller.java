// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GSignalCMarshaller)(struct _GClosure*,struct _GValue*,unsigned int,struct _GValue*,void*,void*);
 * }
 */
public interface GSignalCMarshaller {

    void apply(java.lang.foreign.MemorySegment closure, java.lang.foreign.MemorySegment return_value, int n_param_values, java.lang.foreign.MemorySegment param_values, java.lang.foreign.MemorySegment invocation_hint, java.lang.foreign.MemorySegment marshal_data);
    static MemorySegment allocate(GSignalCMarshaller fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$406.GSignalCMarshaller_UP$MH, fi, constants$406.GSignalCMarshaller$FUNC, scope);
    }
    static GSignalCMarshaller ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _closure, java.lang.foreign.MemorySegment _return_value, int _n_param_values, java.lang.foreign.MemorySegment _param_values, java.lang.foreign.MemorySegment _invocation_hint, java.lang.foreign.MemorySegment _marshal_data) -> {
            try {
                constants$406.GSignalCMarshaller_DOWN$MH.invokeExact(symbol, _closure, _return_value, _n_param_values, _param_values, _invocation_hint, _marshal_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


