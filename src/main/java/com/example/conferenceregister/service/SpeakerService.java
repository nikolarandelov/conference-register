package com.example.conferenceregister.service;

import com.example.conferenceregister.dto.Speaker;
import java.util.List;

public interface SpeakerService {

  void addSpeaker(Speaker speaker);

  List<Speaker> getSpeakers();
}
