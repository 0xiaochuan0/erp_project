package com.jk.service.warehouse;

import com.jk.model.warehouse.ShelfPlace;

import java.util.List;

public interface IShelfPlaceService {


    List<ShelfPlace> queryManagement(ShelfPlace shelfPlace);

    List<ShelfPlace> queryReport(ShelfPlace shelfPlace);
}
