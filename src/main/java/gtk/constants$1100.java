// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1100 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1100() {}
    static final FunctionDescriptor gdk_events_get_distance$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_events_get_distance$MH = RuntimeHelper.downcallHandle(
        "gdk_events_get_distance",
        constants$1100.gdk_events_get_distance$FUNC
    );
    static final FunctionDescriptor gdk_events_get_angle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_events_get_angle$MH = RuntimeHelper.downcallHandle(
        "gdk_events_get_angle",
        constants$1100.gdk_events_get_angle$FUNC
    );
    static final FunctionDescriptor gdk_events_get_center$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_events_get_center$MH = RuntimeHelper.downcallHandle(
        "gdk_events_get_center",
        constants$1100.gdk_events_get_center$FUNC
    );
    static final FunctionDescriptor gdk_key_event_matches$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_key_event_matches$MH = RuntimeHelper.downcallHandle(
        "gdk_key_event_matches",
        constants$1100.gdk_key_event_matches$FUNC
    );
    static final FunctionDescriptor gdk_key_event_get_match$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_key_event_get_match$MH = RuntimeHelper.downcallHandle(
        "gdk_key_event_get_match",
        constants$1100.gdk_key_event_get_match$FUNC
    );
    static final FunctionDescriptor gdk_frame_timings_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_frame_timings_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_timings_get_type",
        constants$1100.gdk_frame_timings_get_type$FUNC
    );
}

