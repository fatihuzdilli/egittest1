package ch.zhaw.init.semeval2015.features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import ch.zhaw.init.semeval2015.framework.FeatureExtractor;

import com.google.common.collect.Maps;

public class DummyNGram implements FeatureExtractor<Integer> {

	public List<Integer> getAllowedConfigObjects() {
		return Arrays.asList(1,2,3);
	}

	public Map<String, Double> generate(String text, Integer... configs) {
		Map<String, Double> retVal = Maps.newHashMap();
		List<String> tokens = Arrays.asList(text.split(" "));
		for (Integer config : configs) {
			for (int i = 0; i < tokens.size()-config+1; i++) {
				List<String> sublist = tokens.subList(i, config);
				String joined = StringUtils.join(sublist, "_X_");
				retVal.put(config+"-gram:"+joined, 1.0);
			}
		}
		return retVal;
	}

}
