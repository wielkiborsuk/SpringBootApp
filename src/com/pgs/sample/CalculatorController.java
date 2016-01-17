package com.pgs.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calc")
public class CalculatorController {

	@RequestMapping(value = "/add/{arg1}/{arg2}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<OperationResult> addTwoArgs(@PathVariable("arg1") Integer arg1, @PathVariable("arg2") Integer arg2) {
        return new ResponseEntity<OperationResult>(new OperationResult(arg1 + arg2, OperationType.ADD), HttpStatus.OK);
    }
}
