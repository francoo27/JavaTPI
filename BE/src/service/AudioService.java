package service;

import java.util.ArrayList;

import data.AudioRepository;
import entity.Audio;

public class AudioService {

	AudioRepository audioRepository = new AudioRepository();

	public Audio getById(int id) throws Exception {
		return audioRepository.getById(id);
	}

	public ArrayList<Audio> getAll() throws Exception {
		return audioRepository.getAll();
	}

	public void save(Audio audio) throws Exception {
		audioRepository.save(audio);
	}

	public void delete(int id) throws Exception {
		audioRepository.delete(id);
	}

}
