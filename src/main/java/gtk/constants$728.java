// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$728 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$728() {}
    static final FunctionDescriptor g_seekable_can_seek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_seekable_can_seek$MH = RuntimeHelper.downcallHandle(
        "g_seekable_can_seek",
        constants$728.g_seekable_can_seek$FUNC
    );
    static final FunctionDescriptor g_seekable_seek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_seekable_seek$MH = RuntimeHelper.downcallHandle(
        "g_seekable_seek",
        constants$728.g_seekable_seek$FUNC
    );
    static final FunctionDescriptor g_seekable_can_truncate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_seekable_can_truncate$MH = RuntimeHelper.downcallHandle(
        "g_seekable_can_truncate",
        constants$728.g_seekable_can_truncate$FUNC
    );
    static final FunctionDescriptor g_seekable_truncate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_seekable_truncate$MH = RuntimeHelper.downcallHandle(
        "g_seekable_truncate",
        constants$728.g_seekable_truncate$FUNC
    );
    static final FunctionDescriptor g_settings_schema_source_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_settings_schema_source_get_type$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_source_get_type",
        constants$728.g_settings_schema_source_get_type$FUNC
    );
    static final FunctionDescriptor g_settings_schema_source_get_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_settings_schema_source_get_default$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_source_get_default",
        constants$728.g_settings_schema_source_get_default$FUNC
    );
}

