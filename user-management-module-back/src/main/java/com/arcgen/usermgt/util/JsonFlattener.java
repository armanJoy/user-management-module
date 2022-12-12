package com.arcgen.usermgt.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonFlattener {

    private final Map<String, String> json = new LinkedHashMap<>(64);
    private JsonNode root;

    JsonFlattener(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            this.root = mapper.readTree(jsonString);
        } catch (JsonProcessingException ex) {
            // Logger.getLogger(JsonFlattener.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Map<String, String> flatten() {
        process(root, "");
        return json;
    }

    private void process(JsonNode node, String prefix) {
        if (node.isObject()) {
            ObjectNode object = (ObjectNode) node;
            object
                    .fields()
                    .forEachRemaining(
                            entry -> {
                                process(entry.getValue(), prefix + "/" + entry.getKey());
                            });
        } else if (node.isArray()) {
            ArrayNode array = (ArrayNode) node;
            AtomicInteger counter = new AtomicInteger();
            array
                    .elements()
                    .forEachRemaining(
                            item -> {
                                process(item, prefix + "/" + counter.getAndIncrement());
                            });
        } else {

            json.put(prefix, node.textValue());
        }
    }

}
