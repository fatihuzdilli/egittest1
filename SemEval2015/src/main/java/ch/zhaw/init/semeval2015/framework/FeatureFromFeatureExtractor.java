package ch.zhaw.init.semeval2015.framework;

import java.util.List;
import java.util.Map;

public interface FeatureFromFeatureExtractor<C> {
	
	public List<C> getAllowedConfigObjects();
	
	public Map<String, Double> extract(Map<Class<? extends FeatureExtractor>,Map<String, Double>> subFeatures, C config);

}
