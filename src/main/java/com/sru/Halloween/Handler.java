package com.sru.Halloween;

import com.sru.Halloween.dto.Costume;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class Handler {
    Logger logger = LoggerFactory.getLogger(Handler.class);
    public Set<String> getHalloweenCostumes() {
        return Constants.HALLOWEEN_COSTUMES;
    }

    public void saveCostume(Costume costume) {
        String costumeData =  String.format("Costume Name: %s \n Description: %s",costume.getName(), costume.getDescription());
        logger.info(costumeData);
    }
}
