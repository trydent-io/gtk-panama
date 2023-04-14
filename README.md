# GTK Panama

Trying having some fun with new Foreign API's and GTK, but with no results :D

I've generated the package `gtk` with the following command:
```shell
jextract --source --output src/main/java -t gtk -I/usr/include/gtk-4.0 -I/usr/include/gio-unix-2.0 -I/usr/include/cairo -I/usr/include/pango-1.0 -I/usr/include/harfbuzz -I/usr/include/pango-1.0 -I/usr/include/fribidi -I/usr/include/harfbuzz -I/usr/include/gdk-pixbuf-2.0 -I/usr/include/x86_64-linux-gnu -I/usr/include/cairo -I/usr/include/pixman-1 -I/usr/include/uuid -I/usr/include/freetype2 -I/usr/include/libpng16 -I/usr/include/graphene-1.0 -I/usr/lib/x86_64-linux-gnu/graphene-1.0/include -I/usr/include/libmount -I/usr/include/blkid -I/usr/include/glib-2.0 -I/usr/lib/x86_64-linux-gnu/glib-2.0/include /usr/include/gtk-4.0/gtk/gtk.h
```
and then I tried to implement the `Hello World` example from here: https://www.gtk.org/docs/getting-started/hello-world/ but I'm not able to go beyond this statement:
```java
interface Main {
  static void main(String... args) {
    // ...
    var window = gtk_application_window_new(gtkApp);
    // ...
  }  
}
``` 
since everything fails for the Java Runtime Environment:
```text
WARNING: A restricted method in java.lang.foreign.ValueLayout$OfAddress has been called
WARNING: java.lang.foreign.ValueLayout$OfAddress::asUnbounded has been called by module panama
WARNING: Use --enable-native-access=panama to avoid a warning for this module

#
# A fatal error has been detected by the Java Runtime Environment:
#
#  SIGSEGV (0xb) at pc=0x00007f8b68537f95, pid=89397, tid=89398
#
# JRE version: OpenJDK Runtime Environment Temurin-20+36 (20.0+36) (build 20+36)
# Java VM: OpenJDK 64-Bit Server VM Temurin-20+36 (20+36, mixed mode, sharing, tiered, compressed oops, compressed class ptrs, g1 gc, linux-amd64)
# Problematic frame:
# C  [libgtk-4.so.1.600.6+0x337f95]
#
# Core dump will be written. Default location: Core dumps may be processed with "/usr/share/apport/apport -p%p -s%s -c%c -d%d -P%P -u%u -g%g -- %E" (or dumping to /home/.../gtk-panama/core.89397)
#
# An error report file with more information is saved as:
# /home/.../gtk-panama/hs_err_pid89397.log
[0.222s][warning][os] Loading hsdis library failed
#
# If you would like to submit a bug report, please visit:
#   https://github.com/adoptium/adoptium-support/issues
# The crash happened outside the Java Virtual Machine in native code.
# See problematic frame for where to report the bug.
#
```
And I can't understand if I'm doing something wrong or not.
