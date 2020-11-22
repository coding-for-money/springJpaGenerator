package com.richcoder.code.generate.db.code.impl;

import com.richcoder.code.generate.IGenerator;
import com.richcoder.code.generate.db.code.GeneratoraAdapter;
import com.richcoder.code.generate.db.code.conf.GenerateConfig;
import com.richcoder.code.generate.db.code.vo.TableInfo;
public class GeneratorPageableDTOFreeMark extends AbstractGeneratorFreeMark implements IGenerator{

    @Override
    public void generator(final GenerateConfig config) {
        generator(config, new GeneratoraAdapter() {
            @Override
            public String getTemplateName() {
                return "pageableDTO.ftl";
            }

            @Override
            public String getPackageName(GenerateConfig config, TableInfo tableInfo) {
                return config.getDtoPackageName() + ".request."+tableInfo.getClassPackageName();
            }

            @Override
            public String getClassName(String modelName) {
                return modelName+"PageableDTO";
            }
        });
    }
}
