// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$264 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$264() {}
    static final FunctionDescriptor g_rand_set_seed_array$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_rand_set_seed_array$MH = RuntimeHelper.downcallHandle(
        "g_rand_set_seed_array",
        constants$264.g_rand_set_seed_array$FUNC
    );
    static final FunctionDescriptor g_rand_int$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rand_int$MH = RuntimeHelper.downcallHandle(
        "g_rand_int",
        constants$264.g_rand_int$FUNC
    );
    static final FunctionDescriptor g_rand_int_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_rand_int_range$MH = RuntimeHelper.downcallHandle(
        "g_rand_int_range",
        constants$264.g_rand_int_range$FUNC
    );
    static final FunctionDescriptor g_rand_double$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rand_double$MH = RuntimeHelper.downcallHandle(
        "g_rand_double",
        constants$264.g_rand_double$FUNC
    );
    static final FunctionDescriptor g_rand_double_range$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle g_rand_double_range$MH = RuntimeHelper.downcallHandle(
        "g_rand_double_range",
        constants$264.g_rand_double_range$FUNC
    );
    static final FunctionDescriptor g_random_set_seed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_random_set_seed$MH = RuntimeHelper.downcallHandle(
        "g_random_set_seed",
        constants$264.g_random_set_seed$FUNC
    );
}


