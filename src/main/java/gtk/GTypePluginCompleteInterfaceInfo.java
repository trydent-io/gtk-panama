// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GTypePluginCompleteInterfaceInfo)(struct _GTypePlugin* plugin,unsigned long instance_type,unsigned long interface_type,struct _GInterfaceInfo* info);
 * }
 */
public interface GTypePluginCompleteInterfaceInfo {

    void apply(java.lang.foreign.MemorySegment plugin, long instance_type, long interface_type, java.lang.foreign.MemorySegment info);
    static MemorySegment allocate(GTypePluginCompleteInterfaceInfo fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$450.GTypePluginCompleteInterfaceInfo_UP$MH, fi, constants$450.GTypePluginCompleteInterfaceInfo$FUNC, scope);
    }
    static GTypePluginCompleteInterfaceInfo ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _plugin, long _instance_type, long _interface_type, java.lang.foreign.MemorySegment _info) -> {
            try {
                constants$450.GTypePluginCompleteInterfaceInfo_DOWN$MH.invokeExact(symbol, _plugin, _instance_type, _interface_type, _info);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


