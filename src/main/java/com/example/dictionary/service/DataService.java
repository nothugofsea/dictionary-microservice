package com.example.dictionary.service;

import com.example.dictionary.model.Data;
import com.example.dictionary.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public Data createData(Data data) {
        return dataRepository.save(data);
    }

    public List<Data> getAllData() {
        return dataRepository.findAll();
    }

    public Data getDataById(UUID id) {
        return dataRepository.findById(id).orElse(null);
    }

    public void deleteData(UUID id) {
        dataRepository.deleteById(id);
    }
}