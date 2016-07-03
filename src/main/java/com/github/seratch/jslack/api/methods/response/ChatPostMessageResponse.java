package com.github.seratch.jslack.api.methods.response;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Message;
import lombok.Data;

@Data
public class ChatPostMessageResponse implements SlackApiResponse {

    private boolean ok;
    private String error;

    private String channel;
    private String ts;
    private Message message;
}