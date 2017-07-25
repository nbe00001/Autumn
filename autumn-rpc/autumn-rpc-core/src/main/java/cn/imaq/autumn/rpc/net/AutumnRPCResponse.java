package cn.imaq.autumn.rpc.net;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

@Data
public class AutumnRPCResponse {
    private int status;

    private JsonNode result;

    public AutumnRPCResponse(int status, Object result, ObjectMapper mapper) {
        this.status = status;
        this.result = mapper.valueToTree(result);
    }
}