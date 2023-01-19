package com.ajaxbankingtransaction.controller.api;


import com.ajaxbankingtransaction.model.Transfer;
import com.ajaxbankingtransaction.service.transfer.ITransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transfers")
public class TransferRestController {

    @Autowired
    private ITransferService transferService;

    @GetMapping
    private ResponseEntity<List<Transfer>> transferHistory() {
        List<Transfer> transferList = (List<Transfer>) transferService.findAll();

        return new ResponseEntity<>(transferList, HttpStatus.OK);
    }
}
