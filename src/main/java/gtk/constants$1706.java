// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1706 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1706() {}
    static final FunctionDescriptor gtk_media_stream_get_duration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_media_stream_get_duration$MH = RuntimeHelper.downcallHandle(
        "gtk_media_stream_get_duration",
        constants$1706.gtk_media_stream_get_duration$FUNC
    );
    static final FunctionDescriptor gtk_media_stream_is_seekable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_media_stream_is_seekable$MH = RuntimeHelper.downcallHandle(
        "gtk_media_stream_is_seekable",
        constants$1706.gtk_media_stream_is_seekable$FUNC
    );
    static final FunctionDescriptor gtk_media_stream_is_seeking$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_media_stream_is_seeking$MH = RuntimeHelper.downcallHandle(
        "gtk_media_stream_is_seeking",
        constants$1706.gtk_media_stream_is_seeking$FUNC
    );
    static final FunctionDescriptor gtk_media_stream_seek$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gtk_media_stream_seek$MH = RuntimeHelper.downcallHandle(
        "gtk_media_stream_seek",
        constants$1706.gtk_media_stream_seek$FUNC
    );
    static final FunctionDescriptor gtk_media_stream_get_loop$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_media_stream_get_loop$MH = RuntimeHelper.downcallHandle(
        "gtk_media_stream_get_loop",
        constants$1706.gtk_media_stream_get_loop$FUNC
    );
    static final FunctionDescriptor gtk_media_stream_set_loop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_media_stream_set_loop$MH = RuntimeHelper.downcallHandle(
        "gtk_media_stream_set_loop",
        constants$1706.gtk_media_stream_set_loop$FUNC
    );
}

