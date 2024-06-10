package marcus6n.taskmanager_api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class TaskManagerApiController {

    private List<String> tasks = new ArrayList<>();

    private ObjectMapper objectMapper;

    public TaskManagerApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public ResponseEntity<String> listTask() throws JsonProcessingException {
        return ResponseEntity.ok(objectMapper.writeValueAsString(tasks));
    }

    @PostMapping
    public ResponseEntity<Void> createTask(@RequestBody String task) {
        tasks.add(task);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTask() {
        tasks = new ArrayList<>();
        return ResponseEntity.ok().build();
    }
}
