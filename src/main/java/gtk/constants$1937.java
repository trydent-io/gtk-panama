// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1937 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1937() {}
    static final FunctionDescriptor gtk_window_handle_get_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_handle_get_child$MH = RuntimeHelper.downcallHandle(
        "gtk_window_handle_get_child",
        constants$1937.gtk_window_handle_get_child$FUNC
    );
    static final FunctionDescriptor gtk_window_handle_set_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_handle_set_child$MH = RuntimeHelper.downcallHandle(
        "gtk_window_handle_set_child",
        constants$1937.gtk_window_handle_set_child$FUNC
    );
    static final MemorySegment NULL$ADDR = MemorySegment.ofAddress(0L);
    static final MemorySegment G_GNUC_FUNCTION$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("");
    static final MemorySegment G_GNUC_PRETTY_FUNCTION$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("");
    static final MemorySegment G_STRLOC$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("/tmp/jextract$15822390321994032325.h:46");
}


