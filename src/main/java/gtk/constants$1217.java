// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1217 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1217() {}
    static final FunctionDescriptor graphene_vec4_near$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle graphene_vec4_near$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_near",
        constants$1217.graphene_vec4_near$FUNC
    );
    static final FunctionDescriptor graphene_vec4_min$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_min$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_min",
        constants$1217.graphene_vec4_min$FUNC
    );
    static final FunctionDescriptor graphene_vec4_max$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_max$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_max",
        constants$1217.graphene_vec4_max$FUNC
    );
    static final FunctionDescriptor graphene_vec4_interpolate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_interpolate$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_interpolate",
        constants$1217.graphene_vec4_interpolate$FUNC
    );
    static final FunctionDescriptor graphene_vec4_get_x$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_get_x$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_get_x",
        constants$1217.graphene_vec4_get_x$FUNC
    );
    static final FunctionDescriptor graphene_vec4_get_y$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec4_get_y$MH = RuntimeHelper.downcallHandle(
        "graphene_vec4_get_y",
        constants$1217.graphene_vec4_get_y$FUNC
    );
}

