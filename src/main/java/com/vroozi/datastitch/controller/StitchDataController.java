package com.vroozi.datastitch.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class StitchDataController {


  @PostMapping(value = "/data-stitch/organization/{unitId}/upload-record-to-s3")
  public void sendLatestRecordsToS3(@PathVariable("unitId") String unitId) {

  }

}
