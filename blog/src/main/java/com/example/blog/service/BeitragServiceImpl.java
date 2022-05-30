package com.example.blog.service;

import com.example.blog.model.Beitrag;
import com.example.blog.repository.BeitragRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class BeitragServiceImpl implements BeitragService {

    @Autowired
    private BeitragRepository beitragRepository;


    @Override
    public List<Beitrag> getAlleBeitraege() {
        return beitragRepository.findAll().stream().sorted(Comparator.comparing(Beitrag::getDatum).reversed()).toList();
    }

    @Override
    public void saveBeitrag(Beitrag beitrag) {
        this.beitragRepository.save(beitrag);
    }

    @Override
    public Beitrag getBeitragById(long id) {
        Optional<Beitrag> optional = beitragRepository.findById(id);
        Beitrag beitrag = null;
        if (optional.isPresent()){
            beitrag = optional.get();
        }else {
            throw new RuntimeException("Beitrag mit der ID " + id + " nicht gefunden!");
        }
        return beitrag;
    }

    @Override
    public void deleteBeitragById(long id) {
        this.beitragRepository.deleteById(id);
    }
}
