package com.capsetrack.leaseadmin;

import java.util.UUID;

public class LeaseCompany {
    private String id;

    public LeaseCompany() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}
