// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1394 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1394() {}
    static final FunctionDescriptor gtk_bitset_remove_range_closed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_bitset_remove_range_closed$MH = RuntimeHelper.downcallHandle(
        "gtk_bitset_remove_range_closed",
        constants$1394.gtk_bitset_remove_range_closed$FUNC
    );
    static final FunctionDescriptor gtk_bitset_add_rectangle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_bitset_add_rectangle$MH = RuntimeHelper.downcallHandle(
        "gtk_bitset_add_rectangle",
        constants$1394.gtk_bitset_add_rectangle$FUNC
    );
    static final FunctionDescriptor gtk_bitset_remove_rectangle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_bitset_remove_rectangle$MH = RuntimeHelper.downcallHandle(
        "gtk_bitset_remove_rectangle",
        constants$1394.gtk_bitset_remove_rectangle$FUNC
    );
    static final FunctionDescriptor gtk_bitset_union$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bitset_union$MH = RuntimeHelper.downcallHandle(
        "gtk_bitset_union",
        constants$1394.gtk_bitset_union$FUNC
    );
    static final FunctionDescriptor gtk_bitset_intersect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bitset_intersect$MH = RuntimeHelper.downcallHandle(
        "gtk_bitset_intersect",
        constants$1394.gtk_bitset_intersect$FUNC
    );
    static final FunctionDescriptor gtk_bitset_subtract$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_bitset_subtract$MH = RuntimeHelper.downcallHandle(
        "gtk_bitset_subtract",
        constants$1394.gtk_bitset_subtract$FUNC
    );
}


