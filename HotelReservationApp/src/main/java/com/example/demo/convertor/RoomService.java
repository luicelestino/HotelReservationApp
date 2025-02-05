package com.example.demo.convertor;

import com.example.demo.entity.RoomEntity;

import java.util.List;

/**
 * Project: D387 sample code
 * Package: edu.wgu.d387_sample_code.convertor
 * <p>
 * User: carolyn.sher
 * Date: 9/16/2022
 * Time: 4:52 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

public interface RoomService {

    public RoomEntity findById(long theId);
   // public Page<RoomEntity> findAvailableRooms(LocalDate checkin, LocalDate checkout, Pageable page);
    public List<RoomEntity> findAll();

}
