// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1266 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1266() {}
    static final FunctionDescriptor graphene_ray_get_direction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_ray_get_direction$MH = RuntimeHelper.downcallHandle(
        "graphene_ray_get_direction",
        constants$1266.graphene_ray_get_direction$FUNC
    );
    static final FunctionDescriptor graphene_ray_get_position_at$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_ray_get_position_at$MH = RuntimeHelper.downcallHandle(
        "graphene_ray_get_position_at",
        constants$1266.graphene_ray_get_position_at$FUNC
    );
    static final FunctionDescriptor graphene_ray_get_distance_to_point$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_ray_get_distance_to_point$MH = RuntimeHelper.downcallHandle(
        "graphene_ray_get_distance_to_point",
        constants$1266.graphene_ray_get_distance_to_point$FUNC
    );
    static final FunctionDescriptor graphene_ray_get_distance_to_plane$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_ray_get_distance_to_plane$MH = RuntimeHelper.downcallHandle(
        "graphene_ray_get_distance_to_plane",
        constants$1266.graphene_ray_get_distance_to_plane$FUNC
    );
    static final FunctionDescriptor graphene_ray_equal$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_ray_equal$MH = RuntimeHelper.downcallHandle(
        "graphene_ray_equal",
        constants$1266.graphene_ray_equal$FUNC
    );
    static final FunctionDescriptor graphene_ray_get_closest_point_to_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_ray_get_closest_point_to_point$MH = RuntimeHelper.downcallHandle(
        "graphene_ray_get_closest_point_to_point",
        constants$1266.graphene_ray_get_closest_point_to_point$FUNC
    );
}


