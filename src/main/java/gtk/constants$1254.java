// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1254 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1254() {}
    static final FunctionDescriptor graphene_frustum_init_from_frustum$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_frustum_init_from_frustum$MH = RuntimeHelper.downcallHandle(
        "graphene_frustum_init_from_frustum",
        constants$1254.graphene_frustum_init_from_frustum$FUNC
    );
    static final FunctionDescriptor graphene_frustum_init_from_matrix$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_frustum_init_from_matrix$MH = RuntimeHelper.downcallHandle(
        "graphene_frustum_init_from_matrix",
        constants$1254.graphene_frustum_init_from_matrix$FUNC
    );
    static final FunctionDescriptor graphene_frustum_contains_point$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_frustum_contains_point$MH = RuntimeHelper.downcallHandle(
        "graphene_frustum_contains_point",
        constants$1254.graphene_frustum_contains_point$FUNC
    );
    static final FunctionDescriptor graphene_frustum_intersects_sphere$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_frustum_intersects_sphere$MH = RuntimeHelper.downcallHandle(
        "graphene_frustum_intersects_sphere",
        constants$1254.graphene_frustum_intersects_sphere$FUNC
    );
    static final FunctionDescriptor graphene_frustum_intersects_box$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_frustum_intersects_box$MH = RuntimeHelper.downcallHandle(
        "graphene_frustum_intersects_box",
        constants$1254.graphene_frustum_intersects_box$FUNC
    );
    static final FunctionDescriptor graphene_frustum_get_planes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_frustum_get_planes$MH = RuntimeHelper.downcallHandle(
        "graphene_frustum_get_planes",
        constants$1254.graphene_frustum_get_planes$FUNC
    );
}


