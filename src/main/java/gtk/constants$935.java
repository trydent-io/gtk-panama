// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$935 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$935() {}
    static final FunctionDescriptor hb_version_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_version_string$MH = RuntimeHelper.downcallHandle(
        "hb_version_string",
        constants$935.hb_version_string$FUNC
    );
    static final FunctionDescriptor hb_version_atleast$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_version_atleast$MH = RuntimeHelper.downcallHandle(
        "hb_version_atleast",
        constants$935.hb_version_atleast$FUNC
    );
    static final FunctionDescriptor pango_coverage_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_coverage_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_coverage_get_type",
        constants$935.pango_coverage_get_type$FUNC
    );
    static final FunctionDescriptor pango_coverage_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle pango_coverage_new$MH = RuntimeHelper.downcallHandle(
        "pango_coverage_new",
        constants$935.pango_coverage_new$FUNC
    );
    static final FunctionDescriptor pango_coverage_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_coverage_ref$MH = RuntimeHelper.downcallHandle(
        "pango_coverage_ref",
        constants$935.pango_coverage_ref$FUNC
    );
    static final FunctionDescriptor pango_coverage_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_coverage_unref$MH = RuntimeHelper.downcallHandle(
        "pango_coverage_unref",
        constants$935.pango_coverage_unref$FUNC
    );
}

