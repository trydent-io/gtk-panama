// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GTypePluginCompleteTypeInfo)(struct _GTypePlugin* plugin,unsigned long g_type,struct _GTypeInfo* info,struct _GTypeValueTable* value_table);
 * }
 */
public interface GTypePluginCompleteTypeInfo {

    void apply(java.lang.foreign.MemorySegment plugin, long g_type, java.lang.foreign.MemorySegment info, java.lang.foreign.MemorySegment value_table);
    static MemorySegment allocate(GTypePluginCompleteTypeInfo fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$450.GTypePluginCompleteTypeInfo_UP$MH, fi, constants$450.GTypePluginCompleteTypeInfo$FUNC, scope);
    }
    static GTypePluginCompleteTypeInfo ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _plugin, long _g_type, java.lang.foreign.MemorySegment _info, java.lang.foreign.MemorySegment _value_table) -> {
            try {
                constants$450.GTypePluginCompleteTypeInfo_DOWN$MH.invokeExact(symbol, _plugin, _g_type, _info, _value_table);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


