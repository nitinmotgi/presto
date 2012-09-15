package com.facebook.presto.block;

import com.facebook.presto.slice.Slice;
import com.facebook.presto.slice.SliceOutput;

public interface TupleStreamSerde
{
    /**
     * Serialize a single TupleStream to SliceOutput
     */
    void serialize(TupleStream tupleStream, SliceOutput sliceOutput);

    /**
     * Create a TupleStreamWriter that be used to serialize multiple TupleStreams together
     */
    TupleStreamWriter createTupleStreamWriter(SliceOutput sliceOutput);

    /**
     * Extract the TupleStream that has been serialized to the Slice
     */
    TupleStream deserialize(Slice slice);
}
