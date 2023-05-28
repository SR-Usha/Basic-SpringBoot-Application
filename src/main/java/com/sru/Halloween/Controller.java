package com.sru.Halloween;

import com.sru.Halloween.dto.Costume;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/halloween")
@RequiredArgsConstructor
public class Controller {

    private final Handler handler;

    Logger logger = LoggerFactory.getLogger(Controller.class);
    @GetMapping("/costumes")
    public ResponseEntity costumes() {
        logger.info("Received a request to get halloween costumes");
        try {
           return ResponseEntity.ok().body(handler.getHalloweenCostumes());
        } catch (Exception e) {
            logger.error("Error in getting the halloween costumes");
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @PostMapping("/costume")
    public ResponseEntity saveCostumeInfo(@RequestBody Costume costume){
        logger.info("Received a request to save halloween costume name with description.");
        try{
            handler.saveCostume(costume);
            return ResponseEntity.ok().body("Saved costume!!!");
        }catch (Exception e){
            logger.error("Error in saving the halloween costume data : {}", costume.toString());
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }
}
