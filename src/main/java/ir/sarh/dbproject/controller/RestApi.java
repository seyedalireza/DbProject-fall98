package ir.sarh.dbproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
@Slf4j
public class RestApi {

    @Autowired
    public RestApi() {
    }
}
