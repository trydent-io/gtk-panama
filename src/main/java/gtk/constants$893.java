// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$893 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$893() {}
    static final FunctionDescriptor hb_face_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_face_create$MH = RuntimeHelper.downcallHandle(
        "hb_face_create",
        constants$893.hb_face_create$FUNC
    );
    static final FunctionDescriptor hb_reference_table_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor hb_reference_table_func_t_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_reference_table_func_t_UP$MH = RuntimeHelper.upcallHandle(hb_reference_table_func_t.class, "apply", constants$893.hb_reference_table_func_t_UP$FUNC);
    static final FunctionDescriptor hb_reference_table_func_t_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_reference_table_func_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$893.hb_reference_table_func_t_DOWN$FUNC
    );
    static final FunctionDescriptor hb_face_create_for_tables$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_create_for_tables$MH = RuntimeHelper.downcallHandle(
        "hb_face_create_for_tables",
        constants$893.hb_face_create_for_tables$FUNC
    );
    static final FunctionDescriptor hb_face_get_empty$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_face_get_empty$MH = RuntimeHelper.downcallHandle(
        "hb_face_get_empty",
        constants$893.hb_face_get_empty$FUNC
    );
    static final FunctionDescriptor hb_face_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_reference$MH = RuntimeHelper.downcallHandle(
        "hb_face_reference",
        constants$893.hb_face_reference$FUNC
    );
}


