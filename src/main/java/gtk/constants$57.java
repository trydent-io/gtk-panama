// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$57 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$57() {}
    static final FunctionDescriptor mbtowc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mbtowc$MH = RuntimeHelper.downcallHandle(
        "mbtowc",
        constants$57.mbtowc$FUNC
    );
    static final FunctionDescriptor wctomb$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle wctomb$MH = RuntimeHelper.downcallHandle(
        "wctomb",
        constants$57.wctomb$FUNC
    );
    static final FunctionDescriptor mbstowcs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mbstowcs$MH = RuntimeHelper.downcallHandle(
        "mbstowcs",
        constants$57.mbstowcs$FUNC
    );
    static final FunctionDescriptor wcstombs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcstombs$MH = RuntimeHelper.downcallHandle(
        "wcstombs",
        constants$57.wcstombs$FUNC
    );
    static final FunctionDescriptor rpmatch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rpmatch$MH = RuntimeHelper.downcallHandle(
        "rpmatch",
        constants$57.rpmatch$FUNC
    );
    static final FunctionDescriptor getsubopt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getsubopt$MH = RuntimeHelper.downcallHandle(
        "getsubopt",
        constants$57.getsubopt$FUNC
    );
}


