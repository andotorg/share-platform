package org.andot.share.api.service.impl;

import org.andot.share.api.domain.OrganDto;
import org.andot.share.api.entity.Organ;
import org.andot.share.api.service.OrganService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("organService")
public class OrganServiceImpl implements OrganService {
    @Override
    public Organ getOrganById(Long roleId) {
        return null;
    }

    @Override
    public List<Organ> getOrganList(String organName) {
        return null;
    }

    @Override
    public boolean saveOrgan(Organ role) {
        return false;
    }

    @Override
    public boolean updateOrgan(Organ role) {
        return false;
    }

    @Override
    public boolean delOrganById(Long id) {
        return false;
    }

    @Override
    public List<OrganDto> getOrganTree(Long organId) {
        return null;
    }
}
