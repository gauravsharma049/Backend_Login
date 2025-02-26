package com.example.authentication.service.page;

import com.example.authentication.model.page.Page;

import java.util.List;

public interface PageService {

    Page save(Page page);
    Page update(int id, Page page);
    Page getById(int id);
    void delete(int id);
    List<Page> findAll();
}
