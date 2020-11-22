package com.richcoder.code.generate;


import com.richcoder.code.generate.db.code.GeneratoraAdapter;
import com.richcoder.code.generate.db.code.conf.GenerateConfig;

/**
 * 
 * @author richcoder
 *
 */
public interface IGenerator {

	default void generator(GenerateConfig config){}
	
	default void generator(GenerateConfig config, GeneratoraAdapter adapter){ }
}
