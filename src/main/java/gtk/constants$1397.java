// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1397 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1397() {}
    static final FunctionDescriptor gtk_bookmark_list_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_bookmark_list_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_bookmark_list_get_type",
        constants$1397.gtk_bookmark_list_get_type$FUNC
    );
    static final FunctionDescriptor gtk_bookmark_list_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bookmark_list_new$MH = RuntimeHelper.downcallHandle(
        "gtk_bookmark_list_new",
        constants$1397.gtk_bookmark_list_new$FUNC
    );
    static final FunctionDescriptor gtk_bookmark_list_get_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bookmark_list_get_filename$MH = RuntimeHelper.downcallHandle(
        "gtk_bookmark_list_get_filename",
        constants$1397.gtk_bookmark_list_get_filename$FUNC
    );
    static final FunctionDescriptor gtk_bookmark_list_set_attributes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bookmark_list_set_attributes$MH = RuntimeHelper.downcallHandle(
        "gtk_bookmark_list_set_attributes",
        constants$1397.gtk_bookmark_list_set_attributes$FUNC
    );
    static final FunctionDescriptor gtk_bookmark_list_get_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bookmark_list_get_attributes$MH = RuntimeHelper.downcallHandle(
        "gtk_bookmark_list_get_attributes",
        constants$1397.gtk_bookmark_list_get_attributes$FUNC
    );
    static final FunctionDescriptor gtk_bookmark_list_set_io_priority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_bookmark_list_set_io_priority$MH = RuntimeHelper.downcallHandle(
        "gtk_bookmark_list_set_io_priority",
        constants$1397.gtk_bookmark_list_set_io_priority$FUNC
    );
}


