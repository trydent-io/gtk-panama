package io.trydent.panama;


import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static gtk.gtk_h_14.*;
import static gtk.gtk_h_15.gtk_application_window_new;
import static gtk.gtk_h_15.gtk_button_new_with_label;
import static gtk.gtk_h_6.g_signal_connect_object;

interface Main {
  static void main(String[] args) {
    System.load("/usr/lib/x86_64-linux-gnu/libgtk-4.so");
    System.load("/usr/lib/x86_64-linux-gnu/libpango-1.0.so");
    System.load("/usr/lib/x86_64-linux-gnu/libgdk_pixbuf-2.0.so");
    System.load("/usr/lib/x86_64-linux-gnu/libcairo.so");
    System.load("/usr/lib/x86_64-linux-gnu/libcairo-gobject.so");
    System.load("/usr/lib/x86_64-linux-gnu/libgraphene-1.0.so");
    System.load("/usr/lib/x86_64-linux-gnu/libgio-2.0.so");
    System.load("/usr/lib/x86_64-linux-gnu/libgobject-2.0.so");
    System.load("/usr/lib/x86_64-linux-gnu/libglib-2.0.so");

    try (var arena = Arena.openShared()) {
      var gtkApp = gtk_application_new(arena.allocateUtf8String("io.trydent.panama"), 0);

      var window = gtk_application_window_new(gtkApp);
      gtk_window_set_title(window, arena.allocateUtf8String("GTK Window"));
      gtk_widget_set_size_request(window, 200, 200);

      gtk_window_present(window);

      g_signal_connect_object(gtkApp, arena.allocateUtf8String("activate"), window, MemorySegment.NULL, 0);
      int i = g_application_run(gtkApp, 0, MemorySegment.NULL);
      g_object_unref(gtkApp);

      System.exit(i);
    }
  }
}
