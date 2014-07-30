package ch.zhaw.init.semeval2015.framework;

import java.util.List;
import java.util.Map;

public interface FeatureExtractor<C> {
	
	public List<C> getAllowedConfigObjects();
	
	public Map<String, Double> generate(String text, C ... configs);

}
