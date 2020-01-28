package hu.flowacademy.musicstore.DTO.DtoService;

import hu.flowacademy.musicstore.DTO.AlbumDto;
import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Repository.AlbumRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class AlbumDtoService {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ModelMapper modelMapper;

    /*
    public AlbumDto getStudent(String id) {


     Album album = albumRepository.findOne(id);


   AlbumDto albumDto = modelMapper.map(album, AlbumDto.class);

        */

}
