// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1412 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1412() {}
    static final FunctionDescriptor gtk_builder_add_objects_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_add_objects_from_string$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_add_objects_from_string",
        constants$1412.gtk_builder_add_objects_from_string$FUNC
    );
    static final FunctionDescriptor gtk_builder_get_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_get_object$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_get_object",
        constants$1412.gtk_builder_get_object$FUNC
    );
    static final FunctionDescriptor gtk_builder_get_objects$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_get_objects$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_get_objects",
        constants$1412.gtk_builder_get_objects$FUNC
    );
    static final FunctionDescriptor gtk_builder_expose_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_expose_object$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_expose_object",
        constants$1412.gtk_builder_expose_object$FUNC
    );
    static final FunctionDescriptor gtk_builder_get_current_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_get_current_object$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_get_current_object",
        constants$1412.gtk_builder_get_current_object$FUNC
    );
    static final FunctionDescriptor gtk_builder_set_current_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_set_current_object$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_set_current_object",
        constants$1412.gtk_builder_set_current_object$FUNC
    );
}

