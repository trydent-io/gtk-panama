// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1672 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1672() {}
    static final FunctionDescriptor gtk_im_context_simple_add_table$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_im_context_simple_add_table$MH = RuntimeHelper.downcallHandle(
        "gtk_im_context_simple_add_table",
        constants$1672.gtk_im_context_simple_add_table$FUNC
    );
    static final FunctionDescriptor gtk_im_context_simple_add_compose_file$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_im_context_simple_add_compose_file$MH = RuntimeHelper.downcallHandle(
        "gtk_im_context_simple_add_compose_file",
        constants$1672.gtk_im_context_simple_add_compose_file$FUNC
    );
    static final FunctionDescriptor gtk_im_multicontext_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_im_multicontext_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_im_multicontext_get_type",
        constants$1672.gtk_im_multicontext_get_type$FUNC
    );
    static final FunctionDescriptor gtk_im_multicontext_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_im_multicontext_new$MH = RuntimeHelper.downcallHandle(
        "gtk_im_multicontext_new",
        constants$1672.gtk_im_multicontext_new$FUNC
    );
    static final FunctionDescriptor gtk_im_multicontext_get_context_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_im_multicontext_get_context_id$MH = RuntimeHelper.downcallHandle(
        "gtk_im_multicontext_get_context_id",
        constants$1672.gtk_im_multicontext_get_context_id$FUNC
    );
    static final FunctionDescriptor gtk_im_multicontext_set_context_id$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_im_multicontext_set_context_id$MH = RuntimeHelper.downcallHandle(
        "gtk_im_multicontext_set_context_id",
        constants$1672.gtk_im_multicontext_set_context_id$FUNC
    );
}


