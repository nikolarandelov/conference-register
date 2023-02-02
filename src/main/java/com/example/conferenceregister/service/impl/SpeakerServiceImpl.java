package com.example.conferenceregister.service.impl;

import com.example.conferenceregister.dto.Speaker;
import com.example.conferenceregister.model.SpeakerDao;
import com.example.conferenceregister.service.SpeakerService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SpeakerServiceImpl implements SpeakerService {

  private final HashMap<Long, SpeakerDao> speakers = new HashMap<>();
  private Long index = 0L;

  @Override
  public void addSpeaker(Speaker speaker) {
    SpeakerDao speakerDao = new SpeakerDao();
    speakerDao.setSpeakerId(index);
    speakerDao.setFirstName(speaker.getFirstName());
    speakerDao.setLastName(speaker.getLastName());
    speakerDao.setEmail(speaker.getEmail());
    speakerDao.setTitle(speaker.getTitle());
    speakerDao.setYearsInEndava(speaker.getYearsInEndava());

    speakers.put(index, speakerDao);
    index++;
  }

  @Override
  public List<Speaker> getSpeakers() {
    List<Speaker> speakerList = new ArrayList<>();
    speakers.values().stream().toList().forEach(speakerDao -> {
      Speaker speaker = new Speaker();
      speaker.setFirstName(speakerDao.getFirstName());
      speaker.setLastName(speakerDao.getLastName());
      speaker.setEmail(speakerDao.getEmail());
      speaker.setTitle(speakerDao.getTitle());
      speaker.setYearsInEndava(speakerDao.getYearsInEndava());
      speakerList.add(speaker);
    });
    return speakerList;
  }
}
