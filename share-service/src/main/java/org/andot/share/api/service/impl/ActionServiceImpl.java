package org.andot.share.api.service.impl;

import org.andot.share.api.entity.Action;
import org.andot.share.api.service.ActionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("actionService")
public class ActionServiceImpl implements ActionService {

    @Override
    public Action getActionById(Long roleId) {
        return null;
    }

    @Override
    public List<Action> getActionList(String actionName, String actionUrl) {
        return null;
    }

    @Override
    public boolean saveAction(Action role) {
        return false;
    }

    @Override
    public boolean updateAction(Action role) {
        return false;
    }

    @Override
    public boolean delActionById(Long id) {
        return false;
    }
}
