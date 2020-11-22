package com.richcoder.code.generate.db.code.impl;

import com.richcoder.code.generate.IGenerator;
import com.richcoder.code.generate.db.code.GeneratoraAdapter;
import com.richcoder.code.generate.db.code.conf.GenerateConfig;

public class GeneratorModeFreeMark extends AbstractGeneratorFreeMark implements IGenerator{

    @Override
    public void generator(final GenerateConfig config) {
        generator(config, new GeneratoraAdapter() {
            @Override
            public String getTemplateName() {
                return "model.ftl";
            }

            @Override
            public String getPackageName(GenerateConfig config) {
                return config.getModelPackageName();
            }

            @Override
            public String getClassName(String modelName) {
                return modelName;
            }
        });
    }
}
