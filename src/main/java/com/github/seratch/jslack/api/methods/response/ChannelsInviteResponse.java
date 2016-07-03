package com.github.seratch.jslack.api.methods.response;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import com.github.seratch.jslack.api.model.Channel;
import lombok.Data;

@Data
public class ChannelsInviteResponse implements SlackApiResponse {

    private boolean ok;
    private String error;

    private Channel channel;
}