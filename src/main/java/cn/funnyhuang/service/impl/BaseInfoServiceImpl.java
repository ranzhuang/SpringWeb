package cn.funnyhuang.service.impl;


import cn.funnyhuang.model.BaseMessageInfoModel;
import cn.funnyhuang.service.BaseInfoService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class BaseInfoServiceImpl implements BaseInfoService {
    @Override
    public List<BaseMessageInfoModel> findInfoModel(long max, int cout) {
        List<BaseMessageInfoModel> infoModels = new ArrayList<>();
        for (int i = 0; i < cout; i++) {
            infoModels.add(new BaseMessageInfoModel("infoModel" + i, new Date()));
        }
        return infoModels;
    }
}
