// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$185 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$185() {}
    static final FunctionDescriptor g_unichar_fully_decompose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_unichar_fully_decompose$MH = RuntimeHelper.downcallHandle(
        "g_unichar_fully_decompose",
        constants$185.g_unichar_fully_decompose$FUNC
    );
    static final FunctionDescriptor g_unicode_canonical_ordering$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_unicode_canonical_ordering$MH = RuntimeHelper.downcallHandle(
        "g_unicode_canonical_ordering",
        constants$185.g_unicode_canonical_ordering$FUNC
    );
    static final FunctionDescriptor g_unicode_canonical_decomposition$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unicode_canonical_decomposition$MH = RuntimeHelper.downcallHandle(
        "g_unicode_canonical_decomposition",
        constants$185.g_unicode_canonical_decomposition$FUNC
    );
    static final OfAddress g_utf8_skip$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle g_utf8_skip$VH = constants$185.g_utf8_skip$LAYOUT.varHandle();
    static final MemorySegment g_utf8_skip$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_utf8_skip", constants$185.g_utf8_skip$LAYOUT);
    static final FunctionDescriptor g_utf8_get_char$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_get_char$MH = RuntimeHelper.downcallHandle(
        "g_utf8_get_char",
        constants$185.g_utf8_get_char$FUNC
    );
    static final FunctionDescriptor g_utf8_get_char_validated$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_get_char_validated$MH = RuntimeHelper.downcallHandle(
        "g_utf8_get_char_validated",
        constants$185.g_utf8_get_char_validated$FUNC
    );
}


