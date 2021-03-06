package com.revature.smp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.smp.beans.MessageRoom;

@Repository
public interface MessageRoomRepository extends JpaRepository<MessageRoom, Integer> {
     
    public MessageRoom findByRoomName(String roomName);
}
