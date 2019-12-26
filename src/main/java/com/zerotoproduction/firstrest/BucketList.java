package com.zerotoproduction.firstrest;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class BucketList {

    private long id;
    private String export_;
    private String import_;
    private String transat_;
    private Date dateTime;

    public BucketList() {
    }

    public BucketList(long id, String export_, String import_, String transat_) {
        this.id = id;
        this.export_ = export_;
        this.import_ = import_;
        this.transat_ = transat_;
        this.dateTime= new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExport_() {
        return export_;
    }

    public void setExport_(String export_) {
        this.export_ = export_;
    }

    public String getImport_() {
        return import_;
    }

    public void setImport_(String import_) {
        this.import_ = import_;
    }

    public String getTransat_() {
        return transat_;
    }

    public void setTransat_(String transat_) {
        this.transat_ = transat_;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
