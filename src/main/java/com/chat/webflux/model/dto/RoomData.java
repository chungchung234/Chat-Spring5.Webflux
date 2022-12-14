package com.chat.webflux.model.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomData {

    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private ObjectId chatRoomId;

    private String receiverId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime lastWatched;
}
