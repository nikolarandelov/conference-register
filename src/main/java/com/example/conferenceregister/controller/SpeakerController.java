package com.example.conferenceregister.controller;

import com.example.conferenceregister.api.SpeakersApi;
import com.example.conferenceregister.dto.Speaker;
import com.example.conferenceregister.service.SpeakerService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SpeakerController implements SpeakersApi {

  private final SpeakerService speakerService;

  @Override
  public ResponseEntity<Void> addSpeaker(Speaker speaker) {
    speakerService.addSpeaker(speaker);

    return new ResponseEntity<>(HttpStatusCode.valueOf(201));
  }

  @Override
  public ResponseEntity<List<Speaker>> getSpeakers() {
    return ResponseEntity.ok(speakerService.getSpeakers());
  }
}
