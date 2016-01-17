package com.pgs.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {

	@RequestMapping(value = "/inputs", method = RequestMethod.GET)
    @ResponseBody
    public MyData myDataWithInputGet() {
    	return new MyData("GET-Name", "GET-Value");
    }
    
    @RequestMapping(value = "/inputs", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<MyData> myDataWithInputGet(@RequestBody MyData input) {
    	input.setName(input.getName()+"-mod");
    	input.setValue(input.getValue()+"-mod");
        return new ResponseEntity<MyData>(input, HttpStatus.BAD_REQUEST);
    }
    
}
