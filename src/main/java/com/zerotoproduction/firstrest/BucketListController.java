package com.zerotoproduction.firstrest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BucketListController {

    private BucketList myBucketList = new BucketList();
    private final AtomicLong counter = new AtomicLong();

//    public BucketListController(){
//        myBucketList.add(new BucketList(counter.incrementAndGet(), "Visit Colosseum in Rome"));
//    }


    @GetMapping(value = "/")
    public ResponseEntity getBucket() {
        if(myBucketList == null ){
            return ResponseEntity.ok("No date found");
        }else {
            return ResponseEntity.ok(myBucketList);
        }

    }

    @PostMapping(value = "/")
    public ResponseEntity addToBucketList(@RequestParam(value="ex") String export,
                                          @RequestParam(value="im") String import_,
                                          @RequestParam(value="tr") String transate_
                                          ) {
        myBucketList = new BucketList(counter.incrementAndGet(), export,import_,transate_);
        return ResponseEntity.ok(myBucketList);
    }

}
