// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$334 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$334() {}
    static final FunctionDescriptor g_uuid_string_random$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_uuid_string_random$MH = RuntimeHelper.downcallHandle(
        "g_uuid_string_random",
        constants$334.g_uuid_string_random$FUNC
    );
    static final OfInt glib_major_version$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle glib_major_version$VH = constants$334.glib_major_version$LAYOUT.varHandle();
    static final MemorySegment glib_major_version$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_major_version", constants$334.glib_major_version$LAYOUT);
    static final OfInt glib_minor_version$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle glib_minor_version$VH = constants$334.glib_minor_version$LAYOUT.varHandle();
    static final MemorySegment glib_minor_version$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_minor_version", constants$334.glib_minor_version$LAYOUT);
    static final OfInt glib_micro_version$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle glib_micro_version$VH = constants$334.glib_micro_version$LAYOUT.varHandle();
    static final MemorySegment glib_micro_version$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_micro_version", constants$334.glib_micro_version$LAYOUT);
    static final OfInt glib_interface_age$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle glib_interface_age$VH = constants$334.glib_interface_age$LAYOUT.varHandle();
    static final MemorySegment glib_interface_age$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_interface_age", constants$334.glib_interface_age$LAYOUT);
    static final OfInt glib_binary_age$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle glib_binary_age$VH = constants$334.glib_binary_age$LAYOUT.varHandle();
    static final MemorySegment glib_binary_age$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_binary_age", constants$334.glib_binary_age$LAYOUT);
}


