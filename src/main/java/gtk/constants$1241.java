// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1241 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1241() {}
    static final FunctionDescriptor graphene_point3d_cross$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_cross$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_cross",
        constants$1241.graphene_point3d_cross$FUNC
    );
    static final FunctionDescriptor graphene_point3d_dot$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_dot$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_dot",
        constants$1241.graphene_point3d_dot$FUNC
    );
    static final FunctionDescriptor graphene_point3d_length$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_length$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_length",
        constants$1241.graphene_point3d_length$FUNC
    );
    static final FunctionDescriptor graphene_point3d_normalize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_normalize$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_normalize",
        constants$1241.graphene_point3d_normalize$FUNC
    );
    static final FunctionDescriptor graphene_point3d_distance$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_distance$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_distance",
        constants$1241.graphene_point3d_distance$FUNC
    );
    static final FunctionDescriptor graphene_point3d_interpolate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_point3d_interpolate$MH = RuntimeHelper.downcallHandle(
        "graphene_point3d_interpolate",
        constants$1241.graphene_point3d_interpolate$FUNC
    );
}


