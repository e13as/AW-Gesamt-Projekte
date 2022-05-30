package com.example.blog.service;

import com.example.blog.model.Beitrag;

import java.util.List;

public interface BeitragService {
    List<Beitrag> getAlleBeitraege();
    void saveBeitrag(Beitrag beitrag);
    Beitrag getBeitragById(long id);
    void deleteBeitragById(long id);
}
