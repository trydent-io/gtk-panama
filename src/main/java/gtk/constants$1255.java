// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1255 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1255() {}
    static final FunctionDescriptor graphene_frustum_equal$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_frustum_equal$MH = RuntimeHelper.downcallHandle(
        "graphene_frustum_equal",
        constants$1255.graphene_frustum_equal$FUNC
    );
    static final FunctionDescriptor graphene_sphere_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_sphere_alloc$MH = RuntimeHelper.downcallHandle(
        "graphene_sphere_alloc",
        constants$1255.graphene_sphere_alloc$FUNC
    );
    static final FunctionDescriptor graphene_sphere_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_sphere_free$MH = RuntimeHelper.downcallHandle(
        "graphene_sphere_free",
        constants$1255.graphene_sphere_free$FUNC
    );
    static final FunctionDescriptor graphene_sphere_init$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle graphene_sphere_init$MH = RuntimeHelper.downcallHandle(
        "graphene_sphere_init",
        constants$1255.graphene_sphere_init$FUNC
    );
    static final FunctionDescriptor graphene_sphere_init_from_points$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_sphere_init_from_points$MH = RuntimeHelper.downcallHandle(
        "graphene_sphere_init_from_points",
        constants$1255.graphene_sphere_init_from_points$FUNC
    );
    static final FunctionDescriptor graphene_sphere_init_from_vectors$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_sphere_init_from_vectors$MH = RuntimeHelper.downcallHandle(
        "graphene_sphere_init_from_vectors",
        constants$1255.graphene_sphere_init_from_vectors$FUNC
    );
}


