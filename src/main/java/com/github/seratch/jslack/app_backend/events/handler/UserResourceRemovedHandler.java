package com.github.seratch.jslack.app_backend.events.handler;

import com.github.seratch.jslack.app_backend.events.EventHandler;
import com.github.seratch.jslack.app_backend.events.payload.UserResourceRemovedPayload;
import com.github.seratch.jslack.api.model.event.UserResourceRemovedEvent;

public abstract class UserResourceRemovedHandler extends EventHandler<UserResourceRemovedPayload> {

    @Override
    public String getEventType() {
        return UserResourceRemovedEvent.TYPE_NAME;
    }
}