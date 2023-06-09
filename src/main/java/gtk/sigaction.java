// Generated by jextract

package gtk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct sigaction {
 *     union  __sigaction_handler;
 *     __sigset_t sa_mask;
 *     int sa_flags;
 *     void (*sa_restorer)();
 * };
 * }
 */
public class sigaction {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("sa_handler"),
            Constants$root.C_POINTER$LAYOUT.withName("sa_sigaction")
        ).withName("__sigaction_handler"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, Constants$root.C_LONG_LONG$LAYOUT).withName("__val")
        ).withName("sa_mask"),
        Constants$root.C_INT$LAYOUT.withName("sa_flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("sa_restorer")
    ).withName("sigaction");
    public static MemoryLayout $LAYOUT() {
        return sigaction.$struct$LAYOUT;
    }
    /**
     * {@snippet :
     * union {
     *     __sighandler_t sa_handler;
     *     void (*sa_sigaction)(int,siginfo_t*,void*);
     * };
     * }
     */
    public static final class __sigaction_handler {

        // Suppresses default constructor, ensuring non-instantiability.
        private __sigaction_handler() {}
        static final UnionLayout __sigaction_handler$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("sa_handler"),
            Constants$root.C_POINTER$LAYOUT.withName("sa_sigaction")
        );
        public static MemoryLayout $LAYOUT() {
            return __sigaction_handler.__sigaction_handler$union$LAYOUT;
        }
        static final VarHandle sa_handler$VH = __sigaction_handler$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sa_handler"));
        public static VarHandle sa_handler$VH() {
            return __sigaction_handler.sa_handler$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * __sighandler_t sa_handler;
         * }
         */
        public static MemorySegment sa_handler$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)__sigaction_handler.sa_handler$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * __sighandler_t sa_handler;
         * }
         */
        public static void sa_handler$set(MemorySegment seg, MemorySegment x) {
            __sigaction_handler.sa_handler$VH.set(seg, x);
        }
        public static MemorySegment sa_handler$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)__sigaction_handler.sa_handler$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void sa_handler$set(MemorySegment seg, long index, MemorySegment x) {
            __sigaction_handler.sa_handler$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static __sighandler_t sa_handler(MemorySegment segment, SegmentScope scope) {
            return __sighandler_t.ofAddress(sa_handler$get(segment), scope);
        }
        static final FunctionDescriptor sa_sigaction$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
        );
        static final FunctionDescriptor sa_sigaction_UP$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
        );
        static final MethodHandle sa_sigaction_UP$MH = RuntimeHelper.upcallHandle(sa_sigaction.class, "apply", __sigaction_handler.sa_sigaction_UP$FUNC);
        static final FunctionDescriptor sa_sigaction_DOWN$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
        );
        static final MethodHandle sa_sigaction_DOWN$MH = RuntimeHelper.downcallHandle(
            __sigaction_handler.sa_sigaction_DOWN$FUNC
        );
        /**
         * {@snippet :
 * void (*sa_sigaction)(int,siginfo_t*,void*);
         * }
         */
        public interface sa_sigaction {

            void apply(int _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
            static MemorySegment allocate(sa_sigaction fi, SegmentScope scope) {
                return RuntimeHelper.upcallStub(__sigaction_handler.sa_sigaction_UP$MH, fi, __sigaction_handler.sa_sigaction$FUNC, scope);
            }
            static sa_sigaction ofAddress(MemorySegment addr, SegmentScope scope) {
                MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
                return (int __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                    try {
                        __sigaction_handler.sa_sigaction_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                };
            }
        }

        static final VarHandle sa_sigaction$VH = __sigaction_handler$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sa_sigaction"));
        public static VarHandle sa_sigaction$VH() {
            return __sigaction_handler.sa_sigaction$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * void (*sa_sigaction)(int,siginfo_t*,void*);
         * }
         */
        public static MemorySegment sa_sigaction$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)__sigaction_handler.sa_sigaction$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * void (*sa_sigaction)(int,siginfo_t*,void*);
         * }
         */
        public static void sa_sigaction$set(MemorySegment seg, MemorySegment x) {
            __sigaction_handler.sa_sigaction$VH.set(seg, x);
        }
        public static MemorySegment sa_sigaction$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)__sigaction_handler.sa_sigaction$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void sa_sigaction$set(MemorySegment seg, long index, MemorySegment x) {
            __sigaction_handler.sa_sigaction$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static sa_sigaction sa_sigaction(MemorySegment segment, SegmentScope scope) {
            return sa_sigaction.ofAddress(sa_sigaction$get(segment), scope);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment __sigaction_handler$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment sa_mask$slice(MemorySegment seg) {
        return seg.asSlice(8, 128);
    }
    static final VarHandle sa_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sa_flags"));
    public static VarHandle sa_flags$VH() {
        return sigaction.sa_flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int sa_flags;
     * }
     */
    public static int sa_flags$get(MemorySegment seg) {
        return (int)sigaction.sa_flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int sa_flags;
     * }
     */
    public static void sa_flags$set(MemorySegment seg, int x) {
        sigaction.sa_flags$VH.set(seg, x);
    }
    public static int sa_flags$get(MemorySegment seg, long index) {
        return (int)sigaction.sa_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sa_flags$set(MemorySegment seg, long index, int x) {
        sigaction.sa_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor sa_restorer$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor sa_restorer_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle sa_restorer_UP$MH = RuntimeHelper.upcallHandle(sa_restorer.class, "apply", sigaction.sa_restorer_UP$FUNC);
    static final FunctionDescriptor sa_restorer_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle sa_restorer_DOWN$MH = RuntimeHelper.downcallHandle(
        sigaction.sa_restorer_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*sa_restorer)();
     * }
     */
    public interface sa_restorer {

        void apply();
        static MemorySegment allocate(sa_restorer fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(sigaction.sa_restorer_UP$MH, fi, sigaction.sa_restorer$FUNC, scope);
        }
        static sa_restorer ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    sigaction.sa_restorer_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle sa_restorer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sa_restorer"));
    public static VarHandle sa_restorer$VH() {
        return sigaction.sa_restorer$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*sa_restorer)();
     * }
     */
    public static MemorySegment sa_restorer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)sigaction.sa_restorer$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*sa_restorer)();
     * }
     */
    public static void sa_restorer$set(MemorySegment seg, MemorySegment x) {
        sigaction.sa_restorer$VH.set(seg, x);
    }
    public static MemorySegment sa_restorer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)sigaction.sa_restorer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sa_restorer$set(MemorySegment seg, long index, MemorySegment x) {
        sigaction.sa_restorer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static sa_restorer sa_restorer(MemorySegment segment, SegmentScope scope) {
        return sa_restorer.ofAddress(sa_restorer$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


