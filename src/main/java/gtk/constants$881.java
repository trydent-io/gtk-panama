// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$881 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$881() {}
    static final FunctionDescriptor hb_blob_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_blob_reference$MH = RuntimeHelper.downcallHandle(
        "hb_blob_reference",
        constants$881.hb_blob_reference$FUNC
    );
    static final FunctionDescriptor hb_blob_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_blob_destroy$MH = RuntimeHelper.downcallHandle(
        "hb_blob_destroy",
        constants$881.hb_blob_destroy$FUNC
    );
    static final FunctionDescriptor hb_blob_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_blob_set_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_blob_set_user_data",
        constants$881.hb_blob_set_user_data$FUNC
    );
    static final FunctionDescriptor hb_blob_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_blob_get_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_blob_get_user_data",
        constants$881.hb_blob_get_user_data$FUNC
    );
    static final FunctionDescriptor hb_blob_make_immutable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_blob_make_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_blob_make_immutable",
        constants$881.hb_blob_make_immutable$FUNC
    );
    static final FunctionDescriptor hb_blob_is_immutable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_blob_is_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_blob_is_immutable",
        constants$881.hb_blob_is_immutable$FUNC
    );
}

