package com.wesovilabs.festify.service.impl;

import com.wesovilabs.festify.dto.request.AlbumRequest;
import com.wesovilabs.festify.dto.response.AlbumDetailResponse;
import com.wesovilabs.festify.dto.response.AlbumResumeResponse;
import com.wesovilabs.festify.mapper.AlbumMapper;
import com.wesovilabs.festify.persistence.jpa.entity.AlbumEntity;
import com.wesovilabs.festify.persistence.jpa.repository.AlbumJpaRepositori;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumIservice {


    private AlbumJpaRepositori misImplementaciones;

    @Override
    public List<AlbumResumeResponse> listAlbum() {
        List<AlbumEntity> listaAlbunes = misImplementaciones.findAll();
        return listaAlbunes.stream().map(AlbumMapper::mapAlbumDTOResume).toList();
    }

    @Override
    public AlbumResumeResponse createAlbum(AlbumRequest requestAl) {
        AlbumEntity albumEntity = AlbumMapper.mapAlbumEntityResponse(requestAl);

        AlbumEntity resultado = misImplementaciones.save(albumEntity);

        return AlbumMapper.mapAlbumDTOResume(resultado);
    }

    @Override
    public AlbumDetailResponse updateAlbum(String id, AlbumRequest requestAl) {

        
        return null;
    }

    @Override
    public AlbumDetailResponse getAlbumId(String id) {
        return null;
    }

    @Override
    public void deleteAlbum(String id) {

    }
}
