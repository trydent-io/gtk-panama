// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1747 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1747() {}
    static final FunctionDescriptor gtk_page_setup_set_left_margin$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_page_setup_set_left_margin$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_set_left_margin",
        constants$1747.gtk_page_setup_set_left_margin$FUNC
    );
    static final FunctionDescriptor gtk_page_setup_get_right_margin$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_page_setup_get_right_margin$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_get_right_margin",
        constants$1747.gtk_page_setup_get_right_margin$FUNC
    );
    static final FunctionDescriptor gtk_page_setup_set_right_margin$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_page_setup_set_right_margin$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_set_right_margin",
        constants$1747.gtk_page_setup_set_right_margin$FUNC
    );
    static final FunctionDescriptor gtk_page_setup_set_paper_size_and_default_margins$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_page_setup_set_paper_size_and_default_margins$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_set_paper_size_and_default_margins",
        constants$1747.gtk_page_setup_set_paper_size_and_default_margins$FUNC
    );
    static final FunctionDescriptor gtk_page_setup_get_paper_width$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_page_setup_get_paper_width$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_get_paper_width",
        constants$1747.gtk_page_setup_get_paper_width$FUNC
    );
    static final FunctionDescriptor gtk_page_setup_get_paper_height$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_page_setup_get_paper_height$MH = RuntimeHelper.downcallHandle(
        "gtk_page_setup_get_paper_height",
        constants$1747.gtk_page_setup_get_paper_height$FUNC
    );
}


