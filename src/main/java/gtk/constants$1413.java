// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1413 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1413() {}
    static final FunctionDescriptor gtk_builder_set_translation_domain$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_set_translation_domain$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_set_translation_domain",
        constants$1413.gtk_builder_set_translation_domain$FUNC
    );
    static final FunctionDescriptor gtk_builder_get_translation_domain$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_get_translation_domain$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_get_translation_domain",
        constants$1413.gtk_builder_get_translation_domain$FUNC
    );
    static final FunctionDescriptor gtk_builder_get_scope$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_get_scope$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_get_scope",
        constants$1413.gtk_builder_get_scope$FUNC
    );
    static final FunctionDescriptor gtk_builder_set_scope$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_set_scope$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_set_scope",
        constants$1413.gtk_builder_set_scope$FUNC
    );
    static final FunctionDescriptor gtk_builder_get_type_from_name$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_get_type_from_name$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_get_type_from_name",
        constants$1413.gtk_builder_get_type_from_name$FUNC
    );
    static final FunctionDescriptor gtk_builder_value_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_value_from_string$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_value_from_string",
        constants$1413.gtk_builder_value_from_string$FUNC
    );
}

