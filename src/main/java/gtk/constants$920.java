// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$920 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$920() {}
    static final FunctionDescriptor hb_buffer_set_language$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_set_language$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_language",
        constants$920.hb_buffer_set_language$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_language$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_language$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_language",
        constants$920.hb_buffer_get_language$FUNC
    );
    static final FunctionDescriptor hb_buffer_set_segment_properties$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_set_segment_properties$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_segment_properties",
        constants$920.hb_buffer_set_segment_properties$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_segment_properties$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_segment_properties$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_segment_properties",
        constants$920.hb_buffer_get_segment_properties$FUNC
    );
    static final FunctionDescriptor hb_buffer_guess_segment_properties$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_guess_segment_properties$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_guess_segment_properties",
        constants$920.hb_buffer_guess_segment_properties$FUNC
    );
    static final FunctionDescriptor hb_buffer_set_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_set_flags$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_flags",
        constants$920.hb_buffer_set_flags$FUNC
    );
}


