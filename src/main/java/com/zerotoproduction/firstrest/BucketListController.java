package com.zerotoproduction.firstrest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BucketListController {

    private List<BucketList> myBucketList = new ArrayList();
    private final AtomicLong counter = new AtomicLong();

//    public BucketListController(){
//        myBucketList.add(new BucketList(counter.incrementAndGet(), "Visit Colosseum in Rome"));
//    }

    @GetMapping(value = "/")
    public ResponseEntity index() {
        return ResponseEntity.ok(myBucketList);
    }

    @GetMapping(value = "/bucket")
    public ResponseEntity getBucket() {
        BucketList itemToReturn = null;
        for(BucketList bucket : myBucketList){
                itemToReturn = bucket;
        }
        if(itemToReturn == null){
            return ResponseEntity.ok("No bucket found with id ");
        }else {
            return ResponseEntity.ok(itemToReturn);
        }

    }

    @PostMapping(value = "/")
    public ResponseEntity addToBucketList(@RequestParam(value="ex") String export,
                                          @RequestParam(value="im") String import_,
                                          @RequestParam(value="tr") String transate_
                                          ) {
        myBucketList.add(new BucketList(counter.incrementAndGet(), export,import_,transate_));
        return ResponseEntity.ok(myBucketList);
    }



    @DeleteMapping(value = "/")
    public ResponseEntity removeBucketList() {
        myBucketList.clear();
        return ResponseEntity.ok(myBucketList);
    }
}
