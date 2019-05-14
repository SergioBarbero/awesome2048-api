package com.awesome2048.Board;

import com.awesome2048.Cell.Cell;
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
        jsonGenerator.writeStartArray();
        for (int i = 0; i < board.getSize(); i++) {
            jsonGenerator.writeStartArray();
            for (int j = 0; j < board.getSize(); j++) {
                Cell cell = board.getCell(i, j);
                jsonGenerator.writeNumber(cell.hasTile() ? cell.getTile().getValue() : 0);
            }
            jsonGenerator.writeEndArray();
        }
        jsonGenerator.writeEndArray();
    }
}
