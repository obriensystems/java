// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;


// TODO(fishx): Move these monitoring APIs into a separate file.
// -----------------------------------------------------------------------------
// Monitoring Counter APIs.
// These APIs de-templated monitoring Counter for swig.

@Opaque @Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class TFE_MonitoringCounterCell extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TFE_MonitoringCounterCell() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_MonitoringCounterCell(Pointer p) { super(p); }
}
