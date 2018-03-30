package ren.draven.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public interface PersonService {
	public Set<String> getSets();
	public List<String> getLists();
	public Properties getProperties();
	public Map<String, String> getMaps();

	public void save();

}