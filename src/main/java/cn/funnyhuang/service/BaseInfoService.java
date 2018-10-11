package cn.funnyhuang.service;


import cn.funnyhuang.model.BaseMessageInfoModel;

import java.util.List;

public interface BaseInfoService {

    List<BaseMessageInfoModel> findInfoModel(long max, int cout);
}
