// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$983 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$983() {}
    static final FunctionDescriptor script_engine_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle script_engine_list$MH = RuntimeHelper.downcallHandle(
        "script_engine_list",
        constants$983.script_engine_list$FUNC
    );
    static final FunctionDescriptor script_engine_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle script_engine_init$MH = RuntimeHelper.downcallHandle(
        "script_engine_init",
        constants$983.script_engine_init$FUNC
    );
    static final FunctionDescriptor script_engine_exit$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle script_engine_exit$MH = RuntimeHelper.downcallHandle(
        "script_engine_exit",
        constants$983.script_engine_exit$FUNC
    );
    static final FunctionDescriptor script_engine_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle script_engine_create$MH = RuntimeHelper.downcallHandle(
        "script_engine_create",
        constants$983.script_engine_create$FUNC
    );
    static final FunctionDescriptor pango_attr_type_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_attr_type_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_attr_type_get_type",
        constants$983.pango_attr_type_get_type$FUNC
    );
    static final FunctionDescriptor pango_underline_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_underline_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_underline_get_type",
        constants$983.pango_underline_get_type$FUNC
    );
}


