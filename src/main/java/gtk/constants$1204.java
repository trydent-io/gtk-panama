// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1204 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1204() {}
    static final FunctionDescriptor graphene_vec2_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle graphene_vec2_alloc$MH = RuntimeHelper.downcallHandle(
        "graphene_vec2_alloc",
        constants$1204.graphene_vec2_alloc$FUNC
    );
    static final FunctionDescriptor graphene_vec2_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec2_free$MH = RuntimeHelper.downcallHandle(
        "graphene_vec2_free",
        constants$1204.graphene_vec2_free$FUNC
    );
    static final FunctionDescriptor graphene_vec2_init$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle graphene_vec2_init$MH = RuntimeHelper.downcallHandle(
        "graphene_vec2_init",
        constants$1204.graphene_vec2_init$FUNC
    );
    static final FunctionDescriptor graphene_vec2_init_from_vec2$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec2_init_from_vec2$MH = RuntimeHelper.downcallHandle(
        "graphene_vec2_init_from_vec2",
        constants$1204.graphene_vec2_init_from_vec2$FUNC
    );
    static final FunctionDescriptor graphene_vec2_init_from_float$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec2_init_from_float$MH = RuntimeHelper.downcallHandle(
        "graphene_vec2_init_from_float",
        constants$1204.graphene_vec2_init_from_float$FUNC
    );
    static final FunctionDescriptor graphene_vec2_to_float$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle graphene_vec2_to_float$MH = RuntimeHelper.downcallHandle(
        "graphene_vec2_to_float",
        constants$1204.graphene_vec2_to_float$FUNC
    );
}

