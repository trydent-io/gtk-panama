// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$918 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$918() {}
    static final FunctionDescriptor hb_buffer_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_reference$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_reference",
        constants$918.hb_buffer_reference$FUNC
    );
    static final FunctionDescriptor hb_buffer_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_destroy$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_destroy",
        constants$918.hb_buffer_destroy$FUNC
    );
    static final FunctionDescriptor hb_buffer_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_set_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_user_data",
        constants$918.hb_buffer_set_user_data$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_user_data",
        constants$918.hb_buffer_get_user_data$FUNC
    );
    static final FunctionDescriptor hb_buffer_set_content_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_set_content_type$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_content_type",
        constants$918.hb_buffer_set_content_type$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_content_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_content_type$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_content_type",
        constants$918.hb_buffer_get_content_type$FUNC
    );
}


