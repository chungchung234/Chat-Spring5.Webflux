package com.chat.webflux.model.vo;

import com.lotte.danuri.messengeron.model.dto.Chat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ChatVo {

    private String contentType;
    private String content;
    private String sendBy;
    private String sendTo;
    private String source;
    private String id;


    public Chat getChat() {
        return new Chat(new ObjectId(), this.getContentType(), this.getContent(), this.getSendBy(), this.getSource(), LocalDateTime.now());
    }


}
