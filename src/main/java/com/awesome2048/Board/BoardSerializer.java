package com.awesome2048.Board;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class BoardSerializer extends StdSerializer<Board> {

    public BoardSerializer() {
        this(null);
    }

    public BoardSerializer(Class<Board> t) {
        super(t);
    }

    @Override
    public void serialize(Board board, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

    }
}
