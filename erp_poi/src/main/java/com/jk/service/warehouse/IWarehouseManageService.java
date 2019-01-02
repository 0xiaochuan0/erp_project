package com.jk.service.warehouse;

import com.jk.model.indents.Indents;
import com.jk.utils.ResultPage;

public interface IWarehouseManageService {
    ResultPage queryListStock(Integer page, Integer rows, Indents indents);
}
